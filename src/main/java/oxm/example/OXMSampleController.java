package oxm.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import oxm.example.converter.XMLConverter;
import oxm.example.model.Sample;

@RestController
public class OXMSampleController {
	
	@Autowired
	private XMLConverter converter;

	@RequestMapping("/convert")
	public String index() {

		//
		URL sampleDataURL;
		InputStream sampleDataInputStream = null;
		InputStreamReader sampleDataInputStreamReader;
		
		FileOutputStream os = null;

		try {
			
			// Unmarshalling
			String sampleDataFullPath = "http://api.seibro.or.kr/openapi/service/StockSvc/getStkIsinByNm?secnNm=%EC%82%BC%EC%84%B1&numOfRows=30&pageNo=1&ServiceKey=qGFHa4FuCWTQNwoOnFmpEt6Qt%2B8GKHkCZH3bwsXWyTJJGy4S96y5FOwoGzrduVQvggw0mGzm3qbBfLlZ%2BltqxQ%3D%3D";
			sampleDataURL = new URL(sampleDataFullPath);
			sampleDataInputStream = sampleDataURL.openStream();
			sampleDataInputStreamReader = new InputStreamReader(sampleDataInputStream);
			Sample sample = (Sample) converter.getUnmarshaller().unmarshal(new StreamSource(sampleDataInputStreamReader));

			// Marshalling
			os = new FileOutputStream("C:/sample.xml");
			converter.getMarshaller().marshal(sample, new StreamResult(os));
			
			os.close();
		} catch (MalformedURLException mue) {
			System.out.println("Ouch - a MalformedURLException happened.");
			mue.printStackTrace();
		} catch (IOException ioe) {
			System.out.println("Oops- an IOException happened.");
			ioe.printStackTrace();
		} finally {
			// ---------------------------------//
			// Step 6: Close the InputStream //
			// ---------------------------------//
			try {
				sampleDataInputStream.close();
			} catch (IOException ioe) {
				// just going to ignore this one
			}
			
			if (os != null)
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		} // end of 'finally' clause

		return "OXM Complete";
	}
}
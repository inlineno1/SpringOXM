/**
 * 
 */
/**
 * @author Administrator
 *
 */
package oxm.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import oxm.example.converter.XMLConverter;

@Configuration
public class Config {
	
	@Bean
	public XMLConverter converter() {		
		XMLConverter converter = new XMLConverter();
		converter.setMarshaller(jaxb2Marshaller());
		converter.setUnmarshaller(jaxb2Marshaller());
		return converter;
	}
	
	@Bean
	public Jaxb2Marshaller jaxb2Marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setClassesToBeBound(new Class[]{oxm.example.model.Sample.class});
		return marshaller;
	}
}
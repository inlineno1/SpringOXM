//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.10 at 04:41:18 PM KST 
//


package oxm.example.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="resultMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="body">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="items">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="isin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="issuDt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="issucoCustno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="korSecnNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="secnKacdNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="shotnIsin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="numOfRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="pageNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "body"
})
@XmlRootElement(name = "response")
public class Sample {

    @XmlElement(required = true)
    protected Sample.Header header;
    @XmlElement(required = true)
    protected Sample.Body body;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Sample.Header }
     *     
     */
    public Sample.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sample.Header }
     *     
     */
    public void setHeader(Sample.Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link Sample.Body }
     *     
     */
    public Sample.Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sample.Body }
     *     
     */
    public void setBody(Sample.Body value) {
        this.body = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="items">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="isin" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="issuDt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="issucoCustno" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="korSecnNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="secnKacdNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="shotnIsin" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="numOfRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="pageNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "items",
        "numOfRows",
        "pageNo",
        "totalCount"
    })
    public static class Body {

        @XmlElement(required = true)
        protected Sample.Body.Items items;
        protected int numOfRows;
        protected int pageNo;
        protected int totalCount;

        /**
         * Gets the value of the items property.
         * 
         * @return
         *     possible object is
         *     {@link Sample.Body.Items }
         *     
         */
        public Sample.Body.Items getItems() {
            return items;
        }

        /**
         * Sets the value of the items property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sample.Body.Items }
         *     
         */
        public void setItems(Sample.Body.Items value) {
            this.items = value;
        }

        /**
         * Gets the value of the numOfRows property.
         * 
         */
        public int getNumOfRows() {
            return numOfRows;
        }

        /**
         * Sets the value of the numOfRows property.
         * 
         */
        public void setNumOfRows(int value) {
            this.numOfRows = value;
        }

        /**
         * Gets the value of the pageNo property.
         * 
         */
        public int getPageNo() {
            return pageNo;
        }

        /**
         * Sets the value of the pageNo property.
         * 
         */
        public void setPageNo(int value) {
            this.pageNo = value;
        }

        /**
         * Gets the value of the totalCount property.
         * 
         */
        public int getTotalCount() {
            return totalCount;
        }

        /**
         * Sets the value of the totalCount property.
         * 
         */
        public void setTotalCount(int value) {
            this.totalCount = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="isin" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="issuDt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="issucoCustno" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="korSecnNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="secnKacdNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="shotnIsin" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Items {

            @XmlElement(required = true)
            protected List<Sample.Body.Items.Item> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Sample.Body.Items.Item }
             * 
             * 
             */
            public List<Sample.Body.Items.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<Sample.Body.Items.Item>();
                }
                return this.item;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="isin" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="issuDt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="issucoCustno" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="korSecnNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="secnKacdNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="shotnIsin" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "isin",
                "issuDt",
                "issucoCustno",
                "korSecnNm",
                "secnKacdNm",
                "shotnIsin"
            })
            public static class Item {

                @XmlElement(required = true)
                protected String isin;
                protected int issuDt;
                protected int issucoCustno;
                @XmlElement(required = true)
                protected String korSecnNm;
                @XmlElement(required = true)
                protected String secnKacdNm;
                protected int shotnIsin;

                /**
                 * Gets the value of the isin property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsin() {
                    return isin;
                }

                /**
                 * Sets the value of the isin property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsin(String value) {
                    this.isin = value;
                }

                /**
                 * Gets the value of the issuDt property.
                 * 
                 */
                public int getIssuDt() {
                    return issuDt;
                }

                /**
                 * Sets the value of the issuDt property.
                 * 
                 */
                public void setIssuDt(int value) {
                    this.issuDt = value;
                }

                /**
                 * Gets the value of the issucoCustno property.
                 * 
                 */
                public int getIssucoCustno() {
                    return issucoCustno;
                }

                /**
                 * Sets the value of the issucoCustno property.
                 * 
                 */
                public void setIssucoCustno(int value) {
                    this.issucoCustno = value;
                }

                /**
                 * Gets the value of the korSecnNm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKorSecnNm() {
                    return korSecnNm;
                }

                /**
                 * Sets the value of the korSecnNm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKorSecnNm(String value) {
                    this.korSecnNm = value;
                }

                /**
                 * Gets the value of the secnKacdNm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSecnKacdNm() {
                    return secnKacdNm;
                }

                /**
                 * Sets the value of the secnKacdNm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSecnKacdNm(String value) {
                    this.secnKacdNm = value;
                }

                /**
                 * Gets the value of the shotnIsin property.
                 * 
                 */
                public int getShotnIsin() {
                    return shotnIsin;
                }

                /**
                 * Sets the value of the shotnIsin property.
                 * 
                 */
                public void setShotnIsin(int value) {
                    this.shotnIsin = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="resultMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resultCode",
        "resultMsg"
    })
    public static class Header {

        protected int resultCode;
        @XmlElement(required = true)
        protected String resultMsg;

        /**
         * Gets the value of the resultCode property.
         * 
         */
        public int getResultCode() {
            return resultCode;
        }

        /**
         * Sets the value of the resultCode property.
         * 
         */
        public void setResultCode(int value) {
            this.resultCode = value;
        }

        /**
         * Gets the value of the resultMsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultMsg() {
            return resultMsg;
        }

        /**
         * Sets the value of the resultMsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultMsg(String value) {
            this.resultMsg = value;
        }

    }

}

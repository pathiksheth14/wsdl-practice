
package com.bloomberg.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitCancelResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitCancelResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}PerSecurityResponse">
 *       &lt;sequence>
 *         &lt;element name="responseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitCancelResponse", propOrder = {
    "responseId"
})
public class SubmitCancelResponse
    extends PerSecurityResponse
{

    @XmlElement(required = true)
    protected String responseId;

    /**
     * Gets the value of the responseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseId() {
        return responseId;
    }

    /**
     * Sets the value of the responseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseId(String value) {
        this.responseId = value;
    }

}

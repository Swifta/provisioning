
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deletecommissionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deletecommissionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}deletecommissionrequestresponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletecommissionResponse", propOrder = {
    "_return"
})
public class DeletecommissionResponse {

    @XmlElement(name = "return")
    protected Deletecommissionrequestresponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Deletecommissionrequestresponse }
     *     
     */
    public Deletecommissionrequestresponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deletecommissionrequestresponse }
     *     
     */
    public void setReturn(Deletecommissionrequestresponse value) {
        this._return = value;
    }

}

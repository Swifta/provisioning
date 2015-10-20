
package com.swifta.sub.mats.operation.provisioning.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webauthenticationrequestresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="webauthenticationrequestresponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://swifta.com/sub/mats/operation/provisioning/v1.0}weboperationresponse">
 *       &lt;sequence>
 *         &lt;element name="permission" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accountholderdetail" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}kyc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webauthenticationrequestresponse", propOrder = {
    "permission",
    "accountholderdetail"
})
public class Webauthenticationrequestresponse
    extends Weboperationresponse
{

    @XmlElement(nillable = true)
    protected List<String> permission;
    protected Kyc accountholderdetail;

    /**
     * Gets the value of the permission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPermission() {
        if (permission == null) {
            permission = new ArrayList<String>();
        }
        return this.permission;
    }

    /**
     * Gets the value of the accountholderdetail property.
     * 
     * @return
     *     possible object is
     *     {@link Kyc }
     *     
     */
    public Kyc getAccountholderdetail() {
        return accountholderdetail;
    }

    /**
     * Sets the value of the accountholderdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kyc }
     *     
     */
    public void setAccountholderdetail(Kyc value) {
        this.accountholderdetail = value;
    }

}

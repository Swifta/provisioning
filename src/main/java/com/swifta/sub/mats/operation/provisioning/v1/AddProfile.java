
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loggedinUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profiletypeid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addProfile", propOrder = {
    "loggedinUser",
    "profilename",
    "profiletypeid"
})
public class AddProfile {

    protected String loggedinUser;
    protected String profilename;
    protected int profiletypeid;

    /**
     * Gets the value of the loggedinUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedinUser() {
        return loggedinUser;
    }

    /**
     * Sets the value of the loggedinUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedinUser(String value) {
        this.loggedinUser = value;
    }

    /**
     * Gets the value of the profilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilename() {
        return profilename;
    }

    /**
     * Sets the value of the profilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilename(String value) {
        this.profilename = value;
    }

    /**
     * Gets the value of the profiletypeid property.
     * 
     */
    public int getProfiletypeid() {
        return profiletypeid;
    }

    /**
     * Sets the value of the profiletypeid property.
     * 
     */
    public void setProfiletypeid(int value) {
        this.profiletypeid = value;
    }

}

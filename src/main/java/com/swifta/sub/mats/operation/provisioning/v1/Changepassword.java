
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changepassword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changepassword">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loggedinUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newcredentials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldcredentials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changepassword", propOrder = {
    "loggedinUser",
    "username",
    "newcredentials",
    "oldcredentials"
})
public class Changepassword {

    protected String loggedinUser;
    protected String username;
    protected String newcredentials;
    protected String oldcredentials;

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
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the newcredentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewcredentials() {
        return newcredentials;
    }

    /**
     * Sets the value of the newcredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewcredentials(String value) {
        this.newcredentials = value;
    }

    /**
     * Gets the value of the oldcredentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldcredentials() {
        return oldcredentials;
    }

    /**
     * Sets the value of the oldcredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldcredentials(String value) {
        this.oldcredentials = value;
    }

}

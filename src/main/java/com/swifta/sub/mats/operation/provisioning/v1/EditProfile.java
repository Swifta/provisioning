
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loggedinUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldprofilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profileid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editProfile", propOrder = {
    "loggedinUser",
    "profilename",
    "oldprofilename",
    "profileid"
})
public class EditProfile {

    protected String loggedinUser;
    protected String profilename;
    protected String oldprofilename;
    protected int profileid;

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
     * Gets the value of the oldprofilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldprofilename() {
        return oldprofilename;
    }

    /**
     * Sets the value of the oldprofilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldprofilename(String value) {
        this.oldprofilename = value;
    }

    /**
     * Gets the value of the profileid property.
     * 
     */
    public int getProfileid() {
        return profileid;
    }

    /**
     * Sets the value of the profileid property.
     * 
     */
    public void setProfileid(int value) {
        this.profileid = value;
    }

}

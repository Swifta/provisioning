
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unlinkaccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unlinkaccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loggedinUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initiatinguserresourceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="childuserresourceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profileid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paraentaccountresourceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unlinkaccount", propOrder = {
    "loggedinUser",
    "initiatinguserresourceid",
    "childuserresourceid",
    "profileid",
    "paraentaccountresourceid"
})
public class Unlinkaccount {

    protected String loggedinUser;
    protected String initiatinguserresourceid;
    protected String childuserresourceid;
    protected int profileid;
    protected String paraentaccountresourceid;

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
     * Gets the value of the initiatinguserresourceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatinguserresourceid() {
        return initiatinguserresourceid;
    }

    /**
     * Sets the value of the initiatinguserresourceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatinguserresourceid(String value) {
        this.initiatinguserresourceid = value;
    }

    /**
     * Gets the value of the childuserresourceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChilduserresourceid() {
        return childuserresourceid;
    }

    /**
     * Sets the value of the childuserresourceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChilduserresourceid(String value) {
        this.childuserresourceid = value;
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

    /**
     * Gets the value of the paraentaccountresourceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParaentaccountresourceid() {
        return paraentaccountresourceid;
    }

    /**
     * Sets the value of the paraentaccountresourceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParaentaccountresourceid(String value) {
        this.paraentaccountresourceid = value;
    }

}

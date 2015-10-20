
package com.swifta.sub.mats.operation.provisioning.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addProfileThreshold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addProfileThreshold">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loggedinUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="profileid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="thresholdtypeid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="profiletypeid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addProfileThreshold", propOrder = {
    "loggedinUser",
    "profilename",
    "action",
    "profileid",
    "thresholdtypeid",
    "profiletypeid",
    "value"
})
public class AddProfileThreshold {

    protected String loggedinUser;
    protected String profilename;
    @XmlElement(type = Integer.class)
    protected List<Integer> action;
    protected int profileid;
    protected int thresholdtypeid;
    protected int profiletypeid;
    protected String value;

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
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAction() {
        if (action == null) {
            action = new ArrayList<Integer>();
        }
        return this.action;
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
     * Gets the value of the thresholdtypeid property.
     * 
     */
    public int getThresholdtypeid() {
        return thresholdtypeid;
    }

    /**
     * Sets the value of the thresholdtypeid property.
     * 
     */
    public void setThresholdtypeid(int value) {
        this.thresholdtypeid = value;
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

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}

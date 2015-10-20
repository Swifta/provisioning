
package com.swifta.sub.mats.operation.provisioning.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setupservicefees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setupservicefees">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loggedinUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userresourceid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serviceconfigtype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transactiontypeid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="servicefeedetails" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}serviceFees" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setupservicefees", propOrder = {
    "loggedinUser",
    "userresourceid",
    "serviceconfigtype",
    "transactiontypeid",
    "servicefeedetails"
})
public class Setupservicefees {

    protected String loggedinUser;
    protected Integer userresourceid;
    protected Integer serviceconfigtype;
    protected Integer transactiontypeid;
    protected List<ServiceFees> servicefeedetails;

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
     * Gets the value of the userresourceid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserresourceid() {
        return userresourceid;
    }

    /**
     * Sets the value of the userresourceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserresourceid(Integer value) {
        this.userresourceid = value;
    }

    /**
     * Gets the value of the serviceconfigtype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceconfigtype() {
        return serviceconfigtype;
    }

    /**
     * Sets the value of the serviceconfigtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceconfigtype(Integer value) {
        this.serviceconfigtype = value;
    }

    /**
     * Gets the value of the transactiontypeid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransactiontypeid() {
        return transactiontypeid;
    }

    /**
     * Sets the value of the transactiontypeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransactiontypeid(Integer value) {
        this.transactiontypeid = value;
    }

    /**
     * Gets the value of the servicefeedetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicefeedetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicefeedetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFees }
     * 
     * 
     */
    public List<ServiceFees> getServicefeedetails() {
        if (servicefeedetails == null) {
            servicefeedetails = new ArrayList<ServiceFees>();
        }
        return this.servicefeedetails;
    }

}

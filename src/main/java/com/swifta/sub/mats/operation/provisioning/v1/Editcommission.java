
package com.swifta.sub.mats.operation.provisioning.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editcommission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editcommission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loggedinUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userresourceid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="commissionsetuptype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="servicefeepropertiesid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transactiontypeid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="commissionfeefortrnxfee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="servicecommissiondetails" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}serviceCommission" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editcommission", propOrder = {
    "loggedinUser",
    "userresourceid",
    "commissionsetuptype",
    "servicefeepropertiesid",
    "transactiontypeid",
    "commissionfeefortrnxfee",
    "servicecommissiondetails"
})
public class Editcommission {

    protected String loggedinUser;
    protected Integer userresourceid;
    protected Integer commissionsetuptype;
    protected Integer servicefeepropertiesid;
    protected Integer transactiontypeid;
    protected BigDecimal commissionfeefortrnxfee;
    protected List<ServiceCommission> servicecommissiondetails;

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
     * Gets the value of the commissionsetuptype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommissionsetuptype() {
        return commissionsetuptype;
    }

    /**
     * Sets the value of the commissionsetuptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommissionsetuptype(Integer value) {
        this.commissionsetuptype = value;
    }

    /**
     * Gets the value of the servicefeepropertiesid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServicefeepropertiesid() {
        return servicefeepropertiesid;
    }

    /**
     * Sets the value of the servicefeepropertiesid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServicefeepropertiesid(Integer value) {
        this.servicefeepropertiesid = value;
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
     * Gets the value of the commissionfeefortrnxfee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionfeefortrnxfee() {
        return commissionfeefortrnxfee;
    }

    /**
     * Sets the value of the commissionfeefortrnxfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionfeefortrnxfee(BigDecimal value) {
        this.commissionfeefortrnxfee = value;
    }

    /**
     * Gets the value of the servicecommissiondetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicecommissiondetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicecommissiondetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCommission }
     * 
     * 
     */
    public List<ServiceCommission> getServicecommissiondetails() {
        if (servicecommissiondetails == null) {
            servicecommissiondetails = new ArrayList<ServiceCommission>();
        }
        return this.servicecommissiondetails;
    }

}

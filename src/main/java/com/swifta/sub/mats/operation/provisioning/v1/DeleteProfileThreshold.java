package com.swifta.sub.mats.operation.provisioning.v1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for deleteProfileThreshold complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="deleteProfileThreshold">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loggedinUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="thresholdtypeid" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "deleteProfileThreshold", propOrder = { "loggedinUser",
		"action", "thresholdtypeid", "profileid" })
public class DeleteProfileThreshold {

	protected String loggedinUser;
	@XmlElement(type = Integer.class)
	protected List<Integer> action;
	protected int thresholdtypeid;
	protected int profileid;

	/**
	 * Gets the value of the loggedinUser property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLoggedinUser() {
		return loggedinUser;
	}

	/**
	 * Sets the value of the loggedinUser property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLoggedinUser(String value) {
		this.loggedinUser = value;
	}

	/**
	 * Gets the value of the action property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the action property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAction().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Integer }
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

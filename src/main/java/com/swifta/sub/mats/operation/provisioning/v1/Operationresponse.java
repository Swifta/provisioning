
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operationresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operationresponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responsemessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}extension" minOccurs="0"/>
 *         &lt;element name="parameterextension" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}parameterExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operationresponse", propOrder = {
    "responsemessage",
    "responsecode",
    "extension",
    "parameterextension"
})
@XmlSeeAlso({
    UnLinkaccountrequestresponse.class,
    RemoveProfilerequestresponse.class,
    PasswordResetrequestresponse.class,
    Addcustodyaccountrequestresponse.class,
    Suspendaccountholderrequestresponse.class,
    AddProfilerequestresponse.class,
    SetProfilePermissionrequestresponse.class,
    Activationresponse.class,
    Servicecommissionrequestresponse.class,
    Addaccountrequestresponse.class,
    AddProfileThresholdrequestresponse.class,
    DeleteProfileThresholdrequestresponse.class,
    Deletefeerequestresponse.class,
    Registrationrequestresponse.class,
    Deletecommissionrequestresponse.class,
    SetDefaultaccountrequestresponse.class,
    Linkaccountrequestresponse.class,
    Addaccounttoexistinguserrequestresponse.class,
    Servicefeerequestresponse.class,
    RemoveProfilePermissionrequestresponse.class,
    Setparentrequestresponse.class,
    EditProfileThresholdrequestresponse.class,
    Editcommissionrequestresponse.class,
    EditProfilerequestresponse.class,
    Changepasswordrequestresponse.class,
    Editfeerequestresponse.class
})
public abstract class Operationresponse {

    protected String responsemessage;
    protected String responsecode;
    protected Extension extension;
    protected ParameterExtension parameterextension;

    /**
     * Gets the value of the responsemessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsemessage() {
        return responsemessage;
    }

    /**
     * Sets the value of the responsemessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsemessage(String value) {
        this.responsemessage = value;
    }

    /**
     * Gets the value of the responsecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsecode() {
        return responsecode;
    }

    /**
     * Sets the value of the responsecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsecode(String value) {
        this.responsecode = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Extension }
     *     
     */
    public Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extension }
     *     
     */
    public void setExtension(Extension value) {
        this.extension = value;
    }

    /**
     * Gets the value of the parameterextension property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterExtension }
     *     
     */
    public ParameterExtension getParameterextension() {
        return parameterextension;
    }

    /**
     * Sets the value of the parameterextension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterExtension }
     *     
     */
    public void setParameterextension(ParameterExtension value) {
        this.parameterextension = value;
    }

}

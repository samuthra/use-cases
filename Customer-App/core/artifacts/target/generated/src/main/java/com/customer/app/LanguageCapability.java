//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 11:16:26 AM EDT 
//


package com.customer.app;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Language Capability
 * 
 * <p>Java class for LanguageCapability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguageCapability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ispreferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.davita.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="methodofexpression" type="{http://www.davita.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="proficiencylevel" type="{http://www.davita.com}Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageCapability", propOrder = {
    "ispreferred",
    "language",
    "methodofexpression",
    "proficiencylevel"
})
@XmlRootElement(name = "LanguageCapability")
public class LanguageCapability
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Boolean ispreferred;
    protected Code language;
    protected Code methodofexpression;
    protected Code proficiencylevel;

    /**
     * Gets the value of the ispreferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIspreferred() {
        return ispreferred;
    }

    /**
     * Sets the value of the ispreferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIspreferred(Boolean value) {
        this.ispreferred = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setLanguage(Code value) {
        this.language = value;
    }

    /**
     * Gets the value of the methodofexpression property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMethodofexpression() {
        return methodofexpression;
    }

    /**
     * Sets the value of the methodofexpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMethodofexpression(Code value) {
        this.methodofexpression = value;
    }

    /**
     * Gets the value of the proficiencylevel property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getProficiencylevel() {
        return proficiencylevel;
    }

    /**
     * Sets the value of the proficiencylevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setProficiencylevel(Code value) {
        this.proficiencylevel = value;
    }

}

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
 * Biological Entity - Cause of death - The condition(s) that caused or contributed to the death of the organism. For Humans, the U.S. Standard Certificate of Death (Rev 11/2003) requires the entry of "the chain of events-diseases, injuries, or complications-that directly caused the death", beginning with the "immediate cause (final disease or condition resulting in death)" and ending with the "underlying cause (disease or injury that initiated the events resulting in death)." Note the CDC Center for Vital Statistics is required to report this information to the World Health Organization (WHO). The WHO requires that this data be reported using ICD-10 codes. For Non-humans, the coding system to be used for non-humans has not been determined at this time. Added 11/23/2010 for Problem List.
 * 
 * <p>Java class for CauseOfDeath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CauseOfDeath"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="causeofdeath" type="{http://www.davita.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="timeinterval" type="{http://www.davita.com}TimeQuantity" minOccurs="0"/&gt;
 *         &lt;element name="precedence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CauseOfDeath", propOrder = {
    "causeofdeath",
    "timeinterval",
    "precedence"
})
@XmlRootElement(name = "CauseOfDeath")
public class CauseOfDeath
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code causeofdeath;
    protected TimeQuantity timeinterval;
    protected Integer precedence;

    /**
     * Gets the value of the causeofdeath property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCauseofdeath() {
        return causeofdeath;
    }

    /**
     * Sets the value of the causeofdeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCauseofdeath(Code value) {
        this.causeofdeath = value;
    }

    /**
     * Gets the value of the timeinterval property.
     * 
     * @return
     *     possible object is
     *     {@link TimeQuantity }
     *     
     */
    public TimeQuantity getTimeinterval() {
        return timeinterval;
    }

    /**
     * Sets the value of the timeinterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeQuantity }
     *     
     */
    public void setTimeinterval(TimeQuantity value) {
        this.timeinterval = value;
    }

    /**
     * Gets the value of the precedence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrecedence() {
        return precedence;
    }

    /**
     * Sets the value of the precedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecedence(Integer value) {
        this.precedence = value;
    }

}

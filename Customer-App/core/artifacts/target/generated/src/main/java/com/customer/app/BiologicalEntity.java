//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 11:16:26 AM EDT 
//


package com.customer.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Entity - Person - Biological Entity
 * 
 * <p>Java class for BiologicalEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiologicalEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.davita.com}Parties"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="agegroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateofdeath" type="{http://www.davita.com}PointInTime" minOccurs="0"/&gt;
 *         &lt;element name="isdeceased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deathcertificatenumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isorgandonor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="multiplebirthorder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ageatdeath" type="{http://www.davita.com}TimeQuantity" minOccurs="0"/&gt;
 *         &lt;element name="wasmultiplebirth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dateofbirth" type="{http://www.davita.com}PointInTime" minOccurs="0"/&gt;
 *         &lt;element name="Patient" type="{http://www.davita.com}Patient" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CauseOfDeath" type="{http://www.davita.com}CauseOfDeath" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiologicalEntity", propOrder = {
    "age",
    "agegroup",
    "dateofdeath",
    "isdeceased",
    "deathcertificatenumber",
    "isorgandonor",
    "multiplebirthorder",
    "ageatdeath",
    "wasmultiplebirth",
    "dateofbirth",
    "patients",
    "causeOfDeaths"
})
@XmlSeeAlso({
    Person.class
})
public class BiologicalEntity
    extends Parties
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Integer age;
    protected String agegroup;
    protected PointInTime dateofdeath;
    protected Boolean isdeceased;
    protected String deathcertificatenumber;
    protected Boolean isorgandonor;
    protected Integer multiplebirthorder;
    protected TimeQuantity ageatdeath;
    protected Boolean wasmultiplebirth;
    protected PointInTime dateofbirth;
    @XmlElement(name = "Patient")
    protected List<Patient> patients;
    @XmlElement(name = "CauseOfDeath")
    protected List<CauseOfDeath> causeOfDeaths;

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * Gets the value of the agegroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgegroup() {
        return agegroup;
    }

    /**
     * Sets the value of the agegroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgegroup(String value) {
        this.agegroup = value;
    }

    /**
     * Gets the value of the dateofdeath property.
     * 
     * @return
     *     possible object is
     *     {@link PointInTime }
     *     
     */
    public PointInTime getDateofdeath() {
        return dateofdeath;
    }

    /**
     * Sets the value of the dateofdeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInTime }
     *     
     */
    public void setDateofdeath(PointInTime value) {
        this.dateofdeath = value;
    }

    /**
     * Gets the value of the isdeceased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsdeceased() {
        return isdeceased;
    }

    /**
     * Sets the value of the isdeceased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsdeceased(Boolean value) {
        this.isdeceased = value;
    }

    /**
     * Gets the value of the deathcertificatenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathcertificatenumber() {
        return deathcertificatenumber;
    }

    /**
     * Sets the value of the deathcertificatenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathcertificatenumber(String value) {
        this.deathcertificatenumber = value;
    }

    /**
     * Gets the value of the isorgandonor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsorgandonor() {
        return isorgandonor;
    }

    /**
     * Sets the value of the isorgandonor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsorgandonor(Boolean value) {
        this.isorgandonor = value;
    }

    /**
     * Gets the value of the multiplebirthorder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultiplebirthorder() {
        return multiplebirthorder;
    }

    /**
     * Sets the value of the multiplebirthorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultiplebirthorder(Integer value) {
        this.multiplebirthorder = value;
    }

    /**
     * Gets the value of the ageatdeath property.
     * 
     * @return
     *     possible object is
     *     {@link TimeQuantity }
     *     
     */
    public TimeQuantity getAgeatdeath() {
        return ageatdeath;
    }

    /**
     * Sets the value of the ageatdeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeQuantity }
     *     
     */
    public void setAgeatdeath(TimeQuantity value) {
        this.ageatdeath = value;
    }

    /**
     * Gets the value of the wasmultiplebirth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWasmultiplebirth() {
        return wasmultiplebirth;
    }

    /**
     * Sets the value of the wasmultiplebirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWasmultiplebirth(Boolean value) {
        this.wasmultiplebirth = value;
    }

    /**
     * Gets the value of the dateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link PointInTime }
     *     
     */
    public PointInTime getDateofbirth() {
        return dateofbirth;
    }

    /**
     * Sets the value of the dateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInTime }
     *     
     */
    public void setDateofbirth(PointInTime value) {
        this.dateofbirth = value;
    }

    /**
     * Gets the value of the patients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Patient }
     * 
     * 
     */
    public List<Patient> getPatients() {
        if (patients == null) {
            patients = new ArrayList<Patient>();
        }
        return this.patients;
    }

    /**
     * Gets the value of the causeOfDeaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the causeOfDeaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCauseOfDeaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CauseOfDeath }
     * 
     * 
     */
    public List<CauseOfDeath> getCauseOfDeaths() {
        if (causeOfDeaths == null) {
            causeOfDeaths = new ArrayList<CauseOfDeath>();
        }
        return this.causeOfDeaths;
    }

}

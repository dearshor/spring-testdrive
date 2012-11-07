//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.07 at 09:36:48 上午 CST 
//


package com.example.myschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Define a JobDetail
 * 
 * <p>Java class for job-detailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="job-detailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="job-class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="durability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="recover" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/sequence>
 *         &lt;element name="job-data-map" type="{http://www.quartz-scheduler.org/xml/JobSchedulingData}job-data-mapType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "job-detailType", propOrder = {
    "name",
    "group",
    "description",
    "jobClass",
    "durability",
    "recover",
    "jobDataMap"
})
public class JobDetailType {

    @XmlElement(required = true)
    protected String name;
    protected String group;
    protected String description;
    @XmlElement(name = "job-class", required = true)
    protected String jobClass;
    protected Boolean durability;
    protected Boolean recover;
    @XmlElement(name = "job-data-map")
    protected JobDataMapType jobDataMap;

    public JobDetailType() {
	}

	public JobDetailType(String name) {
    	this.name = name;
	}

	/**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the jobClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobClass() {
        return jobClass;
    }

    /**
     * Sets the value of the jobClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobClass(String value) {
        this.jobClass = value;
    }

    /**
     * Gets the value of the durability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDurability() {
        return durability;
    }

    /**
     * Sets the value of the durability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDurability(Boolean value) {
        this.durability = value;
    }

    /**
     * Gets the value of the recover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecover() {
        return recover;
    }

    /**
     * Sets the value of the recover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecover(Boolean value) {
        this.recover = value;
    }

    /**
     * Gets the value of the jobDataMap property.
     * 
     * @return
     *     possible object is
     *     {@link JobDataMapType }
     *     
     */
    public JobDataMapType getJobDataMap() {
        return jobDataMap;
    }

    /**
     * Sets the value of the jobDataMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobDataMapType }
     *     
     */
    public void setJobDataMap(JobDataMapType value) {
        this.jobDataMap = value;
    }

}

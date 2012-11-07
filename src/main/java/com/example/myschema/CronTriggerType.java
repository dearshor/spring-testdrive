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
 * Define a CronTrigger
 * 
 * <p>Java class for cronTriggerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cronTriggerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.quartz-scheduler.org/xml/JobSchedulingData}abstractTriggerType">
 *       &lt;sequence>
 *         &lt;element name="misfire-instruction" type="{http://www.quartz-scheduler.org/xml/JobSchedulingData}cron-trigger-misfire-instructionType" minOccurs="0"/>
 *         &lt;element name="cron-expression" type="{http://www.quartz-scheduler.org/xml/JobSchedulingData}cron-expressionType"/>
 *         &lt;element name="time-zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cronTriggerType", propOrder = {
    "misfireInstruction",
    "cronExpression",
    "timeZone"
})
public class CronTriggerType
    extends AbstractTriggerType
{

    @XmlElement(name = "misfire-instruction")
    protected String misfireInstruction;
    @XmlElement(name = "cron-expression", required = true)
    protected String cronExpression;
    @XmlElement(name = "time-zone")
    protected String timeZone;

    public CronTriggerType() {
		super();
	}

	public CronTriggerType(String cronExpression) {
    	this.cronExpression = cronExpression;
	}

	/**
     * Gets the value of the misfireInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMisfireInstruction() {
        return misfireInstruction;
    }

    /**
     * Sets the value of the misfireInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMisfireInstruction(String value) {
        this.misfireInstruction = value;
    }

    /**
     * Gets the value of the cronExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * Sets the value of the cronExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCronExpression(String value) {
        this.cronExpression = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

}

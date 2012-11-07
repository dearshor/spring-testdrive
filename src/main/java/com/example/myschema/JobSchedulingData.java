//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.07 at 09:36:48 上午 CST 
//


package com.example.myschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="pre-processing-commands" type="{http://www.quartz-scheduler.org/xml/JobSchedulingData}pre-processing-commandsType" minOccurs="0"/>
 *         &lt;element name="processing-directives" type="{http://www.quartz-scheduler.org/xml/JobSchedulingData}processing-directivesType" minOccurs="0"/>
 *         &lt;element name="schedule" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="job" type="{http://www.quartz-scheduler.org/xml/JobSchedulingData}job-detailType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="trigger" type="{http://www.quartz-scheduler.org/xml/JobSchedulingData}triggerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "preProcessingCommandsAndProcessingDirectivesAndSchedule"
})
@XmlRootElement(name = "job-scheduling-data")
public class JobSchedulingData {

    @XmlElements({
        @XmlElement(name = "pre-processing-commands", type = PreProcessingCommandsType.class),
        @XmlElement(name = "schedule", type = JobSchedulingData.Schedule.class),
        @XmlElement(name = "processing-directives", type = ProcessingDirectivesType.class)
    })
    protected List<Object> preProcessingCommandsAndProcessingDirectivesAndSchedule;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the preProcessingCommandsAndProcessingDirectivesAndSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preProcessingCommandsAndProcessingDirectivesAndSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreProcessingCommandsAndProcessingDirectivesAndSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreProcessingCommandsType }
     * {@link JobSchedulingData.Schedule }
     * {@link ProcessingDirectivesType }
     * 
     * 
     */
    public List<Object> getPreProcessingCommandsAndProcessingDirectivesAndSchedule() {
        if (preProcessingCommandsAndProcessingDirectivesAndSchedule == null) {
            preProcessingCommandsAndProcessingDirectivesAndSchedule = new ArrayList<Object>();
        }
        return this.preProcessingCommandsAndProcessingDirectivesAndSchedule;
    }
    
    public  JobSchedulingData addContent(Object obj) {
    	getPreProcessingCommandsAndProcessingDirectivesAndSchedule().add(obj);
    	return this;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }


    @Override
	public String toString() {
		final int maxLen = 10;
		StringBuilder builder = new StringBuilder();
		builder.append("JobSchedulingData [");
		if (preProcessingCommandsAndProcessingDirectivesAndSchedule != null)
			builder.append(
					"preProcessingCommandsAndProcessingDirectivesAndSchedule=")
					.append(preProcessingCommandsAndProcessingDirectivesAndSchedule
							.subList(0, Math.min(
									preProcessingCommandsAndProcessingDirectivesAndSchedule
											.size(), maxLen))).append(", ");
		if (version != null)
			builder.append("version=").append(version);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((preProcessingCommandsAndProcessingDirectivesAndSchedule == null) ? 0
						: preProcessingCommandsAndProcessingDirectivesAndSchedule
								.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof JobSchedulingData)) {
			return false;
		}
		JobSchedulingData other = (JobSchedulingData) obj;
		if (preProcessingCommandsAndProcessingDirectivesAndSchedule == null) {
			if (other.preProcessingCommandsAndProcessingDirectivesAndSchedule != null) {
				return false;
			}
		} else if (!preProcessingCommandsAndProcessingDirectivesAndSchedule
				.equals(other.preProcessingCommandsAndProcessingDirectivesAndSchedule)) {
			return false;
		}
		if (version == null) {
			if (other.version != null) {
				return false;
			}
		} else if (!version.equals(other.version)) {
			return false;
		}
		return true;
	}
	


	/**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="job" type="{http://www.quartz-scheduler.org/xml/JobSchedulingData}job-detailType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="trigger" type="{http://www.quartz-scheduler.org/xml/JobSchedulingData}triggerType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "jobAndTrigger"
    })
    public static class Schedule {

        @XmlElements({
            @XmlElement(name = "trigger", type = TriggerType.class),
            @XmlElement(name = "job", type = JobDetailType.class)
        })
        protected List<Object> jobAndTrigger;

        /**
         * Gets the value of the jobAndTrigger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jobAndTrigger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJobAndTrigger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TriggerType }
         * {@link JobDetailType }
         * 
         * 
         */
        public List<Object> getJobAndTrigger() {
            if (jobAndTrigger == null) {
                jobAndTrigger = new ArrayList<Object>();
            }
            return this.jobAndTrigger;
        }
        
        public Schedule addContent(Object jobOrTrigger) {
        	getJobAndTrigger().add(jobOrTrigger);
        	return this;
        }

		@Override
		public String toString() {
			final int maxLen = 10;
			StringBuilder builder = new StringBuilder();
			builder.append("Schedule [");
			if (jobAndTrigger != null)
				builder.append("jobAndTrigger=").append(
						jobAndTrigger.subList(0,
								Math.min(jobAndTrigger.size(), maxLen)));
			builder.append("]");
			return builder.toString();
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((jobAndTrigger == null) ? 0 : jobAndTrigger.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			Schedule other = (Schedule) obj;
			if (jobAndTrigger == null) {
				if (other.jobAndTrigger != null) {
					return false;
				}
			} else if (!jobAndTrigger.equals(other.jobAndTrigger)) {
				return false;
			}
			return true;
		}
        
        

    }

}
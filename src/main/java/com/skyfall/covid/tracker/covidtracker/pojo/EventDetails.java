/**
 * 
 */
package com.skyfall.covid.tracker.covidtracker.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author drn Nov 16, 2021
 * 
 */

@XmlRootElement(name = "EventDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class EventDetails {

	@XmlElement(name = "EventCode")
	private String eventCode;

	@XmlElement(name = "EventDate")
	private String eventDate;

	@XmlElement(name = "EventTime")
	private String eventTime;

	/**
	 * @return the eventCode
	 */
	public String getEventCode() {
		return eventCode;
	}

	/**
	 * @param eventCode the eventCode to set
	 */
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	/**
	 * @return the eventDate
	 */
	public String getEventDate() {
		return eventDate;
	}

	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	/**
	 * @return the eventTime
	 */
	public String getEventTime() {
		return eventTime;
	}

	/**
	 * @param eventTime the eventTime to set
	 */
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	

}

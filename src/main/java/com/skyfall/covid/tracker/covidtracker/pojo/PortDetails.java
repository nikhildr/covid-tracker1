/**
 * 
 */
package com.skyfall.covid.tracker.covidtracker.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author drn Nov 16, 2021
 * 
 */

@XmlRootElement(name = "PortDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class PortDetails {

	@XmlElement(name = "StopSequenceNumber")
	private String stopSequenceNumber;

	@XmlElement(name = "PortFunctionCode")
	private String portFunctionCode;

	@XmlElement(name = "PortCode")
	private String portCode;

	@XmlElement(name = "PortName")
	private String portName;

	@XmlElement(name = "StateCode")
	private String stateCode;

	@XmlElement(name = "CountryCode")
	private String countryCode;

	@XmlElement(name = "EventDetails")
	private List<EventDetails> eventDetails;

	/**
	 * @return the stopSequenceNumber
	 */
	public String getStopSequenceNumber() {
		return stopSequenceNumber;
	}

	/**
	 * @param stopSequenceNumber the stopSequenceNumber to set
	 */
	public void setStopSequenceNumber(String stopSequenceNumber) {
		this.stopSequenceNumber = stopSequenceNumber;
	}

	/**
	 * @return the portFunctionCode
	 */
	public String getPortFunctionCode() {
		return portFunctionCode;
	}

	/**
	 * @param portFunctionCode the portFunctionCode to set
	 */
	public void setPortFunctionCode(String portFunctionCode) {
		this.portFunctionCode = portFunctionCode;
	}

	/**
	 * @return the portCode
	 */
	public String getPortCode() {
		return portCode;
	}

	/**
	 * @param portCode the portCode to set
	 */
	public void setPortCode(String portCode) {
		this.portCode = portCode;
	}

	/**
	 * @return the portName
	 */
	public String getPortName() {
		return portName;
	}

	/**
	 * @param portName the portName to set
	 */
	public void setPortName(String portName) {
		this.portName = portName;
	}

	/**
	 * @return the stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * @param stateCode the stateCode to set
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the eventDetails
	 */
	public List<EventDetails> getEventDetails() {
		return eventDetails;
	}

	/**
	 * @param eventDetails the eventDetails to set
	 */
	public void setEventDetails(List<EventDetails> eventDetails) {
		this.eventDetails = eventDetails;
	}
	
	

}

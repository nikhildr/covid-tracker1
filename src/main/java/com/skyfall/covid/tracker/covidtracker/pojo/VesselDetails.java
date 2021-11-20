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

@XmlRootElement(name = "VesselDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class VesselDetails {

	@XmlElement(name = "TransactionReferenceId")
	private String transactionReferenceId;

	@XmlElement(name = "VesselCode")
	private String vesselCode;

	@XmlElement(name = "VesselName")
	private String vesselName;
	
	@XmlElement(name = "CountryCode")
	private String countryCode;

	@XmlElement(name = "VoyageNumber")
	private String voyageNumber;

	@XmlElement(name = "SCACCode")
	private String SCACCode;

	@XmlElement(name = "VesselCodeQualifier")
	private String vesselCodeQualifier;

	@XmlElement(name = "ShpInstrctDateTime")
	private String shpInstrctDateTime;

	@XmlElement(name = "Remarks")
	private Remarks remarks;

	@XmlElement(name = "PortDetails")
	private List<PortDetails> portDetails;

	/**
	 * @return the transactionReferenceId
	 */
	public String getTransactionReferenceId() {
		return transactionReferenceId;
	}

	/**
	 * @param transactionReferenceId the transactionReferenceId to set
	 */
	public void setTransactionReferenceId(String transactionReferenceId) {
		this.transactionReferenceId = transactionReferenceId;
	}

	/**
	 * @return the vesselCode
	 */
	public String getVesselCode() {
		return vesselCode;
	}

	/**
	 * @param vesselCode the vesselCode to set
	 */
	public void setVesselCode(String vesselCode) {
		this.vesselCode = vesselCode;
	}

	/**
	 * @return the vesselName
	 */
	public String getVesselName() {
		return vesselName;
	}

	/**
	 * @param vesselName the vesselName to set
	 */
	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}

	/**
	 * @return the voyageNumber
	 */
	public String getVoyageNumber() {
		return voyageNumber;
	}

	/**
	 * @param voyageNumber the voyageNumber to set
	 */
	public void setVoyageNumber(String voyageNumber) {
		this.voyageNumber = voyageNumber;
	}

	/**
	 * @return the sCACCode
	 */
	public String getSCACCode() {
		return SCACCode;
	}

	/**
	 * @param sCACCode the sCACCode to set
	 */
	public void setSCACCode(String sCACCode) {
		SCACCode = sCACCode;
	}

	/**
	 * @return the vesselCodeQualifier
	 */
	public String getVesselCodeQualifier() {
		return vesselCodeQualifier;
	}

	/**
	 * @param vesselCodeQualifier the vesselCodeQualifier to set
	 */
	public void setVesselCodeQualifier(String vesselCodeQualifier) {
		this.vesselCodeQualifier = vesselCodeQualifier;
	}

	/**
	 * @return the shpInstrctDateTime
	 */
	public String getShpInstrctDateTime() {
		return shpInstrctDateTime;
	}

	/**
	 * @param shpInstrctDateTime the shpInstrctDateTime to set
	 */
	public void setShpInstrctDateTime(String shpInstrctDateTime) {
		this.shpInstrctDateTime = shpInstrctDateTime;
	}

	/**
	 * @return the remarks
	 */
	public Remarks getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(Remarks remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the portDetails
	 */
	public List<PortDetails> getPortDetails() {
		return portDetails;
	}

	/**
	 * @param portDetails the portDetails to set
	 */
	public void setPortDetails(List<PortDetails> portDetails) {
		this.portDetails = portDetails;
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

	
}

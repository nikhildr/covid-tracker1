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

@XmlRootElement(name = "Remarks")
@XmlAccessorType(XmlAccessType.FIELD)
public class Remarks {

	@XmlElement(name = "RemarksText")
	private String remarksText;

	/**
	 * @return the remarksText
	 */
	public String getRemarksText() {
		return remarksText;
	}

	/**
	 * @param remarksText the remarksText to set
	 */
	public void setRemarksText(String remarksText) {
		this.remarksText = remarksText;
	}

}

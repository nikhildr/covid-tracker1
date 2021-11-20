package com.skyfall.covid.tracker.covidtracker.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "VesselSchedule")
@XmlAccessorType(XmlAccessType.FIELD)
public class VesselSchedule {

    @XmlElement(name = "Header")
    private Header header;

    @XmlElement(name = "VesselDetails")
    private VesselDetails vesselDetails;

    /**
     * @return the header
     */
    public Header getHeader() {
        return header;
    }

    /**
     * @param header the header to set
     */
    public void setHeader(Header header) {
        this.header = header;
    }

    /**
     * @return the vesselDetails
     */

    public VesselDetails getVesselDetails() {
        return vesselDetails;
    }

    /**
     * @param vesselDetails the vesselDetails to set
     */
    public void setVesselDetails(VesselDetails vesselDetails) {
        this.vesselDetails = vesselDetails;
    }

}

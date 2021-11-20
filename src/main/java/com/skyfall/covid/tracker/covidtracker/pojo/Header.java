package com.skyfall.covid.tracker.covidtracker.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Header")
@XmlAccessorType(XmlAccessType.FIELD)
public class Header {

    @XmlElement(name = "SenderID")
    private String SenderID;

    @XmlElement(name = "ReceiverID")
    private String receiverID;

    @XmlElement(name = "TransactionDate")
    private String transactionDate;

    @XmlElement(name = "TransactionTime")
    private String transactionTime;

    /**
     * @return the senderID
     */
    public String getSenderID() {
        return SenderID;
    }

    /**
     * @param senderID the senderID to set
     */
    public void setSenderID(String senderID) {
        SenderID = senderID;
    }

    /**
     * @return the receiverID
     */
    public String getReceiverID() {
        return receiverID;
    }

    /**
     * @param receiverID the receiverID to set
     */
    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
    }

    /**
     * @return the transactionDate
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * @return the transactionTime
     */
    public String getTransactionTime() {
        return transactionTime;
    }

    /**
     * @param transactionTime the transactionTime to set
     */
    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

}

package com.warehouse.bean;

import java.sql.Date;

public class Shipment {

	private String itemDescription ;
	private int totalQuantity ;
	private int availableQuantity ;
	private Date receivedDate ;
	private String shipmentID;
	
	public String getShipmentID() {
		return shipmentID;
	}

	public void setShipmentID(String shipmentID) {
		this.shipmentID = shipmentID;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

}

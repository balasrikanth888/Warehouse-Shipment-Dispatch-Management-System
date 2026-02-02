package com.warehouse.bean;

import java.sql.Date;

public class Dispatch {
	private int dispatchID;
	private String shipmentID ;
	private String destination ;
	private int quantityDispatched ;
	private Date dispatchDate ;
	private String status ;
	public int getDispatchID() {
		return dispatchID;
	}
	public void setDispatchID(int dispatchID) {
		this.dispatchID = dispatchID;
	}
	public String getShipmentID() {
		return shipmentID;
	}
	public void setShipmentID(String shipmentID) {
		this.shipmentID = shipmentID;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getQuantityDispatched() {
		return quantityDispatched;
	}
	public void setQuantityDispatched(int quantityDispatched) {
		this.quantityDispatched = quantityDispatched;
	}
	public Date getDispatchDate() {
		return dispatchDate;
	}
	public void setDispatchDate(Date dispatchDate) {
		this.dispatchDate = dispatchDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	}
	

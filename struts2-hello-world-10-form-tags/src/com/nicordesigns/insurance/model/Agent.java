package com.nicordesigns.insurance.model;

import java.io.Serializable;
import java.util.Arrays;

public class Agent implements Serializable, Cloneable {

	
	
	public Agent() {
		super();
	}


	public Agent(

			Integer agentId, String agentfname, String agentlname, String agentmi, String agentaddr1, String agentaddr2,
			String agentcity, String residency, Integer agentstateid, String agentpostalcode, 
			String agentEmail, String company, String active, String[] coverageSold) {
		super();
		this.id = agentId;
		this.firstName = agentfname;
		this.lastName = agentlname;
		this.midddleInitial = agentmi;
		this.addressLine1 = agentaddr1;
		this.addressLine2 = agentaddr2;
		this.city = agentcity;
		this.residency = residency;
		this.coverageSold = coverageSold;
		this.stateId = agentstateid;
		this.postalCodeZip = agentpostalcode;
		this.email = agentEmail;
		this.company = company;
		this.active = active;
		
	}
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String firstName;
	private String lastName;
	private String midddleInitial;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private Integer stateId;
	private String residency;
	private String[] coverageSold;
	private String active;
	

	private String postalCodeZip;
	private String email;
	private String company;

	private String phoneNumber;

	private boolean isActive;

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMidddleInitial() {
		return midddleInitial;
	}


	public void setMidddleInitial(String midddleInitial) {
		this.midddleInitial = midddleInitial;
	}


	public String getAddressLine1() {
		return addressLine1;
	}


	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	public String getAddressLine2() {
		return addressLine2;
	}


	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Integer getStateId() {
		return stateId;
	}


	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}


	public String getPostalCodeZip() {
		return postalCodeZip;
	}


	public void setPostalCodeZip(String postalCodeZip) {
		this.postalCodeZip = postalCodeZip;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public boolean isActive() {
		return isActive;
	}
	
	public String getResidency() {
		return residency;
	}


	public void setResidency(String residency) {
		this.residency = residency;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	public String getActive() {
		return active;
	}


	public void setActive(String active) {
		this.active = active;
	}


	

	public String[] getCoverageSold() {
		return coverageSold;
	}


	public void setCoverageSold(String[] coverageSold) {
		this.coverageSold = coverageSold;
	}


	@Override
	public String toString() {
		return "Agent [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", midddleInitial="
				+ midddleInitial + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city="
				+ city + ", stateId=" + stateId + ", residency=" + residency + ", coverageSold="
				+ Arrays.toString(coverageSold) + ", active=" + active + ", postalCodeZip=" + postalCodeZip + ", email="
				+ email + ", company=" + company + ", phoneNumber=" + phoneNumber + ", isActive=" + isActive + "]";
	}

}

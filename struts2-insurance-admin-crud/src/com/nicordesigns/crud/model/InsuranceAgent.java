package com.nicordesigns.crud.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class InsuranceAgent implements Serializable, Cloneable {
	
	public InsuranceAgent(
			
			Integer agentId, 
			String agentfname, 
			String agentlname, 
			String agentmi, 
			String agentaddr1,
			String agentaddr2, 
			String agentcity, 
			BigInteger agentstateid, 
			String fssiteid, 
			String fssitepw, 
			String agentpostalcode, 
			String grouporindividual,
			String agentEmail, 
			String company, 
			Integer agentprovinceid, 
			State state) {
		super();
		this.agentId = agentId;
		this.agentfname = agentfname;
		this.agentlname = agentlname;
		this.agentmi = agentmi;
		this.agentaddr1 = agentaddr1;
		this.agentaddr2 = agentaddr2;
		this.agentcity = agentcity;
		this.agentStateId = agentstateid;
		this.agentpostalcode = agentpostalcode;
		this.grouporindividual = grouporindividual;
		this.agentEmail = agentEmail;
		this.company = company;
		this.agentprovinceid = agentprovinceid;
		this.state = state;
	}

	private static final long serialVersionUID = 1L;

	private Integer agentId;
	private String agentfname;
	private String agentlname;
	private String agentmi;
	private String agentaddr1;
	private String agentaddr2;
	private String agentcity;
	private BigInteger agentStateId;
	private String agentpostalcode;
	private String grouporindividual;
	private String agentEmail;
	private String company;
	private Integer agentprovinceid;
	
	private String sport;
    private String gender;
    private State state = new State("GA", "Georgia");
    
    private String[] carModels;
    private String phoneNumber;
    
    private boolean over21;
    

	public boolean isOver21() {
		return over21;
	}

	public void setOver21(boolean over21) {
		this.over21 = over21;
	}

	public String[] getCarModels() {
		return carModels;
	}

	public void setCarModels(String[] carModels) {
		this.carModels = carModels;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public InsuranceAgent() {
	}

	public InsuranceAgent(Integer agentId) {
		this.agentId = agentId;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getAgentfname() {
		return agentfname;
	}

	public void setAgentfname(String agentfname) {
		this.agentfname = agentfname;
	}

	public String getAgentlname() {
		return agentlname;
	}

	public void setAgentlname(String agentlname) {
		this.agentlname = agentlname;
	}

	public String getAgentmi() {
		return agentmi;
	}

	public void setAgentmi(String agentmi) {
		this.agentmi = agentmi;
	}

	public String getAgentaddr1() {
		return agentaddr1;
	}

	public void setAgentaddr1(String agentaddr1) {
		this.agentaddr1 = agentaddr1;
	}

	public String getAgentaddr2() {
		return agentaddr2;
	}

	public void setAgentaddr2(String agentaddr2) {
		this.agentaddr2 = agentaddr2;
	}

	public String getAgentcity() {
		return agentcity;
	}

	public void setAgentcity(String agentcity) {
		this.agentcity = agentcity;
	}

	public BigInteger getAgentStateid() {
		return agentStateId;
	}

	public void setAgentStateid(BigInteger agentStateid) {
		this.agentStateId = agentStateid;
	}

	public String getAgentpostalcode() {
		return agentpostalcode;
	}

	public void setAgentpostalcode(String agentpostalcode) {
		this.agentpostalcode = agentpostalcode;
	}

	public String getGrouporindividual() {
		return grouporindividual;
	}

	public void setGrouporindividual(String grouporindividual) {
		this.grouporindividual = grouporindividual;
	}

	
	public String getAgentEmail() {
		return agentEmail;
	}

	public void setAgentEmail(String agentEmail) {
		this.agentEmail = agentEmail;
	}

	public String getEntity() {
		return company;
	}

	public void setEntity(String entity) {
		this.company = entity;
	}

	public Integer getAgentprovinceid() {
		return agentprovinceid;
	}

	public void setAgentprovinceid(Integer agentprovinceid) {
		this.agentprovinceid = agentprovinceid;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (agentId != null ? agentId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof InsuranceAgent)) {
			return false;
		}
		InsuranceAgent other = (InsuranceAgent) object;
		if ((this.agentId == null && other.agentId != null)
				|| (this.agentId != null && !this.agentId.equals(other.agentId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Id: " + getAgentId() + " | "
                + " First Name: " + getAgentfname() + " | "
                + " Last Name:  " + getAgentlname() + " | "
                + " Email: " + getAgentEmail() + " | "
                + " Favorite Sport: " + getSport() + " | "
                + " Gender: " + getGender() + " | "
                + " State: " + getState() + " | "
                + " Over 21: " + isOver21() + " | "
                //+ " Car models: " + Arrays.asList(getCarModels()) + " | "
                + " Phone: " + getPhoneNumber()+ " | "
                + " Province Id" + getAgentprovinceid();
	}
	
	 
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

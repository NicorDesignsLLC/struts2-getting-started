package com.nicordesigns.insurance.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.nicordesigns.insurance.model.Agent;
import com.nicordesigns.insurance.model.State;
import com.nicordesigns.insurance.service.EditService;
import com.nicordesigns.insurance.service.EditServiceInMemory;
import com.opensymphony.xwork2.ActionSupport;

public class EditAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private EditService editService = new EditServiceInMemory();
	
	private Agent agentBean;
	
	private String [] coverageSold = {"Replacement Exchange", "Refurbishment Exchange", "Upgrade Exchange" };
	
	private String [] status = {"active", "inactive"};
	
	private List<State> states ;

	//private String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};

	public String execute() throws Exception {
		
	    editService.saveAgent( getAgentBean() );
		
		return SUCCESS;
		
	}
	
	
	public String input() throws Exception {
		
		setAgentBean( editService.getAgent() );
		
		return INPUT;
	}
	
	public Agent getAgentBean() {
				
		return agentBean;
		
	}
	
	public void setAgentBean(Agent agent) {
		
		agentBean = agent;
		
	}


//	public List<String> getSports() {
//		return Arrays.asList(sports);
//	}
//	
	public List<String> getStatus() {
		
		return Arrays.asList(status);
		
	}



	public List<State> getStates() {
		
		states = new ArrayList<State>();
		states.add( new State("AZ", "Arizona") );
		states.add( new State("CA", "California") );
		states.add( new State("FL", "Florida") );
		states.add( new State("KS", "Kansas") );
		states.add( new State("NY", "New York") );
		states.add( new State("GA", "Georgia") );
		
		
		return states;
	}


	public String[] getCoverageSold() {
		return coverageSold;
	}

//	public String [] getCarModelsAvailable() {
//		return carModelsAvailable;
//	}

}

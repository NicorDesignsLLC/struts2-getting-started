package com.nicordesigns.insurance.service;


import com.nicordesigns.insurance.model.Agent;

public class EditServiceInMemory implements EditService {
	
	
	private static Agent agent ;
	//private static String [] carModels = {"Ford","Nissan"};

	
	static {
		
		agent = new Agent();
		agent.setCompany("Global Insurance Co");
		agent.setFirstName("Bruce");
		agent.setLastName("Conway");
		agent.setMidddleInitial("A");
		agent.setAddressLine1("Suite 14");
		agent.setAddressLine2("1 Windy Hill");
		agent.setCity("Smyrna");
		//agent.setSport("basketball");
		//agent.setGender("not sure");
		agent.setResidency("GA");
		agent.setActive("active");	
		agent.setPostalCodeZip("30080");	
		agent.setEmail("Bruce.Conway@GlobalInsure.com");	
		agent.setPhoneNumber("679 409 9351");	
		
		//agent.setOver21(true);		
		//agent.setCarModels( carModels);		

	}

	@Override
	public Agent getAgent() {
		
		return EditServiceInMemory.agent;
	}

	@Override
	public void saveAgent(Agent agentBean) {

		EditServiceInMemory.agent.setCompany(agentBean.getCompany() );
		EditServiceInMemory.agent.setFirstName(agentBean.getFirstName() );
		EditServiceInMemory.agent.setLastName(agentBean.getLastName() );
		EditServiceInMemory.agent.setMidddleInitial(agentBean.getMidddleInitial());
		EditServiceInMemory.agent.setAddressLine1(agentBean.getAddressLine1());
		EditServiceInMemory.agent.setAddressLine2(agentBean.getAddressLine2());
		EditServiceInMemory.agent.setCity(agentBean.getCity());
		EditServiceInMemory.agent.setResidency(agentBean.getResidency());
		EditServiceInMemory.agent.setActive(agentBean.getActive());	
		EditServiceInMemory.agent.setPostalCodeZip(agentBean.getPostalCodeZip());	
		EditServiceInMemory.agent.setEmail(agentBean.getEmail());	
		EditServiceInMemory.agent.setPhoneNumber(agentBean.getPhoneNumber());	
		EditServiceInMemory.agent.setCoverageSold(agentBean.getCoverageSold());
		System.out.println("Updated : " + EditServiceInMemory.agent);
	}


}

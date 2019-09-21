package com.nicordesigns.crud.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nicordesigns.crud.model.InsuranceAgent;

public class InsuranceAgentDaoMemoryImpl implements InsuranceAgentDao {

	private static final Logger LOG = LogManager.getLogger(MemoryPersonDao.class.getName());

	private final static List<InsuranceAgent> insuranceAgents;

	static {
		insuranceAgents = new ArrayList<>();

		insuranceAgents.add(
				new InsuranceAgent(1, 
				"Ben", 
				"Leslie", 
				"M", 
				"agentaddr1", 
				"agentaddr2", 
				"agentcity",
				BigInteger.ONE, 
				"fssiteid", 
				"fssitepw", 
				"agentpostalcode",
				"grouporindividual", 
				"Ben.Leslie@insurance.com", 
				"Old Allied", 
				new Integer(10),  InsuranceAgentSupportDaoMemoryImpl.getState("NC")));
	
		insuranceAgents.add(
				new InsuranceAgent(
						2, 
						"Peter", 
						"Parker", 
						"P", 
						"agentaddr1", 
						"agentaddr2", 
						"agentcity",
				BigInteger.ONE, 
				"fssiteid", 
				"fssitepw", 
				"agentpostalcode",
				"grouporindividual", 
				"peter.parker@spiderweb.com", 
				"New Allied", 
				new Integer(10),  InsuranceAgentSupportDaoMemoryImpl.getState("SC")));
	
	}

	@Override
	public InsuranceAgent getInsuranceAgent(Integer id) {
		for (InsuranceAgent insuranceAgent : insuranceAgents) {
            if (insuranceAgent.getAgentId().equals(id)) {
                try {
                    return (InsuranceAgent) insuranceAgent.clone();
                } catch (CloneNotSupportedException ex) {
                    LOG.error("Unexpected exception cloning InsuranceAgent");
                }
            }
        }
		return null;
	}

	@Override
	public InsuranceAgent[] getAllInsuranceAgents() {
		  return insuranceAgents.toArray(new InsuranceAgent[insuranceAgents.size()]);
	}

	@Override
	public void updateInsuranceAgent(InsuranceAgent insuranceAgent) {
		 Integer id = insuranceAgent.getAgentId();
	        for (int i = 0; i < insuranceAgents.size(); i++) {
	        	InsuranceAgent insuranceAgentLooper = insuranceAgents.get(i);
	            if (insuranceAgentLooper.getAgentId().equals(id)) {
	            	insuranceAgentLooper.setState(MemoryPersonSupportDao.getCountry(insuranceAgent.getState().getStateId()));
	            	insuranceAgents.set(i, insuranceAgent);
	                break;
	            }
	        }
	}

	@Override
	public void insertInsuranceAgent(InsuranceAgent insuranceAgent) {
		int lastId = 0;
        for (InsuranceAgent p : insuranceAgents) {
            if (p.getAgentId() > lastId) {
                lastId = p.getAgentId();
            }
        }
        insuranceAgent.setAgentId(lastId + 1);
        insuranceAgent.setState(MemoryPersonSupportDao.getCountry(insuranceAgent.getState().getStateId()));
        insuranceAgents.add(insuranceAgent);

	}

	@Override
	public void deleteInsuranceAgent(Integer id) {
		for (int i = 0; i < insuranceAgents.size(); i++) {
			InsuranceAgent insuranceAgent = insuranceAgents.get(i);
            if (insuranceAgent.getAgentId().equals(id)) {
            	insuranceAgents.remove(i);
                break;
            }
        }

	}

}

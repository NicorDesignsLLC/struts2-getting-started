package com.nicordesigns.crud.service;

import com.nicordesigns.crud.dao.InsuranceAgentDao;
import com.nicordesigns.crud.dao.InsuranceAgentDaoMemoryImpl;
import com.nicordesigns.crud.dao.InsuranceAgentSupportDao;
import com.nicordesigns.crud.dao.InsuranceAgentSupportDaoMemoryImpl;
import com.nicordesigns.crud.model.State;
import com.nicordesigns.crud.model.InsuranceAgent;
import com.nicordesigns.crud.model.Province;

public class DefaultInsuranceAgentService implements InsuranceAgentService {
    InsuranceAgentDao insuranceAgentDao;
    
    InsuranceAgentSupportDao insuranceAgentSupportDao;
    
    public DefaultInsuranceAgentService() {
    	insuranceAgentDao = new InsuranceAgentDaoMemoryImpl();
    	insuranceAgentSupportDao = new InsuranceAgentSupportDaoMemoryImpl();
    }

    @Override
	public InsuranceAgent getInsuranceAgent(Integer id) {
		return insuranceAgentDao.getInsuranceAgent(id);
	}
    
    @Override
	public InsuranceAgent[] getAllInsuranceAgents() {
    	return insuranceAgentDao.getAllInsuranceAgents();
	}

	@Override
	public void updateInsuranceAgent(InsuranceAgent insuranceAgent) {
		insuranceAgentDao.updateInsuranceAgent(insuranceAgent);;
	}

	@Override
	public void insertInsuranceAgent(InsuranceAgent insuranceAgent) {
		insuranceAgentDao.insertInsuranceAgent(insuranceAgent);;
	}

	@Override
	public void deleteInsuranceAgent(Integer id) {
		insuranceAgentDao.deleteInsuranceAgent(id);
	}


	@Override
	public Province[] getProvinces() {
		return insuranceAgentSupportDao.getProvinces();
	}

	@Override
	public State[] getStates() {
		return insuranceAgentSupportDao.getStates();
	}

    @Override
    public String[] getCarModels() {
        return insuranceAgentSupportDao.getCarModels();
    }

    @Override
    public String[] getSports() {
        return insuranceAgentSupportDao.getSports();
    }

    @Override
    public String[] getGenders() {
        return insuranceAgentSupportDao.getGenders();
    }
    


	}

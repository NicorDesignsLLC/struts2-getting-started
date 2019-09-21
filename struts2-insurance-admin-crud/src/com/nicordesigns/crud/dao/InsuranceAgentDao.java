package com.nicordesigns.crud.dao;

import com.nicordesigns.crud.model.InsuranceAgent;

public interface InsuranceAgentDao {

	InsuranceAgent[] getAllInsuranceAgents();
    
    void updateInsuranceAgent(InsuranceAgent insuranceAgent);
    
    void insertInsuranceAgent(InsuranceAgent insuranceAgent);
    
    void deleteInsuranceAgent(Integer id);

	InsuranceAgent getInsuranceAgent(Integer id);
    
}

package com.nicordesigns.crud.service;

import com.nicordesigns.crud.model.State;
import com.nicordesigns.crud.model.InsuranceAgent;
import com.nicordesigns.crud.model.Province;

/**
 * Define methods a InsuranceAgentService must implement
 * to provide services related to a InsuranceAgent class.
 * 
 * @author bruce phillips
 * @author antonio sánchez
 */
public interface InsuranceAgentService {

    InsuranceAgent getInsuranceAgent(Integer id);
    
    InsuranceAgent[] getAllInsuranceAgents();

    void updateInsuranceAgent(InsuranceAgent InsuranceAgentBean);
    
    void insertInsuranceAgent(InsuranceAgent InsuranceAgentBean);
    
    void deleteInsuranceAgent(Integer id);
    
    Province[] getProvinces();
    
    State[] getStates();
    
    String[] getCarModels();
    
    String[] getSports();
    
    String[] getGenders();
}
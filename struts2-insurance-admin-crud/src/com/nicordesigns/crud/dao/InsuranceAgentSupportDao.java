package com.nicordesigns.crud.dao;

import com.nicordesigns.crud.model.State;
import com.nicordesigns.crud.model.Province;

public interface InsuranceAgentSupportDao {

    State[] getStates();
    
    Province[] getProvinces();
    
    
    String[] getCarModels();
    
    String[] getSports();
    
    String[] getGenders();
    
}

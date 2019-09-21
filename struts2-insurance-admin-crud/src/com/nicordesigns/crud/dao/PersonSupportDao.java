package com.nicordesigns.crud.dao;

import com.nicordesigns.crud.model.State;

/**
 * Methods a PersonSupportDao class must implement to provide
 * additional information related to a Person.
 * 
 * @author bruce phillips
 * @author antonio sánchez
 */
public interface PersonSupportDao {

    State[] getCountries();
    
    String[] getCarModels();
    
    String[] getSports();
    
    String[] getGenders();
    
}

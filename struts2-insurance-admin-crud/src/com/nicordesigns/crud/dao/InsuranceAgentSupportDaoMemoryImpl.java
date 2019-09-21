package com.nicordesigns.crud.dao;

import java.util.HashMap;
import java.util.Map;

import com.nicordesigns.crud.model.State;
import com.nicordesigns.crud.model.Province;

public class InsuranceAgentSupportDaoMemoryImpl implements InsuranceAgentSupportDao {
    private static final State[] states;
    private static final Province[] provinces;
    
    private static final Map<String, State> statesMap;
    private static final Map<String, Province> provincesMap;
    
    private static final String[] genders = {"male", "female"};
    private static final String[] sports = {"football", "baseball", "basketball", "mtb" };
    private static final String [] carModelsAvailable = {"Ford", "Chrysler", "Toyota", "Nissan", "Seat"};

    static {
        states = new State[] {new State("FL", "Florida"),
                    new State("AL", "Alabama"),
                    new State("GA", "GA"),
                    new State("NC", "North Carolina"),
                    new State("SC", "South Carolina") };
        
        statesMap = new HashMap<>();
        
        for (State state : states) {
            statesMap.put(state.getStateId(), state);
        }
        
        provinces = new Province[] {
        		new Province(1, "Ontario", "20"),
        		new Province(2, "BC", "40") ,
        		new Province(3, "Saskastawan", "18"),
        		new Province(4, "New Brunswick", "19")
        };

        provincesMap = new HashMap<>();
        for (Province c : provinces) {
        	provincesMap.put(c.getProvinceid().toString(), c);
        }
    }

    @Override
    public String[] getCarModels() {
        return carModelsAvailable;
    }

    @Override
    public String[] getSports() {
        return sports;
    }

    @Override
    public String[] getGenders() {
        return genders;
    }

    @Override
    public State[] getStates() {
        return states;
    }
    
    static State getState(String stateId) {
        return statesMap.get(stateId);
    }

	public Province[] getProvinces() {
		return provinces;
	}
	
	
}

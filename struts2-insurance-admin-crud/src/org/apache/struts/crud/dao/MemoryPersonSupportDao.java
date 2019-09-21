package org.apache.struts.crud.dao;

import java.util.HashMap;
import java.util.Map;

import com.nicordesigns.crud.model.State;

/**
 * @author bruce phillips
 * @author antonio sanchez
 */
public class MemoryPersonSupportDao implements PersonSupportDao {
    private static final State[] states;
    private static final Map<String, State> countriesMap;
    private static final String[] genders = {"male", "female"};
    private static final String[] sports = {"football", "baseball", "basketball", "mtb" };
    private static final String [] carModelsAvailable = {"Ford", "Chrysler", "Toyota", "Nissan", "Seat"};

    static {
        states = new State[] {new State("ES", "Spain"),
                    new State("IE", "Ireland"),
                    new State("IT", "Italy"),
                    new State("PL", "Poland"),
                    new State("US", "Usa") };
        
        countriesMap = new HashMap<>();
        for (State c : states) {
            countriesMap.put(c.getStateId(), c);
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
    public State[] getCountries() {
        return states;
    }
    
    static State getCountry(String countryId) {
        return countriesMap.get(countryId);
    }
}

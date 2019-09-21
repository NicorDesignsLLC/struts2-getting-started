package com.nicordesigns.crud.model;

public class State {
    private String stateId;
    private String stateName;

    public State(String stateId, String countryName) {
        setStateId(stateId);
        setStateName(countryName);
    }

    public void setStateId(String stateId) {
        if (stateId == null)
            throw new IllegalArgumentException("State ID must be non-null.");
        
        this.stateId = stateId;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateName(String countryName) {
        this.stateName = countryName;
    }

    public String getStateName() {
        return stateName;
    }

    @Override
    public String toString() {
        return getStateId();
    }
    
    @Override
    public boolean equals(Object o) {
        return (o!=null) 
                && (o instanceof State) 
                && (((State) o).getStateId() != null) 
                && (stateId.equals(((State) o).getStateId()));
    }
}

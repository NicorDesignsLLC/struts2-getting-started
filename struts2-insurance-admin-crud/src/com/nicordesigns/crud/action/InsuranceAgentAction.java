package com.nicordesigns.crud.action;

import com.nicordesigns.crud.model.State;
import com.nicordesigns.crud.model.InsuranceAgent;
import com.nicordesigns.crud.model.Province;
import com.nicordesigns.crud.service.DefaultInsuranceAgentService;
import com.nicordesigns.crud.service.InsuranceAgentService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InsuranceAgentAction extends ActionSupport implements Preparable {
    
    private static final long serialVersionUID = -7121532745833134666L;

	private static final Logger LOG = LogManager.getLogger(InsuranceAgentAction.class.getName());
    
    private InsuranceAgentService insuranceAgentService = new DefaultInsuranceAgentService();
    
    private InsuranceAgent insuranceAgent;
    private InsuranceAgent[] insuranceAgents;
    
    private String[] sports;
    private String[] genders;
    
    private State[] states;
    private Province[] provinces;
    
    private String[] carModelsAvailable;

    @Override
    public void prepare() throws Exception {
        carModelsAvailable = insuranceAgentService.getCarModels();
        sports = insuranceAgentService.getSports();
        states = insuranceAgentService.getStates();
        provinces = insuranceAgentService.getProvinces();
        genders = insuranceAgentService.getGenders();
        System.out.println("Prepared support data for insuranceAgent entity.");        
        
        if (insuranceAgent != null && insuranceAgent.getAgentId() != null) {
            insuranceAgent = insuranceAgentService.getInsuranceAgent(insuranceAgent.getAgentId());
            System.out.println("Preparing actual data for insuranceAgent: " + insuranceAgent);
        }
    }

    /**
     * Get all InsuranceAgents for display in the view.
     */
    public String list() {
    	insuranceAgents = insuranceAgentService.getAllInsuranceAgents();
        System.out.println("Listing InsuranceAgents");
        return SUCCESS;
    }
    
    /**
     * Save the state of the insuranceAgent object instance field.
     */
    public String save() {
        if (insuranceAgent.getAgentId() == null) {
            insuranceAgentService.insertInsuranceAgent(insuranceAgent);
            System.out.println("Created new insuranceAgent: " + insuranceAgent);
        } else {
            insuranceAgentService.updateInsuranceAgent(insuranceAgent);
            System.out.println("Updated insuranceAgent: " + insuranceAgent);
        }
        return SUCCESS;
    }

    /**
     * Delete from insuranceAgent identified by the insuranceAgent
     * instance field's InsuranceAgentId value.
     */
    public String delete() {
        insuranceAgentService.deleteInsuranceAgent(insuranceAgent.getAgentId());
        System.out.println("Deleted insuranceAgent: " + insuranceAgent);
        return SUCCESS;
    }
    
    public InsuranceAgent[] getInsuranceAgents() {
        return insuranceAgents;
    }

    public InsuranceAgent getInsuranceAgent() {
        return insuranceAgent;
    }

    public void setInsuranceAgent(InsuranceAgent InsuranceAgent) {
        this.insuranceAgent = InsuranceAgent;
    }

    public String[] getSports() {
        return sports;
    }

    public String[] getGenders() {
        return genders;
    }

    public State[] getStates() {
        return states;
    }

    public String[] getCarModelsAvailable() {
        return carModelsAvailable;
    }
}


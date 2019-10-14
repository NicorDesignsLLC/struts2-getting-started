package com.nicordesigns.insurance.action;


import com.nicordesigns.insurance.exception.SecurityBreachException;
import com.nicordesigns.insurance.model.Agent;
import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Agent agentBean;

	public String execute() throws Exception {
		// call Service class to store agentBean's state in database

		return SUCCESS;
	}

	public Agent getAgentBean() {
		return agentBean;
	}

	public void setAgentBean(Agent Agent) {
		agentBean = Agent;
	}
	
	public void throwException() throws Exception {

		throw new Exception("Exception thrown from throwException");

	}

	public void throwNullPointerException() throws NullPointerException {

		throw new NullPointerException("Null Pointer Exception thrown from "
				+ Register.class.toString());
	}

	public void throwSecurityException() throws SecurityBreachException {

		throw new SecurityBreachException(
				"Security breach exception thrown from throwSecurityException");
	}


//  We are commenting out validate so that we do not actually get Validation Exceptions	
//	public void validate() {
//
//		if (agentBean.getFirstName().length() == 0) {
//
//			addFieldError("agentBean.firstName", "First name is required.");
//
//		}
//
//		if (agentBean.getLastName().length() == 0) {
//
//			addFieldError("agentBean.lastName", "Last name is required.");
//
//		}
//
//		if (agentBean.getEmail().length() == 0) {
//
//			addFieldError("agentBean.email", "Email is required.");
//
//		}
//
//	}
}

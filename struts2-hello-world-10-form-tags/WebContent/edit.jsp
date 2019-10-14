<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Register</title>
    <s:head />
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  </head>
  <body>
    <h1><s:text name="greeting" /></h1>
	<h3><s:text name="instructions" /></h3>

    <s:form action="save">
      <!-- Agent Id to display here, not editable -->
      <s:textfield key="agentBean.company" />
 	  <s:textfield key="agentBean.firstName" />
 	  <s:textfield key="agentBean.lastName" />
 	  <s:textfield key="agentBean.midddleInitial" />
 	  <s:textfield key="agentBean.addressLine1" />
 	  <s:textfield key="agentBean.addressLine2" />
 	  <s:textfield key="agentBean.city" />
 	  <s:select key="agentBean.residency" list="states" listKey="stateAbbr" listValue="stateName" />

 	  <!-- State to be populated with a dropdown -->
      <s:textfield key="agentBean.postalCodeZip" />
 	  <s:textfield key="agentBean.email" />
 	  <!-- Agent isActive Checkbox to Display here -->
 	  <s:radio key="agentBean.active" list="status" />
 	  
      <s:textfield key="agentBean.phoneNumber" />
 	  <s:checkboxlist key="agentBean.coverageSold" list="coverageSold" />
 	  
       <s:submit value="submit" />
    </s:form>	
  </body>
</html>

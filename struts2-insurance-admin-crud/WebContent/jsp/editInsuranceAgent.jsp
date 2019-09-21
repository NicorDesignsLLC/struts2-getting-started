<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:if test="insuranceAgent==null || insuranceAgent.agentid == null">
    <s:set var="title" value="%{'Add new Insurance Agent'}"/>
</s:if>
<s:else>
    <s:set var="title" value="%{'Update Insurance Agent'}"/>
</s:else>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <s:head />
        <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
        <style>td { white-space:nowrap; }</style>
        <title><s:property value="#title"/></title>
    </head>
    <body>
        <div class="titleDiv"><s:text name="application.title"/></div>
        <h1><s:property value="#title"/></h1>
        <s:actionerror />
        <s:actionmessage />
        <s:form action="saveInsuranceAgent" method="post">
            <s:textfield key="insuranceAgent.agentfname" /> 
            <s:textfield key="insuranceAgent.agentlname" /> 
            <s:textfield key="insuranceAgent.agentEmail" />
            <s:textfield key="insuranceAgent.phoneNumber" />
            <s:select key="insuranceAgent.sport" list="sports" />
            <s:radio key="insuranceAgent.gender" list="genders" />
            <s:select name="insuranceAgent.state.stateId" list="states" listKey="stateId" listValue="stateName" label="%{getText('insuranceAgent.state')}"/>
            <s:checkbox key="insuranceAgent.over21" />
            <s:checkboxlist key="insuranceAgent.carModels" list="carModelsAvailable" />
            
            <s:hidden name="insuranceAgent.agentId" value="%{insuranceAgent.agentId}"/>

            <s:submit value="%{getText('button.label.submit')}"/>
            <s:submit value="%{getText('button.label.cancel')}" action="insuranceIndex"/>
        </s:form>
    </body>
</html>


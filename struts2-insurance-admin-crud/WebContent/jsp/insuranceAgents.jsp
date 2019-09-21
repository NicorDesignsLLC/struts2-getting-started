<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <s:head />
        <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
        <title><s:text name="label.insuranceAgents"/></title>
    </head>
    <body>
        <div class="titleDiv"><s:text name="application.title"/></div>
        <h1><s:text name="label.insuranceAgents"/></h1>
        <s:url var="url" action="inputInsuranceAgent" />
        <a href="<s:property value="#url"/>">Add A New Insurance Agent</a>
        <br/><br/>
        <table class="borderAll">
            <tr>
            	<th><s:text name="insuranceAgent.agentId"/></th>
            	<th><s:text name="insuranceAgent.company"/></th>
            	<th><s:text name="insuranceAgent.firstName"/></th>
                <th><s:text name="insuranceAgent.lastName"/></th>
                <th><s:text name="insuranceAgent.email"/></th>
                <!--  
                <th><s:text name="insuranceAgent.sport"/></th>
                <th><s:text name="insuranceAgent.gender"/></th>
                -->
                <th><s:text name="insuranceAgent.agentaddr1"/></th>
                <th><s:text name="insuranceAgent.state"/></th>
                <th><s:text name="insuranceAgent.agentcity"/></th>
                <th><s:text name="insuranceAgent.agentpostalcode"/></th>
                <th><s:text name="insuranceAgent.phoneNumber"/></th>
                
                <!--  
                <th><s:text name="insuranceAgent.over21"/></th>
                <th><s:text name="insuranceAgent.carModels"/></th>
                -->
                <th>&nbsp;</th>
            </tr>
            <s:iterator value="insuranceAgents" status="status">
                <tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
                    <td class="nowrap"><s:property value="agentId"/></td>
                    <td class="nowrap"><s:property value="company"/></td>
                    <td class="nowrap"><s:property value="agentfname"/></td>
                    <td class="nowrap"><s:property value="agentlname"/></td>
                    <td class="nowrap"><s:property value="agentEmail"/></td>
                    <!--  
                    <td class="nowrap"><s:property value="sport"/></td>
                    <td class="nowrap"><s:property value="gender"/></td>
                    -->
                    <td class="nowrap"><s:property value="agentaddr1"/></td>
                    <td class="nowrap"><s:property value="state.stateName"/></td>
                    <td class="nowrap"><s:property value="agentcity"/></td>
                    <td class="nowrap"><s:property value="agentpostalcode"/></td>
                    <td class="nowrap"><s:property value="phoneNumber"/></td>
                    
                    
                    <!--  
                    <td class="nowrap">
                        <s:if test="over21">
                            <span style="color:green; font-size: large;">&#x2714;</span>
                        </s:if>
                        <s:else>
                            <span style="color:red; font-size: large;">&#x2717;</span>
                        </s:else>                        
                    </td>
                    <td class="nowrap"><s:property value="carModels"/></td>
                    -->
                    <td class="nowrap">
                        <s:url action="inputInsuranceAgent" var="url">
                            <s:param name="insuranceAgent.agentId" value="agentId"/>
                        </s:url>
                        <a href="<s:property value="#url"/>">Edit</a>
                        &nbsp;&nbsp;&nbsp;
                        
                        <s:url action="deleteInsuranceAgent" var="url">
                            <s:param name="insuranceAgent.agentId" value="agentId"/>
                        </s:url>
                        
                        <a href="<s:property value="#url"/>">Delete</a>
                    </td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>

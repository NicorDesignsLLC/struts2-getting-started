package com.nicordesigns.helloworld;

/* 
 * Hello World Action for chapter one.  This Action expects to receive a 
 * name input from a form on Name.jsp.  The business logic of this action
 * merely concatenates the name with its static greeting message, and then
 * makes that custom message available for the result to which it forwards.  
 */

public class HelloWorld {
	
	/* Our defintion of the greeting text is just static for this
	 * first example.  Later we will add internationalization features
	 * that pull the text from a local specific properties file.
	 */
	private static final String GREETING = "Hello ";

	/*
	 * By default, the Struts 2 framework will invoke the execute() method
	 * on the action object.  Several strategies exist to have other methods
	 * invoked, but this is the default.
	 *  
	 */
	
    public String execute()  {
    	
    	/* Build the custom greeting from the base greeting text
    	 * and the name parameter sent in from the form.  Set it 
    	 * so that it can be read in the Result.
    	 */ 
    	
    	setCustomGreeting( GREETING + getName() );
    	
    	/* Our simplistic busines logic doesn't have any sense of 
    	 * failure, so we will just return the string we have mapped
    	 * to our successful result.
    	 */
    	
    	return "SUCCESS";
    }


    /*
     * Definition of Java Bean properties includes a field, getter and
     * setter method for each property.  This is neccessary for the data 
     * transfer mechanisms of Struts2.
     */
    
    private String name;
    
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private String customGreeting;
    
    public String getCustomGreeting()
    {
    	return customGreeting;
    }
    
    public void setCustomGreeting( String customGreeting ){
    	this.customGreeting = customGreeting;
    }
}

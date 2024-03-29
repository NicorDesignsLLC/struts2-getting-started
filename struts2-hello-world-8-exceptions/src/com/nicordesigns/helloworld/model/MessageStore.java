package com.nicordesigns.helloworld.model;

/**
 * Model class that stores a message.
 * @author Bruce Phillips
 *
 */
public class MessageStore {
    
    private String message;
    
    public MessageStore() {
        message = "Hello Struts User";
    }

    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String toString() {
        return message + " (from toString)";
    }

}

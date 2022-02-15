/**
 * 
 */
package com.hosts.cal.rest.webservices.restwebservices;

/**
 * @author spli5
 *
 */
public class HostData {
	
	private String message;
	
	public HostData(String message) {
		this.setMessage(message);
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HostData [message=" + message + "]";
	}

	
}

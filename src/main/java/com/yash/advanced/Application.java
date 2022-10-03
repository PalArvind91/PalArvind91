package com.yash.advanced;

public class Application {
	
	int application_id;
	String applicationName;
	
	public Application(int application_id, String applicationName) {
	
		this.application_id = application_id;
		this.applicationName = applicationName;
	}
	public Application() {
		// TODO Auto-generated constructor stub
	}
	public int getApplication_id() {
		return application_id;
	}
	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

}

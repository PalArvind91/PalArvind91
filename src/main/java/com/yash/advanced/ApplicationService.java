package com.yash.advanced;

import java.util.ArrayList;
import java.util.List;

public class ApplicationService {
	
	List<Application> applicationList = new ArrayList();
	
	public void initilizeApplication() {
		Application application1 = new Application(101, "Application 1 Detrails");
		Application application2 = new Application(102, "Application 2 Detrails");
		Application application3 = new Application(103, "Application 3 Detrails");
		Application application4 = new Application(104, "Application 4 Detrails");
		applicationList.add(application1);
		applicationList.add(application2);
		applicationList.add(application3);
		applicationList.add(application4);
		
	}
	
	public int addApplication(Application application) {
		
		
		applicationList.add(application);
		return application.getApplication_id();
	}
	
	public void deleteApplication(int appId) {
		Application app = app=getApplication(appId);
		if(app!= null)
			applicationList.remove(appId);
	}
	
	public Application updateApplication(int appId ,Application app) {
		
		Application app1 = getApplication(appId);
		app1.setApplication_id(app.getApplication_id());
		app1.setApplicationName(app.getApplicationName());
		
		return app1;
	}
	
	public  Application getApplication(int appId) {
		for(Application application : applicationList) {
			if(application.getApplication_id()==appId)
				return application;
		}
		return null;
	}

}

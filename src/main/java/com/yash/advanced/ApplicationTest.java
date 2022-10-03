package com.yash.advanced;

import java.util.List;

public class ApplicationTest {
	
	private ApplicationService appService;
	
	public void initApplication() {
		appService.initilizeApplication();
	}
	
	public int addApplication() {
		Application application1 = new Application(202, " Finance Application");
		
		return appService.addApplication(application1);
		
		}
	
	public void deleteApplication() {
		appService.deleteApplication(101);
	}
	
	public Application updateApplication() {
		Application app = new Application();
		app.setApplication_id(108);
		app.setApplicationName("bannking Applocation");
		return appService.updateApplication(102,app);
	}

}

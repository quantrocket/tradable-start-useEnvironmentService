package com.tradable.exampleApps.useEnvironmentService;

import org.springframework.beans.factory.annotation.Autowired;

import com.tradable.api.component.WorkspaceModule;
import com.tradable.api.component.WorkspaceModuleCategory;
import com.tradable.api.component.WorkspaceModuleFactory;
import com.tradable.api.services.environment.EnvironmentService;

public class UseEnvironmentServiceFactory implements WorkspaceModuleFactory {


	@Autowired
	EnvironmentService environmentService;

	@Override
	public WorkspaceModuleCategory getCategory() {
		// TODO Auto-generated method stub
		return WorkspaceModuleCategory.MISCELLANEOUS;
	}

	@Override
	public String getDisplayName() {
		// rename me
		return "use EnvironmentService";
	}

	@Override
	public String getFactoryId() {
		// TODO Auto-generated method stub
		return "com.tradable.exampleApps.useEnvironmentService";
	}

	@Override
	public WorkspaceModule createModule() {
		// TODO Auto-generated method stub
		return new UseEnvironmentServiceModule(environmentService);
	}

}

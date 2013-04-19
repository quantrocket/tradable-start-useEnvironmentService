package com.tradable.exampleApps.useEnvironmentService;

import javax.swing.JComponent;
import javax.swing.JPanel;

import com.tradable.api.component.WorkspaceModule;
import com.tradable.api.component.WorkspaceModuleProperties;
import com.tradable.api.component.state.PersistedStateHolder;
import com.tradable.api.services.environment.EnvironmentService;

import javax.swing.JLabel;

public class UseEnvironmentServiceModule extends JPanel implements WorkspaceModule{
	

	private static final long serialVersionUID = 1L; //change this number to something more sensible
	
	//We note that the EnvironmentService is not dynamic, there is no listener or subscription
	//or other, It is just a static service that always contains the same information.
	
	public UseEnvironmentServiceModule(EnvironmentService environmentService) {
		setLayout(null);
		setSize(350, 250);
		
		JLabel lblUserName = new JLabel(environmentService.getUserName());
		lblUserName.setBounds(10, 30, 300, 30);
		add(lblUserName);
		
		JLabel lblAuthTokenId = new JLabel(environmentService.getAuthenticationTokenId());
		lblAuthTokenId.setBounds(10, 75, 300, 30);
		add(lblAuthTokenId);
		
		JLabel lblConnectiontype = new JLabel(environmentService.getConnectionType());
		lblConnectiontype.setBounds(10, 120, 300, 30);
		add(lblConnectiontype);
		
		JLabel lblWorkingDir = new JLabel(environmentService.getWorkingDirectory().getAbsolutePath());
		lblWorkingDir.setBounds(10, 165, 300, 30);
		add(lblWorkingDir);
		
		setModuleTitle("Environment Service");
	}

	@Override
	public JComponent getVisualComponent() {
		return this;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersistedStateHolder getPersistedState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadPersistedState(PersistedStateHolder state) {
		// TODO Auto-generated method stub
		
	}
	

    protected void setModuleTitle(String title) {
        putClientProperty(WorkspaceModuleProperties.COMPONENT_TITLE, title);
    }
}

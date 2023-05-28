package com.projectvpn.module.training;

import com.projectvpn.module.Module;

public class TrainingModule extends Module {
	public TrainingModule() {
		super("Training");
	}

	@Override
	public void viewOperations() {
		System.out.println("Viewing technical operations of " + moduleName + " module.");
	}
}
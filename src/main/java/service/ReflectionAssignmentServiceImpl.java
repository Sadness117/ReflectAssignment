package service;

import model.ReflectionAssignmentPojo;

public class ReflectionAssignmentServiceImpl {
	public void getClassInformation(String userInput) {
		
		Class inputClass = null;
		try {
			inputClass = Class.forName(userInput);
			ReflectionAssignmentPojo userClass = new ReflectionAssignmentPojo(inputClass);
			userClass.getConstructors();
			userClass.getMethods();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

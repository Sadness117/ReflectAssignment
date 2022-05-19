package model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ReflectionAssignmentPojo {
	private Class userClass;
	public ReflectionAssignmentPojo(Class inputClass){
		this.userClass = inputClass;
	}
	public void getConstructors() {
		Constructor[] allConstructors = userClass.getConstructors();
		for(Constructor eachConstructor : allConstructors) {
			String finalString = "";
			finalString += Modifier.toString(eachConstructor.getModifiers());
			finalString += " void ";
			finalString+= eachConstructor.getName();
			
			Parameter[] allParams = eachConstructor.getParameters();
			
			finalString += "(";
			if (allParams.length != 0) {
				
				for(Parameter eachParam : allParams) {
					finalString += eachParam.getType() + ", ";
					
				}
				finalString = finalString.substring(0, finalString.length()-1);
				finalString = finalString.substring(0, finalString.length()-1);
				
			}
			finalString += ") ";
			
			
			Type[] allExceptions = eachConstructor.getGenericExceptionTypes();
			for(Type eachException: allExceptions) {
				finalString += "throws ";
				finalString += eachException.getTypeName();
			}
			
			System.out.println(finalString);
		}
		
	}
	public void getMethods() {
		Method[] allMethods = userClass.getMethods();
		for(Method eachMethod : allMethods) {
			String finalString = "";
			finalString += Modifier.toString(eachMethod.getModifiers());
			finalString += " void ";
			finalString+= eachMethod.getName();
			
			Parameter[] allParams = eachMethod.getParameters();
			finalString += "(";
			if (allParams.length != 0) {
				
				for(Parameter eachParam : allParams) {
					finalString += eachParam.getType() + ", ";
					
				}
				finalString = finalString.substring(0, finalString.length()-1);
				finalString = finalString.substring(0, finalString.length()-1);
				
			}
			finalString += ") ";
			Type[] allExceptions = eachMethod.getGenericExceptionTypes();
			for(Type eachException: allExceptions) {
				finalString += "throws ";
				finalString += eachException.getTypeName();
			}
			
			System.out.println(finalString);
		}
	}
	
}

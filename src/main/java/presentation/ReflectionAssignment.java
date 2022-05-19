package presentation;

import java.util.Scanner;

import service.ReflectionAssignmentServiceImpl;

public class ReflectionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReflectionAssignmentServiceImpl service = new ReflectionAssignmentServiceImpl();
		Scanner scan = new Scanner(System.in);
		String input = null;
		char proceed = 'y';
		while(proceed== 'y') {
			
			System.out.println("Please input a Class");
			input = scan.next();
			System.out.println(input);
			System.out.println("Working");
			service.getClassInformation(input);
			
			
			
			
			
		}

	}

}

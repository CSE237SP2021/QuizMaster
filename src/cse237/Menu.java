package cse237;

import java.util.Scanner;

public class Menu {
	
	private Scanner keyboardIn;
	
	public Menu() {
		keyboardIn = new Scanner(System.in);
	}

	public static void main(String[] args) {
		
		Menu quizMasterMenu = new Menu();
		quizMasterMenu.runMenu();
		
	}

	private void runMenu() {
		this.displayMainMenu();
		
		int selectedOption = this.getUserInput();
		
		this.processMainMenu(selectedOption);
		this.keyboardIn.close();
	}

	private void processMainMenu(int selectedOption) {
		if(selectedOption == 1) {
			this.displayTeacherMenu();
			
			int teacherOption = this.getUserInput();
			this.processTeacherMenu(teacherOption);
		} else {
			//student menu here
			this.displayStudentMenu();
			
			int studentOption = this.getUserInput();
			this.processStudentMenu(studentOption);
		}
	}

	private void processStudentMenu(int studentOption) {
		if(studentOption == 1) {
			System.out.println("List of quizzes!");
		}
		else if(studentOption == 2) {
			System.out.println("Taking a quiz!");
		}
		else if(studentOption == 3) {
			System.out.println("Viewing Quiz scores!");
		}
	}

	private void processTeacherMenu(int teacherOption) {
		if(teacherOption == 1) {
			System.out.println("Creating a quiz!");
		}
		else if(teacherOption == 2) {
			System.out.println("Viewing grades");
		}
		else if(teacherOption == 3) {
			System.out.println("Editing");
		}
	}

	private void displayStudentMenu() {
		System.out.println("1. See list of quizzes");
		System.out.println("2. Take a quiz");
		System.out.println("3. View your quiz scores");
	}

	private void displayTeacherMenu() {
		System.out.println("1. Create a Quiz");
		System.out.println("2. View Quiz Grades");
		System.out.println("3. Edit Existing Quiz");
	}

	private void displayMainMenu() {
		System.out.println("Welcome to QuizMaster!");
		System.out.println("Please select an option: ");
		
		System.out.println("1. Teacher Menu");
		System.out.println("2. Student Menu");
	}
	
	private int getUserInput() {
		return keyboardIn.nextInt();
	}
}
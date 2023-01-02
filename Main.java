package com.greatlearning.service;
import com.greatlearning.model.Employee

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee employee = new Employee("Prakhar", "Sharma");
        CredentialService credHandler = new CredentialService();
        String generatedEmail;
        char[] generatedPassword;
        System.out.println("Please enter the department from the following ");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        Scanner sc  = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option){
            case 1:
                generatedEmail = credHandler.generateEmailAddress(employee.getFirstName().toLowerCase(),
                        employee.getLastName().toLowerCase(), "tech");
                generatedPassword = credHandler.generatePassword();
                credHandler.showCredentials(employee, generatedEmail, generatedPassword);
                break;

            case 2:
                generatedEmail = credHandler.generateEmailAddress(employee.getFirstName().toLowerCase(),
                        employee.getLastName().toLowerCase(), "adm");
                generatedPassword = credHandler.generatePassword();
                credHandler.showCredentials(employee, generatedEmail, generatedPassword);
                break;

            case 3:
                generatedEmail = credHandler.generateEmailAddress(employee.getFirstName().toLowerCase(),
                        employee.getLastName().toLowerCase(), "hr");
                generatedPassword = credHandler.generatePassword();
                credHandler.showCredentials(employee, generatedEmail, generatedPassword);
                break;

            case 4:
                generatedEmail = credHandler.generateEmailAddress(employee.getFirstName().toLowerCase(),
                        employee.getLastName().toLowerCase(), "lg");
                generatedPassword = credHandler.generatePassword();
                credHandler.showCredentials(employee, generatedEmail, generatedPassword);
                break;
            default:
                System.out.println("Enter a valid option");

        }





    }
}

package dsa.util.foundation;

import java.util.Scanner;


import dsa.util.foundation.Foundation.BasicDataTypes;
import dsa.util.foundation.Foundation.ConditionalStatements;
import dsa.util.foundation.Foundation.LoopExamples;
import dsa.util.foundation.Foundation.StringExamples;
import dsa.util.foundation.Foundation.SwitchStatement;
import dsa.util.foundation.Foundation.WrapperClassExamples;

public class Run {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an option to run:");
            System.out.println("1. Basic Data Types");
            System.out.println("2. Conditional Statements");
            System.out.println("3. Switch Statement");
            System.out.println("4. Loop Examples");
            System.out.println("5. Array Examples");
            System.out.println("6. String Examples");
            System.out.println("7. Wrapper Class Examples");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BasicDataTypes basicDataTypes = new BasicDataTypes();
                    basicDataTypes.runExamples();
                    break;
                case 2:
                    ConditionalStatements conditionalStatements = new ConditionalStatements();
                    conditionalStatements.runExamples();
                    break;
                case 3:
                    SwitchStatement switchStatement = new SwitchStatement();
                    switchStatement.runExamples();
                    break;
                case 4:
                    LoopExamples loopExamples = new LoopExamples();
                    loopExamples.runExamples();
                    break;
                case 5:
                	Foundation.ArrayExamples arrayExamples = new Foundation.ArrayExamples();
                    arrayExamples.runExamples();
                    break;
                case 6:
                    StringExamples stringExamples = new StringExamples();
                    stringExamples.runExamples();
                    break;
                case 7:
                    WrapperClassExamples wrapperClassExamples = new WrapperClassExamples();
                    wrapperClassExamples.runExamples();
                    break;
                case 8:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

}

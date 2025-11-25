package dev.jaca;

import java.util.Scanner;

import dev.jaca.desenvolvimento.Bmi;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        do{
            System.out.println("\n=== EXERCISE MENU ===");
            System.out.println("1. Multiplication Table");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Even or Odd Checker");
            System.out.println("4. Remainder");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter a number for its multiplication table: ");
                    var number = scanner.nextInt();
                    for(int i = 1; i <= 10; i++){
                        System.out.printf("%d x %d = %d%n", number, i, number * i);
                    }
                    break;
                case 2:
                    Bmi bmi = new Bmi();
                    System.out.println("Enter your weight (kg): ");
                    bmi.setWeight(scanner.nextFloat());
                    System.out.println("Enter your height (m): ");
                    bmi.setHeight(scanner.nextFloat());
                    bmi.imputData(bmi.getWeight(), bmi.getHeight());
                    break;
                case 3:
                    System.out.println("Enter a first number: ");
                    var firstNumber = scanner.nextInt();
                    System.out.println("Enter a second number: ");
                    var secondNumber = scanner.nextInt();
                    if (secondNumber < firstNumber) {
                        System.out.println("Second number must be greater than or equal to first number.");
                        break;
                    }
                    System.out.println("select an option: 1 - even / 2 - odd");
                    var evenOddOption = scanner.nextInt();
                    if (evenOddOption == 1) {
                        System.out.println("Even numbers:");
                        for (int i = secondNumber; i >= firstNumber; i--) {
                            if (i % 2 == 0) {
                                System.out.println(i);
                            }
                        }
                    }else if (evenOddOption == 2) {
                        System.out.println("Odd numbers:");
                        for (int i = secondNumber; i >= firstNumber; i--) {
                            if (i % 2 != 0) {
                                System.out.println(i);
                            }
                        }
                    }else{
                        System.out.println("Invalid option.");
                    }
                    break;
                case 4:
                    System.out.println("You selected Option 4");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while(option != 5);
    }    
}
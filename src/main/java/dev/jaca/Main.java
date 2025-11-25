package dev.jaca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        do{
            System.out.println("\n=== EXERCISE MENU ===");
            System.out.println("1. Multiplication Table");
            System.out.println("2. IMC Calculator");
            System.out.println("3. Even or Odd Checker");
            System.out.println("4. Remainder");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            switch(option){
                case 1:
                    System.out.println("informe o numero que deja a tabuada:");
                    var numero = scanner.nextInt();
                    for(int i = 1; i <= 10; i++){
                        System.out.printf("%d x %d = %d%n", numero, i, numero * i);
                    }
                    break;
                case 2:
                    System.out.println("You selected Option 2");
                    break;
                case 3:
                    System.out.println("You selected Option 3");
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

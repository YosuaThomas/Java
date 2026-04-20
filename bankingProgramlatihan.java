/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanjava;

import java.util.Scanner;

/**
 *
 * @author jhoooganteng
 */
public class bankingProgramlatihan {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        //declare variabel
        double balance = 0;
        boolean isRunning = true;
        int choice;

        //display menu
        while(isRunning){
        System.out.println("---------------");
        System.out.println("Banking program");
        System.out.println("---------------");
        System.out.println("1. show balance");
        System.out.println("2. deposit");
        System.out.println("3. withdraw");
        System.out.println("4. exit");
        System.out.println("---------------");
        
        System.out.print("enter your choice: ");
        choice = scanner.nextInt();
        
        //get and process user choice
        switch(choice){
            case 1 -> showBalance(balance);
            case 2 -> balance += deposit();
            case 3 -> balance -= withdraw(balance);
            case 4 -> isRunning = false; //exit message
            
            default -> System.out.println("Invalid choice");
        }
        
        }
        scanner.close();
    }
    
    //showBalance()
    static void showBalance(double balance){
        System.out.printf("Rp%.2f\n", balance);
    }
    //deposit()
    static double deposit(){
        double amount;
        
        System.out.print("enter a amount to be deposited: ");
        amount = scanner.nextDouble();
        
        if(amount <0){
            System.out.println("amount can'e be negative");
            return 0;
        }
        else{
            return amount;
        }
        
    }
    
    //withdraw()
    static double withdraw(double balance){
        
        double amount;
        System.out.print("enter amount to be withdrawn: ");
        amount = scanner.nextDouble();
        
        if(amount>balance){
            System.out.println("insufficient funds");
            return 0;
        }
        else if(amount <0){
            System.out.println("amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
@author Tirawati_20210040078_TI21F
 */
public class CheckingAccount1 extends Account{
    
    // Default Transaction Fee
    private static double FEE = 2.5;

    // default constructor
    public CheckingAccount1() {
        super();
    }
    
    public CheckingAccount1(int accountNumber, double fee) {
        super(accountNumber);
        FEE = fee;
    }

    @Override
    public void deposit(double amount) {

        if( amount > 0) {
            balance += amount;
            System.out.printf("Amount %.2f deposited%n", amount);
            balance -= FEE;
            System.out.printf("Fee %.2f Applied%n", FEE);
            System.out.printf("Current Balance is: %.2f%n", balance);
            
        } else {
            System.out.println("A negative amount cannot be deposited");
        }
    }
    @Override
    public void withdraw(double amount) {
        if(amount > 0) {
          
            if((amount+FEE) <= balance) {

                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                balance -= amount;
                balance -= FEE;
                System.out.printf("Fee of %.2f applied%n", FEE);
                System.out.printf("Current Balance is: %.2f%n", balance);
            }
        } else {
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }
}
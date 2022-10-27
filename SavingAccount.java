/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 @author Tirawati_20210040078_TI21F
 */
public class SavingAccount extends Account{
    private double interestRate;
    
    public SavingAccount(double balance, double interstRate){
        super(balance);
        this.interestRate = interstRate;
    }
            
}

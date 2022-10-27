/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 @author Tirawati_20210040078_TI21F
 */
public class CheckingAccount extends Account {
    
    private double overdraftProtection;

    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }

    public CheckingAccount(double balance) {
        this(balance, -1);
    }

    @Override
    public boolean withDraw(double amt) {
        if (balance - amt >= 0) {
            balance -= amt;
            return true;
        } else {
            if (overdraftProtection <= amt - balance) {
                return false;
            }else{
                balance=0;
                overdraftProtection-=amt-balance;
                return true;
            }
        }
    }

}

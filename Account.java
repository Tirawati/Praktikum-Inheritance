/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tirawati_20210040078_TI21F
 */
public class Account {
    protected double balance;
    
    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amt){
        balance+=amt;
        return true;
    }
    
    public boolean withDraw(double amt){
        balance-=amt;
        return true;
    }
}
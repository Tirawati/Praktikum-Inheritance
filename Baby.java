/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
@author Tirawati_20210040078_TI21F
 */
public class Baby extends Parent{
    String babyName;

    public String getBabyName() {
        return babyName;
    }
    Baby(String babyName){
        super();
        this.babyName = babyName;
        System.out.println("Konstruktor Baby");
        System.out.println(babyName);
 } 
    public void cry() {
        System.out.println("owek owek");
    }
}
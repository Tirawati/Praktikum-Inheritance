/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
@author Tirawati_20210040078_TI21F
 */
public class HappyObject extends MoodyObject{
    
    protected String getHappy(){
        return"happy";
    }
    public void laugh(){
        System.out.println("Hahaha : " + getHappy());
 }
}

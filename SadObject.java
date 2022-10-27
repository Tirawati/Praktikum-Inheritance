/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
@author Tirawati_20210040078_TI21F
 */
public class SadObject {
    extends MoodyObject{
   
 protected String getSad(){
        return "sad";
    }
    public void cry(){
        System.out.println("Hoo hoo : "+ getSad());
 }
}

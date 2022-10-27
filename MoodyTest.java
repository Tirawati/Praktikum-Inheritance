/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
@author Tirawati_20210040078_TI21F
 */
public class MoodyTest {
     public static void main(String[] args) {
        MoodyObject m = new MoodyObject();
        SadObject Sad = new SadObject();
        HappyObject Happy = new HappyObject();
        
        m.speak();
        Sad.cry();
        Happy.laugh();
    }
}
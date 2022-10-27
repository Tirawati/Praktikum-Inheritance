/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
@author Tirawati_20210040078_TI21F
 */
public class InheritanceExample {
    
public static void main(String[] args) {
    Bapak objectBapak = new Bapak();
    Anak objectAnak = new Anak();
    


objectBapak.a=1;
objectBapak.b=1;
System.out.println("Object Bapak (Superclass):");
objectBapak.show_variabel();

objectAnak.c=5;
System.out.println("Object Anak (Superclass dari Bapak):");
objectAnak.show_Variabel();
}
}

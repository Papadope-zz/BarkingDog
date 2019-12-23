/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barkingdog;

/**
 *
 * @author User
 */
public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay >= 0 && hourOfDay <= 23) {
            if ((barking == true) && (hourOfDay < 8) || (hourOfDay > 22)) {
                System.out.println(barking);
            } else {
                barking = false; 
                System.out.println(barking);
            }
        } else {
            barking = false;
            System.out.println(barking);
        }return barking;
    }
}

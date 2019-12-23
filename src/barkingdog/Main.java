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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarkingDog.shouldWakeUp(false ,7);
        BarkingDog.shouldWakeUp(true, -1);
//        BarkingDog.shouldWakeUp(true, 8);
//        BarkingDog.shouldWakeUp(true, -1);
        BarkingDog.shouldWakeUp(true, 1);
        BarkingDog.shouldWakeUp(false, 2);
        BarkingDog.shouldWakeUp(true, 8);
        BarkingDog.shouldWakeUp(true, -1);
    }
    
}

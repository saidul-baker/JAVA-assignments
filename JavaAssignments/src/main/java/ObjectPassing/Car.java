/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPassing;

/**
 *
 * @author sajid
 */
public class Car {
    public Car(Truck tr_1){
        int wheels=(tr_1.wheels)-2;
        int weight=(tr_1.weight)/2;
        System.out.println("Car wheels :"+wheels+" "+"Car weight :"+weight);
    }
    
}

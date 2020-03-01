/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPassing;


public class Main {
    public static void main(String[] args) {
        System.out.print("Object passing way 1:");
        Truck tr_1=new Truck();
        Car cr_1=new Car(tr_1);
        
        System.out.print("Object passing way 2:");
        Truck tr_2=new Truck(8,2000,"Green");
        Car cr_2=new Car(tr_2);
        
           
        tr_1.wheels=12;
        tr_1.weight=3000;
        tr_1.color="Blue";
        
        System.out.print("Way 3:");
        Truck tr_3=new Truck(tr_1);
        Car cr_3=new Car(tr_3);
    }
        
    
}

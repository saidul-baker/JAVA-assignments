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
public class Truck {
    int wheels=6,weight=1000;
    String color="yellow";
    public Truck(){
        System.out.println("Truck wheels ="+wheels+" "+"Truck weight ="+weight+" "+"Truck color ="+color);
    }
    public Truck(int wheels,int weight,String color){
        this.wheels=wheels;
        this.weight=weight;
        this.color=color;
        System.out.println("Truck wheels ="+this.wheels+" "+"Truck weight ="+this.weight+" "+"Truck color ="+this.color);
    }
    public Truck(Truck object)
    {
        this.wheels=object.wheels;
        this.weight=object.weight;
        this.color=object.color;
         System.out.println("Truck wheels ="+this.wheels+" "+"Truck weight ="+this.weight+" "+"Truck color ="+this.color);
    }
    
}

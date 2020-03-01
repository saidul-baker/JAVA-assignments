/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

import java.util.Scanner;

/**
 *
 * @author sajid
 */
public class Main {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       SolveFibonacci object=new SolveFibonacci();
       int ans=object.solve(n);
        System.out.println(ans);
    }
    
}

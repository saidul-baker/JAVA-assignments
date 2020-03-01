/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

/**
 *
 * @author sajid
 */
public class SolveFibonacci {
    int solve(int n){
        if (n==0)
      return 0;
   else if (n==1)
      return 1;
   else
      return (solve(n-1)+solve(n-2));
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author Dell
 */import java.util.Scanner;
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=input.nextInt();
        System.out.println("sum="+sumDigits(num));
        // TODO code application logic here
        
    }
    public static int sumDigits(int num){
  int sum=0;
  
  while (num>0){
      
      sum= sum+(num%10);
      num=num/10;
    }
      return sum;  
        
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountinterface;

/**
 *
 * @author teel6
 */
import java.util.Scanner;
public class Account implements AccountInterface{
    private double balance;
    private String name;
   Account(){
       
   }
    
     
   Account(String name,double balance){
       name = null;
       balance = 0.0;
    }
    
    public String getName(){
    return name;
    }
    
    public double getBalance(){
    return balance;
        }
    
    
    public void setName(String newName){
    Scanner Name = new Scanner(System.in);
    name = Name.nextLine();
    }
    
    public void setBalance(double newBalance){
        Scanner Balance = new Scanner(System.in);
        balance = Balance.nextFloat();
    }
    
  
    public  double withdraw(double amount){
          if(amount<0){
              balance = balance - amount;
          }
    
          else if((balance-amount)<0){
              System.out.println("You don't have the funds.");
    }
          else
            System.out.println("There is no withdrawal.");
            return balance;
}

    
public double deposit(double amount){
    balance = balance+amount;
    return balance;
        }
    
    public void displayAccountInfo() {
        System.out.println("The account holder" + Name + " has a blance of $" + balance);

  }
    
     public  double balance() {
         return balance;
  }
    

}


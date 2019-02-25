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
public class TestAccount {
    public static void main(String[] args) {
             Scanner sc= new Scanner(System.in);

      System.out.println("Select a choice:");
      System.out.println("1. Existing customer");
      System.out.println("2. New customer");   
      System.out.println("3. Quit");
String str1=sc.next();
Account temp=null;
if(str1.equals("1")){
    System.out.println("Enter your name: ");
    
    String str2=sc.next();
      for(Account acc: accountList){
          
                  if(acc.getName().compareTo(str2)==0)
                  {
                      temp=acc;

                  }

          }
      System.out.println("Would you like to: ");
          System.out.println("1. Deposit ");
          System.out.println("2. Withdraw ");
          System.out.println("3. Display account info ");
          System.out.println("4. Check balance ");
String str3=sc.next();
             if(str3.equals("1")){
                 System.out.println("The balance before deposit: "+ temp.getBalance());
            System.out.println("How much would you like to deposit?");
            
            double deposit = sc.nextDouble();
            temp.deposit(deposit);
            System.out.println("The balance after deposit: "+ temp.getBalance());

          
        }
             
               else if (str3.equals("2")){
                   System.out.println("The balance before withdraw: "+ temp.getBalance());
           System.out.println("How much would you like to withdraw?");
            double withdraw = sc.nextDouble(); 
            temp.withdraw(withdraw);
System.out.println("The balance after withdraw: "+ temp.getBalance());
          }
             
             else if (str3.equals("3")){
            temp.displayAccountInfo();
          }
              else if (str3.equals("4"))
           temp.balance();

          else
            System.out.println("Invalid");
             
            
}
  //new customer
else if(str1.equals("2")){
          //add new user to arraylist

         

           System.out.println("Enter your name: ");
           String str4 = sc.next(); 
           
           System.out.println("Enter initial balance: ");
          double balance = sc.nextInt(); 

           
           accountList.add(new Account(str4 , balance));
           
           System.out.println("All account's info are displayed as follows: ");
           
for(Account acc: accountList){
System.out.println(acc.getName());
            System.out.println(acc.getBalance());


        }
}

 else if(str1.equals("3")){

          System.out.println("Thanks for using this bank!");
          //flag = false;
        }

        else{

          System.out.println("Invalid");

        }
   
        
    }
}

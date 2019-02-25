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
public interface AccountInterface {
    
    public void deposit(); 

    public void withdraw();

    public double getBalance();

    public String getName();
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author jayia
 */
public class readyCake extends Cake{
    
    public readyCake(double price, String flavour){
        super(price, flavour);
    }
    @Override
    public String toString() {
        return " cake: "+flavour + "_" + String.format("%.2f", calculatePrice());
    }
    
    @Override
    public double calculatePrice(){
        return price;
    }
    
}

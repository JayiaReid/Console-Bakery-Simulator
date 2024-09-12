/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author jayia
 */
abstract class Cake{
//    protected String name;
    protected double price;
    protected String flavour;
    
    protected Cake( double price, String flavour){
        this.flavour=flavour;
        this.price=price;
    }
    
    abstract public double calculatePrice();
    
    @Override
    abstract public String toString();
}

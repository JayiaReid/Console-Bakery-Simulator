/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author jayia
 */

class customCake extends Cake{
    private int size;
    private double fee;//imagine price is dependent on tiers and then fee is for customizations
    private String name;
    private String notes;
    
    public customCake(String name, double price, int size, double fee, String flavour, String notes ){
        super(price,flavour);
        this.name = name;
        this.size = size;
        this.fee = fee;
        this.notes = notes;
    }
    
    @Override
    public String toString() {
        return  " cake: "+ name+ "_"+flavour + "_"+ size+ "_" + String.format("%.2f", calculatePrice())+ "_"+notes;
    }
    
    @Override
    public double calculatePrice(){
        return price*size + fee;
    }
}

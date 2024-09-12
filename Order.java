/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jayia
 */

import java.util.ArrayList;

public class Order {
    private ArrayList<Cake> cakes;
    private String date;
    private double totalPrice;

    public Order(String date) {
        this.cakes = new ArrayList<>();
        this.date = date;
        this.totalPrice = 0;
    }

    public void addCakes(Cake cake) {
        this.cakes.add(cake);
        setPrice();
    }
    
    public void addCakes(Cake[] cakes){
        for (Cake cake : cakes){
            this.cakes.add(cake);
        }
        setPrice();
    }

    private void setPrice() {
        this.totalPrice = 0;
        for (Cake cake : cakes) {
            this.totalPrice += cake.calculatePrice();
        }
    }

    public double getTotalPrice() {
        
        return totalPrice;
    }
    
    

    public void saveOrderToFile(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\jayia\\OneDrive - Humber College\\Desktop\\pgrming\\java\\Bakery\\src\\bakery\\orders.txt", true))) {
            writer.write(date + ",");
            for (Cake cake : cakes) {
                writer.write(cake.toString() + ",");
            }
            writer.write( String.format("%.2f", totalPrice) + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
    
}

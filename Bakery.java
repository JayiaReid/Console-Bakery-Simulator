/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bakery;

import java.awt.Font;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author jayia
 */
public class Bakery {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Intro and Selection
        System.out.println("Welcome to BakeCo.!");
        System.out.println("Select what you would like to do: \n 1- Order Cake(s) 2- View Cake Orders");

        Scanner s = new Scanner(System.in);
        int selection = s.nextInt();
        s.nextLine();

        // order cakes
        if (selection == 1) {
            LocalDate today = LocalDate.now();
            Order order = new Order(today.toString());
            int function = 2;

            // selecting and ordering based on cake type
            while (function == 2) {
                System.out.println("Select order type: \n 1-Ready Made Cake 2-Custom Order");
                int cakeType = s.nextInt();

                if (cakeType == 1) {
                    System.out.println("Select flavour: ");
                    ReadFiles read = new ReadFiles();
                    read.printRCakes();
                    int fselect = s.nextInt();

                    double price = read.getRCakePrice(fselect);
                    String flavour = read.getRCakeFlavour(fselect);

                    order.addCakes(new readyCake(price, flavour));

                } else if (cakeType == 2) {

                   System.out.print("\nEnter customer name: \n");
                    String name = s.nextLine();

                    System.out.print("\nEnter flavour: \n");
                    String flavour = s.nextLine();

                    System.out.print("\nEnter number of tiers: \n");
                    int tiers = s.nextInt();
                    s.nextLine();
                    double price = 20.50 * tiers;

                    System.out.println("\nEnter pan size in inches: \n");
                    int size = s.nextInt();
                    s.nextLine();

                    System.out.print("\nEnter additional details: \n");
                    String notes = s.nextLine();

                    System.out.print("\nEnter additional fees: \n");
                    double fee = s.nextInt();
                    s.nextLine();

                    order.addCakes(new customCake(name, price, size, fee, flavour, notes));

                }
                System.out.print("\n2 to add more cakes, 1 to save order or 3 to cancel order \n");

                function = s.nextInt();

            }

            if (function == 1) {
                order.saveOrderToFile();
            } else if (function == 3) {
                System.out.print("\norder cancelled.");
            }

        } else if (selection == 2) {
            System.out.print("\ncoming soon");
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author jayia
 */
public class ReadFiles {
    private ArrayList<Cake> rCakes;
    
    private void getRCakes(){
        String line = "";
        rCakes = new ArrayList<>();
        
        try(BufferedReader readRCakes = new BufferedReader(new FileReader("C:\\Users\\jayia\\OneDrive - Humber College\\Desktop\\pgrming\\java\\Bakery\\src\\bakery\\readyCakes.txt"))){
            while((line = readRCakes.readLine())!=null){
                String[] info = line.split(",");
//                new readyCake( double(info[1]),info[0]);
                 this.rCakes.add(new readyCake(Double.parseDouble(info[1]), info[0]));
            }
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
//            return false;
         } catch(IOException e){
             System.out.println(e.getMessage());
//            return false;
         }
    }
    
    public void printRCakes(){
        getRCakes();
        int i = 1;
        String text = "";
        for (Cake cake: rCakes){
            System.out.println(i+"- "+cake.flavour+"\n");
            i++;
        }
    }
    
    public double getRCakePrice(int i){
        return rCakes.get(i).price;
    }
    
    public String getRCakeFlavour(int i){
        return rCakes.get(i).flavour;
    }
    
    
}

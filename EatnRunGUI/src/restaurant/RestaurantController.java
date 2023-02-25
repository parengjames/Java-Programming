/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;

/**
 *
 * @author james
 */
public class RestaurantController {
    private ArrayList <menu> data;
    
    public RestaurantController(){
        
    }
    public RestaurantController(ArrayList<menu>list){
        this.data = list;
    }
    public ArrayList menuList(){
        ArrayList <menu> data = new ArrayList<>();
        menu m1= new menu("Blueberry Muffin",50);
        menu m2 = new menu("StrawBerry",30);
        menu m3 = new menu("Lite Yogurt",40);
        menu m4 = new menu("Vanilla Ice Cream",90);
        menu m5 = new menu("Hash Browns",35);
        menu m6 = new menu("Toast",25);
        menu m7 = new menu("French Fries",50);
        menu m8 = new menu("Onion Soup",75);
        menu m9 = new menu("Coffee",30);
        menu m10 = new menu("Iced Tea",50);
        menu m11 = new menu("Hot Chocolate",30);
        data.add(m1);
        data.add(m2);
        data.add(m3);
        data.add(m4);
        data.add(m5);
        data.add(m6);
        data.add(m7);
        data.add(m8);
        data.add(m9);
        data.add(m10);
        data.add(m11);
        return data;     
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author james
 */
public class menu {
    String itemName;
    double price;
    
    private int quantity;
    private double total;
    
    public menu(){   
    }
    public menu(String ItemName, double Price){
        this.itemName = ItemName;
        this.price = Price;
        
    }
    public menu(String ItemName, double Price,int qty,double total){
        this.itemName = ItemName;
        this.price = Price;
        this.quantity = qty;
        this.total = total;
    }
    public String getItemname(){
        return this.itemName;
    }
    public void setItemname(String item){
        this.itemName = item;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double Price){
        this.price = Price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int qty){
        this.quantity = qty;
    }
    public double getTotal(){
        return this.total;
    }
    public void setTotal(double total){
        this.total = total;
    }
}

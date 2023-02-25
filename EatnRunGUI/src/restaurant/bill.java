/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;

/**
 *
 * @author james
 */
public class bill {
    
    String CustomerName;
    double subTotal ;
    double tax ;
    double totalBill ;
    int number = 1;
    ArrayList <menu> menuList;
    
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    String dateNow = formatter.format(date);
    
    public bill(){
        
    }
    public bill(String customername,double subtotal,double Tax,double totalbill,ArrayList <menu> cartlist){
        this.CustomerName = customername;
        this.subTotal = subtotal;
        this.tax = Tax;
        this.totalBill = totalbill;
        this.menuList = cartlist;
    }
    public String getCustomername(){
        return this.CustomerName;
    }
    public void setCustomername(String name){
        this.CustomerName = name;
    }
    public double getSubtotal(double subtotal){
        subTotal = subtotal;
        return this.subTotal;
    }
    public double getTax(double Tax){
        tax = Tax;
        return this.tax;
    }
    public double getTotalBill(double bill){
        totalBill = bill;
        return this.totalBill;
    }
    public ArrayList <menu> getMenuList(){
        return this.menuList; 
    }
    public void setMenuList(ArrayList <menu> list){
        this.menuList = list;
    }
    public void printReceipt(){
        int Billnumber = number++;
        System.out.println("Your receipt here:");
        System.out.printf("%s\n","---------------------------------------------------------------");
        System.out.printf("%s%s\n","Customer name: ",CustomerName);
        System.out.printf("%s%s\n","Date: ",dateNow);
        System.out.printf("%s%s\n","Bill number: ",Billnumber);
        System.out.printf("%s\n","---------------------------------------------------------------");
        System.out.printf("%-25s%-15s%-10s%10s\n","Item","Price","Quantity","Total");
        System.out.printf("%s\n","---------------------------------------------------------------");
        for (menu menuList1 : menuList) {
            System.out.printf("%-25s%-15.2f%-10s%10.2f\n",menuList1.getItemname(),menuList1.getPrice(),menuList1.getQuantity(),menuList1.getTotal());
        }
        System.out.printf("%s\n","---------------------------------------------------------------");
        System.out.printf("%s%.2f\n","Subtotal: ",subTotal);
        System.out.printf("%s%.2f\n","Tax: ",tax);
        System.out.printf("%s%.2f\n","Total: ",totalBill);
        System.out.printf("%s\n","---------------------------------------------------------------");
    }
}

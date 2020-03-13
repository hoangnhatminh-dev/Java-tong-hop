/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

/**
 *
 * @author rough
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String classification;
    
    public Product(int id, String name, double price, int quantity, String classification){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.classification = classification;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getQty(){
        return quantity;
    }
    
    public double setPrice(double price){
        this.price = price;
        return price;
    }

    @Override
    public String toString() {
        return "Product{" + " id= " + id + ", name= " + name + ", price= " + price + ", quantity= " + quantity + ", classification= " + classification + '}';
    }
    
    
            
}

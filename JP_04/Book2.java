/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_04;
import java.util.Arrays;

/**
 *
 * @author rough
 */
public class Book2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    

    public Book2(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Author[] getAuthors(){
        return this.authors;
    }
    
    
    public double getPrice(){
        return this.price;
    }
    
    public int getQty(){
        return this.qty;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }
    
    
    @Override
    public String toString(){
        return "Book[ name = " + this.name + Arrays.toString(authors)
                + "]}, price = " + this.price + ", qty = " + this.qty;
    }

}

package giftmodel;

public class Gift {

    private int id;
    private String name;
    private double price;
    private int qty;

     public Gift(){
        id = 0;
         name = null;
         price = 0;
         qty = 0;
     }

     public Gift(int id, String name, double price, int qty){
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
     }

     public int getID(){
         return this.id;
     }

     public String getName(){
         return this.name;
     }

     public double getPrice(){
         return this.price;
     }

     public int getQty(){
         return this.qty;
     }

     public void setID(int id){
         this.id = id;
     }

     public void setName(String name){
         this.name = name;
     }

     public void setPrice(double price){
         this.price = price;
     }

     public void setQty(int qty){
         this.qty = qty;
     }

     @Override
    public String toString(){
         return "ID = " + this.id + ", Name = " + this.name + ", Price = " + this.price + ", Quantity = " + this.qty;
     }

}

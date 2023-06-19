package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int  vegPizzaPrice = 300;
    private int  nonVegPizzaPrice = 400;
    private int  cheezePrice = 80;
    private int  toppingPrice = 70;
    private int  pakingBagPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg){
            this.bill ="";
            price += vegPizzaPrice;

            this.bill ="Base Price Of The Pizza: "+vegPizzaPrice+"\n";
        } else {
            price += nonVegPizzaPrice;
            this.bill ="";
            bill += "Base Price Of The Pizza: "+nonVegPizzaPrice+"\n";
        }
    }

    public int getPrice(){
        return this.price;
    }
boolean flag = false;
    int A = 0 , B= 0 ,C=0;
    public void addExtraCheese(){
        // your code goes here
        if(A==0) {
            price += cheezePrice;
            bill += "Extra Cheese Added: " + cheezePrice + "\n";
            flag = true;
            A++;
        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(flag==true && B==0){
            price += toppingPrice;
            this.bill += "Extra Toppings Added: " +toppingPrice+"\n";
            B++;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(C==0) {
            price += pakingBagPrice;
            this.bill += "Paperbag Added: " + pakingBagPrice + "\n";
            C++;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: "+ this.price+"\n";
        return this.bill;
    }

}

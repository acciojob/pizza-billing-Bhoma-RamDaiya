package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean istakeAwayAdded;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg){

            price += 300;
            this.bill ="";

        } else {
            price += 400;
            this.bill ="";

        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
       if(isCheeseAdded==false){
           price += 80;
           isCheeseAdded = true;
       }


    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppingsAdded==false ){
            if(isVeg)
            price += 70;
            else price += 120;
            isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(istakeAwayAdded==false){
            price += 20;
            istakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
       if(isVeg) {
           bill +=  "Base Price Of The Pizza: 300" +  '\n';
       }
       else {
           bill += "Base Price Of The Pizza: 400" + '\n';
       }

       if(isCheeseAdded) bill += "Extra Cheese Added: 80"+'\n';
       if(isExtraToppingsAdded && isVeg) bill += "Extra Toppings Added: 70"+'\n';
       else if(isExtraToppingsAdded && !isVeg) bill += "Extra Toppings Added: 120"+'\n';
       if(istakeAwayAdded) bill+= "Paperbag Added: 20"+'\n';
      bill +=  "Total Price: "+ price +'\n';
      return bill;
    }

}

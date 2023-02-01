package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private int Cheese;
    private int Toppings;
    private int Bagage;

    private Boolean isExtraCheese;
    private Boolean isExtraToppings;
    private Boolean isTakeAway;
    private Boolean isBillGenerated;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheese = false;
        this.isExtraToppings = false;
        this.isTakeAway = false;
        this.isBillGenerated = false;
        this.bill = "";

        if(isVeg)
        {
            this.price = 300;
            this.Toppings = 70;
        }
        else
        {
            this.price = 400;
            this.Toppings =120;
        }
        this.Cheese = 80;
        this.Bagage=20;
        this.bill+= "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice()
    {
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheese)
        {
            this.price+=this.Cheese;
            isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppings)
        {
            this.price+=this.Toppings;
            isExtraToppings = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAway)
        {
            this.price+=Bagage;
            isTakeAway=true;
        }
    }

    public String getBill(){
        if(!isBillGenerated) {
            if (isExtraCheese)
                this.bill += "Extra Cheese Added: " + this.Cheese + "\n";
            if (isExtraToppings)
                this.bill += "Extra Toppings Added: " + this.Toppings + "\n";
            if (isTakeAway)
                this.bill += "Paperbag Added: " + this.Bagage + "\n";
            this.bill += "Total Price: " + this.price + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}

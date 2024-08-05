public abstract class Item{
    //variables
    private String itemName;
    private double price;

    
    private static int numItems=0;
   
    //constructors
    Item(){
        numItems++;
    }
    Item(String itemName,double price){
        setItemName(itemName);
        setPrice(price);
        numItems++;

    }
    public String getItemName() {
        return this.itemName;
    }
    public double getPrice() {
        return this.price;
    }
    

    public void setItemName(String itemName) {
        if(itemName.equals("")){
            throw new IllegalArgumentException("Invalid item name, name can not be blank");
        }else{
        this.itemName = itemName;
        }
    }
    public void setPrice(double price){
        if(price>0){
            this.price = price;
        }else{
            throw new IllegalArgumentException("Invalid price, price must be greater than 0");
        }
    }
    public static int getNumItems() {
        return numItems;
    }
    
    //special purpose methods

    public String toString() {
        return "*|" + this.getItemName() + "| Price: $" + this.getPrice();
    }
    public String defaultMenuString(){
    return "*| " + this.getItemName() + "| Price: $" + this.getPrice();
    }
    public static void updateNumItems(){
        numItems--;
    }

    


}//end
public abstract class Drink extends Item{
    private String size; // small medium large
    //constructors
    Drink(){}

    //for menu
    Drink(String itemName, double price){
        super(itemName,price);
    }

    Drink(String itemName, double price,String size){
        super(itemName,price);
        setSize(size);
        
    }
    //accessors
    public String getSize() {
        return this.size;
    }
    //mutator
    public void setSize(String size) {
        if(size.equalsIgnoreCase("small")||size.equalsIgnoreCase("medium")||size.equalsIgnoreCase("large"))
            this.size = size;
        else
            throw new IllegalArgumentException("Invalid size, drink size must be small, medium, or large");
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + "|Size: " + this.getSize();
    }

    public String defaultMenuString(){
        return super.toString() + " |Size: S|M|L";
    }
    
}//end
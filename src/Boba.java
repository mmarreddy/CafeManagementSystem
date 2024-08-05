public class Boba extends Drink{
    //variables
    String topping; 
    String iceLevel;// low reg extra
    //constructyors
    Boba(){}

    Boba(String itemName, double price){
        super(itemName, price);
    }
    Boba(String itemName, double price, String size){
        super(itemName, price, size);
        setTopping(topping);
        setIceLevel(iceLevel);
    }
    //accessor
    public String getTopping() {
        return this.topping;
    }
    public String getIceLevel() {
        return this.iceLevel;
    }
    //mutators
    public void setTopping(String topping) {
        if(topping.equalsIgnoreCase("tapioca")||topping.equalsIgnoreCase("jelly")||topping.equalsIgnoreCase("popping")){
            this.topping = topping;
        } else{
            throw new IllegalArgumentException("Invalid choice. Please enter one of the following: Tapioca, jelly, or popping");
        }
    }
    public void setIceLevel(String iceLevel) {
        if(iceLevel.equalsIgnoreCase("low")||iceLevel.equalsIgnoreCase("regular")||iceLevel.equalsIgnoreCase("extra")){
            this.iceLevel = iceLevel;
        }else{
            throw new IllegalArgumentException("Invalid choice. Please enter one of the following: low, regular, or extra");
        }
    }
    //speacial purpose method

    @Override
    public String toString() {
        return super.toString() + " |Topping: " + this.getTopping() + " |Ice level: "+ this.getIceLevel();
    }
    public String defaultMenuString(){
        return super.defaultMenuString();
    }

}

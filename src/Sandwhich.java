public class Sandwhich extends Food{
private String meats;
private String cheese;
private String toppings;

Sandwhich(){}
Sandwhich(String itemName,double price, String dietaryRestriction){
    super(itemName, price, dietaryRestriction);
}
Sandwhich(String itemName,double price, String dietaryRestriction, String meats, String cheese, String toppings){
    super(itemName, price, dietaryRestriction);
    setMeats(meats);
    setCheese(cheese);
    setToppings(toppings);
}

public String getMeats() {
    return this.meats;
}
public String getCheese() {
    return this.cheese;
}
public String getToppings() {
    return this.toppings;
}

public void setMeats(String meats) {
    if(meats.equalsIgnoreCase("Chicken")||meats.equalsIgnoreCase("Bacon")||meats.equalsIgnoreCase("ham")||meats.equalsIgnoreCase("none")){
        this.meats = meats;
    }else{
        throw new IllegalArgumentException("Invalid choice. Please enter one of the following: Chicken, Bacon, Ham, or none");
    }
}

public void setCheese(String cheese) {
    if(cheese.equalsIgnoreCase("pepperjack")||cheese.equalsIgnoreCase("american")||cheese.equalsIgnoreCase("swiss")||cheese.equalsIgnoreCase("none")){
        this.cheese = cheese;
    }else{
        throw new IllegalArgumentException("Invalid choice. Please enter one of the following: Pepperjack, American, Swiss, or none");
    }
}

public void setToppings(String toppings) {
   if(toppings.equalsIgnoreCase("lettuce")||toppings.equalsIgnoreCase("tomato")|| toppings.equalsIgnoreCase("olives")||toppings.equalsIgnoreCase("none")){
        this.toppings = toppings;
    }else{
        throw new IllegalArgumentException("Invalid choice. Please enter one of the following: Lettuce, Tomato, Olives, or none");
    }
}

@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString() +" | Meats:"+getMeats() +" | Cheese:"+ getCheese()+" | Toppings:"+getToppings();
}
public String defaultMenuString(){
    return super.toString();
}

}

public abstract class Food extends Item {
    private String dietaryRestriction;

    Food(){}
    Food(String itemName,double price, String dietaryRestriction){
        super(itemName,price);
        setDietary(dietaryRestriction);
    }
    public String getDietaryRestriction() {
        return this.dietaryRestriction;
    }
    public void setDietary(String dietaryRestriction) {
        if(dietaryRestriction.equals("")){
            throw new IllegalArgumentException("Invalid dietarty restriciton");
        }else{
            this.dietaryRestriction = dietaryRestriction;
        }
}
@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString()+ "| Dietary Restrictions: " + getDietaryRestriction();
}

public String defaultMenuString(){
    return super.toString();
}
    
}



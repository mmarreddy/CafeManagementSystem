
public class BakedGood extends Food {
private String bakedType;

BakedGood(){}
BakedGood(String itemName,double price, String dietaryRestriction, String bakedType){
    super(itemName, price, dietaryRestriction);
    setBakedType(bakedType);
}
public String getBakedType() {
    return bakedType;
}

public void setBakedType(String bakedType) {
    if(bakedType.equals("")){
        throw new IllegalArgumentException("Invalid baked type(bread/sweets)");
    }else{
    this.bakedType = bakedType;
    }
}

@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString()+ "| Baked type: "+this.getBakedType();
}
public String defaultMenuString(){
    return super.toString()+"| Baked type: "+this.getBakedType();
}
}

public class Coffee extends Drink {
//variables
String cafOrDecaf;
String hotOrIced;
String addedCream;
String addedSugar;

//constructors
Coffee(){}

//for menu
Coffee(String name, double price){
    super(name,price);
}

Coffee(String name, double price, String size, 
String cafOrDecaf, String hotOrIced, String addedCream, String addedSugar){
    super(name, price, size);
    setCafOrDecaf(cafOrDecaf);
    setHotOrIced(hotOrIced);
    setAddedCream(addedCream);
    setAddedSugar(addedSugar);
    
}
//accessors
public String getCafOrDecaf(){
    return this.cafOrDecaf;
}
public String getHotOrIced(){
    return this.hotOrIced;
}
public String getAddedCream(){
    return this.addedCream;
}
public String getAddedSugar(){
    return this.addedSugar;
}
//mutator
public void setCafOrDecaf(String cafOrDecaf){
    if(cafOrDecaf.equalsIgnoreCase("caf")||cafOrDecaf.equalsIgnoreCase("decaf") ){
        this.cafOrDecaf = cafOrDecaf;
    }else{
        throw new IllegalArgumentException("Invalid Entry. Try Again(caf/decaf)");
    }
}


public void setHotOrIced(String hotOrIced){
    if(hotOrIced.equalsIgnoreCase("Hot")||hotOrIced.equalsIgnoreCase("iced")){
        this.hotOrIced = hotOrIced;
    }else
        throw new IllegalArgumentException("Invalid Entry. Try Again(hot/iced)");
}
public void setAddedCream(String addedCream){
    if(addedCream.equalsIgnoreCase("yes")||addedCream.equalsIgnoreCase("no")){
        this.addedCream = addedCream;
    }else{
        throw new IllegalArgumentException("Invalid Entry. Try Again(yes/no)");
    }
}
public void setAddedSugar(String addedSugar){
    if(addedSugar.equalsIgnoreCase("yes")||addedSugar.equalsIgnoreCase("no")){
        this.addedSugar = addedSugar;
    }else{
        throw new IllegalArgumentException("Invalid Entry. Try Again(yes/no)");
        
    }
}
public String toString(){
    return super.toString() + " | Caf or Decaf: "+this.getCafOrDecaf()+" | Hot or Iced: "+this.getHotOrIced()+" | Added cream: "+this.getAddedCream()
    +" | Added sugar: "+this.getAddedSugar();
}

public String defaultMenuString(){
    return super.defaultMenuString();
}
}

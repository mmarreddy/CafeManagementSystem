public class Cafe {
    private String cafeName;
    private String address;
    private String manager;
    private String managerID;//Must be 8 characters long and start with a letter.
    private Item[] menuItem;
    private Order[] arrayOrders;
    private int numItemsInCafe;
    

    Cafe(){}

    Cafe(String cafeName, String address, String manager, String managerID, Item[] menuItems, Order[] arrayOrders){
        setCafeName(cafeName);
        setCafeAddress(address);
        setManager(manager);
        setManagerID(managerID);
        setMenu(menuItems);
        setArrayOrders(arrayOrders);
    }
    public String getCafeName() {
        return this.cafeName;
    }
    public String getAddress() {
        return this.address;
    }
    public String getManager() {
        return this.manager;
    }
    public String getManagerID() {
        return this.managerID;
    }

    public Item[] getMenu() {
        return this.menuItem;
    }
    public int getNumItems() {
        return numItemsInCafe;
    }

    public void setCafeName(String cafeName) {
        if(cafeName.equals("")){
            throw new IllegalArgumentException("Invalid cafe name");
        }else{
          this.cafeName = cafeName;  
        } 
    }
    public void setCafeAddress(String address) {
         if(address.equals("")){
            throw new IllegalArgumentException("Invalid cafe address");
        }else{
        this.address = address;
        }
    }
    public void setArrayOrders(Order[] arrayOrders) {
        this.arrayOrders = arrayOrders;
    }
    public void setManager(String manager) {
         if(manager.equals("")){
            throw new IllegalArgumentException("Invalid cafe manager");
        }else{
        this.manager = manager;
        }
    }
    public void setManagerID(String managerID) {
        if(managerID.length()==8){
            if(Character.isUpperCase(managerID.charAt(0))){
                int validCounter = 0;
                for(int i=1; i<8; i++){
                    if(Character.isDigit(managerID.charAt(i)))
                        validCounter++;
                    else
                        break;
                }
                if(validCounter==7){
                    this.managerID = managerID;
                }else
                    throw new IllegalArgumentException("Error! Invalid manager ID");
            }else{
                throw new IllegalArgumentException("Error! Invalid manager ID");
            }
        }else{
            throw new IllegalArgumentException("Error! ID must be 8 characters long");
        }
    }

    public void setMenu(Item[] menuItem) {
        this.menuItem = menuItem;
    }

    @Override
    public String toString() {
        return "Name: "+ this.getCafeName() +"\nAddress: "+this.getAddress()+"\nManager: "+this.getManager();
    }

}//end



import javax.swing.JOptionPane;

public class Imp {
    static final int MAX_ITEM = 50;
    static final int MAX_ORDERS = 300;
    public static void main(String[] args) {
        //items array
        Item[] menuItems = new Item[MAX_ITEM];

        Order[] arrayOrder = new Order[MAX_ORDERS];    

    //create cafe
    menuItems = createMenu(menuItems);
    Cafe c1 = new Cafe("Java Cafe", "21980 Momoland Avenue, Fairfax, VA 22030", "Fatima Ahmed","J1234567", menuItems, arrayOrder);

    //swithcase menu
    String option = "";
        do {
        option = JOptionPane.showInputDialog("**Welcome to Java Cafe**\n\nEnter your choice\n1:View menu\n2:Add menu items"+ 
        "\n3:Order\n4:Find and print receipt\n5:Print cafe info\n6:Delete menu item\nE:exit");

        switch(option){
        case "1":
            JOptionPane.showMessageDialog(null,viewMenu(menuItems));
            break;
        case "2":
            addMenuItem(menuItems, c1);

            break;
        case "3":
            arrayOrder[Order.getNumOfOrders()]= createOrder(menuItems);
            break;
        case "4":
           findOrder(arrayOrder,menuItems);
           break;
        case "5":
            printCafeInfo(menuItems,c1);
            break;
       case "6": 
            deleteMenuItem(menuItems, c1);
            break;
        case "E","e":
            return;
        default:
            JOptionPane.showMessageDialog(null, "Invalid choice");
    }     
    } while (option != "E"||option!="e");

   
}//main end

    //check manager ID
   public static boolean checkManager(Cafe c1){
        boolean valid = false;
        String ID = JOptionPane.showInputDialog("Enter your ID: ");
        if(ID.equalsIgnoreCase(c1.getManagerID())){
            valid = true;
        }else
            valid = false;
        return valid;
    }

    //add items to menu
    public static void addMenuItem(Item[] menuItems, Cafe c1){
        //Check if its manager, only manager can add menu item
        boolean proceed = checkManager(c1);
        if(proceed){
                String option = "";
                do {
                option = JOptionPane.showInputDialog("Enter your menu item you would like to add\n1:Coffee\n2:Boba"+ 
                "\n3:Sandwhiches\n4:Baked goods\nE:exit");
                switch(option){
                    case "1":
                        addCoffee(menuItems);
                        break;
                    case "2":
                        addBoba(menuItems);
                        break;
                    case "3":
                        addSandwhich(menuItems);
                        break;
                    case "4":
                        addBakedGood(menuItems);
                        break;
                    case "E","e":
                        return;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice");
                    }     
            } while (option != "E"||option!="e" && Item.getNumItems()<MAX_ITEM);
            }else
                JOptionPane.showMessageDialog(null, "Error! only manager can add new items to the menu");
            
        }
        
        public static void addCoffee(Item[] menuItems){
            Coffee newCoffee = new Coffee();
            //get name
            String itemName = "";
            boolean valid = false;
            do{
                try{
                    itemName= JOptionPane.showInputDialog("Enter the item name:");
                    newCoffee.setItemName(itemName);
                    valid = true;
                }catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }while(!valid);
            //get price
            double price = 0;
            boolean validP= false;
            do{
                try{
                    price = Double.parseDouble(JOptionPane.showInputDialog("Enter the item price:"));
                    newCoffee.setPrice(price);
                    validP = true;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Price must be a number!!");
                }catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }while(!validP);
            menuItems[Item.getNumItems()-1] = newCoffee;
         
        }

        public static void addBoba(Item[] menuItems){
            Boba newBoba = new Boba();
            //get name
            String itemName = "";
            boolean valid = false;
            do{
                try{
                    itemName= JOptionPane.showInputDialog("Enter the item name:");
                    newBoba.setItemName(itemName);
                    valid = true;
                }catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }while(!valid);
            //get price
            double price = 0;
            boolean validP= false;
            do{
                try{
                    price = Double.parseDouble(JOptionPane.showInputDialog("Enter the item price:"));
                    newBoba.setPrice(price);
                    validP = true;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Price must be a number!!");
                }catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }while(!validP);
            menuItems[Item.getNumItems()-1] = newBoba;
        }
        public static void addSandwhich(Item[] menuItems){
            Sandwhich newSandwhich = new Sandwhich();
            //get name
            String itemName = "";
            boolean valid = false;
            do{
                try{
                    itemName= JOptionPane.showInputDialog("Enter the item name:");
                    newSandwhich.setItemName(itemName);
                    valid = true;
                }catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }while(!valid);
            //get price
            double price = 0;
            boolean validP= false;
            do{
                try{
                    price = Double.parseDouble(JOptionPane.showInputDialog("Enter the item price:"));
                    newSandwhich.setPrice(price);
                    validP = true;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Price must be a number!!");
                }catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }while(!validP);
            //get dietary restrictions
            String restriction = "";
            boolean validR = false;
            do{
                try{
                    restriction= JOptionPane.showInputDialog("Enter dietary restricions:");
                    newSandwhich.setDietary(restriction);
                    validR = true;
                }catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }while(!validR);
            menuItems[Item.getNumItems()-1] = newSandwhich;
        }
        public static void addBakedGood(Item[] menuItems){
            BakedGood newBG = new BakedGood();
            //get name
            String itemName = "";
            boolean valid = false;
            do{
                try{
                    itemName= JOptionPane.showInputDialog("Enter the item name:");
                    newBG.setItemName(itemName);
                    valid = true;
                }catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }while(!valid);
            //get price
            double price = 0;
            boolean validP= false;
            do{
                try{
                    price = Double.parseDouble(JOptionPane.showInputDialog("Enter the item price:"));
                    newBG.setPrice(price);
                    validP = true;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Price must be a number!!");
                }catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }while(!validP);
            //get dietary restrictions
            String restriction = "";
            boolean validR = false;
            do{
                try{
                    restriction= JOptionPane.showInputDialog("Enter dietary restricions:");
                    newBG.setDietary(restriction);
                    validR = true;
                }catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }while(!validR);
           // menuItems[Item.getNumItems()-1] = newBG;
            //get baked good
            String type = "";
            boolean validt = false;
            do{
                try{
                    type= JOptionPane.showInputDialog("Enter baked goods type:");
                    newBG.setBakedType(type);
                    validt = true;
                }catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }while(!validt);
            menuItems[Item.getNumItems()-1] = newBG;
        }

    //delete menu item
    public static void deleteMenuItem(Item[] menuItems, Cafe c1){
        boolean proceed = checkManager(c1);
            if(proceed){
            String searchName = JOptionPane.showInputDialog("Enter the name of the item you wish to delete");
            int index = findMenuItem(menuItems, searchName);
            if(index>-1){
                  menuItems[index] = null;
                  JOptionPane.showMessageDialog(null, "Menu item has been removed");
                  for(int i=index; i<Item.getNumItems();i++){
                  menuItems[i] = menuItems[i+1];
                  }    
            }
            Item.updateNumItems();
        }else
                JOptionPane.showMessageDialog(null, "Error! only manager can delete items to the menu");
        }

        public static int findMenuItem(Item[]menuItem, String searchName){
            int index = -1;
                boolean valid = false;
                for(int i=0; i<Item.getNumItems(); i++){
                    if( 
                        searchName.equalsIgnoreCase(menuItem[i].getItemName())){
                        index = i;
                        valid = true;
                    }
                }
                if(valid = false){
                    JOptionPane.showMessageDialog(null, "Sorry, you have entered invalid item name");
                }
            return index;
        }

    //create order -- add items 
    public static Order createOrder(Item[] menuItems){
        Order aOrder = new Order();
        aOrder.setOrderNo(Order.getNumOfOrders()-1);//set customer's order Number, it auto increments.
        boolean validName = false;
        boolean validId = false;
        
        Item [] customersOrder = new Item[Order.MAX_ORDERITEMS];
       
       do{
        try{
        String custName = JOptionPane.showInputDialog("Enter customer name: ");
        aOrder.setCustomerName(custName);
        validName = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validName != true);


        do{
        aOrder.setCustomersOrder(customersOrder);
        int index = search(menuItems);
        customersOrder[aOrder.getNumCustomerOrderItem()] = menuItems[index];
        
        if(customersOrder[aOrder.getNumCustomerOrderItem()] instanceof Coffee){
           
            boolean validSize=false;
            boolean validCafOrDecaf= false;
            boolean validHotOrIced= false;
            boolean validAddedCream = false;
            boolean validAddedSugar = false; 
            
        do{
        try{
        String coffeeSize = JOptionPane.showInputDialog("Enter coffee size (Small, medium, or large): ");
        
        ((Coffee) customersOrder[aOrder.getNumCustomerOrderItem()]).setSize(coffeeSize);
        validSize = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validSize != true);

        do{
        try{
        String coffeeCaf = JOptionPane.showInputDialog("Enter cafination (caf or decaf): ");
        
        ((Coffee) customersOrder[aOrder.getNumCustomerOrderItem()]).setCafOrDecaf(coffeeCaf);
        validCafOrDecaf = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validCafOrDecaf != true);

        do{
        try{
        String coffeeTemp = JOptionPane.showInputDialog("Enter hot or iced: ");
        
        ((Coffee) customersOrder[aOrder.getNumCustomerOrderItem()]).setHotOrIced(coffeeTemp);
        validHotOrIced = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validHotOrIced != true);
        
        do{
        try{
        String coffeeCream = JOptionPane.showInputDialog("Would you like to add cream (yes or no): ");
        
        ((Coffee) customersOrder[aOrder.getNumCustomerOrderItem()]).setAddedCream(coffeeCream);
        validAddedCream = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validAddedCream != true);

        do{
        try{
        String coffeeSugar = JOptionPane.showInputDialog("Would you like to add sugar (yes or no) ");
        
        ((Coffee) customersOrder[aOrder.getNumCustomerOrderItem()]).setAddedSugar(coffeeSugar);
        validAddedSugar = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validAddedSugar != true);


       
        }else if(customersOrder[aOrder.getNumCustomerOrderItem()] instanceof Boba){
            boolean validSize =false;
           boolean validTopping =false; 
           boolean validiceLevel = false;// low reg extra


        do{
        try{
        String bobaSize = JOptionPane.showInputDialog("Enter boba size (Small, medium, or large): ");
        
        ((Boba) customersOrder[aOrder.getNumCustomerOrderItem()]).setSize(bobaSize);
        validSize = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validSize != true);

        do{
        try{
        String bobaTopping = JOptionPane.showInputDialog("Enter type of boba (tapioca, jelly, or popping): ");
        ((Boba) customersOrder[aOrder.getNumCustomerOrderItem()]).setTopping(bobaTopping);
        validTopping = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validTopping != true);

    
            do{
                try{
                String bobaIce = JOptionPane.showInputDialog("Enter ice level (low, regular, or extra) : ");
                ((Boba)customersOrder[aOrder.getNumCustomerOrderItem()]).setIceLevel(bobaIce);
                validiceLevel = true;
                }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
            }while(validiceLevel != true);


        }
        else if(customersOrder[aOrder.getNumCustomerOrderItem()] instanceof Sandwhich){
           String meatMenu = "Meat Options:\nChicken, Bacon, Ham, none";
           String cheeseMenu="Cheese Options:\nPepperjack, American, Swiss, none";
           String toppingMenu="Topping Options:\nLettuce, Tomato, Olives, none";
            //get meat
            boolean validM = false;
            do{
                try{
                String meat = JOptionPane.showInputDialog(meatMenu+"\n\nEnter meat toppings: ");
                ((Sandwhich)customersOrder[aOrder.getNumCustomerOrderItem()]).setMeats(meat);
                validM = true;
                }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
            }while(validM != true);
            //get cheese
            boolean validC = false;
            do{
                try{
                String cheese = JOptionPane.showInputDialog(cheeseMenu+"\n\nEnter cheese you would like: ");
                ((Sandwhich)customersOrder[aOrder.getNumCustomerOrderItem()]).setCheese(cheese);
                validC = true;
                }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
            }while(validC != true);
            //get topping
            boolean validT = false;
            do{
                try{
                String cheese = JOptionPane.showInputDialog(toppingMenu+"\n\nEnter vegetable toppings: ");
                ((Sandwhich)customersOrder[aOrder.getNumCustomerOrderItem()]).setToppings(cheese);
                validT = true;
                }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
            }while(validT != true);

        }else if(customersOrder[aOrder.getNumCustomerOrderItem()]instanceof BakedGood){
           
        }
    aOrder.numCustomerOrderItem++;
    }while(JOptionPane.showInputDialog("Add another item? yes/no").equalsIgnoreCase("yes")&& aOrder.getNumCustomerOrderItem()<Order.MAX_ORDERITEMS);

    return aOrder; 
    }


    public static int search(Item[] menuItems){
        int index = -1;
        boolean validSearch = false;
        String selectedItem;
        do{
        String printMenu = viewMenu(menuItems);
        selectedItem = JOptionPane.showInputDialog(printMenu + "\nEnter item name to add to order");
       
        
        for(int i = 0 ; i<Item.getNumItems();i++){
           if(selectedItem.equalsIgnoreCase(menuItems[i].getItemName())){
              index = i;
              validSearch = true;
            }

        }if(validSearch!= true){
            JOptionPane.showMessageDialog(null, "Item could not be found, try again");
        }
        }while(validSearch!= true);

        return index; 
        }
   

//create menu item
    public static Item[] createMenu(Item[] menuItems){
        //cofee//
        Coffee c1 = new Coffee("Cold brew",3.00); //cofee
        menuItems[0]= c1; 
        Coffee c2 = new Coffee("Caramel frappacino", 3.88);
        menuItems[1] = c2;

        //boba//
        Boba b1 = new Boba("Thai tea latte", 5.49);
        menuItems[2]= b1;
        Boba b2 = new Boba("Jasmine milk tea", 3.67);
        menuItems[3] = b2;

        //sandwhich//
        Sandwhich s1 = new Sandwhich("Avacado Sandwich", 7.00, "Vegetarian");
        menuItems[4]= s1; 
        Sandwhich s2 = new Sandwhich("Chicken Sandwich", 8.00, "Halal");
        menuItems[5]= s2; 

        //baked//
        BakedGood bg1 = new BakedGood("Flan", 3.49,"none", " sweet");
        menuItems[6]= bg1;
        BakedGood bg2 = new BakedGood("Brioche", 4.00,"none"," bread");
        menuItems[7]= bg2;
        
        return menuItems;
    }

public static String viewMenu(Item[] menuItems){
    String output = "               ** Welcome to java Cafe **\n"+
    "                                Menu      \n";
    for(int i = 0; i<Item.getNumItems();i++){
        output += menuItems[i].defaultMenuString()+"\n";
    }
    return output;
   
}

public static void printCafeInfo(Item[] menuItems,Cafe c1 ){
    String output = "                       Cafe information \n"
    + c1.toString()+"\n"
    + viewMenu(menuItems);

JOptionPane.showMessageDialog(null,output);
}


public static int searchCustoemr(Order[] arrayOrder){
        int index = -1;
        boolean validSearch = false;
        int selectedOrderNo;
        do{
        String printCustomers = viewCustomers(arrayOrder);
        selectedOrderNo = Integer.parseInt(JOptionPane.showInputDialog(printCustomers + "\nEnter Order Number"));
       
        for(int i = 0 ; i<Order.getNumOfOrders();i++){
           if(selectedOrderNo==arrayOrder[i].getOrderNo()){
              index = i;
              validSearch = true;
            }

        }if(validSearch!= true){
            JOptionPane.showMessageDialog(null, "Order number not found");
        }
        }while(validSearch!= true);

        return index; 
        }
        
public static String viewCustomers(Order[] arrayOrder){
    String output= "                List of orders\n";
   for(int i = 0; i< Order.getNumOfOrders();i++){
   output +="Order No: "+ arrayOrder[i].getOrderNo() +" |Name: "+arrayOrder[i].getCustomerName()+"\n";
   }
return output;
}

public static void findOrder(Order[] arrayOrder, Item[] menuItem){
        int index = searchCustoemr(arrayOrder);
        String output = arrayOrder[index].getCustomerName()+ "'s Order\n";
   
        JOptionPane.showMessageDialog(null,output+arrayOrder[index].getCustomersOrder());
}

    
}//end
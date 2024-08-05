public class Order {
    private String customerName;
    public  int numCustomerOrderItem =0;
    static int numOfOrder=0;
    final static double taxPercent = 0.043;
    final static int MAX_ORDERITEMS = 25;
    private int orderNo = 0;
    Item[] customersOrder;

    Order(){ 
        numOfOrder++;
    }
   
    Order(String customerName, Item[] customersOrder, String orderID, int orderNo){
        setCustomerName(customerName);
        setCustomersOrder(customersOrder);
        setOrderNo(orderNo);
        numOfOrder++;
    }
    public int getOrderNo() {
        return this.orderNo;
    }
    public int getNumCustomerOrderItem() {
        return this.numCustomerOrderItem;
    }
    public static int getNumOfOrders() {
        return numOfOrder;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public void setCustomerName(String customerName) {
        if(customerName.equals("")){
            throw new IllegalArgumentException("Invalid customer name ");
        }else{
        this.customerName = customerName;
        }
    }
    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo+1;
    }
    public String getCustomersOrder() {
        double total = 0;
        String output = "Items ordered:\n";
        System.out.println(getNumCustomerOrderItem());

        for(int i =0; i< getNumCustomerOrderItem();i++){
            
            output+= customersOrder[i].toString()+"\n";
            total += customersOrder[i].getPrice();
        }
        double taxTotal = ((total*taxPercent) + total);
        String formatedTotal = String.format("Total price: $%.2f", taxTotal);
        output += "****************\nSubtotal: $"+ total +"\nTax: $"+taxPercent +"\n"+ formatedTotal;
        return output;

    }

    public void setCustomersOrder(Item[] customersOrder) {
        this.customersOrder = customersOrder;
    }

 
    }

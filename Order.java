
public class Order {
    
    private String cust_name;
    private String order_name;    

    public Order(String name, String ord_name ){
        cust_name=name;
        order_name=ord_name;
    }
    public String getCust_name() {
        return cust_name;
    }

   
    public String getOrder_name() {
        return order_name;
    }
    
}

src/Pizzeria2.java
public class Pizzeria {
    public String storeName;
    public String storeAddress;

    private String storeEmail;

    public long storePhone;
    public String storeMenu;
    public String storeWebsite;
    public String pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;
    
    private String orderID;
    private double orderTotal;

    public static final String DEF_ORDER_ID = "DEF-SOH-099";
    public static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    public static final double DEF_ORDER_TOTAL = 15.00;

    public Pizzeria(){
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeEmail = storeEmail;
        this.storePhone = storePhone;
        this.storeMenu = storeMenu;
    }
    public void takeOrder(String id, String pizzaIngredients, String sides, String drinks) {
        this.orderID = id;
        this.pizzaIngredients = pizzaIngredients;
        this.sides = sides;
        this.drinks = drinks;

        this.orderTotal = pizzaPrice;
        if (sides != null &&!sides.isEmpty()) {
            orderTotal += 10;
        }
        if (drinks != null &&!drinks.isEmpty()) {
            orderTotal += 5;
        }

        System.out.println("Order"+orderID+"accepted!");
        makePizza();
        printReceipt();
    }
        public void makePizza(){

        System.out.println("Making pizza with "+pizzaIngredients);

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Pizza making was interrupted: "+e.getMessage());
        }

        System.out.println("Your order is ready!");

        printReceipt();


    }
    
    private void printReceipt(){
        System.out.println("********RECEIPT********");
        System.out.println("Store Name: " + storeName);
        System.out.println("Order ID: " + orderID);
        System.out.println("Pizza Ingredients: " + pizzaIngredients);
        if (sides != null &&!sides.isEmpty()) {
            System.out.println("Sides: " + sides);
        }
    }     
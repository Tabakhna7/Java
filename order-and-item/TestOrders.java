import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
       Items item1= new Items();
       Items item2= new Items();
       Items item3= new Items();
       Items item4= new Items();
       item1.price=3.5;
       item1.name="mocha";
       item2.price=4.5;
       item2.name="latte";
       item3.price=6.5;
       item3.name="drip coffe";
       item4.price=7;
       item4.name="cappuccino";

       Order order1=new Order();
       Order order2=new Order();
       Order order3=new Order();
       Order order4=new Order();
       order1.name="Cindahuri";
       order2.name="Jimmy";
       order3.name="Noah";
       order4.name="Sam";
        
        order2.listOfItems.add(item1);
        order2.total+=item1.price;

        order3.listOfItems.add(item4);
        order4.listOfItems.add(item2);
        order4.total+=item2.price ;
        order4.ready=true;

        order1.ready=true;
        order4.listOfItems.add(item2);
        order4.listOfItems.add(item2);

        order4.total+=(item2.price*2);
        order2.ready=true;
        

        

    
        // Order variables -- order1, order2 etc.
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.println(order4.total);
    }
}
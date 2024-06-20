import java.util.ArrayList;

public class CoffeeKiosk {
   private ArrayList<Items> menu;
   private ArrayList<Order> orders;

   public CoffeeKiosk(){
    this.menu=new ArrayList<Items> ();
    this.orders=new ArrayList<Order> ();
   }
   public void addMenuItem(Items item) {
    this.menu.add(item);
   }
}
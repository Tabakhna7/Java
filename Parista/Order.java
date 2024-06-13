import java.util.ArrayList;

public class Order {
    private String name;
    // private double total;
    private boolean ready;
    private ArrayList<Items> listOfItems;

    public Order() {
        this.name = "Guest";
        this.listOfItems = new ArrayList<Items>();

    }

    public Order(String name) {
        this.name = name;
        this.listOfItems = new ArrayList<Items>();

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setListOfItems(ArrayList<Items> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public ArrayList<Items> getListOfItems() {
        return listOfItems;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public boolean isReady() {

        return ready;
    }

    public void addItem(Items item) {
        this.listOfItems.add(item);
    }

    public String getStatusMessage() {
        if (isReady()) {
            return "Your order is ready.";

        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }

    }

    public double getOrderTotal() {
        double total=0;
        for(int i=0;i<listOfItems.size();i++){
            total+=listOfItems.get(i).getPrice();

        }
        return total;
        
    }
    public void display(){
 

        System.out.println("Customer Name-: "+getName());
        for ( Items item : listOfItems){
            System.out.println( item.getName() + item.getPrice());

        }
        System.out.println("Total "+this.getOrderTotal() );
    }
}

public class Test {
public static void main(String[] args) {
Order order0=new Order();
Order ordern=new Order();
Order order1=new Order("Tabakhna");
Order order2=new Order("Maher");
Order order3=new Order("Naser");

Items item1= new Items("Mocha",3.5 );
Items item2= new Items("latte", 4.5);
Items item3= new Items("drip coffe", 6.5);
Items item4= new Items("capuccino",7);

order1.addItem(item1);       
order1.addItem(item2);
order2.addItem(item4);
order2.addItem(item3);
order3.addItem(item1);
order3.addItem(item2);

order1.setReady(true);
order2.setReady(true);
order3.setReady(false);

System.out.println(order1.getOrderTotal());
order1.display();
order2.display();
order3.display();

}


}

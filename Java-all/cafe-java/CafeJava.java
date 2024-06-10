public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffe=4.5;
        double latte=5.5;
        double cappuccino=6.5;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2=true;
        boolean isReadyOrder3=false;
        boolean isReadyOrder4=false;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	if (isReadyOrder1){
            System.out.println(readyMessage);
           
            
        }
        else{
            System.out.println(pendingMessage);
        }
        if (isReadyOrder4){
            System.out.println(readyMessage +" "+ displayTotalMessage + cappuccino);
           
            
        }
        else{
            System.out.println(pendingMessage);
        }
        if (isReadyOrder2) {
            System.out.println("Hello"+" "+customer2 +" "+ displayTotalMessage + latte*2 );
        }
        else{
            System.out.println(pendingMessage);
        }
        if (isReadyOrder3) {
            System.out.println("Hello"+" "+customer3+" "+ "we need a difference from you "+(latte-dripCoffe)+"$") ;
        }
        else{
            System.out.println("Hello"+" "+customer3+" "+ "you want a change from us "+(latte-dripCoffe)+"$");
        }
        
    }
}
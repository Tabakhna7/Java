import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello ," + name + ".nice to see you";
    }
    public String guestGreeting(String name , int age) {
        
        return "Hello ," + name + "your age is " + age;
    }
    
    public String dateAnnouncement() {
        Date date=new Date();

        return "this is the date"+ date ;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis")>-1){

            return "right away";
        }
        else if (conversation.indexOf("Alfred")>-1){
            return "At your service";
        }
            
        
        return " Right , and with that i shall retire ";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}



/**
 * Hash
 */
import java.util.HashMap;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        HashMap <String , String>trackList=new HashMap<String , String>();
        trackList.put("happy birthday " , "happy borthday to you ");
        trackList.put("Set fire to the rain" , "watch me burn ");
        trackList.put("love story", " Love story ");
        trackList.put("Mocking bird", " daddy ");
        
        String music = trackList.get("love story");
        System.out.println(music);
        Set <String> keys= trackList.keySet();

        for(String key : keys){
            System.out.println(key + ":" + trackList.get(key));
        
        }
}

}
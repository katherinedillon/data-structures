import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /* The Map interface is generic
        The first type given is the key, the 2nd type is the value
         */
        Map<String, Color> favColors = new HashMap<>();

        // Add elements to the map using the put method
        favColors.put("Katherine", Color.PINK);
        favColors.put("Kaitlyn", Color.GREEN);
        favColors.put("Cam", Color.BLUE);

        // Two different elements with the same value
        favColors.put("Sreeram", Color.GREEN);

        //The same key cannot have two different values
        //Using put on a key that exists changes the valye
        favColors.put("Cam", Color.ORANGE);

        // Create a set of the keys in a map
        Set<String> keys = favColors.keySet();
        for (String key: keys){
            // [name] ([hashCode]) : [color]
            System.out.println(key + "("+key.hashCode()+"): "+favColors.get(key));
        }

    }
}

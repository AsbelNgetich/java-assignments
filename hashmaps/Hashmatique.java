import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Shaldon bridge", "Standing strong since the 1800's, live and let live.");
        trackList.put("Walking in Teignmouth", "I was walking in Teignmouth, when I decided to go fishing");
        trackList.put("Stop cats", "Stop alley cats, what's that sound. Tell me what's going on.");
        trackList.put("Unloaded piggy",
                "Weights, weights, weights! Make you piggy banks way heavier than you, my children.");

        // String lyrics = trackList.get("Shaldon bridge");
        // System.out.println("Song Title: Shaldon bridge lyrics:" + lyrics);

        // getting keys by using the keySet method
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println("Song Title: " + key + "  Lyrics: " + trackList.get(key));
        }
    }
}
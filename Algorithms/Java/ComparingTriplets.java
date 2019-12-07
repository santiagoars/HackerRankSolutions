import java.util.ArrayList;
import java.util.List;

public class ComparingTriplets{

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0, bob = 0;
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).compareTo(b.get(i)) > 0){
                alice++;
            }else if(a.get(i).compareTo(b.get(i)) < 0){
                bob++;
            }
        }
        List<Integer> results = new ArrayList<Integer>();
        results.add(alice);
        results.add(bob);
        return results;
    }
}
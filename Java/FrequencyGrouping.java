import java.util.*;
import java.util.stream.Collectors;

public class FrequencyGrouping {

    public static Map<Integer, Long> frequencyGrouping(List<Integer> arr){
        if (arr == null || arr.isEmpty()) {
            return Collections.emptyMap();
        }
        return arr.stream()
                .collect(Collectors.groupingBy(
                        x -> x,
                        Collectors.counting()
                ));
    }

    public static void main(String[] args){
        //for test
        List<Integer> arr = Arrays.asList(1,3,4,5,1,5,4);
        Map<Integer, Long> res = frequencyGrouping(arr);
        System.out.println(res);
    }
}

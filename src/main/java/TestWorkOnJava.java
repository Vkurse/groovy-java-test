import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestWorkOnJava {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> elementCountMap = countElements(list);
        System.out.println(elementCountMap);
    }

    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();
        for (int element : list) {
            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
        }

        return elementCountMap;
    }
}

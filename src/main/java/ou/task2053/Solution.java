package ou.task2053;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> strCount = new HashMap<>();
        for (String s : arr) {
            strCount.computeIfPresent(s, (key, v) -> v + 1);
            strCount.putIfAbsent(s, 1);
        }
        List<String> list = new ArrayList<>();
        for (String s : arr) {
            if (strCount.get(s) == 1) {
                list.add(s);
            }
        }
        System.out.println(list);
        if (k > list.size())
            return "";
        return list.get(k - 1);
    }
}

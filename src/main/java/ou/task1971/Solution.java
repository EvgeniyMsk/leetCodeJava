package ou.task1971;

import java.util.*;

public class Solution {
    Map<Integer, Set<Integer>> graph = new HashMap<>();
    Map<Integer, Boolean> visited = new HashMap<>();

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        for (int i = 0; i < n; i++)
            visited.put(i, false);

        for (int[] edge : edges) {
           graph.computeIfAbsent(edge[0], k -> new HashSet<>()).add(edge[1]);
           graph.computeIfAbsent(edge[1], k -> new HashSet<>()).add(edge[0]);

           Set<Integer> neighbors_1 = graph.get(edge[0]);
           neighbors_1.add(edge[1]);

           Set<Integer> neighbors_2 = graph.get(edge[1]);
           neighbors_2.add(edge[0]);

           graph.computeIfPresent(edge[0], (k, v) -> neighbors_1);
           graph.computeIfPresent(edge[1], (k, v) -> neighbors_2);
       }
        dfs(source);
        return visited.get(destination);
    }

    public void dfs(int current) {
        visited.put(current, true);
        if (graph.get(current) != null) {
            for (int neighbor : graph.get(current)) {
                if (!visited.get(neighbor)) {
                    dfs(neighbor);
                }
            }
        }
    }
}

package ou.task2392;

import java.util.*;

public class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        List<Integer> row_sorting = topological_sort(rowConditions, k);
        List<Integer> col_sotring = topological_sort(colConditions, k);

        if (row_sorting.isEmpty() || col_sotring.isEmpty()) {
            return new int[0][0];
        }

        Map<Integer, int[]> value_position = new HashMap<>();
        for (int n = 1; n <= k; ++n) {
            value_position.put(n, new int[2]);
        }
        for (int ind = 0; ind < row_sorting.size(); ++ind) {
            value_position.get(row_sorting.get(ind))[0] = ind;
        }
        for (int ind = 0; ind < col_sotring.size(); ++ind) {
            value_position.get(col_sotring.get(ind))[1] = ind;
        }

        int[][] res = new int[k][k];
        for (int value = 1; value <= k; ++value) {
            int row = value_position.get(value)[0];
            int col = value_position.get(value)[1];
            res[row][col] = value;
        }
        return res;
    }

    private boolean dfs(
            int src,
            Map<Integer, List<Integer>> graph,
            Set<Integer> visited,
            Set<Integer> current_path,
            List<Integer> res) {
        // Цикл найден
        if (current_path.contains(src))
            return false;
        // В этой узле мы уже были
        if (visited.contains(src))
            return true;
        visited.add(src);
        current_path.add(src);

        for (int neighbor : graph.getOrDefault(src, Collections.emptyList())) {
            if (!dfs(neighbor, graph, visited, current_path, res))
                return false;
        }

        current_path.remove(src);
        res.add(src);
        return true;
    }

    private List<Integer> topological_sort(int[][] edges, int k) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], x -> new ArrayList<>())
                    .add(edge[1]);
        }

        Set<Integer> visited = new HashSet<>();
        Set<Integer> cur_path = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int src = 1; src <= k; ++src) {
            if (!dfs(src, graph, visited, cur_path, result))
                return Collections.emptyList();
        }
        Collections.reverse(result);
        return result;
    }
}

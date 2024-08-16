package ou.task119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0)
            return new ArrayList<>(){ {add(1);}};
        return generate(rowIndex + 1).get(rowIndex);
    }

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 1)
            return new ArrayList<>() { { add(new ArrayList<>() {{ add(1);}});}};
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>() {{ add(1); }});
        for (int i = 1; i < numRows; i++) {
            result.add(getNewRow(result.get(i - 1)));
        }
        return result;
    }

    public List<Integer> getNewRow(List<Integer> row) {
        List<Integer> result = new ArrayList<>();
        if (row.size() == 1)
        {
            result.add(1);
            result.add(1);
            return result;
        }
        for (int i = 0; i < row.size(); i++) {
            if (i == 0) {
                result.add(row.get(i));
                result.add(row.get(i) + row.get(i + 1));
                continue;
            }
            if (i == row.size() - 1) {
                result.add(row.get(i));
                break;
            }
            result.add(row.get(i) + row.get(i + 1));
        }
        return result;
    }
}

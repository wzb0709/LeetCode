package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class YangHuiTriangle {
    public static void main(String args[]) {
        YangHuiTriangle demo = new YangHuiTriangle();

        System.out.println(demo.generate(4));
    }

    private List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        if (numRows < 1) return arr;
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr.add(arr1);
        for (int i = 2; i <= numRows; i++) {
            List<Integer> arr2 = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    arr2.add(1);
                } else {
                    int sum = arr.get(i - 2).get(j - 1) + arr.get(i - 2).get(j);
                    arr2.add(sum);
                }
            }
            arr.add(arr2);
        }
        return arr;
    }
}

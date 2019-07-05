package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class YangHuiTriangle2 {
    public static void main(String args[]) {
        YangHuiTriangle2 demo = new YangHuiTriangle2();

        System.out.println(demo.getRow(4));
    }

    private List<Integer> getRow(int rowIndex) {

        List<Integer> res = new ArrayList<>();

        res.add(1);
        if (rowIndex == 1) return res;
        else {
            for (int i = 0; i < res.size(); i++) {
                List<Integer> source = new ArrayList<>();
                if (i == 1 || i == res.size() - 1) {
                    source.add(1);
                }else{
                    int sum = res.get(i-1) + res.get(i);
                    source.add(sum);
                }
                res = source;
            }
        }
        return res;
    }
}

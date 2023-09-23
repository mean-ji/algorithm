package leetcode;
import java.lang.Math;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix l = new LongestCommonPrefix();
        String[] strs = {"flower","flower","flower","flower"};
        System.out.println(l.longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        // 1. 몇번의 index만큼 갈 수 있는지 minLength를 구한다.
        // 2. while minLength, for문으로 같으면 result에 해당 글자 추가해준다.
        //    다르면 바로 stop 하고 return
        int minLength = strs[0].length();
        String result = "";
        int index = 0;

        for (String str : strs) {
            minLength = Math.min(str.length(), minLength);
        }

        Loop1:
        while (minLength > 0) {
            String curStr = strs[0].substring(index, index + 1);
            for (String str : strs) {
                if (!curStr.equals(str.substring(index, index + 1))) {
                    break Loop1;
                }
            }
            result = result.concat(curStr);
            index++;
            minLength--;
        }

        return result;
    }
}

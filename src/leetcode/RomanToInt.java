package leetcode;

public class RomanToInt {

    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        System.out.println(romanToInt.romanToInt("MCMXCIV"));;
    }
    public enum Roman {
        I("I", 1),
        V("V", 5),
        X("X", 10),
        L("L", 50),
        C("C", 100),
        D("D", 500),
        M("M", 1000);

        private final String str;
        private final int num;
        Roman(String str, int num) {
            this.str = str;
            this.num = num;
        }
        public String getStr() {
            return str;
        }
        public int getNum() {
            return num;
        }
    }
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && Roman.valueOf(s.substring(i, i+1)).getNum() > Roman.valueOf(s.substring(i-1, i)).getNum()) {
                result += (Roman.valueOf(s.substring(i, i+1)).getNum() - (2 * Roman.valueOf(s.substring(i-1, i)).getNum()));
            } else {
                result += Roman.valueOf(s.substring(i, i+1)).getNum();
            }
        }

        return result;
    }
}

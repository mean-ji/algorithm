package leetcode;

public class DefangingIP {
    public static void main(String[] args) {
        DefangingIP d = new DefangingIP();
        String address = "255.100.50.0";
        System.out.println(d.defangIPaddr(address));
    }

    public String defangIPaddr(String address) {
        return String.join("[.]", address.split("\\."));
    }
}

package leetcode;

public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        // ransomNote의 글자 한개가 magazine에 있으면 magazine에서 그 글자를 지우기
        // 없으면 false
        // 끝까지 가면 true
        StringBuffer magBuffer = new StringBuffer(magazine);
        String[] array = ransomNote.split("");
        for (String str : array) {
            if (magazine.contains(str)) {
                int index = magazine.indexOf(str);
                magazine = magBuffer.deleteCharAt(index).toString();
            } else {
                return false;
            }
        }
        return true;
    }
}

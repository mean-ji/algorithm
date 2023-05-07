package programmers;

public class Compression {
    public int solution(String s) {
        int answer = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            String comp = compression(s, i);
            int compLen = comp.length();
            answer = Math.min(answer, compLen);
        }

        return answer;
    }

    /**
     * 문자열 압축
     */
    private String compression(String s, int i) {
        String compResStr = ""; // 압축 결과
        int compCount = 1;   // 압축 횟수
        String compStr = "";    // 비교 대상
        String currentStr = ""; // 기준 문자열

        Boolean changeCur = true;  // 기준 문자열을 변경할 것인지
        Boolean changeComp = true;  // 마지막인지 구분

        for (int j = 0; j <= s.length() - i; j += i) {
            // 기준 문자열 생성
            if (changeCur) {
                currentStr = s.substring(j, j + i);
            }

            // 비교 대상 생성
            // 마지막 비교인 경우
            if (j + i + i >= s.length()) {
                compStr = s.substring(j + i);
                // 마지막이라는 의미 어차피 밑에서 다르다는 판별이 남
                if (compStr.length() < currentStr.length()) {
                    currentStr += compStr;
                }
            } else {
                compStr = s.substring(j + i, j + i + i);
            }

            if (currentStr.equals(compStr)) {
                changeCur = false;   // 기준 문자열 그대로 유지
                compCount++;
            } else {
                changeCur = true;
                compResStr += compCount > 1 ? compCount + currentStr : currentStr;
                compCount = 1;
            }

            compStr = "";
        }

        return compResStr;
    }
}

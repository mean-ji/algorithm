package programmers;

public class IdRecommendation {
    public String solution(String new_id) {
        String answer = "";
        answer = recommend(new_id);
        return answer;
    }

    private String recommend(String id) {
        String resultStr = "";

        resultStr = step1(id);
        return resultStr;
    }

    private String step1(String id) {
        return step2(id.toLowerCase());
    }

    private String step2(String id) {
        String returnStr = "";
        for (int i = 0; i < id.length(); i++) {
            if (id.charAt(i) >= 97 && id.charAt(i) <= 122) {
                returnStr += id.substring(i, i + 1);
            } else if (id.charAt(i) >= 48 && id.charAt(i) <= 57) {
                returnStr += id.substring(i, i + 1);
            } else if (id.charAt(i) == 45 || id.charAt(i) == 46 || id.charAt(i) == 95) {
                returnStr += id.substring(i, i + 1);
            }
        }
        return step3(returnStr);
    }

    private String step3(String id) {
        String returnStr = "";
        for (int i = 0; i < id.length() - 1; i++) {
            if (!(id.charAt(i) == 46 && id.charAt(i + 1) == 46)) {
                returnStr += id.charAt(i);
            }
        }
        returnStr += id.charAt(id.length() - 1);
        return step4(returnStr);
    }

    private String step4(String id) {
        String returnStr = "";
        if (id.charAt(0) == 46) {
            id = id.substring(1);
        }
        if (id.length() > 0) {
            if (id.charAt(id.length() - 1) == 46) {
                id = id.substring(0, id.length() - 1);
            }
        }
        return step5(id);
    }

    private String step5(String id) {
        if (id.length() == 0) {
            id = "a";
        }
        return step6(id);
    }

    private String step6(String id) {
        if (id.length() > 15) {
            id = id.substring(0, 15);
            if (id.charAt(id.length() - 1) == 46) {
                id = id.substring(0, id.length() - 1);
            }
        }
        return step7(id);
    }

    private String step7(String id) {
        if (id.length() <= 2) {
            String lastStr = id.substring(id.length() - 1);
            while (id.length() < 3) {
                id += lastStr;
            }
        }
        return id;
    }
}

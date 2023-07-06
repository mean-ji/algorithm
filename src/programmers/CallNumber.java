package programmers;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class CallNumber {
    public boolean solution(String[] phone_book) {
        return isContain(phone_book);
    }

    public boolean isContain(String[] phone_book) {
        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            phoneBook.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (phoneBook.containsKey(phone_book[i].substring(0, j))) return false;
            }
        }
        return true;
    }
}

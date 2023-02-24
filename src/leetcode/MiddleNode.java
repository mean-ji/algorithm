package leetcode;

import java.util.ArrayList;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> node = new ArrayList<>();

        int len = 0;
        while(head != null) {
            node.add(head);
            head = head.next;
            len++;
        }

        return node.get(len / 2);
    }
}

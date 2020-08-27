package practice;

import java.util.ArrayList;
import java.util.List;

public class Ji6 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        node.next = node1;
        node1.next = node2;
        int[] res = reversePrint(node);
        System.out.println(res.length);
    }

    public static int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        int[] res = new int[list.size()];
        for(int j=0;j<list.size();j++){
            res[j] = list.get(j);
        }
        return res;
    }
}

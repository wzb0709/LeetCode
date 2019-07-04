package LeetCode;


public class SolutionListNode {
    public static void main (String args[]){
        ListNode head = new ListNode(1);
        ListNode firstNode = new ListNode(2);
        ListNode secondNode = new ListNode(3);
        ListNode thirdNode = new ListNode(4);
        head.setNext(firstNode);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);

        SolutionListNode demo = new SolutionListNode();
        head.toString(demo.SolutionListNode(head));

    }

    private ListNode SolutionListNode(ListNode head){
        if(head == null || head.next == null ) return head;
        ListNode res = head.next;
        ListNode tmp = SolutionListNode(head.next.next);
        res.next = head;
        head.next = tmp;
        return res;
    }
}

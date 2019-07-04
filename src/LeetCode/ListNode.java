package LeetCode;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) { val = x; }

    public ListNode setNext(ListNode next){
        this.next = next;
        return this;
    }

    public void toString(ListNode now){
        if(now.next == null) {
            System.out.println("值:"+ now.val + "指向:null");
            return;
        }
        System.out.println("值:"+ now.val + "指向:" + now.next.val);
        this.toString(now.next);
    }
}

public class RemoveDuplicatesFromSortedList {
    //[1][1][2]
    public ListNode deleteDuplicates(ListNode head) {
        var first = head;
        if(head == null){
            return head;
        }
        var second = head.next;
        while(second != null) {
            if(first.val == second.val) {
                first.next = second.next;
                second = second.next;
            }else{
                first = second;
                second = second.next;
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
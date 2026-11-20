class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int counter = 0;
        ListNode temp = head;
        while(temp != null)      //for count the number of node at the linked list
        {
            counter += 1;
            temp = temp.next;
        }
        counter = counter - n;      // Get the previous index of deleting node
        temp = head;
        if(counter == 0)     // Check the deleting index is valid or not
        {
            return head.next;
        }
        for(int i=1; i<counter; i++)    //get the previous node 
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;  //Assign that node next to the next node's next 
        return head;
    }
}
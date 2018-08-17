
// Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
 
 class P_19 {
     public ListNode removeNthFromEnd(ListNode head, int n) {
         
         ListNode curr = head;
         int i = 0;
         
         while(curr.next!=null){
             curr = curr.next;
             
         
             i++;
             
         }
         
         ListNode node = head;
         int j=0;
         System.out.println("this is i: " + i);
         
         if(i==0){
             return null;
         }
         
         while(node.next!=null ){
             
             if(j == i-n){
                 System.out.println("this is j: " + j);
                 System.out.println("this is node value : " + node.val);
                 //System.out.println("this is node.next.next value : " + node.next.next.val);

                 node.next = node.next.next;
                 j++;
             }
             
             else if(i-n<0){
                 System.out.println("here!");
                 return node.next;
             }
             
             else{
             node = node.next;  
             j++;

             }

         }
         System.out.println(j);
         
          
         return head;
         
     }
 }
 public static void rearrange(Node odd)
    {
        // add your code here
        if(odd==null || odd.next==null || odd.next.next==null){
            return;
        }
        Node even=odd.next;
        odd.next=odd.next.next;
        odd=odd.next;
        even.next=null;
        
         while (odd.next != null) {
 
            // Store the next node in odd list
            Node temp = odd.next.next;
 
            // Link the next even node at the
            // beginning of even list
            odd.next.next = even;
            even = odd.next;
 
            // Remove the even node from middle
            odd.next = temp;
 
            // Move odd to the next odd node
            if (temp != null) {
                odd = temp;
            }
        }
 
        // Append the even list at the end of odd list
        odd.next = even;
    }

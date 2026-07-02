public class PalindromeLinkedList {



    static class ListNode {


        int val ;
        ListNode next ;


        ListNode(int val) {
            this.val =  val ;


        }
    }

    public static boolean ispalindrome(ListNode head) {

        if (head == null || head.next == null) {


            return true ;

        }

        ListNode slow = head ; 
        ListNode fast = head ; 

        while (fast != null && fast.next != null) {

            slow = slow.next ;
            fast = fast.next.next ;

        }

        ListNode prev = null ;

        while (slow != null) {

            ListNode next = slow.next ;
            slow.next = prev ;
            slow = next ;


        }

        ListNode first = head ;
        ListNode second = prev ; 

        while (second != null ) {

            if(first.val != second.val ) {

                return false ; 
                

            }

            first = first.next ;
            second = second.next ;


        }

         return true ;

    }

    

    public static void main(String[] args) {


        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1) ;
        System.out.println(ispalindrome(head));
    }
    
    
}

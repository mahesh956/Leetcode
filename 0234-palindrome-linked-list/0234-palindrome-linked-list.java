class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        boolean isPalindrome = true;
        ListNode current = head;
        while(current != null){
            stack.push(current.val);
            current = current.next;
        }
        while(head != null){
            int i = stack.pop();
            if(head.val == i){
                isPalindrome = true;
            }
            else{
                isPalindrome = false;
                break;
            }
            head = head.next;
            
        }
        return isPalindrome;
    }
}

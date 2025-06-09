//Link:https://leetcode.com/problems/reverse-linked-list/submissions/1658353842/
//TC:O(N)
//SC:O(1)
// Status: Solved ✅ | Date: 2025-06-09

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class reverse{
    public Node reverseList(Node head){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}

 class Main {
    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // Call reverse
        reverse r = new reverse();
        Node newHead = r.reverseList(head);

        // Print reversed list: 3 -> 2 -> 1 -> null
        while (newHead != null) {
            System.out.print(newHead.data + " -> ");
            newHead = newHead.next;
        }
        System.out.print("null");
    }
}

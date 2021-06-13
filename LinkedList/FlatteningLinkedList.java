package LinkedList;

public class FlatteningLinkedList {
    Node head;  // head of list

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next, bottom;
        Node(int data)
        {
            this.data = data;
            next = null;
            bottom = null;
        }
    }
    
    // Function to merge two linked lists
    Node merge(Node head1, Node head2)
   {
       Node merged = new Node(-1);
       Node temp = merged;
     
       // While head1 is not null and head2
       // is not null
       while (head1 != null && head2 != null) {
           if (head1.data < head2.data) {
               temp.bottom = head1;
               head1 = head1.bottom;
           }
           else {
               temp.bottom = head2;
               head2 = head2.bottom;
           }
           temp = temp.bottom;
       }
     
       // While head1 is not null
       while (head1 != null) {
           temp.bottom = head1;
           head1 = head1.bottom;
           temp = temp.bottom;
       }
     
       // While head2 is not null
       while (head2 != null) {
           temp.bottom = head2;
           head2 = head2.bottom;
           temp = temp.bottom;
       }
       return merged.bottom;
   }
    
//    Method: Use merge() to merge lists one by one. Try to recursively merge() the current list with the already flattened list.
//    Expected Time Complexity: O(N*M)
//    Expected Auxiliary Space: O(1)
     
   Node flatten(Node root)
   {
         if(root==null || root.next==null){
             return root;
         }
         root.next=flatten(root.next);
         root=merge(root,root.next);
         return root;
   }
   /* Utility function to insert a node at beginning of the
   linked list */
Node push(Node head_ref, int data)
{
    /* 1 & 2: Allocate the Node &
              Put in the data*/
    Node new_node = new Node(data);

    /* 3. Make next of new Node as head */
    new_node.bottom = head_ref;

    /* 4. Move the head to point to new Node */
    head_ref = new_node;

    /*5. return to link it back */
    return head_ref;
}
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.bottom;
        }
        System.out.println();
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        FlatteningLinkedList L = new FlatteningLinkedList();

        /* Let us create the following linked list
            5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
        */

        L.head = L.push(L.head, 30);
        L.head = L.push(L.head, 8);
        L.head = L.push(L.head, 7);
        L.head = L.push(L.head, 5);

        L.head.next = L.push(L.head.next, 20);
        L.head.next = L.push(L.head.next, 10);

        L.head.next.next = L.push(L.head.next.next, 50);
        L.head.next.next = L.push(L.head.next.next, 22);
        L.head.next.next = L.push(L.head.next.next, 19);

        L.head.next.next.next = L.push(L.head.next.next.next, 45);
        L.head.next.next.next = L.push(L.head.next.next.next, 40);
        L.head.next.next.next = L.push(L.head.next.next.next, 35);
        L.head.next.next.next = L.push(L.head.next.next.next, 20);

        
        // flatten the list
        System.out.println("Linkedlist after flattening");
        L.head = L.flatten(L.head);

        L.printList();
    }

}

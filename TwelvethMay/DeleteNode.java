//Program to delete a node from the end of the singly linked list
public class DeleteNode {  
  
    class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    public Node head = null;  
    public Node tail = null;  
  
    public void addNode(int data) {  
        Node newNode = new Node(data);  
  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            tail.next = newNode;  
            tail = newNode;  
        }  
    }  
  
    public void deleteFromEnd() {  
  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            if(head != tail ) {  
                Node current = head;  
                while(current.next != tail) {  
                    current = current.next;  
                }  
                tail = current;  
                tail.next = null;  
            }  
            else {  
                head = tail = null;  
            }  
        }  
    }  
  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        DeleteNode sList = new DeleteNode();  
  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(4);  
  
        System.out.println("Original List: ");  
        sList.display();  
  
        while(sList.head != null) {  
            sList.deleteFromEnd();  
            System.out.println("Updated List: ");  
            sList.display();  
        }  
    }  
}  

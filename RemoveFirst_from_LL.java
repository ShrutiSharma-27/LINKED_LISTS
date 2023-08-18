class Node{
    int data;
    Node next;
}

class LinkedList{
    Node head;
    Node tail;
    int size;

    void addLast(int value){
        Node temp=new Node();
        temp.data=value;
        temp.next=null;
        if (size==0){
            head = tail = temp;
        }
        else{
            tail.next=temp ;
            tail=temp;
        }
        size++;
    }

    void displayLinkedList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    int getSize(){
        return size;
    }

    // HERE are the mention functions :
    void removeFirst(){
        if(size==0) System.out.println("Linked list is empty");
        else if (size==1) {
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            size--;
        }
    }
}

public class RemoveFirst_from_LL {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(200);
        list.addLast(50);
        list.addLast(70);

        System.out.println("Before removing : ");
        list.displayLinkedList();
        System.out.println(list.getSize());

        list.removeFirst();

        System.out.println("After removing : ");
        list.displayLinkedList();
        System.out.println(list.getSize());
    }
}

//Output :

// Before removing : 
// 200
// 50
// 70
// 3
// After removing : 
// 50
// 70
// 2

class Node{  //Node object points to the address where it has stored that particular node.
    int data;
    Node next;
}

class LinkedList{
    Node head;
    Node tail;
    int size;

    // HERE are the mentioned functions :
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
}

public class AddAtLast_Display_LL {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(70);

        list.displayLinkedList();
        System.out.println(list.getSize());
    }
}

//Output :

// 10
// 20
// 70
// 3

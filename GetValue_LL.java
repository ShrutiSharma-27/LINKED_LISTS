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

    // HERE are the mentioned functions :
    int getFirst(){
        if(size==0) {
            System.out.println("Linked List is empty.");
            return -1;
        }
        return head.data;
    }

    int getLast(){
        if(size==0) {
            System.out.println("Linked List is empty.");
            return -1;
        }
        return tail.data;
    }

    int getAt(int index){
        if(size==0) {
            System.out.println("Linked List is empty.");
        }
        else if(index>size-1 || index<0){
            System.out.println("Invalid Arguments !");
        }
        else{
            Node temp = head; //for 0th index
            for(int i=0 ; i<index ; i++){ //so run it 1 less than the desired index as you've covered that 1 outside this loop.
                temp=temp.next;
            }
            return temp.data;
        }
        return -1;
    }
}

public class GetValue_LL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(23);
        list.addLast(20);
        list.addLast(98);
        list.addLast(1);
        list.addLast(100);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getAt(5));
        System.out.println(list.getAt(2));
    }
}

//Output :

// 23
// 100
// Invalid Arguments !
// -1
// 98

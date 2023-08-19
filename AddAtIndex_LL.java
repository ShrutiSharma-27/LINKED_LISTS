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

    void addFirst(int value){
        Node temp = new Node();
        temp.data=value;
        temp.next=head;
        head=temp;
        size++;
    }

    // HERE is the mentioned function :
    void addIndex(int index, int value){
        if (index<0 || index>size){ //index==size is not included because you can add at last so, in that case index=size
            System.out.println("Invalid Arguments");
        }
        else if(index==size) addLast(value);
        else if(index==0) addFirst(value);
        else {
            //Node to be added in linked list
            Node temp = new Node();
            temp.data = value;

            Node before_node = new Node();
            before_node=head; //0th index is assigned already so, we'll start our loop from i=1

            for(int i=1 ; i<index ; i++) {//I want to stop at node with index 1 less than the given
                before_node = before_node.next;
            }

            temp.next=before_node.next;
            before_node.next = temp;

            size++;
        }
    }
}

public class AddAtIndex_LL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(23);
        list.addLast(20);
        list.addLast(98);
        list.addLast(1);
        list.addLast(100);

        System.out.println("Before adding :");
        list.displayLinkedList();
        System.out.println(list.getSize());

        list.addIndex(0,999);
        list.addIndex(3,3);
        list.addIndex(7,250);


        System.out.println("\nAfter adding :");
        list.displayLinkedList();
        System.out.println(list.getSize());
    }
}

//Output :

// Before adding :
// 23
// 20
// 98
// 1
// 100
// 5

// After adding :
// 999
// 23
// 20
// 3
// 98
// 1
// 100
// 250
// 8

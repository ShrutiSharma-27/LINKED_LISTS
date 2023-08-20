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
        if (size==0) System.out.println("List is empty");
        else{
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp=temp.next;
            }
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

    void removeLast(){
        if(size == 0){
            System.out.println("List is empty");
        }
        else if (size == 1){
            head=tail=null;
            size--;
        }
        else{
            Node temp = new Node();
            temp=head;
            for (int i=1 ; i<size-1 ; i++){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp; //tail will point to new last
            size--;
        }
    }


    // HERE is the mentioned function : 
    void reverse(){
        if (size == 0){
            ; //acts like pass in python : empty statement
        }
        else if (size==1){
            ;
        }
        else{
            Node previous_node = null;
            Node current_node = head;
            while (current_node != null){
                Node hold_currentNext = current_node.next;

                current_node.next = previous_node;
                previous_node=current_node;
                current_node=hold_currentNext;
            }
            //Swap head and tail
            Node temp = head;
            head = tail;
            tail = temp;
        }
    }
}

public class Reverse_LL_Pointer_Iterative {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(23);
        list.addLast(20);
        list.addLast(98);
        list.addLast(1);

        LinkedList list1 = new LinkedList();
        list1.addLast(0);

        LinkedList list2  = new LinkedList();

        list.reverse();
        list1.reverse();
        list2.reverse();

        list.displayLinkedList();
        System.out.println();
        list1.displayLinkedList();
        System.out.println();
        list2.displayLinkedList();
    }
}

//Output :

// 1
// 98
// 20
// 23

// 0

// List is empty

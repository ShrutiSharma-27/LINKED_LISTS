# LINKED_LISTS

### Advantages of Arrays over Linked Lists :
* Array data structures have a simple implementation.
* Accessing elements in the array is very easy compared to the linked List. There is directed access to the element through indexing.
* The array implements other data structures like a queue, stack, etc.

### Disadvantages of Arrays over Linked Lists :
* Data stored in the array takes place in a static manner, which means that we cannot change the size of the array at run time as in the linked List.
* We can't exceed the length of array.
* We must specify the type of elements to be stored in the array as the type of array.
* Elements are stored in contiguous memory locations; hence there is no free space in between to add new elements. If there is free space in the array and we wish to insert an element between the array, then we have to push other elements to create a space at that particular location, which is very time-consuming.
* Memory wastage takes place in the case if we acquire less memory than reserved. For example, if we declared an array of length 100 and stored 40 elements only in it.
* We must predefine the size and length of an array

### Advantages of Linked Lists :

* Dynamic data structure: A linked list is a dynamic arrangement so it can grow and shrink at runtime by allocating and deallocating memory. So there is no need to give the initial size of the linked list.
* No memory wastage: In the Linked list, efficient memory utilization can be achieved since the size of the linked list increase or decrease at run time so there is no memory wastage and there is no need to pre-allocate the memory.
* Implementation: Linear data structures like stacks and queues are often easily implemented using a linked list.
* Insertion and Deletion Operations: Insertion and deletion operations are quite easier in the linked list. There is no need to shift elements after the insertion or deletion of an element only the address present in the next pointer needs to be updated. 
* Flexible: This is because the elements in Linked List  are not stored in contiguous memory locations unlike the array.
* Efficient for large data: When working with large datasets linked lists play a crucial role as it can grow and shrink dynamically.
* Scalability: Contains the ability to add or remove elements at any position.
* Optimally utilise space when you have fragmented memory space (not contiguous).
  
### Disadvantages of Linked Lists :

* Memory usage: More memory is required in the linked list as compared to an array. Because in a linked list, a pointer is also required to store the address of the next element and it requires extra memory for itself.
* Traversal: In a Linked list traversal is more time-consuming as compared to an array. Direct access to an element is not possible in a linked list as in an array by index. For example, for accessing a node at position n, one has to traverse all the nodes before it.
* Reverse Traversing: In a singly linked list reverse traversing is not possible, but in the case of a doubly-linked list, it can be possible as it contains a pointer to the previously connected nodes with each node. For performing this extra memory is required for the back pointer hence, there is a wastage of memory.
* Random Access: Random access is not possible in a linked list due to its dynamic memory allocation.
* Lower efficiency at times: For certain operations, such as searching for an element or iterating through the list, can be slower in a linked list.
* Complex implementation:  The linked list implementation is more complex when compared to array. It requires a complex programming understanding.
* Difficult to share data: This is because it is not possible to directly access the memory address of an element in a linked list.
* Not suited for small dataset: Cannot provide any significant benefits on small dataset compare to that of an array.

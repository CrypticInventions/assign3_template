//File: SimpleLinkedList.java. 
//Add a file header comment or a class header comment to your work.

package assign3_template;

/**
 * Assign 3 template. Implement more methods in List interface.
 */
public class SimpleLinkedList {

    //-------Start of Assign 3  --------/  
    
    //2.1.2 Coding Requirements
    //You can call other methods to complete a method.
    //You can also add private methods, and then call these methods 
    //  to complete a method required in this assignment. 
    //You are NOT allowed to add or remove data fields to/from SimpleLinkedList class. 
    //You are NOT allowed to change the definition of Node class.
    
    //2.1.1 What Code to Add+6
    //-----Required ---------------//    
    
    //Remove the first occurrence of the specified item from this linked list. 
    // If success, return true. Otherwise, return false.
    public boolean removeByValue(int item) {
        //add your own code
        Node current = head;
        Node preceding = head;
        for(int i = 1; i <= indexOf(item); ++i) {
            current = current.next;

            if(i < indexOf(item)) {
                preceding = preceding.next;

            }
        }
        System.out.println("Current: " + current.data);
        System.out.println("preceding: " + preceding.data);
        if(current.next != preceding.next) {
            preceding.next = current.next;
        }
        else {
            head = current.next;
        }
        //Hint:
        //  call your indexOf(...) to locate the item,
        //  convert the following in SingleLinkedList<E>
        //     private E removeFirst()        
        //     private Node<E> getNode(int index)         
        //     private E removeAfter(Node<E> node)
        
        
        //Hint: if you implement this from scratch, remember to save:
        //   predecessor node reference        
        //   current node reference
        
        return false;
    }

    //add item to be at [index];
    // if index is [0, size-1], insert item between [index-1] and [index]
    // if index is size, append item to the end of this linked list.
   public void add(int index, int item) {
        //add your own code
        Node current = head;
        Node temp = new Node(item);
        for(int i = 0; i < index -1; ++i) {
            current = current.next;
        }
        if(index == 0) {
            head = temp;
            temp.next = current;
        }
        else {
            temp.next = current.next;
            current.next = temp;
        }
        //Hint:
        //convert the following in SingleLinkedList<E>
        //    public void add(int index, E item)
 	//    public void addFirst(E item)
        //    private Node<E> getNode(int index)
    	//    private void addAfter(Node<E> node, E item)          
        
    }

    //Get the integer item at the specified position and return the integer value. 
    //If the index is not valid, throw an exception or print an error message 
    //  and return Integer.MIN_VALUE.
   public int get(int index) {
        //add your own code
        Node current = head;
        for(int i = 0; i < index; ++i) {
            current = current.next;
        }
        //Hint:
	//convert the following in SingleLinkedList<E>
        //    public E get(int index)
        //    private Node<E> getNode(int index)       
        
        return current.data;

    }

    //Search this linked list for the first occurrence of the specified integer: item. 
    //If the item is found, return its index. Otherwise return -1.
    public int indexOf(int item) {
        //add your own code
        //
        Node current = head;
        int index = 0;
        while(index < size()) {
            if(current.data == item) {
              break;
            }
            else {
                current = current.next;
                index += 1;
            }
        }
        //use a looping like the one in toString()
        //in addition, add a counter, 
        //    increment the counter for each element checked 
        //can use size for loop control.
        
        return index;
    }

    //Find out if the specified integer: item is in this linked list. 
    // Returns true if yes, false otherwise.
    public boolean contains(int item) {
        //add your own code
        boolean doesContain = false;
        if(indexOf(item) != size()) {
            doesContain = true;
        }
        //Hint:
        //can either call indexOf(...) 
        //    or directly search for the item using a loop like the one in toString()

        return doesContain;
    }

    //return how many integers are in this linked list
    public int size() {
        //add your own code
        Node current = head;
        int size = 0;
        while(current != null) {
            current = current.next;
            size += 1;
        }
        //Hint: this is actually a getter
        
        return size;
    }

    //-----Bonus ---------------//
    //Remove the item at the specified position from this linked list and 
    //  return the removed item.
    //If the index is not valid, throw an exception or print an error message 
    //   and return Integer.MIN_VALUE.
    public int removeByIndex(int index) {
        //Add your own code
     
        //Hint:        
        //verify that index is valid
        //convert the following in SingleLinkedList<E>
        //     private Node<E> getNode(int index) 
        //     private E removeAfter(Node<E> node)        
       
        //Hint: if you implement this from scratch, remember to save:
        //   predecessor node reference        
        //   current node reference
        
        return 2;
    }

    //-------End of Assign 3 --------/ 

    //Don't change the code below.
    //Nested class Node, enclosing class: SimpleLinkedList
    private static class Node {

        private int data;
        private Node next;

        //constructor used to create a standalone node without a successor
        private Node(int data) {
            this.data = data;
            next = null;
        }
        
        //constructor used to create a Node with a given successor
        private Node(int dataNew, Node nextNew) {
            data = dataNew;
            next = nextNew;
        }
       
    }

    //the reference to the first Node in this linked list.
    private Node head;
    //the size of this linked list
    private int size;

    //create an empty linked list
    public SimpleLinkedList() {
        head = null;
        size = 0;
    }

    //append newItem
    public boolean add(int newItem) {
        Node temp = new Node(newItem);
        if (head == null) { //empty list
            head = temp;
        } else { //non-empty list
            //locate last node
            Node current = head;    //start with the first node
            while (current.next != null) {  //check if current node is not the last node
                current = current.next;     //move on to the next node on the list
            }
            current.next = temp;    //append the new node immediately following the current node
        }
        size++;
        return true;
    }

    //return a string that contains all integers (in the original sequence) in this linked list.
    @Override
    public String toString() {
        String result = "";     //result string
        Node current = head;        //start with first Node
        while (current != null) {   //check if there is still nodes remaining
            result += current.data; //add the integer in current Node to the result string
            result += "-->";
            current = current.next; //move on to the next Node
        }
        return result;
    }
}

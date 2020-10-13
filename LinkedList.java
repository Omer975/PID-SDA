package se.sdaproject;
import java.util.NoSuchElementException;

class Node {
    int value; // package-private
    Node next;
    Node(int num) {
        value = num;
        next = null;
    }
}

/**
 * This class implements a standard single linked list.
 */
public class LinkedList {

    private Node first = null;
    private int size = 0;

    /**
     * Adds the integer element `num` to the end of
     * the list. Calling this method grows the size
     * of this list by one.
     *
     * @param num the element to be added.
     */
    public void add(int num) {
        Node nodeForNum = new Node(num);
        if (first == null) { // case 1
            first = nodeForNum;
        } else { // case 2

            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nodeForNum;
        }
        size++;
    }

    /**
     * Searches whether the LinkedList contains the given number
     * @param number
     * @return -1 if number not found, index of number if the number found
     */
    public int search(int number){
        int index = 0;
       if(first.value == number){
            return index;
       } else {
           Node current = first;
           while(current.next != null){
               current = current.next;
               index++;
               if(current.value == number){
                   return index;
               }
           }
       }
        return -1;
    }

    /**
     * Returns size of the list 
     * @return int size of the list
     */
    public int size(){
        return size;
    }

    /**
    * Takes an index and returns the value of the node under this index
    * @throws NoSuchElementException
    * @param index
    * @return
    */
    public int get(int index){
        if(index > size() - 1){
            throw new NoSuchElementException();
        } else {
            Node currentNode = first;
            int currentIndex = 0;
            while(currentIndex != index){
                currentNode = currentNode.next;
                currentIndex++;
            }
            return currentNode.value;
        }
    }

    public boolean remove(int number){
        if(first == null){
            return false;
        }
        int indexToRemove = search(number);
        if(indexToRemove == -1){
            return false;
        } else {
            int valueToRemove = get(indexToRemove);
            if(valueToRemove == first.value){
                first = first.next;
                return true;
            } else {
                Node currentNode = first;
                while(currentNode.next.value != valueToRemove){
                    currentNode = currentNode.next;
                } 
                currentNode.next = currentNode.next.next;
                return true;
            }
           
        } 
    }

    /**
     * Returns a string representation of this list,
     * containing all elements in their insertion order.
     */
    public String toString() {
        // "LinkedList(5, 2, 7)"
        StringBuilder builder = new StringBuilder();
        builder.append("LinkedList(");
        // append the elements
        if (first != null) { // list is non-empty
            Node current = first;
            builder.append(current.value);

            while (current.next != null) {
                current = current.next;
                // what if current is last node?
                // OK!
                builder.append("," + current.value);
            }    
        }
        builder.append(")");
        return builder.toString();
    }
}

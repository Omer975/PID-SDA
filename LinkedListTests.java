package se.sdaproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LinkedListTests {

    @Test
    void createLinkedList() {
        LinkedList list = new LinkedList();
        assertTrue(true);
    }

    @Test
    void addSingleElement() {
        LinkedList list = new LinkedList();
        list.add(5);
        String expected = "LinkedList(5)";
        assertEquals(expected, list.toString());
    }

    @Test
    void addTwoElements() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(2);
        String expected = "LinkedList(5,2)";
        assertEquals(expected, list.toString());
    }

    @Test
    void searchTest(){
        LinkedList list = new LinkedList();
        list.add(2);
        list.add(5);
        list.add(7);

        int actual = list.search(11);
        int expected = -1;

        assertEquals(actual, expected);

        actual = list.search(7);
        expected = 2;

        assertEquals(actual, expected);
    }

    @Test
    void sizeTest(){
        LinkedList list = new LinkedList();

        int actual = list.size();

        int expected = 0;

        assertEquals(actual, expected);

        list.add(10);
        list.add(11);

        actual = list.size();

        expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void getTest(){
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        int actual = list.get(0);
        int expected = 1;
        assertEquals(actual, expected);

        actual = list.get(1);
        expected = 2;
        assertEquals(actual, expected);
    }
    @Test
    void removeTest(){
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(2);
        String expected = "LinkedList(1,3)";

        System.out.println(list.toString());
        assertEquals(expected, list.toString());
    }


}

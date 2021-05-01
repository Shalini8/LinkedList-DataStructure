package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NodeTest {
    @Test
public void Given3Numbers_WhenLinked_ShouldPassed_LinkedListTest() {
    Node<Integer> firstNode = new Node<Integer>(56);
    Node<Integer> secondNode = new Node<Integer>(30);
    Node<Integer> thirdNode = new Node<Integer>(70);
    firstNode.setNext(secondNode);
    secondNode.setNext(thirdNode);
    boolean res = firstNode.getNext().equals(secondNode) &&
            secondNode.getNext().equals(thirdNode);
    Assertions.assertTrue(res);
    }
    @Test
    public void Given3Numbers_WhenAdded_ToLinkedListShould_BeAddedOnTop() {
        Node<Integer> firstNode = new Node<Integer>(70);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(56);
        LinkedList linkedList = new LinkedList();
        linkedList.add(firstNode);
        linkedList.add(secondNode);
        linkedList.add(thirdNode);
        linkedList.printNodes();
        boolean res = linkedList.head.equals(thirdNode) &&
                linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(firstNode);
        Assertions.assertTrue(res);
    }
}

package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
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
    @Test
    public void Given3Numbers_WhenAppended_ToLinkedListShould_BeAddedToLast() {
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.printNodes();
        boolean res = linkedList.head.equals(firstNode) &&
                linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(res);
    }
    @Test
    public void Given3Numbers_WhenInserted_ToLinkedListShould_BeAddedInBetween() {
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(firstNode);
        linkedList.append(thirdNode);
        linkedList.insert(firstNode, secondNode);
        linkedList.printNodes();
        boolean res = linkedList.head.equals(firstNode) &&
                linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(res);
    }
    @Test
    public void Given3Numbers_WhenDeleted_ToLinkedListShould_Become2_Numbers() {
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.pop();
        linkedList.printNodes();
        boolean res = linkedList.head.equals(secondNode) &&
                linkedList.head.getNext().equals(thirdNode);
        Assertions.assertTrue(res);
    }
    @Test
    public void Given3Numbers_WhenDeleted_LastNumber_ToLinkedListShould_Become2_Numbers() {
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.popLast();
        linkedList.printNodes();
        boolean res = linkedList.head.equals(firstNode) &&
                linkedList.head.getNext().equals(secondNode);
        Assertions.assertTrue(res);
    }
    @Test
    public void Given3Numbers_WhenSearch_AnyNumber_InLinkedList() {
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        boolean res = linkedList.search(30);
        linkedList.printNodes();
        Assertions.assertTrue(res);
    }
}

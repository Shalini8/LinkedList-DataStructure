package com.bridgelabz;

public class Node<K> {
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    private Node next;
    private K key;

    public Node(K key) {
        this.key = key;
        this.next = null;
    }


}

package com.conacry.structures.binarytree;

public class Node<T> {

    private int key;
    private T value;
    private Node leftChild;
    private Node rightChild;

    public Node(int key, T value, Node leftChild, Node rightChild) {
        this.setKey(key);
        this.setValue(value);
        this.setLeftChild(leftChild);
        this.setRightChild(rightChild);
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node(int key, T value) {
        this(key, value, null, null);
    }
}
package com.conacry.structures.binarytree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node find(int key) {
        Node current = root;
        while (current.getKey() != key) {
            if (key < current.getKey()) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public <T> void insert(int key, T value) {
        Node node = new Node<T>(key, value);
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key < current.getKey()) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(node);
                        return;
                    }
                } else {
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(node);
                        return;
                    }
                }
            }
        }
    }

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (current.getKey() != key) {
            parent = current;
            if (key < current.getKey()) {
                isLeftChild = true;
                current = current.getLeftChild();
            } else {
                isLeftChild = false;
                current = current.getRightChild();
            }

            if (current == null) {
                return false;
            }
        }

        if (current.getLeftChild() == null && current.getRightChild() == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.setLeftChild(null);
            } else {
                parent.setRightChild(null);
            }

        } else if (current.getRightChild() == null) {
            if (current == root) {
                root = current.getLeftChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }

        } else if (current.getLeftChild() == null) {
            if (current == root) {
                root = current.getRightChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());;
            } else {
                parent.setRightChild(current.getRightChild());
            }
        } else {
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.setLeftChild(successor);
            } else {
                parent.setRightChild(successor);
            }
        }
        
        return true;
    }

    public Set getKeySet() {
        
        Set keySet = new HashSet<>();
        keyOrder(keySet, root);
        return keySet;
        
    }

    public List getValueList() {
        List valueList = new ArrayList<>();
        valueOrder(valueList, root);
        return valueList;
    }

    public <T> T getValue(int key, Class<T> type) {
        Node node = find(key);
        return type.cast(node.getValue());
    }

    private void valueOrder(List valueList, Node node) {
        if (node != null) {
            valueOrder(valueList, node.getLeftChild());
            valueList.add(node.getValue());
            valueOrder(valueList, node.getRightChild());
        }
    }

    private void keyOrder(Set keySet, Node node) {

        if (node != null) {
            keyOrder(keySet, node.getLeftChild());
            keySet.add(node.getKey());
            keyOrder(keySet, node.getRightChild());
        }
    }

    private Node getSuccessor(Node node) {

        Node successorParent = node;
        Node successor = node;
        Node current = node.getRightChild();

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();
        }

        if (successor != node.getRightChild()) {
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(node.getRightChild());
        }

        return successor;
    }
}
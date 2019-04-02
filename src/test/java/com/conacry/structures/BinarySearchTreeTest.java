package com.conacry.structures;

import java.util.List;
import java.util.Set;

import com.conacry.structures.binarytree.BinarySearchTree;
import com.conacry.structures.binarytree.Node;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BinarySearchTreeTest {

    private BinarySearchTree tree;

    @BeforeMethod
    public void initTree() {
        tree = new BinarySearchTree();
        tree.insert(5, 5L);
        tree.insert(4, 4L);
        tree.insert(6, 6L);
        tree.insert(3, 3L);
        tree.insert(7, 7L);
        tree.insert(2, 2L);
        tree.insert(8, 8L);
        tree.insert(1, 1L);
        tree.insert(9, 9L);
        tree.insert(10, 10L);
    }

    @Test
    public void find_True() {
        Node testNode = new Node(10, 10L);
        Node findNode = tree.find(10);
        Assert.assertTrue(testNode.getKey() == findNode.getKey());
        Assert.assertTrue(testNode.getValue() == findNode.getValue());
    }

    @Test
    public void delete_True() {
        tree.delete(10);
        Assert.assertNull(tree.find(10));
    }

    @Test
    public void getKeySet_True() {
        Set keySet = tree.getKeySet();
        Assert.assertEquals(keySet.size(), 10);
    }


    @Test
    public void getValueList_True() {
        List valueList = tree.getValueList();
        Assert.assertEquals(valueList.size(), 10);
    }

    @Test
    public void getValue_True() {
        Long value = tree.getValue(4, Long.class);
        Assert.assertEquals(value, new Long(4));
    }
}
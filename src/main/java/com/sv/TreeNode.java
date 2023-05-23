package com.sv;

import lombok.ToString;

@ToString
public class TreeNode <E extends Comparable<E>>{

    TreeNode<E> left;
    TreeNode<E> right;

    E data;


    public TreeNode(E nodeData) {
        data = nodeData;
        left = null;
        right = null;
    }




}

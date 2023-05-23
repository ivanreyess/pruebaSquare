package com.sv;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class Tree<E extends Comparable<E>> {

    TreeNode<E> root;

    public void add(E value) {
        insert(root, value);
    }

    private TreeNode<E> insert(TreeNode<E> current, E value) {

        if (current == null) {
            TreeNode<E> treeNode = new TreeNode<>(value);
            System.out.println(treeNode);
            return treeNode;
        }

        if (value.compareTo(current.data) < 0) {
            current.left = insert(current.left, value);
        } else if (value.compareTo(current.data) > 0) {
            current.right = insert(current.right, value);
        } else return current;
        return current;
    }

    public boolean contains (E value) {
        return containsTreeNode(root, value);
    }

    private boolean containsTreeNode(TreeNode<E> current, E value) {
        if (current == null) {
            return false;
        }
        if (value == current.data) {
            return true;
        }
        return (value.compareTo(current.data) < 0) ? containsTreeNode(current.left, value) : containsTreeNode(current.right, value);
    }


}


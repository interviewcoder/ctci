package com.careercup;

public class TreeNodeWithParent {

    public TreeNodeWithParent parent;

    public TreeNodeWithParent left;

    public TreeNodeWithParent right;

    public int val;

    public TreeNodeWithParent(int value) {
        val = value;
    }

    public static void connect(TreeNodeWithParent n, TreeNodeWithParent p,
            TreeNodeWithParent l, TreeNodeWithParent r) {
        if (n != null) {
            n.parent = p;
            n.left = l;
            n.right = r;
        }
    }

}

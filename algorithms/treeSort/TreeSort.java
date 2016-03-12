package algorithms.treeSort;

class Tree {
    public Tree left;
    public Tree right;
    public int key;

    public Tree(int k) {
        key = k;
    }

    public void insert(Tree aTree) {
        if (aTree.key < key)
            if (left != null) left.insert(aTree);
            else left = aTree;
        else if (right != null) right.insert(aTree);
        else right = aTree;
    }

    public void traverse(TreeVisitor visitor) {
        if (left != null)
            left.traverse(visitor);

        visitor.visit(this);

        if (right != null)
            right.traverse(visitor);
    }
}

interface TreeVisitor {
    public void visit(Tree node);
};

class KeyPrinter implements TreeVisitor {
    public void visit(Tree node) {
        System.out.print(" " + node.key);
    }
};

class TreeSort {
    public static void main(String args[]) {
        Tree myTree;
        myTree = new Tree(7);
        myTree.insert(new Tree(5));
        myTree.insert(new Tree(9));
        myTree.traverse(new KeyPrinter());
    }
}
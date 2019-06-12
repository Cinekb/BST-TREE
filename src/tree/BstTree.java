package tree;

import java.math.BigInteger;

public class BstTree {

    Node root;

    public void addNode(int val) {
        Node node = new Node(val);
        if (root == null)
            root = node;
        else {
            Node actual = root;
            Node parent = null;

            while (actual != null) {
                parent = actual;
                if (val < actual.val) {
                    actual = parent.left;
                    if (actual == null) {
                        parent.left = node;
                        return;
                    }
                } else {
                    actual = parent.right;
                    if (actual == null) {
                        parent.right = node;
                        return;
                    }
                }

            }

        }
    }
boolean search(int val)
{
    Node actual =root;
    if(actual.val==val)
        return true;

    while(actual!= null) // dopoki nie znaleziono lub actualny nie rowna sie null
    {
        if (val < actual.val) {
            actual = actual.left;
            if (actual.val == val)
                return true;
        }else{
            actual=actual.right;
            if (actual.val == val)
                return true;
        }
    }
    return false;
}
}

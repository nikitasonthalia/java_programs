package data_structure;

import java.util.Objects;

/**
 * Created by nikitasonthalia on 6/1/16.
 */

class MyTree
{



}

class TreeNodes
{
    Objects data;
    Node left;

    public TreeNodes(Node left,Node right) {
        this.data=null;
        this.left = left;
        this.right=right;
    }
    public TreeNodes(Objects data,Node left,Node right) {
        this.data=data;
        this.left = left;
        this.right=right;
    }

    Node right;

    public TreeNodes() {

    }

    public TreeNodes(Objects data) {
        this.data = data;
        this.left = null;
        this.right=null;
    }

    public void setRight(Node right) {
        this.right = right;
    }


    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }



    public Objects getData() {
        return data;
    }

    public void setData(Objects data) {
        this.data = data;
    }




    public Node getRight() {
        return right;
    }
}
public class CoreTree {
}

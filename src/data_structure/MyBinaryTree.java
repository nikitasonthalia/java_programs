package data_structure;

import java.util.Comparator;

/**
 * Created by nikitasonthalia on 6/20/16.
 */
class BinaryTree {

    TreeNode root;

    public void add(double data)
    {
        if(root==null)
        {
            root=new TreeNode(data);
        }
        else {

//            TreeNode current = root;
            TreeNode temp = new TreeNode(data);
//            TreeNode parent = null;
//            while(current!=null)
//            {
//                parent=current;
//                if(temp.getData()>current.getData())
//                {
//                    current=current.getRight();
//                }
//                else
//                {
//                    current=current.getLeft();
//                }
//            }
//            if(temp.getData()>parent.getData())
//            {
//                parent.setRight(temp);
//            }
//            else
//            {
//                parent.setLeft(temp);
//            }
            TreeNode parent=temp.findParent(root);
            if(temp.getData() > parent.getData())
            {
                parent.setRight(temp);
            }
            else
            {
                parent.setLeft(temp);
            }

            temp.setParent(parent);
        }
    }
    public void inorder()
    {
        inorder(root);
    }

    public void inorder(TreeNode current)
    {
        if(current==null)
        {
            return;
        }
        inorder(current.getLeft());
        System.out.println(current.getData());
        inorder(current.getRight());
    }

//    private int height() {
//
//        int lHieght=0;
//        int rHieght=0;
//        TreeNode current = root;
//        while(current!=null)
//        {
//            if(current.getLeft()!=null)
//            {
//                lHieght=lHieght+1;
//            }
//            current=current.getLeft();
//        }
//        current = root;
//        while (current!=null)
//        {
//            if(current.getRight()!=null)
//            {
//                rHieght=rHieght+1;
//            }
//            current=current.getRight();
//        }
//        if(lHieght>rHieght)
//        {
//            return lHieght;
//        }
//        else
//        {
//            return rHieght;
//        }
//
//    }
    private int height(TreeNode current) {
        if (current==null)
            return 0;
        else
        {
        /* compute the height of each subtree */
            int lheight = height(current.getLeft());
            int rheight = height(current.getRight());

        /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }
    public void levelOrder()
    {
        for(int i = 1 ; i<= height(root) ; i++ ) {
            levelOrder(root, i);
        }
    }




    public void levelOrder(TreeNode current, int level)
    {
        if(current==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.println(current.data);
        }
        if(level>1)
        {
            levelOrder(current.getLeft(),level-1);
            levelOrder(current.getRight(),level-1);
        }

    }

}

class TreeNode
{
    double data;
    TreeNode left;
    TreeNode right;
    TreeNode parent;


    TreeNode(double data)
    {
        this.data = data;
        this.left=null;
        this.right=null;
        this.parent=null;

    }
    TreeNode(double data,TreeNode left, TreeNode right)
    {
        this.data = data;
        this.left=left;
        this.right=right;
        this.parent=null;


    }

    TreeNode(double data,TreeNode left, TreeNode right, TreeNode parent)
    {
        this.data = data;
        this.left=left;
        this.right=right;
        this.parent=parent;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }



    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }


    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }


    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }


    public TreeNode findParent(TreeNode node) {

        TreeNode current=null;

        while(node!=null)
        {
            current=node;
            if( this.data>node.data )
            {
                node=node.getRight();
            }
            else
            {
                node=node.getLeft();
            }
        }
        return current;
    }



}
public class MyBinaryTree
{
    public static void main(String[] args)
    {
        BinaryTree bt = new BinaryTree();
        bt.add(5);
        bt.add(4);
        bt.add(3);
        bt.add(7);
        bt.add(6);
        bt.inorder();
       // bt.levelOrder();
    }
}

package concurrency;

import java.util.ArrayList;
import java.util.List;

public class Test94 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode root1r = new TreeNode(2);
        TreeNode root1r2l = new TreeNode(3);
        root.right = root1r;
        root1r.right = root1r2l;
        List<Integer> integerList = inorderTraversal(root);
        for(int i = 0;i<integerList.size();i++){
            System.out.println(integerList.get(i));
        }

    }

    public static List< Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList< >();
        helper(root, res);
        return res;
    }

    public static void helper(TreeNode root, List < Integer > res) {
        if (root != null) {
            if (root.left!= null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }

}

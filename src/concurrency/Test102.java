package concurrency;

import java.util.*;

public class Test102 {


    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;

//        List<List<Integer>> res = levelOrder(node1);
//        System.out.println(Arrays.toString(res.toArray()));


        int res = levelOrder(node1);
        System.out.println(res);

    }

//    public static List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root);
//        while (!q.isEmpty()){
//            int size = q.size();
//            List<Integer> level = new LinkedList<>();
//            for(int i =0;i<size;i++){
//                TreeNode cur = q.poll();
//                if(cur == null){
//                    continue;
//                }
//                level.add(cur.val);
//                q.offer(cur.left);
//                q.offer(cur.right);
//            }
//            if(!level.isEmpty()){
//                res.add(level);
//            }
//        }
//        return res;
//    }

    public static int levelOrder(TreeNode root) {
        List<List<Integer>> res  = new ArrayList<>();
        if(root != null){
            dfs(res, root, 0);
        }
        return res.size();
    }

    private static void dfs(List<List<Integer>> res, TreeNode node, int level){
        if(res.size() - 1 < level){
            res.add(new ArrayList<Integer>());
        }
        res.get(level).add(node.val);
        if(node.left!=null){
            dfs(res, node.left, level + 1);
        }
        if(node.right!=null){
            dfs(res, node.right, level + 1);
        }
    }

}

class Solution {
    public void generate(List<Integer> result,TreeNode node){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
                result.add(node.val);
                return;
        }
        generate(result,node.left);
        generate(result,node.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> lst1=new ArrayList<>();
        List<Integer> lst2=new ArrayList<>();

        generate(lst1,root1);
        generate(lst2,root2);
        return lst1.equals(lst2);
    }
}
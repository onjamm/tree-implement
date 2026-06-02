public class TreeNode <T> {
    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;
    
    public TreeNode(T data) {
        this.data = data;
    }

    public TreeNode(T data, TreeNode<T> left) {
        this.data = data;
        this.left = left;
        
    }

    //type safety - will tell us at compile time - which is much better than something failing at runtime
    //worse for somethign to crash in production, then in development (compilation time))
    //TreeNode<Integer> myNode = new TreeNode<>(8, null, someOtherNode);
    public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

}
public class Traversal {
    public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(10);


    root.left = new TreeNode<>(9);
    root.left.left = new TreeNode<>(5);
    root.left.right = new TreeNode<>(2);


    root.right = new TreeNode<>(15);
    root.right.left = new TreeNode<>(-3);
    root.right.right = new TreeNode<>(5);
    root.right.right.right = new TreeNode<>(22);


    TreeNode<String> stringRoot = new TreeNode<>("hello");


    stringRoot.left = new TreeNode<>("hi");
    stringRoot.left.left = new TreeNode<>("sdkjf");
    stringRoot.left.right = new TreeNode<>("asdf");


    stringRoot.right = new TreeNode<>(";klj");
    stringRoot.right.left = new TreeNode<>("yo");
    stringRoot.right.right = new TreeNode<>("howdy");
    stringRoot.right.right.right = new TreeNode<>("santa");
    // preorder(stringRoot);
    // // preorder(root); 
    // // postorder(root);
    // // inorder(root);
    // printGreaterThan(root, 1);
    System.out.println(countNodes(root));
    }


    public static int countNodes(TreeNode<?> current) {
        if (current == null) {
            return 0;
        }

        int leftCount = countNodes(current.left);
        int rightCount = countNodes(current.right);

        int totalCount = 1 + leftCount + rightCount;

        return totalCount;
    }

    //Do a preorder traversal 
    // but ONLY PRINT the NODES that are Greater than our threshold
    public static void printGreaterThan(TreeNode<Integer> current, int threshold) {
        if (current == null) return;
        if (current.data > threshold) {
            System.out.println(current.data);
            
        }
        printGreaterThan(current.left, threshold);
        printGreaterThan(current.right, threshold);
    }
    public static void preorder(TreeNode<?> current) {
        if(current == null) return;
        
        System.out.println(current.data);
        preorder(current.left);
        preorder(current.right);
    }

    //E inforces the types in the list - tighter bounds on type safety
    //Generics give us much more type safty then doing <Object>, which would
    //allow any object in the tree, instead of enforcing cohesive types
    public static <E> void postorder(TreeNode<E> current) {
        if(current == null) return;
        postorder(current.left);
        postorder(current.right);
        E myData = current.data;
        System.out.println(myData);        
    }

    public static void inorder(TreeNode<?> current) {
        if(current == null) return;
        inorder(current.left);
        System.out.println(current.data);
        inorder(current.right);        
    }


    //in order: left-print-right
   
}

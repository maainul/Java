# Finding the maximum depth of a binary tree

# Algorithm

The algorithm uses recursion to calculate the maximum height:

1. Recursively calculate the height of the tree to the left of the root.
2. Recursively calculate the height of the tree to the right of the root.
3. Pick the larger height from the two answers and add one to it (to account for the root node).
![Screenshot from 2021-03-04 20-09-24](https://user-images.githubusercontent.com/37740006/109976066-8e530700-7d25-11eb-9f24-4717e3972924.png)

```java
class Node  
{ 
  int value; 
  Node left, right; 
   
  Node(int val)  
  { 
    value = val; 
    left = right = null; 
  } 
}

class BinaryTree  
{ 
  Node root;
  int maxDepth(Node root)  
  { 
    // Root being null means tree doesn't exist.
    if (root == null) 
      return 0; 

    // Get the depth of the left and right subtree 
    // using recursion.
    int leftDepth = maxDepth(root.left); 
    int rightDepth = maxDepth(root.right); 

    // Choose the larger one and add the root to it.
    if (leftDepth > rightDepth) 
      return (leftDepth + 1); 
    else 
      return (rightDepth + 1); 
  } 
      
  // Driver code
  public static void main(String[] args)  
  { 
    BinaryTree tree = new BinaryTree(); 
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.right.left = new Node(5);
    tree.root.right.right = new Node(6);
    tree.root.right.right.left = new Node(8);
    tree.root.right.left.right = new Node(7);
    System.out.println("Max depth: " + tree.maxDepth(tree.root));              
  } 
} 
```

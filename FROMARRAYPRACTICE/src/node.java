import java.util.*;
class Node {
    int data;
    Node left;
    Node right;
    node(int value){
        data =value;
        left = right = null;
    }
}
public class main{
static void Inorder(Node node) {
    if(node == null)
        return;
    Inorder(node.left);
    System.out.println(node.data+"  ");


}
}

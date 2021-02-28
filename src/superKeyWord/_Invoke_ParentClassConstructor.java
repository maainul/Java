package superKeyWord;

class Tree{
    Tree(){
        System.out.println("Tree construtor");
    }
}


class MangoTree extends Tree{
    MangoTree(){
        //super();
        System.out.println("Mango tree constructor");
    }
}




public class _Invoke_ParentClassConstructor {
    public static void main(String[] args) {
        MangoTree mangoTree = new MangoTree();
    }
}

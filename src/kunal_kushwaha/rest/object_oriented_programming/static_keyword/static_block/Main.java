package kunal_kushwaha.rest.object_oriented_programming.static_keyword.static_block;

public class Main {
    public static void main(String[] args) {
        System.out.println(InitializingInStaticBlock.a);
//        InitializingInStaticBlock i = new InitializingInStaticBlock();
    }
}

class InitializingInStaticBlock {
    static int a;
    static {
        System.out.println("imma in static block");
        a = 5;
    }
}

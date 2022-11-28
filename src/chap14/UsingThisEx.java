package chap14;

public class UsingThisEx {
    public static void main(String[] args) {
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();
        inner.method();

        System.out.println("\n=======================\n");

        UsingLocalVariable ulv = new UsingLocalVariable();
        ulv.method(20);
    }
}

class A {
private int x = 101;
class B {
void lakukanSesuatu() {
System.out.print("x = " + x);
}
}
}
public class BelajarInnerClass02 {
public static void main(String[] args) {
A a = new A();
A.B b = a.new B();
b.lakukanSesuatu();
}
}
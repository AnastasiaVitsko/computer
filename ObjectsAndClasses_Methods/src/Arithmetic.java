public class Arithmetic {
public static void main(String[] args) {
        Arithmetic arith23 = new Arithmetic(2,3);
        System.out.println(arith23.doSomeOperation(Double::sum));
        System.out.println(arith23.doSomeOperation((a, b) -> a - b));
        System.out.println(arith23.doSomeOperation((a, b) -> a * b));
    }
 
}
class Arithmetic {
    private int a;
    private int b;
 
    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }
 
    public double doSomeOperation(DoubleBinaryOperator op) {return op.applyAsDouble(a,b);}
 
    public int getA() {
        return a;
    }
 
    public int getB() {
        return b;
    }
}



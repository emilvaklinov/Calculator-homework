public class Calculator {
    private int num_01;
    private int num_02;
    private int result;

    public Calculator (int num_01, int num_02) {
        this.num_01 = num_01;
        this.num_02 = num_02;
    }

    public int getNum_01() {
        return this.num_01;
    }

    public int getNum_02() {
        return this.num_02;
    }

    public void add() {
        result = num_01 + num_02;
        System.out.println( result );
    }

    public void subtract() {
        result = num_01 - num_02;
        System.out.println( result );
    }

    public void divide() {
        result = num_01 / num_02;
        System.out.println( result );
    }

    public void multiply() {
        result = num_01 * num_02;
        System.out.println( result );
    }

}
public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setOperand1(10.5);
        calc.setOperation("+");
        calc.setOperand2(5.2);
        calc.performOperation();
        System.out.println(calc.getResult());
        calc.setOperand1(101.5);
        calc.setOperation("-");
        calc.setOperand2(15.2);
        calc.performOperation();
        System.out.println(calc.getResult());
    }
}

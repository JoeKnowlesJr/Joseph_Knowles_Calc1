import org.jetbrains.annotations.Contract;
import java.io.Serializable;

class Calculator implements Serializable {
    private static final String ADD = "+";
    private static final String SUB = "-";
    private double operand1, operand2, result;
    private String operation;

    @Contract(pure = true)
    Calculator() {}


    void performOperation() {
        switch(operation) {
            case ADD:
                result = operand1 + operand2;
                break;
            case SUB:
                result = operand1 - operand2;
                break;
        }
    }

    double getResult() {
        return result;
    }

    double getOperand1() { return operand1; }
    void setOperand1(double operand1) { this.operand1 = operand1; }
    double getOperand2() { return operand2; }
    void setOperand2(double operand2) { this.operand2 = operand2; }
    String getOperation() { return operation; }
    void setOperation(String operation) { this.operation = operation; }
}

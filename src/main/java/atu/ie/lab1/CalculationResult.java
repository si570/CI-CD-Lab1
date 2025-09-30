package atu.ie.lab1;

public class CalculationResult {
    private String operation;
    private String result; // use String to also allow error messages

    public CalculationResult(String operation, String result) {
        this.operation = operation;
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public String getResult() {
        return result;
    }
}


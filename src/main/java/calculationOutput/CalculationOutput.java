package calculationOutput;

import input.Input;

public class CalculationOutput {
    //Declaration.....
    int total = 500, sum;
    double percent;
    String grade;

    //Constructor....
    public CalculationOutput() {
        percentage();
        grades();
        output();
    }

    //Calculate Percentage....
    public void percentage() {
        Input io = new Input();
        io.input();
        sum = io.ophy + io.ochem + io.obio + io.omath + io.oeng;
        percent = sum * 100 / total;
    }

    //Calculate Grades....
    public void grades() {
        if (percent >= 90) {
            grade = "A+";
        } else if (percent >= 80.0 && percent < 90.0) {
            grade = "A";
        } else if (percent >= 70.0 && percent < 80.0) {
            grade = "B+";
        } else if (percent >= 60.0 && percent < 70.0) {
            grade = "B";
        } else if (percent >= 50.0 && percent < 60.0) {
            grade = "C+";
        } else if (percent >= 40.0 && percent < 50.0) {
            grade = "C";
        } else if (percent < 40.0) {
            grade = "F";
        }
    }

    //Output....
    public void output() {
        System.out.println("\nPercent: " + percent + "%\nGrade: " + grade);
    }
}

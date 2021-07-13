package calculation;

import inputOutput.InputOutput;

public class Calculation {
    int total = 500, sum, sub = 5;
    double percent;
    String grade;

    public void precentage() {
        sum = ophy + ochem + obio + omath + oeng;
        percent = sum / total * 100;
    }

    public void grades() {
        if (percent > 90) {
            grade = "A+";
        } else if (percent > 80 && precent < 90) {
            grade = "A";
        } else if (percent > 70 && precent < 80) {
            grade = "B+";
        } else if (percent > 60 && precent < 70) {
            grade = "B";
        } else if (percent > 50 && precent < 60) {
            grade = "C+";
        } else if (percent > 40 && precent < 50) {
            grade = "C";
        } else {
            grade = "F";
        }
    }
}

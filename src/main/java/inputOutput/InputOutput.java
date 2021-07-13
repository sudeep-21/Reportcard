package inputOutput;

import java.util.Scanner;

public class InputOutput {
    String name, fname, symbol;
    int id, phy, chem, bio, math;

    Scanner input = new Scanner(System.in);

    public void input() {
        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println("Enter your symbol no: ");
        symbol = input.nextLine();

        System.out.println("Enter your id: ");
        id = input.nextInt();

    }
}

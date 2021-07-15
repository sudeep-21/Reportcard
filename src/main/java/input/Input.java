package input;

import java.util.Scanner;

public class Input {
    //Initialization of data members and methods....
    String name, fname, symbol;
    public int id, ophy, ochem, obio, omath, oeng;
    Scanner input = new Scanner(System.in);

    //User input Section.....
    public void input() {
        //Personal Details.....
        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println("Enter your symbol no: ");
        symbol = input.nextLine();

        System.out.println("Enter your id: ");
        id = input.nextInt();

        System.out.println("Enter your father's name: ");
        fname = input.nextLine();
        input.nextLine();

        //Marks section........
        System.err.println("\nThe full marks is 100....\n");

        //Physics.....
        while (ophy < 1 || ophy > 100) {
            System.out.println("Enter obtained marks of Physics: ");
            ophy = input.nextInt();
            validity(ophy);
        }

        //Chemestry.....
        while (ochem < 1 || ochem > 100) {
            System.out.println("Enter obtained marks of Chemestry: ");
            ochem = input.nextInt();
            validity(ochem);
        }

        //Biology....
        while (obio < 1 || obio > 100) {
            System.out.println("Enter obtained marks of Biology: ");
            obio = input.nextInt();
            validity(obio);
        }

        //Mathematics....
        while (omath < 1 || omath > 100) {
            System.out.println("Enter obtained marks of Mathematics: ");
            omath = input.nextInt();
            validity(omath);
        }

        //English.....
        while (oeng < 1 || oeng > 100) {
            System.out.println("Enter obtained marks of English: ");
            oeng = input.nextInt();
            validity(oeng);
        }
    }

    //Check if the input marks are validate....
    public void validity(int v) {
        if (v < 1 || v > 100) {
            System.err.println("The obtained marks should be within 1-100!!!");
        }
    }
}

package personal.views;

import java.util.Scanner;

class Prompt {
    protected String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}

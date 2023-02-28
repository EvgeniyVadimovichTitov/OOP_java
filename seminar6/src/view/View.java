package view;

import controller.Controller;
import module.User;

public class View {
    // имитация UI
    public void run(){
        Controller contr = new Controller();
        User user1 = new User("Artem");
        User user2 = new User("Andrey");
        User user3 = new User("Vitya");
        contr.save(user1);
        contr.report();
        contr.save(user2);
        contr.report();
        contr.save(user3);
        contr.report();
        System.out.println("Well done!!!");
    }
}

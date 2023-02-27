package personal;

import personal.controllers.UserController;
import personal.model.*;
import personal.views.Validation;
import personal.views.ViewUser;
import personal.views.ViewUserConnecting;

public class Main {
    public static void main(String[] args) {
        ViewUserConnecting connecting = new ViewUserConnecting();
        String dbName = connecting.runFirst();
        IncludingDb connect = new IncludingDb();
        Repository repository = connect.includeDb(dbName);
        UserController controller = new UserController(repository,new Validation());
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}

package module;

import java.util.ArrayList;
import java.util.List;


public class ListUsers {
    private static ListUsers singltoneInstance;
    private List<User> users;

    private ListUsers() {this.users = new ArrayList<>();}

    public static ListUsers getSingltoneInstance(){
        if (singltoneInstance == null){
            singltoneInstance = new ListUsers();
        }
        return singltoneInstance;
    }
    public void add(User user) {
        this.users.add(user);
    }
    @Override
    public String toString() {
        return "ListUsers"+ users;
    }


}

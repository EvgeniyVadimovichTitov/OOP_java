package module;

public class Persister implements Persisterly {
    ListUsers users = ListUsers.getSingltoneInstance();

    @Override
    public void save(User user) {
        System.out.println("save in ListUsers:\n"+user);
        users.add(user);
    }

    @Override
    public void report() {
        System.out.println("report of users:\n"+this.users);
    }
}

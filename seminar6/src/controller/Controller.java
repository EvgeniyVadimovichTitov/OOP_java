package controller;


import module.Persister;
import module.User;


public class Controller {
    Persister persister = new Persister();

    public void save(User user){
        persister.save(user);
    }

    public void report(){
        persister.report();
    }
}

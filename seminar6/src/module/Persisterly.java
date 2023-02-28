package module;

import module.User;

public interface Persisterly<T extends User>{
    void save(T user);
    void report();
}

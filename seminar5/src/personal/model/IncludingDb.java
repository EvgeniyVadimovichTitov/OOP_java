package personal.model;

public class IncludingDb {
    public Repository includeDb(String dbName) {
        FileOperation fileOperation = new FileOperationImpl(dbName);
        if (dbName == "users.csv") {return  new RepositoryFile(fileOperation, new UserMapper2());}
        else {return new RepositoryFile(fileOperation, new UserMapper());}
    }
}

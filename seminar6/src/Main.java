import module.ListUsers;
import module.User;
import view.View;

import java.util.List;

import static module.ListUsers.getSingltoneInstance;

public class Main{
	public static void main(String[] args){
		View view = new View();
		view.run();
	}
}
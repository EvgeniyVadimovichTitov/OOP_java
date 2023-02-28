package module;

public class User{
	static private int idGeneration = 0;

	private int id;
	private String name;
	
	public User(String name){
		this.name = name;
		this.id = ++idGeneration;
	}
	
	public String getName(){
		return name;
	}
	public int getId() {return id;}

	@Override
	public String toString() {
		return String.format("user: id %d; name %s", this.getId(), this.getName());
	}
}
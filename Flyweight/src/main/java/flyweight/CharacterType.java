package flyweight;

public class CharacterType {

	private String Name;
	private String Race;
	private String Gender;
	private String Kingdom;
	private String Role;

	public CharacterType(String name, String race, String gender, String kingdom, String role) {
		super();
		Name = name;
		Race = race;
		Gender = gender;
		Kingdom = kingdom;
		Role = role;
	}

	@Override
	public String toString() {
		return "CharacterType [Name=" + Name + ", Race=" + Race + ", Gender=" + Gender + ", Kingdom=" + Kingdom
				+ ", Role=" + Role + "]";
	}
	
	

}

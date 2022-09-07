package ChainOfResponsibility;

public class Character {

	private String Name;
	private String Gender;
	private String Role;
	private int Health;
	private int Mana;
	private int Level;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public String getRole() {
		return Role;
	}

	public int getHealth() {
		return Health;
	}

	public void setHealth(int health) {
		Health = health;
	}

	public int getMana() {
		return Mana;
	}

	public void setMana(int mana) {
		Mana = mana;
	}

	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		Level = level;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public void setRole(String role) {
		Role = role;
	}

	@Override
	public String toString() {
		return "Character [Name=" + Name + ", Gender=" + Gender + ", Role=" + Role + ", Health=" + Health + ", Mana="
				+ Mana + ", Level=" + Level + "]";
	}

	
	
}

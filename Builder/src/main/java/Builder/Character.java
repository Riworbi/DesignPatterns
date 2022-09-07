package Builder;

public class Character {

	private String Name;
	private String Race;
	private String Gender;
	private String Kingdom;
	private String Role;
	private int Health;
	private int Mana;
	private int Level;

	public Character(String name, String race, String gender, String kingdom, String role, int health, int mana,
			int level) {
		super();
		Name = name;
		Race = race;
		Gender = gender;
		Kingdom = kingdom;
		Role = role;
		Health = health;
		Mana = mana;
		Level = level;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRace() {
		return Race;
	}

	public String getGender() {
		return Gender;
	}

	public String getKingdom() {
		return Kingdom;
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

	public void setRace(String race) {
		Race = race;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public void setKingdom(String kingdom) {
		Kingdom = kingdom;
	}

	public void setRole(String role) {
		Role = role;
	}

	@Override
	public String toString() {
		return "Character [Name=" + Name + ", Race=" + Race + ", Gender=" + Gender + ", Kingdom=" + Kingdom + ", Role="
				+ Role + ", Health=" + Health + ", Mana=" + Mana + ", Level=" + Level + "]";
	}

}

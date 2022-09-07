package Builder;

public class CharacterBuilder implements CharacterBuilderInterface {

	private String Name;
	private String Race;
	private String Kingdom;
	private String Role;
	private String Gender;
	private int Health;
	private int Mana;
	private int Level;

	public void setRace(String Race) {
		this.Race = Race;
	}

	public void setGender(String Gender) {
		this.Gender = Gender;
	}

	public void setKingdom(String Kingdom) {
		this.Kingdom = Kingdom;
	}

	public void setRole(String Role) {
		this.Role = Role;
	}

	public Character getResult() {
		return new Character(Name, Race, Gender, Kingdom, Role, Health, Mana, Level);
	}

	public void setHealth(int Health) {
		this.Health = Health;
	}

	public void setMana(int Mana) {
		this.Mana = Mana;
	}

	public void setLevel(int Level) {
		this.Level = Level;
	}

	public void setName(String Name) {
		this.Name = Name;
	}


}

package flyweight;

public class Character {

	private int Health;
	private int Mana;
	private int Level;
	private CharacterType type;

	public Character(int health, int mana, int level, CharacterType type) {
		super();
		Health = health;
		Mana = mana;
		Level = level;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Character [Health=" + Health + ", Mana=" + Mana + ", Level=" + Level + ", type=" + type + "]";
	}

	
	
}

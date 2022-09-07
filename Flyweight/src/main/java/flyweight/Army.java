package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Army {

	private List<Character> ArmyUnit = new ArrayList<Character>();

	public void insertCharacter(String name, String race, String gender, String kingdom, String role, int health,
			int mana, int level) {
		CharacterType type = CharacterFactory.getCharacterType(name, race, gender, kingdom, role);
		Character character = new Character(health, mana, level, type);
		ArmyUnit.add(character);
	}

	public void PrintArmy() {
		for (Character character : ArmyUnit) {
			System.out.println(character);
		}
	}
}

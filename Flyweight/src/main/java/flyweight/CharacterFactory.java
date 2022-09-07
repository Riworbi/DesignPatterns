package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

	static Map<String, CharacterType> characterType = new HashMap<String, CharacterType>();

	public static CharacterType getCharacterType(String name, String race, String gender, String kingdom, String role) {
		CharacterType result = characterType.get(name);
		if (result == null) {
			result = new CharacterType(name, race, gender, kingdom, role);
			characterType.put(name, result);
		}
		return result;
	}

}

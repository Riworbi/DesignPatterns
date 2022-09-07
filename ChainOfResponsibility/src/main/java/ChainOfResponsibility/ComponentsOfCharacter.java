package ChainOfResponsibility;

import java.util.HashSet;
import java.util.Set;

public class ComponentsOfCharacter {

	protected class addName extends CreationClass {

		@Override
		public void handleCreateRequest(Character character) {
			if (character.getName() == null) {
				character.setName("John");
			} else {
				System.out.println("Name is  empty");
			}
		}
	}

	protected class addGender extends CreationClass {
		@Override
		public void handleCreateRequest(Character character) {
			if (character.getGender() == null)
				character.setGender("Male");
		}
	}

	protected class addRole extends CreationClass {
		@Override
		public void handleCreateRequest(Character character) {
			if (character.getRole() == null)
				character.setRole("Warrior");
		}
	}

	protected class addHealth extends CreationClass {
		@Override
		public void handleCreateRequest(Character character) {
			if (character.getHealth() == 0)
				character.setHealth(100);
		}
	}

	protected class addMana extends CreationClass {
		@Override
		public void handleCreateRequest(Character character) {
			if (character.getMana() == 0)
				character.setMana(100);
		}
	}

	protected class addLevel extends CreationClass {
		@Override
		public void handleCreateRequest(Character character) {
			if (character.getLevel() == 0)
				character.setLevel(25);
		}
	}

	public Character makeCharacter() {
		Set<CreationClass> setOfComponents = new HashSet<CreationClass>();

		setOfComponents.add(new addName());
		setOfComponents.add(new addGender());
		setOfComponents.add(new addLevel());
		setOfComponents.add(new addHealth());
		setOfComponents.add(new addMana());
		setOfComponents.add(new addRole());

		Character character = new Character();

		for (CreationClass component : setOfComponents) {
			component.handleCreateRequest(character);
		}

		return character;
	}
}

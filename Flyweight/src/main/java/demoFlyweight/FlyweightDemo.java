package demoFlyweight;

import flyweight.Army;

public class FlyweightDemo {

	static int HEALTH = 100;
	static int MANA = 100;
	static int LEVEL = 0;

	public static void main(String[] args) {
		Army army = new Army();

		army.insertCharacter("John", "Elf", "Male", "Riverwood", "Archer", HEALTH, MANA, LEVEL);
		army.insertCharacter("Olaf", "Dark Elf", "Male", "Saints Woods", "Warrior", HEALTH, MANA, LEVEL);
		army.insertCharacter("Albert", "Human", "Male", "Saints Woods", "Mage", HEALTH, MANA, LEVEL);
		army.insertCharacter("Alex", "Elf", "Male", "Saints Woods", "Druid", HEALTH, MANA, LEVEL);

		army.PrintArmy();
	}

}

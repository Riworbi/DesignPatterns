package Builder;

public class CharacterDirector {

	public void constructMaleFighter(CharacterBuilder builder) {
		builder.setName("John");
		builder.setGender("Male");
		builder.setRace("Human");
		builder.setKingdom("PeopleLand");
		builder.setRole("Fighter");
		builder.setHealth(100);
		builder.setMana(100);
		builder.setLevel(0);
	}

	public void constructFemaleFighter(CharacterBuilder builder) {
		builder.setName("Isabel");
		builder.setGender("Female");
		builder.setRace("Human");
		builder.setKingdom("PeopleLand");
		builder.setRole("Fighter");
		builder.setHealth(100);
		builder.setMana(100);
		builder.setLevel(0);
	}

	public void constructMaleMage(CharacterBuilder builder) {
		builder.setName("Randolf");
		builder.setGender("Male");
		builder.setRace("Giant");
		builder.setKingdom("Wonderland");
		builder.setRole("Mage");
		builder.setHealth(100);
		builder.setMana(100);
		builder.setLevel(0);
	}

	public void constructFemaleMage(CharacterBuilder builder) {
		builder.setName("Anna");
		builder.setGender("Female");
		builder.setRace("Giant");
		builder.setKingdom("Wonderland");
		builder.setRole("Mage");
		builder.setHealth(100);
		builder.setMana(100);
		builder.setLevel(0);
	}

	public void constructMaleArcher(CharacterBuilder builder) {
		builder.setName("Jeffrey");
		builder.setGender("Male");
		builder.setRace("Elf");
		builder.setKingdom("Saints Woods");
		builder.setRole("Archer");
		builder.setHealth(100);
		builder.setMana(100);
		builder.setLevel(0);
	}

	public void constructFemaleArcher(CharacterBuilder builder) {
		builder.setName("Joanna");
		builder.setGender("Female");
		builder.setRace("Elf");
		builder.setKingdom("Saints Woods");
		builder.setRole("Archer");
		builder.setHealth(100);
		builder.setMana(100);
		builder.setLevel(0);
	}

}

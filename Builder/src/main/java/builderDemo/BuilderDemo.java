package builderDemo;

import Builder.*;
import Builder.Character;

public class BuilderDemo {

	public static void main(String[] args) {
		CharacterBuilder builder = new CharacterBuilder();
		CharacterDirector director = new CharacterDirector();
		
		director.constructFemaleArcher(builder);
		Character character = builder.getResult();

		System.out.println(character);
		
	}

}

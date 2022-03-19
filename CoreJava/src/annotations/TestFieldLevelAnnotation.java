package annotations;

import java.lang.reflect.Field;

public class TestFieldLevelAnnotation {

	@Player(value="footballer", fit=true)
	private Person person1;

	@Player(value="cricketer", fit=false)
	private Person person2;
	
	@Player(fit=false)
	private Person person3;

	public static void main(String[] args) {
		TestFieldLevelAnnotation test = new TestFieldLevelAnnotation();
		for (Field field : test.getClass().getDeclaredFields()) {
			Player player = field.getAnnotation(Player.class);
			System.out.println("player :" + player.value());
			System.out.println("fit: " + player.fit());
		}

	}

}

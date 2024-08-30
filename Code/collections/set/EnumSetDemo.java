package core.collections.set;

import java.util.EnumSet;

public class EnumSetDemo {
	
	enum Color {
		RED, BLUE, ORANGE, BLACK, WHITE
	}

	public static void main(String[] args) {
		
		//Creating enumset
		EnumSet<Color> enumSet = EnumSet.allOf(Color.class);
	}

}

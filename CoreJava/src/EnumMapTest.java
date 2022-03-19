import java.util.EnumMap;
import java.util.Map;
import java.util.Set;


public class EnumMapTest {
	
	public enum PLANET { MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE, PLUTO };
	public enum TYPE { ROCKY, GAS, ICE};

	public static void main(String[] args) {
		EnumMap<PLANET, String> planetColorMap = new EnumMap<>(PLANET.class);
		planetColorMap.put(PLANET.MERCURY, "GREY");
		planetColorMap.put(PLANET.VENUS, "YELLOW");
		planetColorMap.put(PLANET.EARTH, "BLUE");
		planetColorMap.put(PLANET.MARS, "BROWN");
		System.out.println(planetColorMap);
		
		planetColorMap.forEach((k,v)->System.out.printf("key = %s :: value = %s %n",k, v));
		
		EnumMap<PLANET, TYPE> planetTypeMap = new EnumMap<>(PLANET.class);
		planetTypeMap.put(PLANET.MERCURY, TYPE.ROCKY);
		planetTypeMap.put(PLANET.EARTH, TYPE.ROCKY);
		planetTypeMap.put(PLANET.JUPITER, TYPE.GAS);
		System.out.println(planetTypeMap);
		
		planetTypeMap.forEach((k,v)->System.out.printf("key = %s :: value = %s %n",k, v));
		
	}

}

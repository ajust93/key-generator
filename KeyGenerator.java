public class KeyGenerator {
	
	final static int NUMBER_OF_POSSIBLE_CHARS = 36; // [0-9 , A-Z]
	static int numberOfKeysToGenerate = 1_000_000;
	static char charDivider = '-';
	static int numberOfCharsBeforeDivider = 5;
	static int numberOfCharsNeeded = 25;
	
	public static String[] generateKeys() {
		String[] keys = new String[numberOfKeysToGenerate];
		for (int i = 0; i < numberOfKeysToGenerate; i++) {
			String key = "";
			for (int j = 0; j < numberOfCharsNeeded; j++) {
				if (j != 0 && j % numberOfCharsBeforeDivider == 0) key += charDivider;
				int randomNumber = (int)(Math.random() * NUMBER_OF_POSSIBLE_CHARS);
				key += KeyMapping.keyMap.get(Integer.toString(randomNumber));
			}
			keys[i] = key;
		}
		return keys;
	}
	
}

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		KeyMapping.generateMapping();
		String[] keys = KeyGenerator.generateKeys();
		for (int i = 0; i < keys.length; i++) System.out.println(i+1 + " = " + keys[i]);
		
		// System.out.println(areKeysUnique(keys));
	}
	
	public static boolean areKeysUnique(String[] keys) {
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < keys.length; i++) set.add(keys[i]);
		if (set.size() == KeyGenerator.numberOfKeysToGenerate) return true;
		return false;
	}
	
}

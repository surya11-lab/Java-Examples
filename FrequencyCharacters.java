import java.util.HashMap;

public class FrequencyCharacters {
    public static void main(String[] args) {

        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: str.toCharArray()) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println("Character Frequencies: ");
        for(char key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));;
        }
    }

}

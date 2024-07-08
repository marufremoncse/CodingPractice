import java.util.LinkedHashMap;

public class FrstNonReptChar {
    public static char frstNonReptChar(String st){
        char res = 0;
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        for(Character c: st.toCharArray()){
            lhm.put(c,lhm.getOrDefault(c, 0)+1);
        }
        for (Character key : lhm.keySet()) {
            // Access each key
            if(lhm.get(key)==1){
                res = key;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String st = "simplest";
        System.out.println(frstNonReptChar(st));
    }
}

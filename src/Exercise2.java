import java.util.*;

public class Exercise2 {
    class Solution {
        Map<String, Integer> map = new HashMap<>();

        public List<String> subdomainVisits(String[] cpdomains) {

            for (String cpdomain : cpdomains) {
                String[] a = cpdomain.split(" ");
                int n = Integer.valueOf(a[0]);
                String damain = a[1];
                String[] b = damain.split("\\.");


                for (int i = 0; i < b.length; i++) {
                    int num = n;
                    String[] c = Arrays.copyOfRange(b, i, b.length );
                    String d = String.join(".", c);
                    map.put(d,map.getOrDefault(d,0)+n);

                }
            }
            List<String> ret = new ArrayList<>();
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                String f = e.getKey();
                int g = e.getValue();
                String s = String.format("%d %s", g, f);
                ret.add(s);
            }
            return ret;
        }
    }

}
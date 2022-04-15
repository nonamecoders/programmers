package tranbe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test2 {

    public void cycle(String prefix, String s, HashSet<String> set) {
        int len = s.length();
        if(!prefix.equals("")) {
            set.add(prefix);
        }

        for (int i = 0; i < len; i++){
            cycle(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, len), set);
        }
    }

    public int solution(String s) {
        int answer = 0;

        Set<String> set = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for(char c : s.toCharArray()){
            set.add(c+"");
        }

        Iterator<String> iter = set.iterator();
        StringBuffer sb= new StringBuffer();

        while (iter.hasNext()){
            sb.append(iter.next());
        }

        cycle("", sb.toString(), set2);

        iter = set2.iterator();
        while (iter.hasNext()){
            if(s.contains(iter.next()))
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println(test2.solution("abac"));
    }
}

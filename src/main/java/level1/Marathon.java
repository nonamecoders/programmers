package level1;

import java.util.Arrays;

public class Marathon {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i]))
                return participant[i];
        }

        return participant[participant.length - 1];
    }

    public static void main(String[] args) {
        Marathon marathon = new Marathon();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden","kiki"};
        System.out.println(marathon.solution(participant,completion));
    }
}

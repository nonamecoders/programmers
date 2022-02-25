package level2;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String tree : skill_trees){
            String temptree = tree;
            for(int i =0; i<tree.length();i++){
                String s = tree.substring(i,i+1);
                if(!skill.contains(s)){
                    temptree = temptree.replace(s,"");
                }
            }

            if(skill.indexOf(temptree) == 0){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        SkillTree skillTree = new SkillTree();
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(skillTree.solution(skill,skill_trees));
    }
}

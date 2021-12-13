package level1;

public class AddNotExistNum {
    public int solution(int[] numbers) {
        int result = 45;


        for(int i : numbers){
            result -=i;
        }

        return result;
    }

    public static void main(String[] args) {
        AddNotExistNum addNotExistNum = new AddNotExistNum();
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(addNotExistNum.solution(numbers));
    }
}

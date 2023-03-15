
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SetOfNumbers extends UserInput {
    public static final int COUNT = 6;
    public List<Integer> numbers = new LinkedList<>();

    public List<Integer> numberList() {
        for (int i = 0; i < COUNT; i++) {
            numbers.add(welcome());
        }
        return numbers;
    }

    public List<Integer> resultList() {
        List<Integer> result = new ArrayList<>();
        for (Integer number : this.numbers) {
            if (!result.contains(number))
               result.add(number);
        }
        return result;
    }

    public void displayInfo() {
        Object[] numberArray = numbers.toArray();
        for (Object number : numberArray) {
            System.out.print(number + " ");
        }
        System.out.println("\n");
    }
    public void resultInfo(){
        Object[] resultArray = resultList().toArray();
        for (Object number : resultArray){
            System.out.print(number + " ");
        }
    }
}


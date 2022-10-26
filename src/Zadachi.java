import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zadachi {

    public int first;
    public int second;

    //Задание 2
    public Zadachi(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args) {
        List<Zadachi> multiTable = new ArrayList<>();
        for (int first = 2; first <= 9; first++) {
            for (int second = first; second <= 9; second++) {
                multiTable.add(new Zadachi(first, second));
            }
        }
        Collections.shuffle(multiTable);
        List<Zadachi> questionsForStudents = multiTable.subList(0, 15);
        System.out.println(questionsForStudents);
    }

    @Override
    public String toString() {
        return first + "*" + second;
    }
}

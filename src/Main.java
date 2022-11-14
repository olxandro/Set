import Collections_3.Human;
import Collections_3.ToMap;

import java.util.*;

public class Main {
    public static void main(String[] args) throws ProductException {
//        Set<Product> a = new HashSet<>();
//        Set<Product> b = new HashSet<>();
//
//
//        Product banan = new Product("банан", 39.50, 5);
//        Product coconut = new Product("кокос", 112.40, 2);
//        Product apple = new Product("яблоко", 25.60, 3);
//        Product orange = new Product("апельсин", 35.30, null);
//        Product grape = new Product("виноград", 120.30, 4);
//
//
//        a.add(banan);
//        a.add(coconut);
//        a.add(apple);
//        b.add(orange);
//        b.add(grape);
//
//
//
//
//        Recipe pirog = new Recipe(a, "Шарлотка");
//        Recipe golobz = new Recipe(b,"голобец");
//
//        Set<Recipe> allRecepts = new HashSet<>();
//        allRecepts.add(pirog);
//        allRecepts.add(golobz);
//        allRecepts.add(golobz);
//        pirog.sumProducts();

        List<Integer> numbers = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            numbers.add(i, (int) (Math.random() * 1000));
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (!(numbers.get(i) % 2 == 0)){
                numbers.remove(i);
            } else {
                System.out.println(numbers.get(i));
            }
        }

        Human human1 = new Human("Василий", "Васильев");
        Human human2 = new Human("Олег", "Фофин");
        Human human3 = new Human("Олег", "Петрович");
        Human human4 = new Human("Роман", "Забутылкин");
        Human human5 = new Human("Петр", "Савушкин");
        Human human6 = new Human("Николай", "Петрухович");
        Human human7 = new Human("Сергей", "Орефьев");
        Human human8 = new Human("Алексей", "Терехин");
        Human human9 = new Human("Илларион", "Орехов");
        Human human10 = new Human("Руслан", "Васильев");
        Human human11 = new Human("Елисей", "Кукуев");
        Human human12 = new Human("Михаил", "Петров");
        Human human13 = new Human("Евгений", "Сутулов");
        Human human14 = new Human("Владимер", "Кукушкин");
        Human human15 = new Human("Юрий", "Иванов");
        Human human16 = new Human("Виталий", "Сидоров");
        Human human17 = new Human("Роберт", "Заразин");
        Human human18 = new Human("Андрей", "Самсонов");
        Human human19 = new Human("Анатолий", "Тарапунькен");
        Human human20 = new Human("Ярик", "Юрьев");

        HashMap<Human, String> telephoneDirectory = new HashMap<>();
        telephoneDirectory.put(human1, "89217348734");
        telephoneDirectory.put(human2, "89217348735");
        telephoneDirectory.put(human3, "89217348736");
        telephoneDirectory.put(human4, "89217348737");
        telephoneDirectory.put(human5, "89217348738");
        telephoneDirectory.put(human6, "89217348739");
        telephoneDirectory.put(human7, "89217448734");
        telephoneDirectory.put(human8, "89217548734");
        telephoneDirectory.put(human9, "89217648734");
        telephoneDirectory.put(human10, "89217748734");
        telephoneDirectory.put(human11, "89217848734");
        telephoneDirectory.put(human12, "89217948734");
        telephoneDirectory.put(human13, "89217348754");
        telephoneDirectory.put(human14, "89217348764");
        telephoneDirectory.put(human15, "89217348774");
        telephoneDirectory.put(human16, "89217348784");
        telephoneDirectory.put(human17, "89217348794");
        telephoneDirectory.put(human18, "89217548734");
        telephoneDirectory.put(human19, "89217648734");
        telephoneDirectory.put(human20, "89217748734");
        System.out.println(telephoneDirectory.toString());

        Map<String, Integer>  nums = new HashMap<>();

        nums.put("str", 23);
        nums.put("str2", 234);
        nums.put("str3", 263);
        nums.put("str4", 123);
        nums.put("str5", 293);

        ToMap mp = new ToMap(nums);
        mp.addToMap("str15", 23);
        System.out.println(mp);

         /*
        Создайте Map<String, List<Integer>>. Заполните ее 5 элементами, где ключ — произвольное значение,
        а значение — список, состоящий из 3 случайных чисел в диапазоне от 0 до 1000.
        Преобразуйте созданную коллекцию в новую — Map<String, Integer>, где ключи взяты из первой коллекции,
        а число — сумма чисел списка. Выведите результат в консоль.
         */
        Map<String, List<Integer>> one = new HashMap<>();
        String string = "Строка";
        for (int i = 0; i < 5; i++) {
            List<Integer> list = new ArrayList<>();
            list.add((int) (Math.random() * 1000));
            list.add((int) (Math.random() * 1000));
            list.add((int) (Math.random() * 1000));
            one.put(string + i, list);
        }
        System.out.println(one);

        Map<String, Integer> two = new HashMap<>();
        for (String name : one.keySet()) {
            int sumList = 0;
            List<Integer> simple = one.get(name);
            for (Integer integer : simple) {
                sumList += integer;
            }
            two.put(name, sumList);
        }
        System.out.println(two);

        /*
        Создайте Map<Integer, String>, заполните ее 10 произвольными значениями. Выведите в консоль всё содержимое
        коллекции в порядке добавления (в формате "ключ:значение").
         */
        System.out.println();
        Map<Integer, String> task2 = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            Integer x = ((int) (Math.random() * 1000));
            task2.put(x, string + i);
        }
        System.out.println(task2);
    }
}
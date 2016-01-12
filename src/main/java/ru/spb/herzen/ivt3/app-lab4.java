ackage ru.spb.herzen.ivt3;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Nastya {
    public static void main(String[] args) {
        List<Integer> randomNums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i = i + 1) {
            randomNums.add((int) (Math.random() * ((1000) + 1)));
        }
        Consumer<Integer> NumberCrusher = (x) -> {
            System.out.println(x * 2);
        };
        randomNums
                .stream()
                .filter(num -> num % 2 == 0)
                .sorted()
                .forEach(NumberCrusher);


        List<Integer> intList = new ArrayList<>();

        Consumer<List> addToIntList = (listName) -> {
            for (int i = 0; i < 30; i = i + 1) {
                listName.add((int) (Math.random() * ((1000) + 1)));
            }
        };
        addToIntList.accept(intList);


        intList
                .stream()
                .sorted()
                .forEach(num -> {
                    System.out.println(num);
                });

        List<Integer> EvenNumsList = intList
                .stream()
                .sorted()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("The amount of even numbers: " + EvenNumsList.size());

        String name;
        name = "Anastasia";

        List<Character> myNameCharList = new ArrayList<Character>();

        for (char nameChar : name.toCharArray()) {
            myNameCharList.add(nameChar);
        }

        myNameCharList
                .stream()
                .sorted()
                .forEach(letter -> {
                    System.out.println(letter);
                });

    }
}

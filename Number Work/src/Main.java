import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(16);
        list.add(-1);
        list.add(-2);
        list.add(0);
        list.add(32);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(23);
        list.add(4);

        list.removeIf(x -> x < 0);
        list.removeIf(x -> (x % 2) == 1);
        list.sort(Comparator.naturalOrder());
        list.forEach(System.out::println);
    }
}
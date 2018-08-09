package july24th;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

enum Numbers {
    PERFECT, DEFICIENT, ABUNDANT
}

public class PerfectNumber {
    public static void main(String[] args) {
        //MNOZHITELI
        int a = 8;
        List<Integer> list = getMultipliers2(a);
        //summa mnozhitelej
        Optional<Integer> reduced = list
                .stream()
                // .sorted()
                .reduce((s1, s2) -> s1 + s2);
        System.out.println(list);
        reduced.ifPresent(System.out::println);

        Function<Integer, List<Integer>> getMultipliers2 = PerfectNumber::getMultipliers2;//to zhe chto iLambda, no lakonichnee
//        System.out.println(getMultipliers2);
    }

    private static List<Integer> getMultipliers2(int a) { //alternativa getMultiplaiers
//        List<Integer> list = IntStream.range(1, (a / 2+1))
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5)
                .stream()
                .filter((i) -> (a % i == 0))
                .collect(Collectors.toList());
        return list;
    }

    private static List<Integer> getMultipliers(int a) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= (a / 2); i++) {
            if (a % i == 0) list.add(i);
        }
        return list;
    }



}

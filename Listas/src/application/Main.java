package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Maria");//0
        list.add("Alex");//1
        list.add("Bob");//2
        list.add("Anna");//3
        list.add(2, "Marco");//4
        list.removeIf(x -> x.charAt(0) == 'M');

        for(String x : list){
            System.out.println(x);
        }
        System.out.println("Qual o tamanho da lista? " + list.size());
        System.out.println("----------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("---------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());//localizar apenas os nomes que comecam com A
        for(String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }

}

package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args){
        int[] a={1,234,45,1,34};
        int b[]=a.clone();


        System.out.println(Arrays.toString(b));
        Arrays.asList("a","b","c").forEach(e -> {
            System.out.println(e);
        });
        List list=new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");

        list.parallelStream().filter(q ->{
           return  q == "a";
        }).collect(Collectors.toList());
        list.forEach(t ->{
            System.out.println(t);
        });


        Consumer<String> consumer = e->System.out.println("都是"+e);
        consumer.accept("弟弟");
        consumer.andThen(consumer);
    }
}

package Collections.Demo;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
    }
    public static void setDemo(){
        Set <String >fruit = new HashSet<>();
        fruit.add("Lemon");
        fruit.add("Orange");
        fruit.add("Pineapple");
        fruit.add("Jack-fruit");
        fruit.add("Lemon");

        System.out.println("fruit.size() = " + fruit.size());
        System.out.println("fruit = " + fruit);
var i = fruit.iterator();
while (i.hasNext()){
    System.out.println("i.next() = " + i.next());
}

for (String item : fruit  ){
    System.out.println("item = " + item);
}

fruit.forEach(x -> System.out.println("x = " + x) );
fruit.forEach(System.out::println);
    }
}

package Collections.Demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
//        listDemo();
//        queDemo();
        mapDemo();

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
fruit.forEach(System.out::println); // Syntaxtic Sugar
    }

    public static void mapDemo(){
        Map<String , Integer > fruitCalories = new HashMap();

        fruitCalories.put("Apple", 95);
        fruitCalories.put("Mango", 105);
        fruitCalories.put("Avocado", 295);
        fruitCalories.put("Apple", 50);
        fruitCalories.put("Starfruit", 55);

        for(var entry : fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }

        fruitCalories.forEach(
                (k,v)->System.out.println("Fruit: " + k + ", Calories: " + v));
    }
}

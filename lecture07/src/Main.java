import java.util.HashSet;

public class Main {
    /*public static void HashMapEntrySet(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Kiwi");

        System.out.println("Iterating HashMap");
        for(Map.Entry<Integer, String> fruit : map.entrySet()) {
            System.out.println(fruit.getKey() + " " + fruit.getValue());
        }

    }
     */
    /*
    public static void HashMapKeySet(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Kiwi");
        for(Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
    */
    /*
    public static void HashMapOperations(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(100, "Ivan");
        hashMap.put(101, "Dan");
        hashMap.put(102, "Gogo");

        for (Map.Entry<Integer, String> name : hashMap.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());

        }
        System.out.println("Updated list of elements: ");
        hashMap.replace(102, "Taso");
        for (Map.Entry<Integer, String> name : hashMap.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }

        System.out.println("Updated list of elements: ");
        //replace the old value of the specified key only if previously mapped with the specific old value
        hashMap.replace(101, "Dan", "Krisi");
        for (Map.Entry<Integer, String> name : hashMap.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }

        System.out.println("Update all pairs");
        hashMap.replaceAll((k,v) -> "Asen");
        for (Map.Entry<Integer, String> name : hashMap.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }
        System.out.println("Updated list of elements: ");
    }
    */
    /*
    public static void HashSetOperations(String[] args) {
        HashSet<String> manNames = new HashSet<>();
        manNames.add("Niki");
        manNames.add("Ivan");
        manNames.add("Georgi");
        manNames.add("Stoyan");

        System.out.println("Initial elements of the set: " + manNames);

        System.out.println("Adding a duplicated element: ");
        manNames.add("Ivan");
        System.out.println("Set: " + manNames);

        //removing specific element
        manNames.remove("Ivan");
        System.out.println("After removing: " + manNames);

        HashSet<String> womanNames = new HashSet<>();

        womanNames.add("Ekaterina");
        womanNames.add("Maya");
        System.out.println("Set1" + womanNames);

        manNames.addAll(womanNames);
        System.out.println("All names: " + manNames);

        manNames.removeAll(womanNames);
        System.out.println("All names" + manNames);

        for(String name: manNames) {
            name = name.concat("1");
            System.out.println(name);
        }
    }
    */
}
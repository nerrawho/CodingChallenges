
public class Main {

    public static void main(String[] args) {

        CircularArray<String> test = new CircularArray<String>();

        test.add("Mom");
        test.add("Dad");
        test.add("Sister");


        System.out.println(test.size());

        for(String i: test) {
            System.out.println("Enhanced For Loop Test: " + i);
        }

        for(int j = 0; j < 20; j++) {
            System.out.println("Circular Test | Index [" +  j + "] returns value: " + test.get(j));
        }

    }
}

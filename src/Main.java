import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int value = 33;
        changeValue(value);
        System.out.println(value);

        Integer value1 = 33;
        changeValue1(value1);
        System.out.println(value1);

        Integer[] value2 = {3, 4};
        changeValue2(value2);
        System.out.println(Arrays.toString(value2));

        changeValue3(value2);
        System.out.println(Arrays.toString(value2));

        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println(person);

        changePerson1(person);

        System.out.println(person);

        changePerson2(person);

        System.out.println(person);

    }

    public static void changePerson1(Person person){
        person = new Person("Ilya", "Lagutenko");
    }

    public static void changePerson2(Person person){
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }

    public static void changeValue(int value){
        value = 22;
    }

    public static void changeValue1(Integer value){
        value = 22;
    }

    public static Integer[] changeValue2(Integer[] value){
        value = new Integer[]{1, 2};
        return value;
    }

    public static Integer[] changeValue3(Integer[] value){
        value[0] = 99;
        return value;
    }
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var male = new Person();
        male.setName("João");
        male.setAge(12);

        var female = new Person();
        female.setName("Maria");
        female.setAge(10);
        System.out.println("Male name: " + male.getName() + "Age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + "Age: " + female.getAge());
    }
}
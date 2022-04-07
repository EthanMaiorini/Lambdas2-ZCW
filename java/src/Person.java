import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        // ...
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public void printPerson() {
        // ..
        System.out.println("Name: "+name +" Birthday: "+birthday+" Sex: "+gender+" Email: "+emailAddress+" \n");
    }
}

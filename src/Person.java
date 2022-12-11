public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private String ssn;

    public Person(String firstname, String lastname, int age, String ssn){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.ssn = ssn;
    }
    public String toString(){
        return "SSN: " + ssn + "\n\tName: " + firstname + " " + lastname + "\n\tAge: " + age;
    }
}

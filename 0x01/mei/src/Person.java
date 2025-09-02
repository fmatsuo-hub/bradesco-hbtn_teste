import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, 
                 boolean pensioner, boolean publicServer, float salary) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
        this.salary = salary;
    }

    public String fullName() {
        return name + " " + surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float calculateYearlySalary() {
        return salary * 12;
    }

    public boolean isMEI() {
        @SuppressWarnings("deprecation")
        int currentYear = new Date().getYear() + 1900;
        @SuppressWarnings("deprecation")
        int birthYear = birthDate.getYear() + 1900;
        int age = currentYear - birthYear;
        
        return (calculateYearlySalary() < 130000) &&
               (age > 18) &&
               (!anotherCompanyOwner) &&
               (!pensioner) &&
               (!publicServer);
    }
}
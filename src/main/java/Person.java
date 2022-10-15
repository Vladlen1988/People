public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        if (age == 0) {
            return false;
        }
        return true;
    }

    public void happyBirthday() {
        if (age != 0) {
            age++;
        }
    }

    public boolean hasAddress() {
        if (city == null) {
            return false;
        }
        return true;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().surname(surname).age(age).city(city);
    }

    @Override
    public String toString() {
        return "\nИмя: " + name + " Фамилия: " + surname
                + "\nВозраст: " + age + "\nГород: " + city;
    }
}

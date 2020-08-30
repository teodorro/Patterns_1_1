public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;
    private boolean alreadyCreatedOne = false;


    public Person build() throws Exception {
        if (alreadyCreatedOne)
            throw new Exception("Already used once. Create new builder");
        if (name == null || name.isEmpty() || surname == null || surname.isEmpty())
            throw new IllegalStateException("Name/Surname is blank or empty");

        Person person = new Person(name, surname);
        alreadyCreatedOne = true;
        return person;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 150)
            throw new IllegalArgumentException("Impossible age detected");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

}

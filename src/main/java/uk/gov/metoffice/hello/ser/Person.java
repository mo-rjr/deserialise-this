package uk.gov.metoffice.hello.ser;

import java.util.Objects;

/**
 * {A thing} to {do something} for {another thing}
 * -- for example, {this}
 * -- and also {this}
 */
// TODO fill in Javadoc
public class Person {

    private String name;

    private String clearance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClearance() {
        return clearance;
    }

    public void setClearance(String clearance) {
        this.clearance = clearance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(clearance, person.clearance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clearance);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", clearance='" + clearance + '\'' +
                '}';
    }
}

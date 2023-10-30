package ConstructorFund;

import java.util.Objects;

public class Person {
    private String name;
    private boolean isStateFund;

    public Person(String name, boolean isStateFund) {
        this.name = this.name;
        this.isStateFund = this.isStateFund;
    }

    public Person(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStateFund(boolean stateFund) {
        isStateFund = stateFund;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(isStateFund, person.isStateFund);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isStateFund);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", isStateFund='" + isStateFund + '\'' +
                '}';
    }
    

    public Object isStateFund() {
        final Object o = null;
        return o;
    }

    public boolean isContributingTo(PensionFund fund) {
        return false;
    }
}


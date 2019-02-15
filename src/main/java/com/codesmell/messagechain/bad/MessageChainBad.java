package com.codesmell.messagechain.bad;


//https://sourcemaking.com/refactoring/smells/message-chains
public class MessageChainBad {

    public static void main(String[] args) {
        Person employee = buildEmployee();
        System.out.println("The manager is " + employee.getDepartment().getManager().getName());
    }

    private static Person buildEmployee() {
        return new Person("Bob", new Department(new Person("Alice")));
    }
}

class Person {
    private Department department;

    private final String name;

    Department getDepartment() {
        return department;
    }

    Person(String name) {
        this(name, null);
    }

    Person(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    String getName() {
        return name;
    }

}

class Department {
    private final Person manager;

    Department(Person manager) {
        this.manager = manager;
    }

    Person getManager() {
        return manager;
    }

}


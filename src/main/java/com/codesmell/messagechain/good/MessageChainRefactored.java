package com.codesmell.messagechain.good;

//https://refactoring.com/catalog/hideDelegate.html
public class MessageChainRefactored {

    public static void main(String[] args) {
        Person employee = buildEmployee();
        System.out.println("The manager is " + employee.getManagerName());
    }

    private static Person buildEmployee() {
        return new Person("Bob", new Department(new Person("Alice")));
    }

}

class Person {
    private Department department;
    private final String name;

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

    String getManagerName() {
        return department.getManager().getName();
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

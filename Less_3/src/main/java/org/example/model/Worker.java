package org.example.model;

public abstract class Worker {
    public static int count; // счетчик для всех сотрудников
    protected int status; // [0, 1, 2]
    protected String firstName;
    protected String name;
    protected String sureName;
    protected String birthday;
    protected Double salary;

    public Worker(int status) {
        this.status = status;
    }

    public Worker(Integer status, String firstName, String name, String sureName,
                  String birthday, Double salary) {
        this.status = status;
        this.firstName = firstName;
        this.name = name;
        this.sureName = sureName;
        this.birthday = birthday;
        this.salary = salary;
        count ++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

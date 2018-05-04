package com.spf.dto;

/**
 * Created by shipengfei.
 * Date: 18/5/3
 * Time: 上午11:33
 * Motto: Saying and doing are two different things.
 */
public class EmployeeDto {
    private int id;
    private String name;
    private int age;
    private String description;

    public EmployeeDto() {
    }

    public EmployeeDto(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeDto that = (EmployeeDto) o;

        if (id != that.id) return false;
        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return description != null ? description.equals(that.description) : that.description == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                '}';
    }


}

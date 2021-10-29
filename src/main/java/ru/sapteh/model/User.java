package ru.sapteh.model;

import java.util.Objects;

public class User {
    private int id;
    private String mark;
    private String body_type;
    private String gasoline;

    public User() {

    }

    public User(int id, String mark, String body_type, String gasoline) {
        this.id = id;
        this.mark = mark;
        this.body_type = body_type;
        this.gasoline = gasoline;
    }

    public User(String mark, String body_type,String gasoline) {
        this(0, mark, body_type,gasoline);
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getBody_type() {
        return body_type;
    }

    public String getGasoline() {
        return gasoline;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setBody_type(String body_type) {
        this.body_type = body_type;
    }

    public void setGasoline(String gasoline) {
        this.gasoline = gasoline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(mark, user.mark) && Objects.equals(body_type, user.body_type) && Objects.equals(gasoline, user.gasoline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, body_type, gasoline);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", body_type='" + body_type + '\'' +
                ", gasoline='" + gasoline + '\'' +
                '}';
    }
}
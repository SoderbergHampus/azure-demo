package org.example.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hello")
public class Hello {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hello_id")
    private int id;

    @Column(name = "hello_msg")
    private String msg;

    public Hello() {}

    public Hello(String msg) {
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

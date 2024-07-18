package com.codegym.customermanagementhibernate.model;

import javax.persistence.*;

//  Đánh dấu class Customer là một entity bằng annotation @Entity.
@Entity

//: chỉ định table tương ứng với entity trong database, đồng thời hỗ trợ đổi tên bảng khi tạo bảng.
@Table(name = "customer")
public class Customer {
//    sử dụng annotation @Id để đánh dấu cho properties tương ứng là khóa chính cho table được tạo bởi entity.
    @Id

//    @GenerateValue: quy định giá trị của khóa chính sẽ tự tăng trong database (auto_increment).
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

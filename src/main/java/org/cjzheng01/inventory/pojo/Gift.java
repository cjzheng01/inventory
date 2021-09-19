package org.cjzheng01.inventory.pojo;

import java.io.Serializable;

public class Gift implements Serializable {

    private static final long serialVersionUID = 333687596433686539L;

    private int id;
    private String code;
    private String name;
    private int num;

    public int getId() {
        return id;
    }

    public Gift setId(int id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Gift setCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public Gift setName(String name) {
        this.name = name;
        return this;
    }

    public int getNum() {
        return num;
    }

    public Gift setNum(int num) {
        this.num = num;
        return this;
    }

    public Gift() {
        super();
    }
}

package br.ufrpe.questao01;

public class Product {
    private String code;
    private String name;

    public Product() {
        this.code = "";
        this.name = "";
    };

    public Product(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String toString() {
        String output = String.format("Product:\nCode: %s\nName:%s", code, name);
        return output;
    }
}

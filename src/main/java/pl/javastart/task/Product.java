package pl.javastart.task;

class Product {
    String name;
    String description;
    double price;
    Category category;

    public Product(String name, String description, double price, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    String getProductDescription() {
        return name + " " + description;
    }
}

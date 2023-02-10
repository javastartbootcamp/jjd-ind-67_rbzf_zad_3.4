package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Category category1 = new Category("slodycze", "cos slodkiego dla kazdego");
        Category category2 = new Category("warzywa", "porcja witamin");

        Product product1 = new Product("Grzesiek", "wafelek", 1.7, category1);
        Product product2 = new Product("Chupa chups", "lizak", 2.89, category1);
        Product product3 = new Product("Brokul", "mrozonka 450 gr", 9.0, category2);
        Product product4 = new Product("Olej rzepakowy", "butelka 1l", 9.95);

        SpecialOffer specialOffer = new SpecialOffer(product4, "produkt dnia", "8:00", "9:00", 0.2);
        System.out.println(specialOffer.getSpecialOfferDescription());
    }
}
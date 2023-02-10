package pl.javastart.task;

class SpecialOffer {
    Product product;
    String description;
    String startTime;
    String endTime;
    double discount;

    public SpecialOffer(Product product, String description, String startTime, String endTime, double discount) {
        this.product = product;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.discount = discount;
    }

    String getSpecialOfferDescription() {
        String format = "Oferta specjalna: \"%s\" obowiazuje dzis od %s do %s%nOfercie podlega: %s%ncena regularna: %.2f PLN, cena specjana: %.2f PLN";
        return format.formatted(description, startTime, endTime, product.getProductDescription(), product.price, getDiscountPrice());
    }

    double getDiscountPrice() {
        return product.price * (1 - discount);
    }
}

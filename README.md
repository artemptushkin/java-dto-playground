### Demo playground for Java DTO best practices

#### How to properly annotate Java classes with Jackson and Lombok annotations?

1. [Compose fields example](src/main/java/io/github/artemptushkin/example/compositefield) and [demo tests](src/test/java/io/github/artemptushkin/example/compositefield)
2. [Inheritance example](src/main/java/io/github/artemptushkin/example/inheritance) and [demo tests](src/test/java/io/github/artemptushkin/example/inheritance)
   ```java
    @Value
    @SuperBuilder
    @EqualsAndHashCode(callSuper = true)
    public class CreditCard extends Card {
    BigDecimal rate;
    
        @ConstructorProperties({"name", "status", "balance", "rate"})
        public CreditCard(String name, Status status, Balance balance, BigDecimal rate) {
            super(name, status, balance);
            this.rate = rate;
        }
    }
   ```
3. [Mutable objects example](src/main/java/io/github/artemptushkin/example/mutable) and [demo tests](src/test/java/io/github/artemptushkin/example/mutable)

No need Jackson annotations when it's possible!

Find more on [the dev.to](https://dev.to/art_ptushkin/best-practices-on-using-jackson-and-lombok-2lpm)
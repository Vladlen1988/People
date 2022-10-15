public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .name("Анна")
                .surname("Вольф")
                .age(31)
                .city("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .name("Антошка")
                .build();
        System.out.println("У " + mom + "\nесть сын, " + son);

        try {
            // Не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().name("Василий").age(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}


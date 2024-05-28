package L4_s1;

public class Main {

    public static enum Holiday {
        MH("23 Февраля - День защитника Отечества"),
        FH("8 Марта - Мееждународный женский день"),
        AH("9 Мая - День Победы");

        private String value;

        Holiday(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }

    // Массив Покупатели
    private final static Customer[] peaple = {
            new Customer("Ivan", Customer.Gender.MALE,20, "+7 999 123-45-67"),
            new Customer("Masha",Customer.Gender.FEMALE, 30, "+7 988 890-12-34")
    };

    // Массив Товары
    private static final Item[] items = {
            new Item("Ball", 100),
            new Item("Sandwich", 1000),
            new Item("Table", 10000),
            new Item("Car", 100000),
            new Item("Rocket", 1000000)
    };
    // Массив покупок
    private static final Order[] orders = new Order[5];

    // Проверка на принадлежность объекта массиву (Товар или Покупатель)
    private static boolean isInArray(Object[] arr, Object o) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(o)) return true;
        return false;
    }

    //
    public static Order buy(Customer who, Item what, int howMuch) {
        if (!isInArray(peaple, who))
            throw new CustomerException("Unknow customer: " + who);
        if (!isInArray(items, what))
            throw new ProductException("Unknow item: " + what);
        if (howMuch < 0 || howMuch > 100)
            throw new AmountException("Incorrect amount: " + howMuch);
        return new Order(who, what, howMuch);
    };

    public static void happyHolidays(Holiday h) {
        if (h == Holiday.MH) {
            // Поздравление Мужчин с праздником
            for (int i = 0; i < peaple.length; i++) {
                if (peaple[i].gender == Customer.Gender.MALE) {
                    System.out.println(peaple[i].name + " С Праздником! " +
                            h.toString());
                }
            }
        } else if (h == Holiday.FH) {
            // Поздрвление женщин с праздником
            for (int i = 0; i < peaple.length; i++) {
                if (peaple[i].gender == Customer.Gender.FEMALE) {
                    System.out.println(peaple[i].name + " С Праздником! " +
                            h.toString());
                }
            }
        } else {
            // Поздравление всех с праздником
            for (int i = 0; i < peaple.length; i++) {
                System.out.println(peaple[i].name + " С Праздником! " +
                            h.toString());
            }
        }

    }


    public static void main(String[] args) {

        // Поздравление с Праздником
        happyHolidays(Holiday.MH);
        happyHolidays(Holiday.FH);

        happyHolidays(Holiday.AH);

        Object[][] info = {
                {peaple[0], items[0], 1}, //
                {peaple[1], items[1], -1}, //
                {peaple[0], items[2], 150}, //
                {peaple[1], new Item("Flower", 10), 1}, //
                {new Customer("Fedor", Customer.Gender.MALE, 40, "+7 977 567-89-01"), items[3], 1}, //
        };

        int capacity = 0;
        int i = 0;

        while (capacity != orders.length - 1 || i != info.length) {
            try {
                orders[capacity] = buy((Customer) info[i][0], (Item) info[i][1], (int) info[i][2]);
                capacity++;
            } catch (ProductException e) {
                e.printStackTrace();
            } catch (AmountException e) {
                orders[capacity++] = buy((Customer) info[i][0], (Item) info[i][1], 1);
            } catch (CustomerException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Orders made: " + capacity);
            }
            ++i;
        }

        //
        // happyHolidays(Holiday.MH);
    }

}




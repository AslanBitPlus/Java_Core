package L4_s1;

/**
 Класс Покупатель
 **/
public class Customer {
    public Customer(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static enum Gender {
        MALE("MALE"),
        FEMALE("FEMALE");

        private String value;

        Gender(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    String name;
    Gender gender;
    int age;
    String phone;

    public Customer(String name, Gender gender, int age, String phone) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        example();
        tasks();
    }
    public static void example(){
        String phone = "+799-6725 6209";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() < 11) {
            phone = "7" + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("телефон слишком  длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("введите первую 7");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79967256209";
        if (phone.equals(expectedPhone)) {
            System.out.println("успех");
        } else {
            System.out.println("Неудача");
        }
    }
    public static void tasks(){
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        middleName = "Семён ";
        lastName = "Семёнович";
        String expectedFirstName = "Ivanov";
        String expectedMiddleName = "Семен ";
        String expectedLastName = "Семенович ";
        if (firstName.equals(expectedFirstName) != true) {
            firstName = firstName.replace("ё", "е");
        }
        if (middleName.equals(expectedMiddleName) != true) {
            middleName = middleName.replace("ё", "е");
        }
        if (lastName.equals(expectedLastName) != true) {
            lastName = lastName.replace("ё", "е");
        }

        System.out.println(firstName + middleName + lastName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + firstName.toUpperCase() + middleName.toUpperCase() + lastName.toUpperCase());
    }
}
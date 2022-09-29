public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());//Задание2

        System.out.println(fullName.replace('ё', 'е')); // Задание 3
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Homework_6.1!");
        //Task 1.
        System.out.println();
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        //Task 2.
        System.out.println();
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperCaseFullName);
        //Task 3.
        System.out.println();
        firstName = firstName.replace ("Ivan", "Сёмен");
        middleName = middleName.replace ("Ivanovich", "Сёменович");
        lastName = lastName.replace ("Ivanov", "Иванов");
        String fullNameNew = lastName + " " + firstName + " " + middleName;
        String modifiedFullName = fullNameNew.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + modifiedFullName);
    }
}
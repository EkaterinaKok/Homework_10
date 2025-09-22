public class Main {
    public static void main(String[] args) {
//        Task 1
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);
        System.out.println();

//        Task 2
        System.out.println("Задача 2");
        String toApperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + toApperCaseFullName);
        System.out.println();

//        Task 3
        System.out.println("Задача 3");
        String fullNameCreat = "Иванов Семён Семёнович";
        fullNameCreat = fullNameCreat.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника — " + fullNameCreat);
    }
}
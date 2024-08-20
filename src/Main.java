//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



        //Task 1
        System.out.println("Task 1");

        String firstName = "ivan";
        String middleName = "Ivanovich";
        String lastName = "ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //Task 2
        System.out.println("Task 2");

        String fullNameInUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameInUpperCase);

        //Task 3
        System.out.println("Task 3");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);

    }
}
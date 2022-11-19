public class Main {
    public static void main(String[] args) {
        //task3
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        String ee = fullName.replace('ё','е');
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + ee);
    }
}
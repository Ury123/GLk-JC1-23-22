package by.itAcademy.homeworks.loops;

/**Вычислить произведение чисел от 1 до 25 с помощью цикла do while.*/

public class Task13 {
    public static void main (String[] args) {
        int i=1; int result=1;
        do{
            result *=i;
            i++;
        } while (i<26);
        System.out.println("Произведение равно: "+result);
    }
}

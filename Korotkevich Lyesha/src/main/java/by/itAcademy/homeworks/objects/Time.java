package by.itAcademy.homeworks.objects;


/**Создать класс, описывающий промежуток времени.
 *  Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 *  Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов (метод должен работать аналогично compareTo в строках).
 *  Создать два конструктора:
        получающий общее количество секунд
        получающий часы, минуты и секунды по отдельности.
 Сделать метод для вывода данных. Прочее на ваше усмотрение.
 */

public class Time {
    private int seconds;
    private int minutes;
    private int hours;
    public int getSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }
    public Time(int s){
        seconds = s;
    }
    public Time(int h, int m, int s){
        hours=h;
        minutes=m;
        seconds=s;
    }
    public void printTime(){
        System.out.printf("%s hours %s minutes %s seconds\n", hours,minutes, seconds);
    }
    public void compareTime(int time1, int time2){
        if (time1 > time2) System.out.println("time1 > time2");
        else if (time1 < time2) System.out.println("time1 < time2");
        else System.out.println("time1 = time2");
    }

}

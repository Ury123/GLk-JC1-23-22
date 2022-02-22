package by.itAcademy.sample;

/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает.
3. Челенж. Переделываем, так что количество вычислений остатка от деления было как можно меньше. Посмотрим у кого что получится.
* */
public class Sample6 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample6
    private static int count=0;
    private static int nums=0;
    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        for (int i=1;i<=1000;i++){//для целочисленного i установить значение 0;выполнять блок пока i меньше 100; после каждого исполнения увеличить i на 1
            if (isPrime(i)){// Вызываем функцию которая проверит является ли число простым если да - выводим его
                nums++;
                System.out.println(i);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
            }//блока иначе нет. эта ситуация будет проигнорирована. никаких действий не выполнится.
        }
        System.out.println("Произвели сравнений остатка от деления:"+count);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
        System.out.println("Чисел:"+nums);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }

    private static boolean isPrime(int number){
        if (number==0 || number==1 || number==2){ //Если число которое нам передали одно из 0 1 2
            return true;//возвращаем да
        }else{//иначе
            for(int i=2;i<number;i++){//для целочисленного i установить значение 2;выполнять блок пока i меньше number; после каждого исполнения увеличить i на 1
                count++;
                if (number%i==0){//проверяем делится ли number на i. если делится нацело
                    return false;//возвращаем нет.
                }
            }
        }
        return true;//Если мы попали сюда - число точно простое.
    }


}

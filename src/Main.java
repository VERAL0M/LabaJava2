import java.util.Locale;
import java.util.Scanner;


public class Main {

    private Scanner scanner = new Scanner(System.in);

    private int readInt(String promt){
        System.out.print(promt);
        while(!scanner.hasNextInt()){
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.run();

    }

    public void run(){

        int n = 10;
        while (n!=0){
            n  = readInt("Введите номер задачи (1-5), 0-выход:  ");
            switch (n){
                case 1:
                    System.out.println("=== Проверка класса Point ===");
                    int x1 = readInt("Введите X: ");
                    int y1 = readInt("Введите Y: ");
                    Point p1 = new Point(x1, y1);
                    System.out.println("Точка №1: " + p1);

                    int x2 = readInt("Введите X: ");
                    int y2 = readInt("Введите Y: ");
                    Point p2 = new Point(x2, y2);
                    System.out.println("Точка №2: " + p2);

                    int x3 = readInt("Введите X: ");
                    int y3 = readInt("Введите Y: ");
                    Point p3 = new Point(x3, y3);
                    System.out.println("Точка №3: " + p3);
                    break;

                case 2:
                    System.out.println("=== Задание 2.1: Прямая ===\n");


                    Point p1_start = new Point(1, 3);
                    Point p1_end = new Point(23, 8);


                    Point p2_start = new Point(5, 10);
                    Point p2_end = new Point(25, 10);


                    Line line1 = new Line(p1_start, p1_end);
                    Line line2 = new Line(p2_start, p2_end);


                    Line line3 = new Line(p1_start, p2_end);


                    System.out.println("Линия 1: " + line1);
                    System.out.println("Линия 2: " + line2);
                    System.out.println("Линия 3: " + line3);
                    System.out.println();

                    System.out.println("Именения первой линии и второй линии так, чтобы соответствовало 3 пункту 3 линия");
                    Point pN1_start = new Point(100, 30);
                    Point pN2_start = new Point(19, 43);
                    Point pN2_end = new Point(19, 43);
                    line1.setStart(pN1_start);
                    line2.setStart(pN2_start);
                    line2.setEnd(pN2_end);


                    System.out.println("Линия 1: " + line1);
                    System.out.println("Линия 2: " + line2);
                    System.out.println("Линия 3: " + line3);
                    System.out.println();

                    System.out.println("Именения первой линии так, чтобы не менялась третья линия");
                    Point pN_start = new Point(10, 3);
                    line1.setStart(pN_start);
                    System.out.println("Линия 1: " + line1);
                    System.out.println("Линия 3: " + line3);
                    break;

                case 3:
                    System.out.println("=== Задание 3.1: Студент ===\n");


                    System.out.println("Пункт 1: Создаём Васю");
                    int[] vasyaMarks = {3, 4, 5};
                    Student vasya = new Student("Вася", vasyaMarks);
                    System.out.println(vasya);
                    System.out.println();


                    System.out.println("Пункт 2: Создаём Петю с копиями оценок Васи");
                    Student petya = new Student("Петя", vasya.getMarks());
                    System.out.println("Вася: " + vasya);
                    System.out.println("Петя: " + petya);
                    System.out.println();


                    System.out.println("Пункт 3: Меняем первую оценку Пети на 5");
                    petya.setMark(0, 5);
                    System.out.println("Вася: " + vasya);
                    System.out.println("Петя: " + petya);
                    System.out.println();


                    System.out.println("Пункт 4: Создаём Андрея (копироване через создание нового массива");
                    int[] andreyMarks = new int[vasya.getMarks().length];
                    for (int i = 0; i < vasya.getMarks().length; i++) {
                        andreyMarks[i] = vasya.getMarks()[i];
                    }
                    Student andrey = new Student("Андрей", andreyMarks);
                    System.out.println("Вася: " + vasya);
                    System.out.println("Андрей: " + andrey);


                    System.out.println("\nМеняем оценку Андрея на 2:");
                    andrey.setMark(0, 2);
                    System.out.println("Вася: " + vasya);   // НЕ изменился!
                    System.out.println("Андрей: " + andrey);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("=== Задание 4.1: Модификация Point ===\n");


                    Point p4 = new Point(3, 5);
                    Point p5 = new Point(25, 6);
                    Point p6 = new Point(7, 8);


                    System.out.println("Точка 1: " + p4);
                    System.out.println("Точка 2: " + p5);
                    System.out.println("Точка 3: " + p6);



                    System.out.println("\n=== Задание 4.7: Модификация Student ===\n");


                    Student vasya2 = new Student("Вася", 3, 4, 5);
                    System.out.println(vasya2);


                    Student maxim = new Student("Максим");
                    System.out.println(maxim);


                    System.out.println("Длина массива оценок Максима: " + maxim.getMarks().length);
                    break;

                case 5:
                    System.out.println("=== Задание 5.6: Студент-отличник ===\n");


                    Student vasya3 = new Student("Вася", 3, 4, 5, 4);
                    System.out.println(vasya3);
                    System.out.println("Средний балл: " + vasya3.getAverageMark());
                    System.out.println("Он отличник? " + vasya3.isExcellent());
                    System.out.println();


                    Student petya2 = new Student("Петя", 5, 5, 5, 5);
                    System.out.println(petya2);
                    System.out.println("Средний балл: " + petya2.getAverageMark());
                    System.out.println("Он отличник? " + petya2.isExcellent());
                    System.out.println();
                    break;



            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();



    }

    public static void task1 () {
        System.out.println("Задача 1");
         // Пишем код для задачи 1

        var dog = 8.0;
        System.out.println (dog);

        var cat = 3.6;
        System.out.println (cat);

        var paper = 763789;
        System.out.println (paper);

    }

    public static void task2 () {
        System.out.println("Задача 2");
         // Пишем код для задачи 2

        var dog = 8.0;
        dog = dog + 4;
        System.out.println (dog);

        var cat = 3.6;
        cat = cat + 4;
        System.out.println (cat);

        var paper = 763789;
        paper = paper + 4;
        System.out.println (paper);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3

        var dog = 12.0;
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 7.6;
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763793;
        paper = paper - 7639;
        System.out.println(paper);

    }

    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


    }
    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6

        var boxer1 = 78.2;
        var boxer2 = 82.7;

        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес спортсменов " + totalWeight);

        var weightDifference = boxer1 - boxer2;
        System.out.println("Разница в весе " + weightDifference);

    }

    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7

        var boxer1 = 78.2;
        var boxer2 = 82.7;

        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница в весе " + weightDifference);

        var interest  = boxer2 % boxer1;
        System.out.println("Проценты " + interest);
    }

    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8

        var openingHours = 640;
        var workingHours = 8;
        var employeesInTheCompany = openingHours / workingHours;
        System.out.println("Всего работников в компании — " +employeesInTheCompany+ " человек");

        var newEmployees = 94;
        var addEmployees = openingHours + newEmployees;
        var addEmployeesInTheCompany = addEmployees / workingHours;
        System.out.println("Если в компании работает " +addEmployees+ " человек, то всего " +addEmployeesInTheCompany+ " часов работы может быть поделено между сотрудниками");
    }
}

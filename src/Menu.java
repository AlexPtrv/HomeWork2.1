import java.util.Scanner;

class Menu {
    private ArrayHolder arrayHolder = new ArrayHolder();
    private static Scanner scn = new Scanner(System.in);
    private static int selection;

    void Start() {
        System.out.println("Запуск...");
        System.out.println("Сколько хотите ввести цыфр?");
        arrayHolder.enterNum();
        System.out.println("Меню:");
        menu();
        choiceInmenu();

    }

    private void menu() {
        System.out.println("1.Добавить елемент.\n" + "2.Удалить елемент.\n" + "3.Поиск элемента по значению.\n" +
                "4.Поиск элемента по индексу.\n" + "5.Поиск максимального элемента.\n" + "6.Поиск минимального элемента\n" +
                "7.Поиск среднего арифметического всех элементов\n" + "8.Вывести сколько индексов.\n" +
                "9.Вывести все елементы.\n" + "10.Выйти.");
    }

    private void choiceInmenu() {

        selection = scn.nextInt();
        do {
            switch (selection) {
                case 1:
                    arrayHolder.addNum();
                    menuOrExit();
                    break;
                case 2:
                    arrayHolder.removeNum();
                    menuOrExit();
                    break;
                case 3:
                    arrayHolder.findByNumb();
                    menuOrExit();
                    break;
                case 4:
                    arrayHolder.findByIndex();
                    menuOrExit();
                    break;
                case 5:
                   arrayHolder.maxNumber();
                    menuOrExit();
                    break;
                case 6:
                    arrayHolder.minNumber();
                    menuOrExit();
                    break;
                case 7:
                    arrayHolder.average();
                    menuOrExit();
                    break;
                case 8:
                    System.out.println(arrayHolder.getGetNum().size());
                    menuOrExit();
                    break;
                case 9:
                    System.out.println(arrayHolder.getGetNum());
                    menuOrExit();
                    break;
                case 10:
                    exit();
                    break;
                default:
                    System.out.println("Такого варианта нету!\n" + "Выберете другой вариант.");
                    choiceInmenu();
                    break;

            }
        } while (selection != 10);
    }

    private void menuOrExit() {
        System.out.println("Елси хотите вернутся в меню нажмите 1.\n" + "Если выйти нажмите 2.");

        Scanner selection2=new Scanner(System.in);
        int select = selection2.nextInt();

        do {
            switch (select) {
                case 1:
                    menu();
                    choiceInmenu();
                    break;
                case 2:
                    exit();


                    break;


                default:
                    menuOrExit();
                    break;
            }
        } while (select != 2);
    }

    private void exit() {

        System.out.println("Выход...");
System.exit(0);

    }

}

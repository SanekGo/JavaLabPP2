package com.company;

import java.util.Scanner;

public class Main {
    private Abiturient[] list;
    private Scanner scan;

    public Main() {
        scan = new Scanner(System.in);

        Abiturient a = new Abiturient(001, "Пархомчук Ярослав Ігорович", "Славута", "0666653348", 60.9f);
        Abiturient b = new Abiturient(002, "Утєшев Матвій СергійовичУтєшевМат", "Рівне", "0975209264", 65.1f);
        Abiturient c = new Abiturient(003, "Вихованюк Віталій Ігорович ", "Самбір", "0970047268", 88.7f);
        Abiturient d = new Abiturient(004, "Саган Богдан Андрійович", "Луцьк", "06387202884", 51.7f);
        Abiturient e = new Abiturient(005, "Глущенко Владислав Ігорович", "Миколаїв", "06693745201", 61.7f);
        Abiturient f = new Abiturient(006, "Станасюк Олег Віталійович", "Львів", "0975302834", 77.7f);
        Abiturient g = new Abiturient(007, "Петров Сергій Павлович", "Львів", "0639201306", 72.7f);

        list = new Abiturient[7];

        list[0] = a;
        list[1] = b;
        list[2] = c;
        list[3] = d;
        list[4] = e;
        list[5] = f;
        list[6] = g;

    }

    public static void main(String[] args) {
        Main m = new Main();

        try {
            m.run();
        }catch (Exception e){
            System.out.println("Завершення програми");
        }
    }

    public void run() throws Exception {
        String in;
        float in_2;
        int in_3;

        System.out.println("Введіть ім'я:");
        in = scan.nextLine();

        for (Abiturient a : list) {
            if (a.getName().equals(in))
                System.out.println(a.toString());

        }

        System.out.println("Середній бал: ");
        in_2 = scan.nextFloat();

        for (Abiturient a : list) {
            if (a.getMiddleMark() > in_2)
                System.out.println(a.toString());
        }

        System.out.println("Введіть число: ");
        in_3 = scan.nextInt();

        for (int i = 0; i < list.length; i++) {
            Abiturient max = list[i];
            int min_i = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j].getMiddleMark() > max.getMiddleMark()) {
                    max = list[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                Abiturient tmp = list[i];
                list[i] = list[min_i];
                list[min_i] = tmp;
            }
        }
        System.out.println("Список студентів:");
        for (int i = 0; i < in_3; i++) {
            System.out.println(list[i].toString());
        }

    }
}

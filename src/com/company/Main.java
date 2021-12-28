package com.company;

public class Main {
    public static void main(String[] args) {
        //Задание 1 && 2
        byte clientOS = 1;
        int clientDeviceYear = 2020;
        int yearOfSmartphonesImprovement = 2015;

        if (clientOS == 0) {
            if (clientDeviceYear < yearOfSmartphonesImprovement) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1 && clientDeviceYear < yearOfSmartphonesImprovement) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 3
        int year = 2021;
        boolean leapYear = year % 4 == 0 && year % 100 != 0;
        if (leapYear) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосным!");
        }

        //Задание 4
        byte deliveryDistance = 95;
        int estimatedDeliveryTime = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + estimatedDeliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (estimatedDeliveryTime + 1));
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (estimatedDeliveryTime + 2));
        }

        //Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сейчас Зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас Весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас Лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас Осень!");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }
}

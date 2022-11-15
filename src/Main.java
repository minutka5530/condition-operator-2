public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int currentYear = 2023;
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0){
            System.out.println("Год высокосный");
        } else {
            System.out.println("Не высокосный");
        }



        int deliveryDistance = 100;
        int day = 0;

        if ( deliveryDistance <= 20) {
            System.out.println("Потребуеться сутки " );

        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется до " + (day + 2) + " суток");

        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется до " + (day + 3) + " cуток ");
        }
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("январь" );
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сеньтябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
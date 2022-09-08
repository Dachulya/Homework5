public class Main {
    public static void main(String[] args) {
        //Задание 1//Задание 2
        int clientOS=1;
        int oldAndNew=2016;
        switch (clientOS){
            case 0:
                System.out.println("Устаовите версию приложения для IOS поссылке");
                if (oldAndNew<2015) {
                    System.out.println("Установите упрощённую версию для IOS");
                    break;
            }
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                if (oldAndNew<2015) {
                    System.out.println("Установите упрощённую версию для Android");
                }
                break;
        }
        //Задание 3
        int year=2021;
        if ((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println(year+"Высокосный год");
        }else {System.out.println(year+"не высокостный год");}
        //Задание 4
        int deliveryDistance = 95;
        int timeDelivery=1;
        if (deliveryDistance<20){

            System.out.println("Потребуется дней: "+timeDelivery);
        } else if (deliveryDistance>20 && deliveryDistance<60) {
            System.out.println("Потребуется дней: "+(timeDelivery+1));
        }else {
            System.out.println("Потребуется дней: "+(timeDelivery+2));
        }
        //задание 5
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Январь");
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
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 13:
                System.out.println("нет такого месяца");
                break;
            case 12:
                System.out.println("декабрь");
                break;

        }


    }
}
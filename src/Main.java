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
            }
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                if (oldAndNew<2015) {
                    System.out.println("Установите упрощённую версию для Android");
                }
        }



    }
}
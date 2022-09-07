public class Main {
    public static void main(String[] args) {

//Задание №9 Объекты и классы
        Author ivanEfremov = new Author("Иван", "Ефремов");
        Author denBraun = new Author("Дэн", "Браун");

        Book nebulaEfremov = new Book("Туманность андромеды", ivanEfremov,1956);
        Book originBraun = new Book("Происхождение",denBraun,2017);

        nebulaEfremov.setPublishYear(1957);

        System.out.println(nebulaEfremov);
        System.out.println(originBraun);
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
// Задание №10 Методы объектов

        Author ivanEfremov2 = new Author("Иван", "Ефремов");
        Book originBraun2 = new Book("Происхождение",denBraun,2017);

        System.out.println(ivanEfremov.equals(ivanEfremov2));
        System.out.println(originBraun.equals(originBraun2));
        System.out.println(originBraun.hashCode() == originBraun2.hashCode());
    }
}
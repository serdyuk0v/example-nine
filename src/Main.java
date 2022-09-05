public class Main {
    public static void main(String[] args) {

        Author ivanEfremov = new Author("Иван", "Ефремов");
        Author denBraun = new Author("Дэн", "Браун");

        Book nebulaEfremov = new Book("Туманность андромеды", ivanEfremov,1956);
        Book originBraun = new Book("Происхождение",denBraun,2017);

        nebulaEfremov.setPublishYear(1957);

        System.out.println(nebulaEfremov);
        System.out.println(originBraun);
    }
}
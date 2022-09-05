public class Main {
    public static void main(String[] args) {

        Author efremov = new Author("Иван", "Ефремов");
        Author braun = new Author("Дэн", "Браун");

        Book nebulaBraun = new Book("Туманность андромеды", efremov,1956);
        Book originBraun = new Book("Происхождение",braun,2017);
        nebulaBraun.setPublishYear(1957);
        System.out.println(nebulaBraun);
        System.out.println(originBraun);
    }
}
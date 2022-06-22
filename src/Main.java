public class Main {
    public static void main(String[] args){
        Author author1 = new Author("Эрнст", "Юнгер");
        Book book1 = new Book("В стальных грозах", author1,1920);
        Author author2 = new Author("Майкл", "Льюис");
        Book book2 = new Book("Flash Boys", author2,2014);
        book1.setYearPublication(3014);
        System.out.println(book1 + ", " + author1);









    }
}
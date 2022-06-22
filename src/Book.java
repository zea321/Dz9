public class Book {
    private String name;
    private Author author;
    private int yearPublications;

    public Book(String name, Author author, int yearPublications) {
        System.out.println(name);
        System.out.println(yearPublications);
        System.out.println();
        this.name = name;
        this.author = author;
        this.yearPublications = yearPublications;
    }

    public Book(String name) {
        this.name = name;
    }

    public String getNameBook() {
        return this.name;
    }
    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.yearPublications;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublications = yearPublication;
    }

}


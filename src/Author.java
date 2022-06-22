public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println(name + " " + surname);
    }

    public Author(String name) {
        this.name = name;
    }

    public String getNameAuthor() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }



}

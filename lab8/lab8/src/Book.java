public class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return this.title.equals(book.title) && this.author.equals(book.author);
    }
    public String toString(){
        return this.title + " " + this.author;
    }
    public static void main(String[] args) {
        Book b1 = new Book("Madonna", "Ömer Seyfettin");
        Book b2 = new Book("Madonna", "Ömer Seyfettin");
        Book b3 = new Book("Aya Yolculuk", "Jules Verne ");
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));

    }
}

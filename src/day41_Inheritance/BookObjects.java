package day41_Inheritance;

public class BookObjects {

    public static void main(String[] args) {

        EBook book1 = new EBook();
        book1.title = "Hamlet";
        book1.author = "Shakespeare";
        book1.price = 20;
        book1.size = "1.5MB";
        book1.pages = 432;
        System.out.println(book1);
        System.out.println("Size: " + book1.size);
        System.out.println("Pages: " + book1.pages);
        book1.readbook();


        AudioBook book2 = new AudioBook();
        book2.title = "YoYo";
        book2.author = "Me";
        book2.price = 30;
        book2.length = 40;


    }
}

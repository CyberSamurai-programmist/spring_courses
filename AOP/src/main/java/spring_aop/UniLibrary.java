package spring_aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

//    @Override
//    public void getBook(){
//        System.out.println("Мы берём книгу из UniLibrary");
//    }

//    public void getBook(String bookName) {
//        System.out.println("Мы берём книгу из UniLibrary - \"" + bookName + "\"");
//    }

//    public void getBook(Book book) {
//        System.out.println("Мы берём книгу из UniLibrary - \"" + book.getName() + "\"");
//    }

    public void getBook() {
        System.out.println("Мы берём книгу из UniLibrary");
        System.out.println("--------------------------------------------");
    }

//    public void returnBook() {
//        System.out.println("Мы возвращаем книгу в UniLibrary");
//        System.out.println("--------------------------------------------");
//    }

    public String returnBook(){
        int a = 10/0;
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "Война и мир";
    }

    public void getMagazine(){
        System.out.println("Мы берём журнал из UniLibrary");
        System.out.println("--------------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Мы возвращаем журнал в UniLibrary");
        System.out.println("--------------------------------------------");
    }

//    public void getMagazine(int a){
//        System.out.println("Мы берём журнал из UniLibrary");
//    }

    public void addBook(String person_name,Book book){
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("--------------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("--------------------------------------------");
    }
}

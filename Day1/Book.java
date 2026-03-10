import java.util.Scanner;
class Book{
    
        
    String title;
    String author;
    Book(String title, String author)
    {
        this.title=title;
        this.author=author;
    }
    Book(String title)
    {
        this.title=title;
        this.author="Unknown";
    }
    void display(){
        System.out.println("tile :" + title +" author: "+ author);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Book obj1=new Book("the Hobbit","Tolkin");
        obj1.display();
        Book obj2=new Book("A Book");
        obj2.display();
}
}

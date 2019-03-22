
import java.util.ArrayList;
import java.util.Iterator;


public class Library {
    private ArrayList <Book> book;
    public Library(){
        this.book = new ArrayList<Book>();
        
    }
    public void addBook(Book newBook){
        this.book.add(newBook);
    }
    public void printBooks(){
        for(Book book:book){
            System.out.println(book.toString());
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList <Book> found = new ArrayList<Book>();
        
        for(Book copy :this.book){
            
            if(StringUtils.included(copy.title(),title)){
                 found.add(copy);
            }
          
        }   
       return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList <Book> found = new ArrayList<Book>();
        
        for(Book copy :this.book){
            
            if(StringUtils.included(copy.publisher(),publisher))
                found.add(copy);
            
        }   
       return found;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList <Book> found = new ArrayList<Book>();
//        String
        for(Book copy :this.book){
            if(copy.year()==year){
                found.add(copy);
            }
        }   
       return found;
    }
    
}

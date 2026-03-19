import java.util.List;

public class Driver {

    public static void main(String[] args) {

        DatasetReader datasetReader = new DatasetReader();
        List<Book> books = datasetReader.readDataset("Driver/dataset/data.csv");

        Book bookInstance = new Book(null, null, null, null, null, null, null);
        
        //Tarefa I
        int countB = bookInstance.numberOfBookByAuthor(books, "J.K. Rowling");
        String msg = "Número total de livros de J.K. Rowling: " + countB;
        System.out.println(msg);
        

        //Tarefa II
        List<String> authors = bookInstance.nameOfAuthor(books);
        for(String autor : authors){
            System.out.println(autor);  
        } 

        //Tarefa III
        List <String> ListBookAuthor = bookInstance.getAuthorTitle(books, "J.K. Rowling");
        for(String title : ListBookAuthor){
              System.out.println(title);  
        }

        //Tarefa IV
        List <String> getBooksByReview = bookInstance.getBooksByReview(books, "4.6");
        for(String title : getBooksByReview){
              System.out.println(title);  
        }

        //Tarefa V
        List <String> getTitlebyPrice = bookInstance.getTitlebyPrice(books, "J.K. Rowling");
        for(String title : getTitlebyPrice){
              System.out.println(title);  
        }
    }
}

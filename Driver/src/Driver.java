import java.util.List;

public class Driver {

    public static void main(String[] args) {

        DatasetReader datasetReader = new DatasetReader();

        List<Book> books = datasetReader.readDataset("dataset/data.csv");

        Book bookInstance = new Book(null, null, null, null, null, null, null);

        int countB = bookInstance.numberOfBookByAuthor(books, "J.K. Rowling");

        System.out.println(countB);
    }
}
import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Books> catalogue;

    public Library(){
        this.catalogue = new ArrayList<Books>();
        this.capacity = 10;
    }

    public void addBook(Books books) {
        if(this.catalogue.size() < this.capacity){
                this.catalogue.add(books);
    } }

    public int countCatalogue(){
        return this.catalogue.size();
    }
}

import java.lang.Comparable;

abstract class Book implements Comparable<Book>{
    int numberOfPages;
    String author;
    String title;
    int yearPublished;
    Float price;
    int rating;

    Book( String title,int year ){
        this.title  = title;
        this.yearPublished = year;
    }
    @Override
    public int compareTo(Book book) {
        // compare book with this book title and then year Published.
        int compareResult = this.title.compareTo(title);
        if (compareResult == 0){
            System.out.println("Exact Title Match!");
        }
        else if (compareResult == -1){
            System.out.println("Match Not Found!");

        }
        else{
            System.out.println("Your Book comes first!");

        }
        return compareResult;
    }
    boolean isComparable(String title, int year){

        if(title.equals(this.title)){
            if(year == this.yearPublished){
                return true;
            }
        }
        return false;
    }
}

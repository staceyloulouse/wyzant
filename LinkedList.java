public class LinkedList{
    
    public static void main(String[] args) {

        //declaration of various books
        DigitalBook ebook = new DigitalBook("1 - I Have No Husband", 2020); //title 1
        PrintBook paperback = new PrintBook("2 - Just Twelve", 2021);//title 2
        DigitalBook ebook2 = new DigitalBook("3 - Celebrate At My Death", 2022);//title 3
        PrintBook paperback2 = new PrintBook("4 - P.O.P. Code", 2023);//title 4
        PrintBook paperback3 = new PrintBook("5 - Veggie Wok Recipes", 2024);//title 5
        DigitalBook ebook3 = new DigitalBook("6 - Axel & Mia",2025);//title 6
        PrintBook paperback4 = new PrintBook("7 - Road to Terebithia",2019);//title 7

        //initialize nodes
        Node title1 = new Node(ebook);
        Node title2 = new Node(paperback);
        Node title3 = new Node(ebook2);
        Node title4 = new Node(paperback2);
        Node title5 = new Node(paperback3);
        Node title6 = new Node(ebook3);
        Node title7 = new Node(paperback4);


        BookList library = new BookList();
        boolean emptyStatus;
        boolean match;

        //populate the list
        library.append(title1);
        library.append(title2);
        library.append(title3);       
        library.append(title4);
        library.append(title5);

        //put a book in the front of the list
        library = library.push(title6);
        library = library.push(title7);

        //insert a book at some given location in the list
        library = library.insert(5,title2);

        //output and testing methods
        emptyStatus = library.isEmpty();
        System.out.println("Empty status: " + emptyStatus);
        System.out.println("Size status: " + library.sizeOf());

        
        library.printList();
        //remove books from the library


        // if (!emptyStatus){
        //     library.printList();
        // }
        match = ebook.isComparable("1 - I Have No Husband",2020);
        if (match){
            System.out.println("Found a Match to " + ebook.title);
        }
    //     library.pop();
    //     System.out.println("node popped!" ); 
    //     library.printList();
    }
    

}
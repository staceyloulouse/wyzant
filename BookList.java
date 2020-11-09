public class BookList {
    Node book;
    BookList next;

    public BookList(){
        book = null;
        next= null;
    }
    public BookList(Node book){
        this.book = book;
        this.next = null;
    }
    boolean isEmpty(){
        //check to see if the list is empty, returns true or false
        return (book == null);
    }
    BookList append(Node book){
        //add Book to end of list
        BookList target  = new BookList(book);

        if (this.book == null){
            this.book = target.book;
            this.next = target.next;
            return this;
        }
        else{
            target = this;
            while (target.next != null){
                
                target = target.next;
                
            }
            target.next = new BookList(book);

        }
        return target;
    }
    
    BookList push(Node book){
        //insert new Book into the front of the list
        BookList l = new BookList(book);
        BookList current = this;
        l.next = current;
        return l;
    }

    BookList pop(){
        //remove the first book in the list
        BookList l = this;
        if (!isEmpty()){
            //store value of book before replacing with next
            l= l.next;
        }
        else{
            System.out.println("Empty list");
            l=null;
        }
        return l;
    }
    
    BookList insert(int location, Node book){
        //put in location or throws new IllegalArgumentException, return Node
        int count = 0;
        BookList l = this;
        BookList target = new BookList(null);
        if(count == location){
            this.append(book);
        }
        else{
            while(count<location){
                target.append(l.book);
                l = l.next;
                if(count+1==location){
                    target.append(book);
                }
                count++;
            }
            while(l.next != null){
                target.append(l.book);
                l=l.next;
            }
            this.book = target.book;
            this.next = target;  
        }
        
        return target;
    }
    
    Node delete(int location){
        //remove node at location or throws new IllegalArgumentException
        int test = location;
        if (test <=-1 ){
            throw new IllegalArgumentException("Invalid location!");
        }
        return new Node(book.content);
    }
    
    boolean contains(Book title){
        //if Book exists in list return true, otherwise false
        return false;
    }

    int getIndex(Book title){
        //find the book and return index or -1
        return 0;
    }

    void printList() {
        //print all the books in the list
        BookList current = this;

        while (current.next!=null){
            current.book.display();
            current = current.next;
            if (current.next == null){
                current.book.display();
            }
        }
         
    }
    
	public int sizeOf() {
        //determine how many nodes in the list
        BookList target = this;
        int count = 0;
        if (isEmpty()){
            count= 0;
        }
        else if (!isEmpty()){
            count = 1;
            while (target.next != null){
                target = target.next;
                if(target.next == null){
                }
                
                ++count;
            }
            
        }
		return count;
	}
        
    
}

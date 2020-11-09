Step 1:


Create a new project called "SinglyLinkedList".


Step 2:


Create an abstract Book class, and a Digital Book and Print Book class that we will use in our linked list. 
Book should have the following fields: 
numberOfPages, author, title, yearPublished, price, rating. 
Book should also implement Comparable (compare title and year in that order). 
Digital Book should inherit from Book and it adds the availablePlatforms, PrintBook should have a boolean hardCover variable.


Step 4:


Create the SinglyLinkedList class and a Node class. We will use the Book class for the content of node, and later put both PrintBooks and DigitalBooks in as content due to polymorphism.


Step 5:


The linked list should have the following functions:


The empty constructor should initialize a new list;
append(Book) should append the item at the end of the list and return the inserted node;
push(Book) should insert the item at the front of the list, update the head, and return the inserted node;
insert(location, Book) should insert at that point in the list, and throw an IllegalArgumentException if location is out of the bounds of the list, it should return the inserted node. So insert at location 1 inserts a node right after the head, insert at location 0 replaces the head;
delete(location) should delete the item at that location, throw an IllegalArgumentException if it doesn't exist and return the deleted node (delete 0 deletes the head);
contains(Book) should return a boolean;
getIndex(Book) should return the first index of the item, return -1 if it isn't there;
shuffle() should return a shuffled version of the list, e.g. 1->2->3->4->5->6->null would become 1->3->5->2->4->6, where the odd indices go first and the even indices go last;
findMiddle() should return the middle Node (this uses the tortoise and hare solution we discussed in class, if there are an even number of items return the item right before the middle of the list, e.g. [0] [1] [2] [3] would return [1]);
concatenate(SinglyLinkedList) should take another linked list and add it to this linked list, you should not modify the list you are appending (make sure you check this, and understand what is going on)
size() should return how many items are in the list.
toString() should print out something like this: "Alexandre Dumas: The Count of Monte Cristo (1844) 5/5 -> Charles Dickens: A Tale of Two Cities (1859) 4/5 -> Dale Courtney: Moon People (2008) 0/5 -> null" where the head is "Alexandre Dumas: The Count of Monte Cristo (1844) 5/5"
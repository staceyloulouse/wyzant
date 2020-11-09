class Node{
    Book content;
    Node next;
    //constructor
    public Node(Book data){
        this.content = data;
        this.next = null;
    }
    void display(){
        System.out.println(" -> " + content.title + " " + content.yearPublished);
    }
    public String toString(){
        return content.title;
    }

}
  //  Java linked list from scratch ------

class LinkedListScratch{
    Node head;
    private int size;
    LinkedListScratch(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data= data;
            this.next= null;
            size++;
        }



    }
    //add first
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
           head= newNode;
           return; 
        }

        newNode.next=head;
        head= newNode;
    }

    // add Last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
           head= newNode;
           return; 
        }
        Node currNode= head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next= newNode;
    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode= head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("NOLL");


    }
    // delete first
    public void deleteFirst(){
        if(head== null){
            System.out.println("list is Empty");
            return;
        }
        size--;
        head=  head.next;
    }
    //deleteLast
    public void deleteLast(){
        if(head==null){
            System.out.println("list is Empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode= head.next;
        while(lastNode.next!=null){
            lastNode= lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;

    }
   // reverse 
    public void reverselist(){
        Node prevNode = head;
        Node currNode= head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next= prevNode;
            prevNode= currNode;
            currNode= nextNode;
        }
        head.next=null;
        head =prevNode;
    }
    // insert specified index
    public void insertIndex(int ind,String data){
        Node newNode= new Node(data);
        if(ind==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        int g=1;
        Node cur=head;
        while(g<ind){
            cur= cur.next;
            g++;
            System.out.println("gjhjh");

        }
        Node newStore =cur.next;
        cur.next=newNode;
        newNode.next=newStore;
    }
    //------------------Main Function---------------------------------------
    public static void main(String[] args){
        LinkedListScratch list = new LinkedListScratch();
        list.addFirst("one");
        list.addFirst("two");
        list.addLast("three");
        list.printList();
        list.addLast("four");
        list.addLast("lakkappa");
        list.printList();
        System.out.println( " List Size  :"+list.getSize());
        list.reverselist();
        list.printList();
        list.insertIndex(0,"basidoni");
        list.printList();

    }

}

public class LL_01{
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addfirst(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head= tail= newNode;
            return;
        }
        newNode.next= head;
        head= newNode;
    }

    public void addlast(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head= tail= newNode;
            return;
        }
        tail.next= newNode;
        tail= newNode;
    }

    public void printll(Node node)
    {
        while(node!=null)
        {
            System.out.print(node.data+"->");
            node=node.next;
        }
        System.out.println("null");
    }

    public void midadd(int i, int data)
    {
        if(i==0)
        {
            addfirst(data);
            return;
        }
        Node temp1= head, newNode= new Node(data);
        for(int k=1; k<i;k++)
        {
           temp1=temp1.next;
        }
        newNode.next=temp1.next;
        temp1.next=newNode;
    }
    public static void main(String[] args) {
        LL_01 ll = new LL_01();
        ll.addfirst(1);
        ll.addfirst(11);
        ll.addfirst(18);
        ll.addfirst(19);
        ll.addlast(21);
        ll.addlast(22);
        ll.addlast(23);
        ll.addlast(24);
        ll.printll(head);
        ll.midadd(0, 72);
        ll.printll(head);
    }
}
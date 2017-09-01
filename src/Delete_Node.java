import java.util.HashSet;

/**
 * Created by jiayicheng on 17/7/18.
 */
public class Delete_Node {
    class Node{                           //创建一个点类，用于构建列表
        int data;
        Node next=null;                   //点类里面应包含所有的参数，作为一个链表，应包含点的值，还有下一个点的位置。
                                          //下一个点的位置由创建一个点代表
        public Node(int d)
        {
            data=d;                       //构造函数一定要写！！！构造函数是用来创建这个类的方法。
        }
        void appendToTail(int d)
        {
            Node end=new Node(d);
            Node n=this;                  //由于要创建一个点类，然后将其做成链表，就要把它们连起来。This 指的是指针现在的位置
            while(n.next!=null)
            {
                n=n.next;                  //循环到链表的尾巴，再接上值为D的这个点。
            }
            n.next=end;
        }
    }

    public static void main(String[] args)
    {

    }

    void deletenode(Node n)
{
    HashSet<Integer> set= new HashSet<Integer>();
    Node pre=null;
    while(n!=null)     //直到循环到最后一个
    {
        if(set.contains(n.data))
        {
            pre.next=n.next;
        }else{
            set.add(n.data);
            pre=n;
        }
        n=n.next;
    }
}

void delete(Node n)
{
    Node current=n;
    while(current!=null)
    {
        Node runner=current;                   //没有多余缓存的情况下的办法
        while(runner.next!=null)
        {
            if(runner.next.data==current.data)
            {
                runner.next=runner.next.next;
            }else
            {
                runner=runner.next;
            }
        }
        current=current.next;                  //while循环，循环运算一般都在最后面。对于链表来说，每次都需要循环到链表末尾，所以用WHILE最合适
    }
}

}

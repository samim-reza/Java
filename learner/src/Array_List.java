import java.util.ArrayList;
import java.util.Iterator;

public class Array_List
{
    public static void main(String[] args)
    {
        ArrayList<Integer>num=new ArrayList<Integer>();
        num.add(10);//default indexing
        num.add(22);
        num.add(2,23);//num.add(index,value)
        //System.out.println(num);
        Iterator itr=num.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        num.remove(1);
        for(int i:num)
        {
            System.out.println(i);
        }
        num.removeAll(num);
    }
}

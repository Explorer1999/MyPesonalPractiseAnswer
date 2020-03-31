package Test.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class temp1{
    int number;

    public temp1(int number){
        this.number=number;
    }

    @Override
    public String toString() {
        return "temp1{" + "number=" + number + '}';
    }
}
class temp2{
    String st;

    public temp2(String st){
        this.st=st;
    }
    public void fun(){
        System.out.println("fun "+ st);
    }

    @Override
    public String toString() {
        return "temp2{" + "st='" + st + '\'' + '}';
    }
}
public class MapTest
{
    //以两个类为键值
    public static Map<temp1,temp2> map=new HashMap<>();

    public static void main(String[]args){
        map.put(new temp1(0),new temp2("aaa"));
        map.put(new temp1(1),new temp2("bbb"));
        map.put(new temp1(2),new temp2("ccc"));

        Iterator<temp1> I=map.keySet().iterator();

        while(I.hasNext()){
            temp1 t1=I.next();
            //获取下一个键

            System.out.println("key: temp1 = "+t1);
            System.out.println("value: temp2 = "+map.get(t1));
            //以键获取值

            map.get(t1).fun();
            System.out.println("***********");
        }
    }
}
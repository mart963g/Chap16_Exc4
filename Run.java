package Exc_4;

public class Run
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(3);
        list.add(7);
        list.add(12);
        list.add(13);
        list.set(0,7);
        System.out.println(list.lastIndexOf(14));
        System.out.println(list);
    }
}

class pen{
    String color;
    String type;

    public void write()
    {
        System.out.println("Writing");
    }

}
class Person{
        String name;
        int age;
    }

public class class_obj
{
   public static void main(String args[])
   {
   Person p1=new Person();
   p1.age=24;
   p1.name="Anuj";     
    


  // Person p2=new Person();
  // p2.age=32;
  // p2.name="Amit";
   System.out.println(p1.age + " "+p1.name);
 //  System.out.println(p2.age+" "+p2.name);
   }
} 
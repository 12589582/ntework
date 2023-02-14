public class Dog{
    String name;
    int age;
   
    // 构造方法，没有返回值
    Dog(String name1, int age1){
        name = name1;
        age = age1;
        System.out.println(name);
    }
   
    // 普通方法，必须有返回值
    void bark(){
        System.out.println("汪汪，不要过来");
    }
 
    void hungry(){
        System.out.println("主人，我饿了");
    }
   
    public static void main(String arg[]){
        // 创建对象时传递的参数要与构造方法参数列表对应
        Dog myDog = new Dog("花花", 3);
    }
}
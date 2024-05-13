public class Person {
    private String name;
    public Person(){

    }
    public Person(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void Learn (String name){
        System.out.println(name+" learning");
    }
    public  void Walk(String name){
        System.out.println(name+" walking ");
    }
    public  void Eat (String name){
        System.out.println( name+" eating");
    }
}

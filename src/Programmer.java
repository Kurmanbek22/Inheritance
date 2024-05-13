public class Programmer extends Person{
            private  String name;
          public Programmer(){

          }
          public Programmer(String name){
              this.name=name;
          }
          public void setName(String name){
              this.name=name;

          }
          public String getName(){
              return name;
          }
          public void Coding(String name){
              this.name=name;
              System.out.println(name+" coding");
          }
          public void Learn (String name){
              super.Learn(name);
          }

           @Override
          public void Walk(String name) {
          super.Walk(name);
               }

             @Override
         public void Eat(String name) {
            super.Eat(name);
         }

           public String toString(){
            return name;
    }
}

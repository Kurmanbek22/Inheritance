public class Dancer extends Person{

        private  String name;
        public Dancer(){

        }
        public Dancer(String name){
            this.name=name;
        }
        public void setName(String name){
            this.name=name;

        }
        public String getName(){
            return name;
        }
        public void Dans(String name){
            this.name=name;
            System.out.println(name+" dans");
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





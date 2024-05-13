public class Singer extends Person{

        private  String name;
        public Singer(){

        }
        public Singer(String name){
            this.name=name;
        }
        public void setName(String name){
            this.name=name;

        }
        public String getName(){
            return name;
        }
        public void Sings(String name){
            this.name=name;
            System.out.println(name+" sings");
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



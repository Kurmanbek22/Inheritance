public class Main {
    public static void main(String[] args) {
           Programmer programmer= new Programmer("Mark Zukerberg");
           programmer.Coding(programmer.getName());
           programmer.Learn(programmer.getName());
           programmer.Walk(programmer.getName());
           programmer.Eat(programmer.getName());
        System.out.println();
           Singer singer= new Singer("Mirbek Atabekov");
        singer.Sings(singer.getName());
        singer.Learn(singer.getName());
        singer.Walk(singer.getName());
        singer.Eat(singer.getName());
        System.out.println();
           Dancer  dancer = new Dancer("Michael Jackson");
           dancer.Dans(dancer.getName());
        dancer.Learn(dancer.getName());
        dancer.Walk(dancer.getName());
        dancer.Eat(dancer.getName());





    }
}
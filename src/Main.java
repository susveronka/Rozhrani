public class Main {
    public static void main(String[] args) {
       GeneratorUdalosti generatorUdalosti = new GeneratorUdalosti();
       Posluchac posluchac1 = new HelloPosluchac("Jana");
       Posluchac posluchac2 = new HelloPosluchac("Karel");

       generatorUdalosti.pridejPosluchace(posluchac1);
        System.out.println("událost 1");
        generatorUdalosti.generujUdalost();

       generatorUdalosti.pridejPosluchace(posluchac2);
        System.out.println("událost 2 ");
        generatorUdalosti.generujUdalost();




    }
}
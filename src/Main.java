public class Main {
    public static void main(String[] args) {
       GeneratorUdalosti generatorUdalosti = new GeneratorUdalosti();
       Posluchac jana = new HelloPosluchac("Jana");
       Posluchac karel = new HelloPosluchac("Karel");

       generatorUdalosti.pridejPosluchace(jana);
        System.out.println("událost 1");
        generatorUdalosti.generujUdalost();


       generatorUdalosti.pridejPosluchace(karel);
        System.out.println("událost 2 ");
        generatorUdalosti.generujUdalost();


    }
}
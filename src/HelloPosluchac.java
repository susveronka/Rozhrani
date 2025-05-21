public class HelloPosluchac implements Posluchac{
    private String name;

    public HelloPosluchac(String name) {
        this.name = name;
    }
    @Override
    public void zpracujUdalost() {
        System.out.println(name + " zpracovává událost...");
    }
}

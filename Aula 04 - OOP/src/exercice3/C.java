package exercice3;

public class C extends B{

    public C() {
    }

    public C(int i) {
        System.out.printf("Sou o construtor da classe C, e meu parâmetro é %d\n",i);
    }

    // MÉTODOS
    public void a1(){
        System.out.println("Sou o método a1 da classe C");
    }

    public void b2(){
        System.out.println("Sou o método b2 da classe C");
    }

    public void c1(){
        System.out.println("Sou o método c1 da classe C");
    }
}

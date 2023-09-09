package exercice3;

public class B extends A{

    public B() {

    }

    public B(int i) {
        System.out.printf("Sou o construtor da classe B, e meu parâmetro é %d\n",i);
    }

    // MÉTODOS
    public void a1(){
        super.a1();
        System.out.println("Sou o método a1 da classe B");
    }

    public void b2(){
        System.out.println("Sou o método b2 da classe B");
    }
}

package exercice3;

public class A {

    // CONSTRUTORES
    public A() {
        System.out.println("Sou o construtor default da classe A");
    }

    public A(int i) {
        System.out.printf("Sou o construtor da classe A, e meu parâmetro é %d\n",i);
    }

    // MÉTODOS
    public void a1(){
        System.out.println("Sou o método a1 da classe A");
    }

    public void a2(){
        System.out.println("Sou o método a2 da classe A");
    }
}

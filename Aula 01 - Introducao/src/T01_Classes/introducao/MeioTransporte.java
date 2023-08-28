package T01_Classes.introducao;

public class MeioTransporte {

    // Atributos da Classe

    /**
     * O estado de uma classe, ou as caracteristicas do tipo SABE da classe é um conjunto de características (atributos)
     * que ele possui, sendo elas de tipos primitivos, de outras classes fornecidas pelo Java como Date e Collections, como
     * tambem de outras classes desenvolvidas propriamente, criando uma ligação entre as classes, e entre os objetos quando
     * instanciado.
     */

    private String tipo;
    private String marca;
    private String modelo;
    private short numeroLugares;
    private double velocidadeAtual;

    // Construtor da classe

    /**
    *
    * O construtor é uma operação, um conjunto de instruções que devem ser executadas para inicializar um objeto/instância
    * de uma classe, ou seja, são as definições de estado iniciais do objeto instanciado.
    *
    */


    public MeioTransporte(String tipo, String marca, String modelo, short numeroLugares) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroLugares = numeroLugares;
    }

    /**
     *
     * A identidade é uma propriedade inerente ao objeto, quando um objeto é instanciado ele passa a ser unico.
     * <p>
     * Ou seja, dois objetos mesmo que tenham as mesmas caracteristicas do tipo faz e sabe, são diferentes internamente.
     */

    public MeioTransporte() {


    }

    //Métodos da Classe

    /**
     * O coportamento é a maneira que o objeto instanciado reage, definindo seu conjunto de operações suportadas.
     *
     *
     */

    public void iniciarViagem(){
        acelerar(40);
    }

    public void interromperViagem(){
        frar();
    }

    public void acelerar(double value){
        this.velocidadeAtual = value;
    }

    public void frar(){
        this.velocidadeAtual = 0;
    }

    public double obterVelocidade(){
        return this.velocidadeAtual;
    }

}

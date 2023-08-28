package T01_Classes.heranca;

public class Mamifero extends SerVivo{

    /**
     * <h3>Herança<h3/>
     * <p> O uso do extends na assinatura da classe define que Mamifero herda SerVivo.
     *
     * Comumente para a identificação é comum utilizar o termo, "É UM(A)" para saber quando é
     * necessário a utilização da herança.
     * <br/>
     * Nesse caso, um mamifero é um SerVivo!<p/>
     */

    private double peso;

    public void mamar(){
        System.out.println("https://www.mamando.com.br");
    }

}

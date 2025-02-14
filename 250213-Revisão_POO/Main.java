package pessoa;

public class Main {

    public static void main(String[] args) {
        exemplo1();
    }

    public static void exemplo1() {
        Pessoa pedro = new Pessoa("Pedro",24);
        Pessoa sofia = new Pessoa("Sofia", 32);

        System.out.println("A pessoa se chama " +
                pedro.getNome() + " e ela tem " +
                pedro.getIdade() + " anos.");

        pedro.setIdade(25);

        System.out.println("A pessoa se chama "+
                pedro.getNome() + " e ela tem " +
                pedro.getIdade() + " anos.");

        sofia.andar();
    }
}
public class Simboli implements Runnable{
    private int numero;
    private char carattere;

    public Simboli(int numero, char carattere){
        this.numero = numero;
        this.carattere = carattere;
    }

    public void run(){
        for(int i = 1; i < numero + 1; i++){
            if(i%10 == 0)
                System.out.println();
            System.out.print(carattere);
        }
    }
}
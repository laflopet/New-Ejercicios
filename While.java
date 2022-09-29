package EstructurasControl.Ciclos;

public class While {
    public static void main(String[] args) {

        String[] nombres = {"Juliana", "Andrea", "Natalia", "Yajaira"};

        int j = 0;
        String tuparo = "";
        while (j < nombres.length){
            tuparo += nombres[j] + " ";
            j +=1;
        }
        System.out.println(tuparo);
    }
}

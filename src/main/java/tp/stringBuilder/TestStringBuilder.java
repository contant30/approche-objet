package tp.stringBuilder;

public class TestStringBuilder {
    public static void main(String[] args) {

    StringBuilder builder = new StringBuilder();
        long debut = System.currentTimeMillis();

        for (int i=0; i<=100000;i++ ){
        builder.append(i);
        builder.append(" ");
    }
        long fin = System.currentTimeMillis();
        //System.out.println(builder.toString());
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

        String chainelong="";
        debut = System.currentTimeMillis();
        for (int i = 0; i<=100000;i++){
            chainelong += i+"";
        }
        fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
    }
}

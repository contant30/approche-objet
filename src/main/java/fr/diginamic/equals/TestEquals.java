package fr.diginamic.equals;

public class TestEquals {
    static void main(String[] args) {

        Pays pays1= new Pays("France",253);
        Pays pays2= new Pays("Angleterre",253);

        if (pays1.equals(pays2)){
            System.out.println("les deux "+pays1.getClass().getSimpleName()+" on la même population : "  );
        } else {
            System.out.println("pas les mêmes");
        }




    }
}

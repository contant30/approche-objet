package fr.diginamic.interfaces;

public class TestObjetGeometrique {
    public static void main(String[] args) {

        // Création d'un tableau
        ObjetGeometrique[] arrays= new ObjetGeometrique[2];

        // Instance de Cercle et Rectangle dans le tableau
        arrays[0] = new Cercle(10.25);
        arrays[1] = new Rectangle(10,15);

        int i=0;
        for (i=0; i< arrays.length; i++){

            ObjetGeometrique type = arrays[i];

            System.out.println(type.getClass().getSimpleName()+"  : "+" la surface est de : "+arrays[i].surface()+" et le perimetre est de : "+arrays[i].perimetre());
        }




    }
}

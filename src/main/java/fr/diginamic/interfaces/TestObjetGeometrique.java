package fr.diginamic.interfaces;

public class TestObjetGeometrique {
    public static void main(String[] args) {

        // Création d'un tableau
        ObjetGeometrique[] arrays= new ObjetGeometrique[3];

        // Instance de Cercle et Rectangle dans le tableau
        arrays[0] = new Cercle(3);
        arrays[1] = new Rectangle(10,5);
        arrays[2] = new Rectangle(10,5);



        int i=0;
        for (i=0; i< arrays.length; i++){

            ObjetGeometrique type = arrays[i];

            System.out.println(type.getClass().getSimpleName()+"  : "+" la surface est de : "+arrays[i].surface()+" et le périmètre est de : "+arrays[i].perimetre());
        }

//        if (arrays[1].equals(arrays[2])){
//            System.out.println("meme");
//        }else {
//            System.out.println("erreur");
//        }


    }
}

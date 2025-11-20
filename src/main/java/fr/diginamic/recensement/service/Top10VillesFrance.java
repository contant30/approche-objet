//package fr.diginamic.recensement.service;
//
//import fr.diginamic.recensement.Recensement;
//import fr.diginamic.recensement.Region;
//import fr.diginamic.recensement.Ville;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Top10VillesFrance extends MenuService{
//    @Override
//    public void traiter(Recensement recensement, Scanner scanner) {
//
//        // On crée une map pour regrouper les villes
//        Map<String, Ville> mapVille = new HashMap<>();
//
//        // on parcour les villes
//        for (Ville v : recensement.getVilles()){
//            String code = v.getCodeCommune();
//            String nom = v.getNomCommune();
//
////
////        // On récupère la région correspondante, sinon on la crée
////        Ville ville = mapVille.get(code);
////        if (ville == null) {
////            ville = new Ville(code, nom);
////            mapVille.put(code, nom);
////        }
////
////
////
////
////    }
////}

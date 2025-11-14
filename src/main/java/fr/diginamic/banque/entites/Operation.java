package fr.diginamic.banque.entites;

public  abstract class Operation {

    private String dateOperation;
    private  double montantOperation;

    public Operation( String dateOperation, double montantOperation){
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    // pour affichage lors de l'appel
    @Override
    public String toString() {
        return "dateOperation =" + dateOperation +", montantOperation =" + montantOperation+" "+getType();
    }


    public double getMontantOperation() {
        return montantOperation;
    }

    // Création methode abstraite
    public  abstract String getType() ;

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }
}

package tp.testEnumaration;

public enum Continent {

    AMERIQUE("amerique"),
    EUROPE("europe"),
    AFRIQUE("afrique"),
    ASIE("asie"),
    OCEANIE("oceanie"),
    ANTARCTIQUE("antartique");

    private String nomContineant;




    public String getNomContineant() {
        return nomContineant;
    }

    Continent(String nomContineant) {
        this.nomContineant = nomContineant;
    }


}

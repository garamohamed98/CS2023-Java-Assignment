class Livre{
    private int code;
    private String titre;
    private String auteur;
    private int prix;

    Livre(int code, String titre, String auteur, int prix){
        this.code = code;
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    Livre(int code, String titre, String auteur){
        this(code,titre,auteur,0);
    }

    Livre(){
        this(0,"","",0);
    }

    int getCode(){
        return this.code;
    }

    void setCode(int code){
        this.code = code;
    }

    String getTitre(){
        return this.titre;
    }

    void setTitre(String titre){
        this.titre = titre;
    }

    String getAuteur(){
        return this.auteur;
    }

    void setAuteur(String auteur){
        this.auteur = auteur;
    }

    int getPrix(){
        return this.prix;
    }

    void setPrix(int prix){
        this.prix = prix;
    }

    public String toString() {
        return "Livre{" +
                "code='" + code + '\'' +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                '}';
    }

    public void afficher(){
        System.out.println(this);
    }
}
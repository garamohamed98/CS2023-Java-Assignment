class gestionDeBiblio {
    public static void main(String[] args0){

        Livre l1 = new Livre(125, "prog java","xxx",50);
        Livre l2 = new Livre(126, "prog c","yyy",60);
        Livre l3 = new Livre(127, "réseaux","aaa");
        Livre l4 = new Livre(128, "conception","bbb");
        Livre l5 = new Livre();

        l1.afficher();
        l2.afficher();
        l3.afficher();
        l4.afficher();
        l5.afficher();

        l5.setCode(129);
        l5.setTitre("Bases de donnée");
        l5.setAuteur("333");
        l5.setPrix(80);

        l5.afficher();

        l1.setPrix(55);

        l1.afficher();

    }
}

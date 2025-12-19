//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {    // LOCAL ONDE VAI SAIR AS FUNÇOES DO SOUT, PAG PRINCIPAL
    public static void main(String[] args) {
        //  Objeto 1
    uzumaki naruto = new uzumaki();
    naruto.setNome("Naruto");
    naruto.getNome();
    naruto.setCla("Uzumaki");
    naruto.getCla();
    naruto.setVila("Vila Oculta da Folha");
    naruto.getVila();
    naruto.euSouNaruto();
    naruto.estiloDeLuta();
    naruto.jutstuCloneDasSombras();


    System.out.println("-----------------");


        //  Objeto 2
    uchiha sasuke = new uchiha();
    sasuke.setCla("Sasuke");
    sasuke.getNome();
    sasuke.setCla("Uchiha");
    sasuke.getCla();
    sasuke.setVila("Renegado da Vila Oculta da Folha");
    sasuke.getVila();
    sasuke.euSouSasuke();
    sasuke.estiloDeLuta();
    sasuke.sharinganDespertado();
    sasuke.estiloDeLuta(2);



    }
}
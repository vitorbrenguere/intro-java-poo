import javax.swing.*;

public class uchiha extends ninja {

    int nivelDoSharingan = 2;

    public void sharinganDespertado(){
        System.out.println("Sharingan Despertou!!");
    }
    public void euSouSasuke(){
        System.out.println("Eu sou Sasuke e vou restabelecer o meu clã");
    }

    @Override  //    Polimorfismo
    public void estiloDeLuta(){
        System.out.println("Eu sou um ninja e sei lutar no estilo FOGO");
    }

    public void estiloDeLuta(int nivelDoSharingan){
        if(nivelDoSharingan == 2){
            System.out.println("Susano'o Ativado");
        } else {
            System.out.println("Lutando ao estilo fogo!!");
        }
    }
}

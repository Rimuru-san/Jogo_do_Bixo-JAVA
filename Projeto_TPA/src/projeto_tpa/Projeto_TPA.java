/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_tpa;

/**
 *
 * @author LAB202-06
 */
import javax.swing.JOptionPane;
public class Projeto_TPA {
    public static void main(String[] args) {
    int i, j=0;
    int[] r = new int [6];
    JOptionPane.showMessageDialog(null,"Este jogo não foi feito com fins "
            + "lucrativos");
    JOptionPane.showMessageDialog(null,"A produção desse jogo foi patrocinada "
        + "pela IBM(International Business Machines)");
    JOptionPane.showMessageDialog(null,"Jogo feito por: Lucas Aguiar Barreto "
            + "de Souza, junto a Yann Rodrigues Casanova");
    JOptionPane.showMessageDialog(null,"P>TEC produções apresenta:");
    JOptionPane.showMessageDialog(null,"Guess the Animal(java version)");
    JOptionPane.showMessageDialog(null,"Pressione ENTER para começar...");
    while(j==0){
    JOptionPane.showMessageDialog(null, "Pense em um dos animais da lista");
    JOptionPane.showMessageDialog(null, "Agora preste atenção e responda as "
            + "perguntas sobre o animal sendo: 1 = sim e 2 = não");
    for(i=0;i<6;i++){
    if(i==0){
    JOptionPane.showMessageDialog(null, "O animal no qual você pensou é "
            + "mamífero?");
    }
    if(i==1){
    JOptionPane.showMessageDialog(null, "O animal no qual você pensou é "
            + "quadrúpede?");
    }
    if(i==2){
    JOptionPane.showMessageDialog(null, "O animal no qual você pensou é "
            + "carnívoro?");
    }
    if(i==3){
    JOptionPane.showMessageDialog(null, "O animal no qual você pensou é "
            + "herbívoro?");
    }
    if(i==4){
    JOptionPane.showMessageDialog(null, "O animal no qual você pensou possui "
            + "asas?");
    }
    if(i==5){
    JOptionPane.showMessageDialog(null, "O animal no qual você pensou vive na "
            + "água?");
    }
    r[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua resposta"
    ));
    }
if(r[0]==1){
if(r[1]==1){
if(r[2]==1){
if(r[3]==1){
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
}
}
else{
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
else{
JOptionPane.showMessageDialog(null, "O animal que você pensou é um leão");
}
}
}
}
else{
if(r[3]==1){
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
else{
JOptionPane.showMessageDialog(null, "O animal que você pensou é um cavalo");

}
}
}
else{
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
}
}
}
}
else{
if(r[2]==1){
if(r[3]==1){
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
else{
JOptionPane.showMessageDialog(null, "O animal que você pensou é o homem");

}
}
}
else{
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
else{
JOptionPane.showMessageDialog(null, "O animal que você pensou é um macaco");
}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "O animal que você pensou é uma baleia");

}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
}
}
}
else{
if(r[3]==1){
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
else{
JOptionPane.showMessageDialog(null, "O animal que você pensou é um morcego");

}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
}
}
else{
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");

}

}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
}
}
}
}
else{
if(r[1]==1){
if(r[2]==1){
if(r[3]==1){
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
}
else{
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "O animal que você pensou é um crocodilo");

}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
}
}
else{
if(r[3]==1){
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "O animal que você pensou é uma tartaruga");

}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
}
else{
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
}

}
}
else{
if(r[2]==1){
if(r[3]==1){
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "O animal que você pensou é um pato");

}
else{
JOptionPane.showMessageDialog(null, "O animal que você pensou é um avestruz");

}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
}
else{
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "O animal que você pensou é um pinguim");

}
else{
JOptionPane.showMessageDialog(null, "O animal que você pensou é uma águia");

}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "O animal que você pensou é uma cobra");

}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
}
}
else{
if(r[3]==1){
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
}
else{
if(r[4]==1){
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
else{
if(r[5]==1){
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
else{
JOptionPane.showMessageDialog(null, "As respostas não coincidem com os valores"
        + " predeterminados");
}
}
}
}
}
}


    j = Integer.parseInt(JOptionPane.showInputDialog("Gostaria de jogar "
            + "novamente?(1 = Sim; 2 = Não)"));
 switch(j){
     case 1:
       j--;  
     break;
     case 2:
         j++;
     break;    
     default:
         j=1000;
        JOptionPane.showMessageDialog(null,"Valor inválido encerrando o jogo "
                 + "em:");
                 JOptionPane.showMessageDialog(null,"3...");
                 JOptionPane.showMessageDialog(null,"2...");
                 JOptionPane.showMessageDialog(null,"1...");
                 JOptionPane.showMessageDialog(null,"0");
 }   
        }
}
}
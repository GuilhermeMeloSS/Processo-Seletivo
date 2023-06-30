import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class processoSeletivo {
    public static void main(String[] args) {
     String  [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            selecaoCandidatos();
            imprimirSelecionados();
            
            entrandoEmContato(candidato);

        }

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
static boolean atender (){
    return new Random().nextInt(3) ==1;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
static void entrandoEmContato (String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
do{
atendeu = atender();
continuarTentando = !atendeu ;
if(continuarTentando){
    tentativasRealizadas++;
    
}else{
    System.out.println("ATENDEU");
}
}while(continuarTentando &&  tentativasRealizadas < 3);
    if(atendeu){
        
        System.out.println("CONSEGUIMOS CONTATO COM " +  candidato + " APÓS " + tentativasRealizadas + " TENTATIVAS");
    }else 
       System.out.println("NÃO CONSEGUIMOS CONTATO COM " +  candidato + " APÓS " + tentativasRealizadas + " TENTATIVAS");
    

}
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
static void imprimirSelecionados (){
    String  [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
    System.out.println("CANDIDATOS SELECIONADOS INFORMANDO O INDICE DO ELEMENTO");
for ( int indice = 0 ; indice < candidatos.length; indice++){
    System.out.println("O CANDIDATO N° " +  (indice+1) + " é : " + candidatos[indice]);
}
// FORMA FOR EACH
for (String candidato : candidatos) {
    System.out.println("O CANDIDATO É : " + candidato );
}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O CANDIDATO " + candidato + " PRETENDE GANHAR " + salarioPretendido);

            if (salarioBase > salarioPretendido) {
                System.out.println("O CANDIDATO " + candidato + " FOI SELECIONADO");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}

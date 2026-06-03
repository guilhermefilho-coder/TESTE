import java.util.Scanner;

public class TesteSensores {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rodadas;
        String alerta;

        Sensor[] listaSensores = {

            new SensorTemperatura("TEMP-01", true, 25.0),
            new SensorPresenca("PRES-01", true)
        
        };

        System.out.println("SISTEMA DE MONITORAMENTO DE SENSORES IoT");
        System.out.println("DADOS INICIAIS DOS SENSORES:");

        for(Sensor s : listaSensores){
            s.exibirDados();
            System.out.println("--------------------");
        }

        System.out.println("INICIANDO LEITURAS");
        System.out.print("Quantas rodadas de leitura deseja realizar?");
        rodadas = scan.nextInt();
        scan.nextLine();

        for(int i = 1; i <= rodadas; i++){
            System.out.println("=== Rodada " + i + " ===");

            for(Sensor s : listaSensores){
                if(s.verificarConexao()){
                    s.realizarLeitura();
                }else{
                    System.out.println("Sensor desconectado.");
                }
                
            }
        }

        System.out.println("TESTE DE REFERÊNCIA GENÉRICA (Interface Monitoravel)");
        System.out.println("Conexão ativa: " + listaSensores[0].verificarConexao());

        System.out.print("ALERTA [TEMP-01]: ");
        alerta = scan.nextLine();
        listaSensores[0].enviarAlerta(alerta);

        scan.close();

    }

}

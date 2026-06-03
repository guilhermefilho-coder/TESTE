public class SensorTemperatura extends Sensor{

    private double temperaturaMax;

    public SensorTemperatura(String ID, boolean ativo, double temperaturaMax){
        super(ID, ativo);
        this.temperaturaMax = temperaturaMax;
    }

    @Override
    public boolean verificarConexao(){
        return getAtivo();
    }

    @Override
    public void realizarLeitura(){
        double temperatura = Math.random()*20.0 + 15.0;

        ultimaLeitura = temperatura;

        System.out.printf("Sensor[%s]: Leitura realizada = [%.2f]C\n",ID , temperatura); 
    }

    @Override
    public void exibirDados(){
        System.out.println("Sensor: Temperatura");
        System.out.println("ID: " + ID);
        System.out.println("Status: " + isAtivo());
        System.out.printf("Ultima leitura: %.2f\n", ultimaLeitura);
    }

    @Override
    public void enviarAlerta(String alerta){
        System.out.println("ALERTA [TEMP-01]: " + alerta);
    }
}
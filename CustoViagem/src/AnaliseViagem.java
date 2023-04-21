
public class AnaliseViagem {
    private static String destino;
    private static String veiculo;
    private static int distancia;
    private static double valorCombustivel;
    private static int kmPorlitro;


//GET E SET
    public static void setDestino(String destino) {
        AnaliseViagem.destino = destino;
    }
    public static void setVeiculo(String veiculo) {
        AnaliseViagem.veiculo = veiculo;
    }
    public static void setDistancia(int distancia){
        AnaliseViagem.distancia = distancia;
    }
    public static void setValorCombustivel(double valorCombustivel){
        AnaliseViagem.valorCombustivel = valorCombustivel;
    }
    public static void setKmPorlitro(int kmPorlitro) {
        AnaliseViagem.kmPorlitro = kmPorlitro;
    }


//METODOS DIVERSOS
    public void cadastrarDestino(String destino){
        setDestino (destino);
    }
    public void cadastrarVeiculo(String veiculo){
        setVeiculo (veiculo);
    }
    public void cadastrarDistancia(int distancia){
        setDistancia (distancia);
    }
    public void cadastrarValorCombustivel(double valorCombustivel){
        setValorCombustivel (valorCombustivel);
    }
    public void cadastrarkmPorlitro(int kmPorlitro){
        setKmPorlitro (kmPorlitro);
    }

    public static String destinoFinal(){
        return "--- Segue a analise de uma viagem para " + destino + " de " + veiculo + ". ---";
    }
    public static String distanciaFinal(){
        return "[distancia aproximada até " + destino + " que é de " + distancia + "km.]";
    }
    public static String consumoFinal(){
        return "[consumo médio do " + veiculo + " é de " + kmPorlitro + "km por litro de combustivel.]";
    }

    /**
     * @autor Saulo Pereira
     * @return Calculo entre as variaveis fornecidas pelo usuario
     */
    public static double custoViagem(){
        double i = distancia / kmPorlitro;
        double valorfinal = i * valorCombustivel;

        return valorfinal;
    }

    public static String msgCustoViagem(){
        return "--- Custo aproximado da viagem para " + destino + " é de R$" + custoViagem() + " ---";
    }





//MOSTRAR NA TELA
    public static void main(String args[]){
        AnaliseViagem viagem = new AnaliseViagem();
        viagem.cadastrarDestino (destino = "Ilha Bela");
        viagem.cadastrarVeiculo (veiculo= "Citycom 300i");
        viagem.cadastrarDistancia (distancia = 700);
        viagem.cadastrarkmPorlitro(kmPorlitro = 20);
        viagem.cadastrarValorCombustivel(valorCombustivel = 5.80);

        System.out.println(destinoFinal());
        System.out.println(distanciaFinal());
        System.out.println(consumoFinal());
        System.out.println(msgCustoViagem());
    }


}
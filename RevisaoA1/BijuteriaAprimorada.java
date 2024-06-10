import java.util.ArrayList;
import java.util.List;

class BijuteriaAprimorada {
    String tipo;
    double preco;
    int id;

    //construtor
    public BijuteriaAprimorada(String tipo, double preco, int id) {
        this.tipo = tipo;
        this.preco = preco;
        this.id = id;
    }
    //set = permite alterar o valor desse atributo
    public void setTipo(String tipoBiju){
        tipo = tipoBiju;
    }
    public void setPreco(double precoBiju){
        preco = precoBiju;
    }
    //get = permite fazer a leitura do valor desse atributo
    public String getTipo(){
        return tipo;
    }
    public double getPreco(){
        return preco;
    }
    public void mostrarTipoBiju(){
        System.out.printf("O tipo da bijuteria é ", getTipo(), "O seu valor é ", getPreco());
    }
}

class Loja {
    List<Bijuteria> bijuterias;

    public Loja() {
        bijuterias = new ArrayList<>();
    }
    public void adicionarBiju(Bijuteria biju) {
        bijuterias.add(biju);
    }   
    public void removerBiju(Bijuteria biju) {
        bijuterias.remove(biju);
    }
    public Bijuteria consultarBiju(int id){
        return bijuterias.get(id);
    }
    

    public static void main(String[] args) {
        Loja minhaBijuteria = new Loja();

        /*Uma forma de já adicionar no BD

        Bijuteria bijeturia1 = new Bijuteria("cordao", 5.80, 1);
        adicionar
        minhaBijuteria.adicionarBiju(bijeturia1);
        remover
        minhaBijuteria.adicionarBiju(bijeturia1);
        alterar
        bijeturia1.remover(8.80);

        Bijuteria bijeturia2 = new Bijuteria("pulseira", 9.50, 2);
        minhaBijuteria.adicionarBiju(bijeturia2);

        Bijuteria bijeturia3 = new Bijuteria("brinco", 15.60, 3);
        minhaBijuteria.adicionarBiju(bijeturia2);*/

        //Outra forma de já adicionar no BD
        minhaBijuteria.bijuterias.add(new Bijuteria("cordao", 5.80, 1));
        minhaBijuteria.bijuterias.add(new Bijuteria("pulseira", 9.50, 2));
        minhaBijuteria.bijuterias.add(new Bijuteria("brinco", 15.60,3));

        minhaBijuteria.removerBiju(new Bijuteria("cordao", 5.80, 1));
    }
}

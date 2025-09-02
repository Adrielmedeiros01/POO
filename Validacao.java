public class Validacao {

    public boolean validaNome(String nome){
        if(nome.isEmpty()){
            return false;
        }
        return true;
    }

    public boolean validaIdade(int idade){
        //return idade > 0;
        if(idade > 0){
            return true;
        }
        return false;
    }

    public boolean validaDados(String nome, int idade){
        return !(nome.isEmpty() || idade <= 0);
    }

}

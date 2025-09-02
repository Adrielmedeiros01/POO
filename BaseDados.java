import java.util.ArrayList;

public class BaseDados {

    private ArrayList<Aluno> alunos;

    public BaseDados(){
        alunos = new ArrayList<>();
    }

    public void cadastrar(Aluno novoAluno){
        alunos.add(novoAluno);
    }

    public boolean listaVazia(){
        if(alunos.isEmpty()){
            return true;
        }
        return false;
    }

    public void exibirAlunos(){
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println((i + 1) + ". " + alunos.get(i).getNome() + " - " + alunos.get(i).getIdade() + " anos");
        }
    }


}

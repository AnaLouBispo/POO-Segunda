public class Main {
    public static void main(String[] args) {
        java.util.ArrayList<Aluno> alunos = new java.util.ArrayList<>();
        alunos.add(new Aluno("Ana", 8));
        alunos.add(new Aluno("Bruno", 5));
        alunos.add(new Aluno("Carlos", 6));
        alunos.add(new Aluno("Diana", 9));
        alunos.add(new Aluno("Eduardo", 4));
        System.out.println("Todos os alunos:");
        for (Aluno aluno : alunos) { aluno.exibirDados(); }
        System.out.println("Aprovados:");
        int aprovados = 0;
        for (Aluno aluno : alunos) {
            if (aluno.getNota() >= 6) { aluno.exibirDados(); aprovados++; }
        }
        System.out.println("Quantidade de aprovados: " + aprovados);
        for (String nome : new String[]{"carlos", "Zeca"}) {
            System.out.println("Busca: " + nome);
            boolean encontrado = false;
            for (Aluno aluno : alunos) {
                if (aluno.getNome().equalsIgnoreCase(nome)) { aluno.exibirDados(); encontrado = true; }
            }
            if (!encontrado) { System.out.println("Aluno não encontrado."); }
        }
    }
}

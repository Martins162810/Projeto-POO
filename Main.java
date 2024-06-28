
import java.util.ArrayList;
import java.util.Scanner;

// Classe Empregado
class Empregado {
    private String nome;
    private String identificador;
    private String alergias;
    private String problemasMedicos;
    private String telefoneContato;
    private String emailContato;
    
    // Construtor
    public Empregado(String nome, String identificador, String alergias, String problemasMedicos, String telefoneContato, String emailContato) {
        this.name = nome;
        this.identificador = identificador;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
        this.telefoneContato = telefoneContato;
        this.emailContato = emailContato;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getProblemasMedicos() {
        return problemasMedicos;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Identificador: " + identificador + "\n" +
               "Alergias: " + alergias + "\n" +
               "Problemas Médicos: " + problemasMedicos + "\n" +
               "Telefone de Contato: " + telefoneContato + "\n" +
               "Email de Contato: " + emailContato;
    }
}

// Classe GerenciadorEmpregados
class GerenciadorEmpregados {
    private ArrayList<Empregado> empregados;

    // Construtor
    public GerenciadorEmpregados() {
        empregados = new ArrayList<>();
    }

    // Método para adicionar empregado
    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    // Método para buscar empregado pelo identificador
    public Empregado buscarEmpregado(String identificador) {
        for (Empregado emp : empregados) {
            if (emp.getIdentificador().equals(identificador)) {
                return emp;
            }
        }
        return null;
    }
}

// Classe Principal (Main)
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorEmpregados gerenciador = new GerenciadorEmpregados();
        
        // Coleta de informações do empregado
        System.out.println("Digite o nome do empregado:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o identificador do empregado:");
        String identificador = scanner.nextLine();
        
        System.out.println("Digite as alergias do empregado:");
        String alergias = scanner.nextLine();
        
        System.out.println("Digite os problemas médicos do empregado:");
        String problemasMedicos = scanner.nextLine();
        
        System.out.println("Digite o telefone de contato do empregado:");
        String telefoneContato = scanner.nextLine();
        
        System.out.println("Digite o e-mail de contato do empregado:");
        String emailContato = scanner.nextLine();
        
        // Criação e adição do empregado ao gerenciador
        Empregado empregado = new Empregado(nome, identificador, alergias, problemasMedicos, telefoneContato, emailContato);
        gerenciador.adicionarEmpregado(empregado);
        
        // Busca e exibição de informações do empregado
        System.out.println("Digite o identificador do empregado que deseja buscar:");
        String idBusca = scanner.nextLine();
        
        Empregado empBuscado = gerenciador.buscarEmpregado(idBusca);
        if (empBuscado != null) {
            System.out.println("Informações do empregado:");
            System.out.println(empBuscado);
        } else {
            System.out.println("Empregado não encontrado.");
        }
        
        scanner.close();
    }
}
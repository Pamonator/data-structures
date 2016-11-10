package avaliacao02;

import java.util.Scanner;

public class Avaliacao02EDD {
    
    static NoLivro inicio = null;
    
    public static void main(String[] args) {
        cadastrarLivro("LORENZI, F.; MATTOS, P. N.; CARVALHO, T. P.", " Estruturas de dados", "1ª edição", "São Paulo", "Thomson Learning", 2007);
        cadastrarLivro("PEREIRA, S. L.", "Estrutura de dados fundamentais: conceitos e aplicações", "12ª edição", "São Paulo", "Érica", 2008);
        cadastrarLivro("LAFORE, R.", "Estrutura de dados & algoritmos em java", "1ª edição", "Rio de Janeiro", "Ciência Moderna", 2004);
        cadastrarLivro("SZWARCFITER, J. L.; MARKENZON, L.", "Estruturas de dados e seus algoritmos", "3ª edição", "Rio de Janeiro", "LTC", 2010);
        cadastrarLivro("PREISS, B. R.", "Estruturas de dados e algoritmos: pradrões de projetos orientados a objeto com java", "1ª edição", "Rio de Janeiro", "Elsevier", 2000);
        cadastrarLivro("WIRTH, N.", "Algoritmos e estruturas de dados", "1ª edição", "Rio de Janeiro", "LTC", 2008);
        cadastrarLivro("CELES, W. ; CERQUEIRA, R.; RANGEL, J. L.", "Introdução a estruturas de dados com técnicas de programação em C", "1ª edição", "Rio de Janeiro", "Elsevier", 2004);
        cadastrarLivro("GUIMARÃES, Â. M.; LAGES, N. A. C.", "Algoritmos e estruturas de dados", "1ª edição", "Rio de Janeiro", "LTC", 2008);
        
        Scanner teclado = new Scanner(System.in);
        
        String opcao;

        // ANTENÇÃO, EXIBA AS INFORMAÇÕES SIMPLES DO PRIMEIRO LIVRO ANTES DE ENTRAR NO MENU
        NoLivro aux = Avaliacao02EDD.inicio;
        System.out.println("\nLIVRO ATUAL");
        imprimeNoLivroSimples(aux);
        
        do {
            System.out.print("\nINFORME A OPÇÃO DESEJADA\n"
                    + "\"a\" para avançar\n"
                    + "\"r\" para retroceder\n"
                    + "\"d\" para detalhar\n"
                    + "\"s\" para sair\n"
                    + "ESCOLHA:");
            
            opcao = teclado.nextLine();
                        
            if (opcao.equals("a")) {
                System.out.println("\nLIVRO ATUAL");
                aux = aux.getNext();
                imprimeNoLivroSimples(aux);
            } else if (opcao.equals("r")) {
                System.out.println("\nLIVRO ATUAL");
                aux = aux.getPrevious();
                imprimeNoLivroSimples(aux);
            } else if (opcao.equals("d")) {
                System.out.println("\nLIVRO ATUAL DETALHADO");
                imprimeNoLivroDetalhado(aux);
            }
            
        } while (!opcao.equals("s"));
        
    }
    
    public static void cadastrarLivro(String autor, String titulo, String edicao,
            String estado, String editora, int ano) {
        
        NoLivro NovoNoLivro;
        NovoNoLivro = new NoLivro(autor, titulo, edicao, estado, editora, ano);
        NovoNoLivro.setPrevious(null);

        if (Avaliacao02EDD.isEmpty()) {
            
            Avaliacao02EDD.inicio = NovoNoLivro;
            NovoNoLivro.setNext(Avaliacao02EDD.inicio);
            
        } else {
            
            NoLivro aux = Avaliacao02EDD.inicio;
            
            while (aux.getNext() != Avaliacao02EDD.inicio) {
                
                aux = aux.getNext();
                
            }
            
            NovoNoLivro.setPrevious(aux);
            NovoNoLivro.setNext(Avaliacao02EDD.inicio);
            aux.setNext(NovoNoLivro);
            Avaliacao02EDD.inicio.setPrevious(NovoNoLivro);
            
        }
        
    }
    
    public static void imprimeNoLivroSimples(NoLivro noLivro) {
        
        System.out.println("Autores: " + noLivro.getAutor());
        System.out.println("Título: " + noLivro.getTitulo());
        
    }
    
    public static void imprimeNoLivroDetalhado(NoLivro noLivro) {
        
        System.out.println("Autores: " + noLivro.getAutor());
        System.out.println("Título: " + noLivro.getTitulo());
        System.out.println("Edição: " + noLivro.getEdicao());
        System.out.println("Estado: " + noLivro.getEstado());
        System.out.println("Editora: " + noLivro.getEditora());
        System.out.println("Ano de publicação: " + noLivro.getAno());
        
    }
    
    public static boolean isEmpty() {
        
        return Avaliacao02EDD.inicio == null;
        
    }
}

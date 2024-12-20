package application;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Tarefa;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Tarefa> listaTarefas = new ArrayList<>();
        String resposta = "";

        System.out.println("Bem-vindo ao To Do List do Zé");
        while (resposta != "não") {
            System.out.print("Titulo da tarefa: ");
            String titulo = sc.next();
            System.out.print("Descrição: ");
            String tarefa = sc.next();
            System.out.print("Data e Hora: (DD/MM/yyy HH:mm) ");
            String dataHora = sc.next();
            

            System.out.print("Deseja continuar? ");
            resposta = sc.next();
        }

        sc.close();
    }
}

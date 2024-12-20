package entities;

import java.time.LocalDateTime;

import entities.enums.CategoriaTarefa;

public class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDateTime dataHora;
    private CategoriaTarefa categoria;
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }


    public CategoriaTarefa getCategoria() {
        return categoria;
    }
    public void setCategoria(CategoriaTarefa categoria) {
        this.categoria = categoria;
    }
    


    
    
    
}

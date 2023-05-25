package dev.android.santos.applistatarefa.model;

import androidx.annotation.NonNull;

public class Tarefa {
    private String nomeTarefa;
    private String descTarefa;
    private String dataConclusao;

    public Tarefa() {
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getDescTarefa() {
        return descTarefa;
    }

    public void setDescTarefa(String descTarefa) {
        this.descTarefa = descTarefa;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    @NonNull
    @Override
    public String toString() {
        return "Tarefa{" +
                "nomeTarefa='" + nomeTarefa + '\'' +
                ", descTarefa='" + descTarefa + '\'' +
                ", dataConclusao='" + dataConclusao + '\'' +
                '}';
    }
}

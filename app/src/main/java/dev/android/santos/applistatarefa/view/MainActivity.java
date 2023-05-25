package dev.android.santos.applistatarefa.view;

import androidx.appcompat.app.AppCompatActivity;
import dev.android.santos.applistatarefa.model.Tarefa;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import dev.android.santos.applistatarefa.R;

public class MainActivity extends AppCompatActivity {
    Tarefa tarefa;

    EditText editNomeTarefa;
    EditText editDescTarefa;
    EditText editDataConclusao;

    Button btn_Limpar;
    Button btn_Salvar;
    Button btn_Concluir;
    Button btn_Finalizar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tarefa = new Tarefa();
        tarefa.setNomeTarefa("Organização Tarefas GitHub");
        tarefa.setDescTarefa("Realizar commit de arquivos importantes curso técnico para repositórios Gits");
        tarefa.setDataConclusao("24/06/2023");

        editNomeTarefa = findViewById(R.id.editNomeTarefa);
        editDescTarefa = findViewById(R.id.editDescTarefa);
        editDataConclusao = findViewById(R.id.editDataConclusao);

        btn_Limpar = findViewById(R.id.btn_Limpar);
        btn_Salvar = findViewById(R.id.btn_Salvar);
        btn_Concluir = findViewById(R.id.btn_Concluir);
        btn_Finalizar = findViewById(R.id.btn_Finalizar);

        editNomeTarefa.setText(tarefa.getNomeTarefa());
        editDescTarefa.setText(tarefa.getDescTarefa());
        editDataConclusao.setText(tarefa.getDataConclusao());

        btn_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Dados inseridos limpados com sucesso", Toast.LENGTH_LONG).show();
                editNomeTarefa.setText("");
                editDescTarefa.setText("");
                editDataConclusao.setText("");
            }
        });

        btn_Concluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Tarefa concluída com sucesso !", Toast.LENGTH_LONG).show();
            }
        });

        btn_Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tarefa.setNomeTarefa(editNomeTarefa.getText().toString());
                tarefa.setDescTarefa(editDescTarefa.getText().toString());
                tarefa.setDataConclusao(editDataConclusao.getText().toString());

                Toast.makeText(MainActivity.this, "Dados salvos com sucesso !" + tarefa.toString(), Toast.LENGTH_LONG).show();
            }
        });

        btn_Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Programa finalizado com sucesso !", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
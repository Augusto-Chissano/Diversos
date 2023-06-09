package com.conveniencis.loja_de_conveniencis;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.CheckBox;
import android.view.LayoutInflater;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText campoNomeProduto;
    private CheckBox checkboxImportado;
    private EditText campoPrecoProduto;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNomeProduto = findViewById(R.id.campoNomeProduto);
        campoPrecoProduto = findViewById(R.id.campoPrecoProduto);
        btnSalvar = findViewById(R.id.btnSalvar);
        checkboxImportado = findViewById(R.id.checkboxImportado);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarProduto();
            }
        });
    }

    private void salvarProduto() {
        String nomeProduto = campoNomeProduto.getText().toString();
        String precoProduto = campoPrecoProduto.getText().toString();
        boolean isImportado = checkboxImportado.isChecked();

        if (nomeProduto.isEmpty()) {
            exibirMensagem("Por favor, informe o nome do produto.");
        } else if (precoProduto.isEmpty()) {
            exibirMensagem("Por favor, informe o preço do produto.");
        } else {
            String mensagem = "Dados Informados" + "\nNome do Produto: " + nomeProduto + "\nPreço do Produto: " + precoProduto;

            if (isImportado) {
                mensagem += "\nProduto Importado: Sim";
            } else {
                mensagem += "\nProduto Importado: Não";
            }
            exibirMensagem(mensagem);
        }
    }

        private void exibirMensagem(String mensagem) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.custom_toast,
                    findViewById(R.id.custom_toast_container));

            TextView text = layout.findViewById(R.id.texttoast);
            text.setText(mensagem);

            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }

}
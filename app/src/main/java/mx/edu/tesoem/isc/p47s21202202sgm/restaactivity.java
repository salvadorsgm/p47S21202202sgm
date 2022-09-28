package mx.edu.tesoem.isc.p47s21202202sgm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class restaactivity extends AppCompatActivity {
    Button regresar,resta;
    EditText txtnum1,txtnum2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaactivity);
        resta=findViewById(R.id.resta);
        regresar=findViewById(R.id.regresar);
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int lnum1 = Integer.parseInt(txtnum1.getText().toString());
                int lnum2 = Integer.parseInt(txtnum2.getText().toString());
                resultado.setText(resultado.getText().toString()+" "+ (lnum1 - lnum2));

            }
        });
    }
    }
}
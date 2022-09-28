package mx.edu.tesoem.isc.p47s21202202sgm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class dividir extends AppCompatActivity {
    Button btndivicion,btnregresa;
    EditText txnum1,Txnum2;
    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividir);
        btndivicion=findViewById(R.id.btndivicion);

        btnregresa=findViewById(R.id.btnregresa);
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        btnregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        btndivicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int txtnum1 = Integer.parseInt(txtnum1.getText().toString());
                int txtlnum2 = Integer.parseInt(txtlnum2.getText().toString());
                lblresultado.setText(lblresultado.getText().toString()+" "+ (txtnum1 / txtlnum2));

            }
        });
    }
}
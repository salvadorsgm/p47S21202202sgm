package mx.edu.tesoem.isc.p47s21202202sgm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class multiplicar extends AppCompatActivity {
    Button btnregresar,btnmultip;
    EditText txtnum1,txtnum2;
    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);
        btnmultip=findViewById(R.id.btnmultip);
        btnregresar=findViewById(R.id.btnregresar);
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        btnmultip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int lnum1 = Integer.parseInt(txtnum1.getText().toString());
                int lnum2 = Integer.parseInt(txtnum2.getText().toString());
                lblresultado.setText(lblresultado.getText().toString()+" "+ (lnum1 * lnum2));

            }
        });
    }
}
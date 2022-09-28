package mx.edu.tesoem.isc.p47s21202202sgm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sumaactivity extends AppCompatActivity {

    Button btnregresar,btnsumas;
    EditText num1,num2;
    TextView lresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumaactivity);
        btnsumas=findViewById(R.id.btnsumas);
        btnregresar=findViewById(R.id.btnreturn);
        num1 = findViewById(R.id.txtnum1);
        num2 = findViewById(R.id.txtnum2);
        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        btnsumas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int lnum1 = Integer.parseInt(num1.getText().toString());
                int lnum2 = Integer.parseInt(num2.getText().toString());
                lresultado.setText(lresultado.getText().toString()+" "+ (lnum1 + lnum2));

            }
        });
    }
}
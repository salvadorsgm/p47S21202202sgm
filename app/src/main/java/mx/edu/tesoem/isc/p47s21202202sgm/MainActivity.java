package mx.edu.tesoem.isc.p47s21202202sgm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnsuma,btnresta,btnmulti,btndivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsuma = findViewById(R.id.btnsumas);
        btnresta = findViewById(R.id.btnresta);
        btnmulti = findViewById(R.id.btnmultip);
        btndivision = findViewById(R.id.btndivision);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent psuma = new Intent(MainActivity.this,sumaactivity.class);
                startActivity(psuma);
            }

        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent presta = new Intent(MainActivity.this,restaactivity.class);
                startActivity(presta);
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pmulti = new Intent(MainActivity.this,multiplicar.class);
                startActivity(pmulti);
            }
        });
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pdividir=new Intent(MainActivity.this,dividir.class);
                startActivity(pdividir);
            }
        });
    }
}
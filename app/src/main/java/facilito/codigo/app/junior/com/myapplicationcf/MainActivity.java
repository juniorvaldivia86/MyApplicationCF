package facilito.codigo.app.junior.com.myapplicationcf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView TextViewResultdo;
    EditText EditText1IngrePesos, EditText2IngreSoles;
    Button ButtonCalcular1, ButtonCalcular2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText1IngrePesos=(EditText) findViewById(R.id.EditText1IngrePesos);
        EditText2IngreSoles=(EditText) findViewById(R.id.EditText2IngreSoles);
        TextViewResultdo=(TextView) findViewById(R.id.TextViewResultdo);
        ButtonCalcular1=(Button) findViewById(R.id.ButtonCalcular1);
        ButtonCalcular2=(Button) findViewById(R.id.ButtonCalcular2);

        ButtonCalcular1.setOnClickListener(this);
        ButtonCalcular2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        double suma;
        String resu;

        switch (v.getId()){
            case R.id.ButtonCalcular1: //Calcular pesos a soles
                String valor1=EditText1IngrePesos.getText().toString();
                int nro1=Integer.parseInt(valor1);
                suma=((nro1/15)*3.3);
                resu=String.valueOf(suma);
                TextViewResultdo.setText(resu + " En Soles");
                break;

            case R.id.ButtonCalcular2: //Calcular soles a pesos
                String valor2=EditText2IngreSoles.getText().toString();
                int nro2=Integer.parseInt(valor2);
                suma=((nro2/3.3)*15);
                resu=String.valueOf(suma);
                TextViewResultdo.setText(resu + " En Pesos");
                break;
        }
    }
}

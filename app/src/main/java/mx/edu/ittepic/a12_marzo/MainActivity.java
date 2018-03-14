package mx.edu.ittepic.a12_marzo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


        Button bt1,bt2;
        EditText et1,et2,et3,et4,et5,et6,et7,et8;
        CheckBox cb1,cb2;
        SeekBar sb;
        int auxsb,aux;



        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            bt1 = findViewById(R.id.btGuardar);
            bt2 = findViewById(R.id.btObtener);

            et1 = findViewById(R.id.etNombre);
            et2 = findViewById(R.id.etCelular);
            et3 = findViewById(R.id.etDireccion);
            et4 = findViewById(R.id.etFecha);
            et5 = findViewById(R.id.etHora1);
            et6 = findViewById(R.id.etHora2);
            et7 = findViewById(R.id.etPlatillos);
            et8 = findViewById(R.id.etPostres);

            cb1 = findViewById(R.id.cbBasica);
            cb2 = findViewById(R.id.cbLujo);

            sb = findViewById(R.id.seekbar);





            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    /**Edit text*/
                    String nombre = et1.getText().toString();
                    SharedPreferences preferences1 = getSharedPreferences("nombres", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor1 = preferences1.edit();
                    editor1.putString("nombre", nombre);
                    editor1.commit();

                    String correo = et2.getText().toString();
                    SharedPreferences preferences2 = getSharedPreferences("correos", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor2 = preferences2.edit();
                    editor2.putString("correo", correo);
                    editor2.commit();

                    String correo3 = et3.getText().toString();
                    SharedPreferences preferences3 = getSharedPreferences("correos3", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor3 = preferences3.edit();
                    editor3.putString("correo3", correo3);
                    editor3.commit();

                    String correo4 = et4.getText().toString();
                    SharedPreferences preferences4 = getSharedPreferences("correos4", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor4 = preferences4.edit();
                    editor4.putString("correo4", correo4);
                    editor4.commit();

                    String correo5 = et5.getText().toString();
                    SharedPreferences preferences5 = getSharedPreferences("correos5", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor5 = preferences5.edit();
                    editor5.putString("correo5", correo5);
                    editor5.commit();

                    String correo6 = et6.getText().toString();
                    SharedPreferences preferences6 = getSharedPreferences("correos6", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor6 = preferences6.edit();
                    editor6.putString("correo6", correo6);
                    editor6.commit();

                    String correo7 = et7.getText().toString();
                    SharedPreferences preferences7 = getSharedPreferences("correos7", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor7 = preferences7.edit();
                    editor7.putString("correo7", correo7);
                    editor7.commit();

                    String correo8 = et8.getText().toString();
                    SharedPreferences preferences8 = getSharedPreferences("correos8", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor8 = preferences8.edit();
                    editor8.putString("correo8", correo8);
                    editor8.commit();


                    SharedPreferences preferencesa = getSharedPreferences("manteleria1", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editora = preferencesa.edit();
                    editora.putBoolean("normal",  cb1.isChecked());
                    editora.commit();

                    SharedPreferences preferencesb = getSharedPreferences("manteleria2", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editorb = preferencesb.edit();
                    editorb.putBoolean("delujo",  cb2.isChecked());
                    editorb.commit();

                    SharedPreferences preferencesz = getSharedPreferences("progresos", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editorz = preferencesz.edit();
                    editorz.putInt("progreso",  auxsb);
                    editorz.commit();


                    et1.setText("");
                    et2.setText("");
                    et3.setText("");
                    et4.setText("");
                    et5.setText("");
                    et6.setText("");
                    et7.setText("");
                    et8.setText("");

                    cb1.setChecked(false);
                    cb2.setChecked(false);

                    sb.setProgress(0);


                }
            });//fin bt1


            bt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    SharedPreferences preferences1 = getSharedPreferences("nombres", Context.MODE_PRIVATE);
                    et1.setText(preferences1.getString("nombre", ""));

                    SharedPreferences preferences2 = getSharedPreferences("correos", Context.MODE_PRIVATE);
                    et2.setText(preferences2.getString("correo", ""));

                    SharedPreferences preferences3 = getSharedPreferences("correos3", Context.MODE_PRIVATE);
                    et3.setText(preferences3.getString("correo3", ""));

                    SharedPreferences preferences4 = getSharedPreferences("correos4", Context.MODE_PRIVATE);
                    et4.setText(preferences4.getString("correo4", ""));

                    SharedPreferences preferences5 = getSharedPreferences("correos5", Context.MODE_PRIVATE);
                    et5.setText(preferences5.getString("correo5", ""));

                    SharedPreferences preferences6 = getSharedPreferences("correos6", Context.MODE_PRIVATE);
                    et6.setText(preferences6.getString("correo6", ""));

                    SharedPreferences preferences7 = getSharedPreferences("correos7", Context.MODE_PRIVATE);
                    et7.setText(preferences7.getString("correo7", ""));

                    SharedPreferences preferences8 = getSharedPreferences("correos8", Context.MODE_PRIVATE);
                    et8.setText(preferences8.getString("correo8", ""));


                    SharedPreferences preferencesa = getSharedPreferences("manteleria1", Context.MODE_PRIVATE);
                    cb1.setChecked((preferencesa.getBoolean("normal", false)));

                    SharedPreferences preferencesb = getSharedPreferences("manteleria2", Context.MODE_PRIVATE);
                    cb2.setChecked((preferencesb.getBoolean("delujo", false)));

                   SharedPreferences preferencesz = getSharedPreferences("progresos", Context.MODE_PRIVATE);
                    sb.setProgress(preferencesz.getInt("progreso", 0));



                }


            });//fin on clic bt2



        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                auxsb=i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        }
}

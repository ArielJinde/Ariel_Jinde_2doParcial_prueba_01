package fisei.ariel_jinde_2doparcial_prueba_01.AHJSPrincipal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import fisei.ariel_jinde_2doparcial_prueba_01.R;


public class AHJSPrincipalMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_menu);
        /*Creamos una variable string del titulo*/
        String Title="Bienvenido a la Aplicación";
        /*Pintamos el titula de la actividad*/
        this.setTitle(Title);
       }
}
package fisei.ariel_jinde_2doparcial_prueba_01.AHJSPrincipal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import fisei.ariel_jinde_2doparcial_prueba_01.R;

public class AHJS_Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahjs_principal);
        String Title="Bienvenido a la Aplicación";
        /*Pintamos el titula de la actividad*/
        this.setTitle(Title);
        }}
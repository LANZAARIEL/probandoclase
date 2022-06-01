package com.example.estoyprobandodatbine;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.estoyprobandodatbine.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding biding;
Animation paradeo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iniciarAminacion();
        Animar();
        //setContentView(R.layout.activity_main);
        biding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(biding.getRoot());
        borrarMostrarMensaje();
    }

    private void Animar() {
paradeo.setDuration(700);
paradeo.setRepeatMode(Animation.REVERSE);
paradeo.setRepeatCount(Animation.INFINITE);
    }

    private void iniciarAminacion() {
        paradeo= AnimationUtils.loadAnimation(this,R.anim.parpadeo);
    }

    private void borrarMostrarMensaje() {

        biding.btnmostrartexto.setOnClickListener(view -> {
biding.estrella.startAnimation(paradeo);
            biding.txtmensaje.setText("Estoy trabajando con Binding");
        });
    }
}
package com.example.silvestreando2026;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvLugares = findViewById(R.id.rvLugares);

        List<Lugar> lugares = new ArrayList<>();
        lugares.add(new Lugar("El último BAile", "2015",
                "Mejor albúm del año", R.drawable.cartagena));
        lugares.add(new Lugar("Catinero", "2002",
                "Mejor albúm del año..", R.drawable.cano_cristales));
        lugares.add(new Lugar("La 9 Batalla", "2000",
                "Mejor albúm del año.", R.drawable.catedral_sal));
        lugares.add(new Lugar("Ta Malo", "2006",
                "Mejor albúm del año.", R.drawable.cocora));
        lugares.add(new Lugar("Las Locuras Mias", "1998",
                "Mejor albúm del año.", R.drawable.guatape));
        lugares.add(new Lugar("Sin Sentimiento", "2013",
                "Mejor albúm del año.", R.drawable.san_andres));

        rvLugares.setLayoutManager(new LinearLayoutManager(this));
        rvLugares.setAdapter(new LugarAdapter(lugares));
    }
}
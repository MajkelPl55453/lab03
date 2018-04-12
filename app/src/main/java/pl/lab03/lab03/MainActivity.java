package pl.lab03.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Planeta merkury = new Planeta("Merkury", "skalista", 0);
        Planeta wenus = new Planeta("Wenus", "skalista", 0);
        Planeta ziemia = new Planeta("Ziemia", "skalista", 1);
        Planeta mars = new Planeta("Mars", "skalista", 2);
        Planeta jowisz = new Planeta("Jowisz", "gazowa", 67);
        Planeta saturn = new Planeta("Saturn", "gazowa", 62);
        Planeta uran = new Planeta("Uran", "gazowo-lodowa", 27);
        Planeta neptun = new Planeta("Neptun", "gazowo-lodowa", 14);

        List<Planeta> planety = new ArrayList<>(8);
        planety.add(merkury);
        planety.add(wenus);
        planety.add(ziemia);
        planety.add(mars);
        planety.add(jowisz);
        planety.add(saturn);
        planety.add(uran);
        planety.add(neptun);

        RecyclerView rvLista = findViewById(R.id.rvLista);
        ListAdapter listAdapter = new ListAdapter(planety);
        rvLista.setAdapter(listAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(linearLayoutManager);


    }
}

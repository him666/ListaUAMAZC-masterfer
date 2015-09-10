package com.fernanda.listauamazc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//Declaro mi lista
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relleno mi arreglo
        Octocats octocats_datos[]= new Octocats[]{
            new Octocats(R.mipmap.ic_bouncer,"Bouncer"),
            new Octocats(R.mipmap.ic_dodger, "Dodger"),
            new Octocats(R.mipmap.ic_female, "Female"),
            new Octocats(R.mipmap.ic_filmtocat, "Filmtocat"),
            new Octocats(R.mipmap.ic_gracehoper, "GraceHoperCat"),
            new Octocats(R.mipmap.ic_ninja, "NinjaCat"),
            new Octocats(R.mipmap.ic_pusheen,"PusheenCat"),
            new Octocats(R.mipmap.ic_rainbow, "RainbowCat")
        };

        //Al adaptador le paso el contenido del arreglo lleno
        OctocatsAdapter adapter = new OctocatsAdapter(this,R.layout.listview_item_row,octocats_datos);

        //Me traigo mi lista y la enlazo con su vista, ademas le asigno su adaptador lleno
        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(adapter);

        //Escucho los eventos en los items (elementos de la lista)
      lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              TextView v = (TextView) view.findViewById(R.id.tv);
              Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();
              System.out.println("prueba; "+v.getText().toString());
              switch(v.getText().toString()){
                  case "Bouncer":
                      Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                      startActivity(i);
                      break;
                  case "Dodger":
                      Intent h = new Intent(getApplicationContext(), ThirdActivity.class);
                      startActivity(h);
                      break;
                  case "Female":
                      Intent j = new Intent(getApplicationContext(), FourthActivity.class);
                      startActivity(j);
                      break;
                  case "Filmtocat":
                      Intent k = new Intent(getApplicationContext(), FifthActivity.class);
                      startActivity(k);
                      break;
                  case "GraceHoperCat":
                      Intent l = new Intent(getApplicationContext(), SixthActivity.class);
                      startActivity(l);
                      break;
                  case "NinjaCat":
                      Intent m = new Intent(getApplicationContext(), SeventhActivity.class);
                      startActivity(m);
                      break;
                  case "PusheenCat":
                      Intent n = new Intent(getApplicationContext(), EightActivity.class);
                      startActivity(n);
                      break;
                  case "RainbowCat":
                      Intent o = new Intent(getApplicationContext(), NinthActivity.class);
                      startActivity(o);
                      break;

              }
          }
      });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

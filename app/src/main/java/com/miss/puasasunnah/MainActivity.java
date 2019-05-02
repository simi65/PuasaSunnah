package com.miss.puasasunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listpuasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi

        listpuasa = findViewById(R.id.listpuasa);

        listpuasa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent seninkamis = new Intent(MainActivity.this, Detail.class);
                    seninkamis.putExtra("posisi", position);
                    seninkamis.putExtra("link", "https://bersamadakwah.net/puasa-senin-kamis/");
                    startActivity(seninkamis);
                }else  if (position == 1){
                    Intent daud  = new Intent(MainActivity.this, Detail.class);
                    daud.putExtra("posisi", position);
                    daud.putExtra("link" , "https://bersamadakwah.net/puasa-daud/");
                    startActivity(daud);
                }else  if (position == 2) {
                    Intent arofah = new Intent(MainActivity.this, Detail.class);
                    arofah.putExtra("posisi", position);
                    arofah.putExtra("link", "https://id.wikipedia.org/wiki/Puasa_Arafah");
                    startActivity(arofah);
                }else  if (position == 3) {
                    Intent asysyuro = new Intent(MainActivity.this, Detail.class);
                    asysyuro.putExtra("posisi", position);
                    asysyuro.putExtra("link","https://muslim.or.id/23090-keutamaan-puasa-asyura-dan-sejarahnya.html");
                    startActivity(asysyuro);
                }else  if (position == 4) {
                    Intent ayyamul = new Intent(MainActivity.this, Detail.class);
                    ayyamul.putExtra("posisi", position);
                    ayyamul.putExtra("link", "https://muslim.or.id/17851-puasa-tiga-hari-setiap-bulan-dan-puasa-ayyamul-bidh.html");
                    startActivity(ayyamul);
                }else  if (position == 5) {
                    Intent syaban = new Intent(MainActivity.this, Detail.class);
                    syaban.putExtra("posisi", position);
                    syaban.putExtra("link", "https://muslim.or.id/15917-anjuran-puasa-syaban.html");
                    startActivity(syaban);
                }
            }
        });
    }
}

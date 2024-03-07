package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;


public class list_makan_activity extends AppCompatActivity implements MakananAdapter.ItemClickListener {

    RecyclerView rvmakanan;
    ArrayList<ModelMakanan> listmakanan;
    MakananAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_makan);
        listmakanan = new ArrayList<>();
        rvmakanan = findViewById(R.id.rvmakanan);

        ModelMakanan makan1 = new ModelMakanan();
        makan1.setNama("Ayam Geprek");
        makan1.setNo("RP 10.000");
        makan1.setImgSrc("https://png.pngtree.com/png-clipart/20230319/original/pngtree-complete-geprek-chicken-with-fresh-vegetables-png-image_8996077.png");
        listmakanan.add(makan1);

        ModelMakanan makan2 = new ModelMakanan();
        makan2.setNama("Mie Ayam");
        makan2.setNo("RP 8.000");
        makan2.setImgSrc("https://i.pinimg.com/originals/ff/ec/27/ffec272ab714af66950c66fc19202b61.png");
        listmakanan.add(makan2);

        ModelMakanan makan3 = new ModelMakanan();
        makan3.setNama("Soto");
        makan3.setNo("RP 7.000");
        makan3.setImgSrc("https://png.pngtree.com/png-clipart/20230124/ourmid/pngtree-illustration-of-chicken-egg-soup-in-a-delicious-hot-bowl-png-image_6568206.png");
        listmakanan.add(makan3);

        ModelMakanan makan4 = new ModelMakanan();
        makan4.setNama("Sate");
        makan4.setNo("RP 10.000");
        makan4.setImgSrc("https://png.pngtree.com/png-clipart/20220621/original/pngtree-sate-indonesian-grilled-chicken-png-image_8152223.png");
        listmakanan.add(makan4);

        ModelMakanan makan5 = new ModelMakanan();
        makan5.setNama("Bakso");
        makan5.setNo("RP 12.000");
        makan5.setImgSrc("https://png.pngtree.com/png-clipart/20220612/original/pngtree-meatball-bakso-png-image_7966192.png");
        listmakanan.add(makan5);

        ModelMakanan makan6 = new ModelMakanan();
        makan6.setNama("Nasi Goreng");
        makan6.setNo("RP 10.000");
        makan6.setImgSrc("https://png.pngtree.com/png-clipart/20211116/original/pngtree-nasi-goreng-kampung-seafood-png-image_6940059.png");
        listmakanan.add(makan6);

        ModelMakanan makan7 = new ModelMakanan();
        makan7.setNama("Nasi Gudeg");
        makan7.setNo("RP 20.000");
        makan7.setImgSrc("https://cdni.iconscout.com/illustration/premium/thumb/gudeg-from-indonesia-10136262-8232976.png");
        listmakanan.add(makan7);

        adapter = new MakananAdapter(this, listmakanan);
        adapter.setClickListener(this);
        rvmakanan.setLayoutManager(new LinearLayoutManager(this));
        rvmakanan.setAdapter(new MakananAdapter(getApplicationContext(),listmakanan));
        rvmakanan.setAdapter(adapter);
    }
    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position).getNama() + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}


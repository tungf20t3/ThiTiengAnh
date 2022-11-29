package com.zantung.pheptinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.zantung.pheptinh.adapter.ThiTiengAnhAdapter;
import com.zantung.pheptinh.model.ThiTiengAnh;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewThi;
    ArrayList<ThiTiengAnh> arrayThi;
    ThiTiengAnhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter = new ThiTiengAnhAdapter(this, R.layout.row_thi_tieng_anh, arrayThi);
        listViewThi.setAdapter(adapter);

        listViewThi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailThiTiengAnh.class);
                intent.putExtra("data", arrayThi.get(i));
                startActivity(intent);
            }
        });
    }

    private void AnhXa(){
        listViewThi = (ListView) findViewById(R.id.lvThi);
        arrayThi = new ArrayList<>();
        arrayThi.add(new ThiTiengAnh("Thì hiện tại đơn", "HTD"));
        arrayThi.add(new ThiTiengAnh("Thì hiện tại tiếp diễn", "HTTD"));
        arrayThi.add(new ThiTiengAnh("Thì quá khứ đơn", "QKD"));
        arrayThi.add(new ThiTiengAnh("Thì tương lai đơn", "TLD"));
        arrayThi.add(new ThiTiengAnh("Thì hiện tại hoàn thành", "HTHT"));
        arrayThi.add(new ThiTiengAnh("Thì quá khứ hoàn thành", "QKHT"));


    }
}
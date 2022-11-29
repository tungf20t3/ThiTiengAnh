package com.zantung.pheptinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.zantung.pheptinh.model.ThiTiengAnh;

import java.lang.Math;

public class DetailThiTiengAnh extends AppCompatActivity {

    EditText edtNum1;
    Button btnTinhToan;
    TextView txtIDThi, tvNho;
    String save;
    SharedPreferences sharedPreferences;
    ThiTiengAnh thiTiengAnh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_phep_tinh);



        Intent intent = getIntent();
        if (intent != null){
            thiTiengAnh = (ThiTiengAnh) intent.getSerializableExtra("data");

        }
        AnhXa();
        btnTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String viDu = edtNum1.getText().toString().trim();
                if (viDu.isEmpty()){
                    Toast.makeText(DetailThiTiengAnh.this, "Vui lòng nhập ví dụ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(DetailThiTiengAnh.this, "Nhập thành công", Toast.LENGTH_SHORT).show();
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.remove(thiTiengAnh.getId_thi());
                    save=edtNum1.getText().toString()+"\n"+ save;
                    editor.putString(thiTiengAnh.getId_thi(),save);
                    editor.commit();
                    edtNum1.setText("");
                    tvNho.setText(save);
                }

            }
        });
    }

    private void AnhXa() {
        edtNum1 = findViewById(R.id.inputNum1);
        txtIDThi = findViewById(R.id.id_thi);
        tvNho = findViewById(R.id.tvSave);
        btnTinhToan = findViewById(R.id.btnTinhToan);
        sharedPreferences = getSharedPreferences("data", MODE_PRIVATE);
        Toast.makeText(this, thiTiengAnh.getId_thi(), Toast.LENGTH_SHORT).show();

        txtIDThi.setText(thiTiengAnh.getTen_thi().toUpperCase());
       save=sharedPreferences.getString(thiTiengAnh.getId_thi(),"");
       tvNho.setText(save);

    }
}
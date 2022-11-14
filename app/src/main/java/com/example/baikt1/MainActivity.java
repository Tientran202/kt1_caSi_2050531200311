package com.example.baikt1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

public class MainActivity extends AppCompatActivity {

    Button btnDangNhap;
    TextView edtNhapTenTK,edtNhapMK;
    FirebaseFirestore firestore;
    CollectionReference caSi ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Anh xa
        btnDangNhap = (Button) findViewById(R.id.btnDangNhapdn);
        edtNhapTenTK = (EditText) findViewById(R.id.edtNhaptendndn);
        edtNhapMK=(EditText) findViewById(R.id.edtNhapMatKhaudn);

        //Khai báo
        firestore = FirebaseFirestore.getInstance();
        caSi = firestore.collection("caSi");

        //Sukien nut dangNhap
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tendn=edtNhapTenTK.getText().toString(),mkdn=edtNhapMK.getText().toString();

                if(tendn.equals("")||mkdn.equals("")){
                    Toast.makeText(MainActivity.this, "Nhập đầy đủ thông tin trước khi đăng nhâp", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent i = new Intent(MainActivity.this,TranChu.class);
                    caSi.whereEqualTo("ngheDanh", tendn)
                            .whereEqualTo("mk", mkdn)
                            .get()
                            .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                                @Override
                                public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                                    Toast.makeText(MainActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                                    startActivity(i);
                                }
                            });
                }


            }
        });
    }
}
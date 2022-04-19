package com.example.lesson8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rb_s1_jauap1, rb_s1_jauap2,rb_s1_jauap3, rb_s1_jauap4,
            rb_s2_jauap1, rb_s2_jauap2,rb_s2_jauap3, rb_s2_jauap4,
            rb_s3_jauap1, rb_s3_jauap2,rb_s3_jauap3, rb_s3_jauap4,
            rb_s4_jauap1, rb_s4_jauap2,rb_s4_jauap3, rb_s4_jauap4;
    TextView tv_surak1,tv_surak2,tv_surak3, tv_surak4;
    Button btn_tekseru;
    String [] suraktar = {"1+1=?","2+2=?","3+3=?", "4+4=?"};
    String [][] variant = {
            {"1","2","3","4"},
            {"4","3","2","5"},
            {"8","7","6","4"},
            {"10","8","9","7"},
    };
    String [] jauaptar = {"2","4","6","8"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb_s1_jauap1 = findViewById(R.id.rb_s1_jauap1);
        rb_s1_jauap2 = findViewById(R.id.rb_s1_jauap2);
        rb_s1_jauap3 = findViewById(R.id.rb_s1_jauap3);
        rb_s1_jauap4 = findViewById(R.id.rb_s1_jauap4);

        rb_s2_jauap1 = findViewById(R.id.rb_s2_jauap1);
        rb_s2_jauap2 = findViewById(R.id.rb_s2_jauap2);
        rb_s2_jauap3 = findViewById(R.id.rb_s2_jauap3);
        rb_s2_jauap4 = findViewById(R.id.rb_s2_jauap4);

        rb_s3_jauap1 = findViewById(R.id.rb_s3_jauap1);
        rb_s3_jauap2 = findViewById(R.id.rb_s3_jauap2);
        rb_s3_jauap3 = findViewById(R.id.rb_s3_jauap3);
        rb_s3_jauap4 = findViewById(R.id.rb_s3_jauap4);

        rb_s4_jauap1 = findViewById(R.id.rb_s4_jauap1);
        rb_s4_jauap2 = findViewById(R.id.rb_s4_jauap2);
        rb_s4_jauap3 = findViewById(R.id.rb_s4_jauap3);
        rb_s4_jauap4 = findViewById(R.id.rb_s4_jauap4);

        tv_surak1 = findViewById(R.id.tv_Suraq1);
        tv_surak2 = findViewById(R.id.tv_Suraq2);
        tv_surak3 = findViewById(R.id.tv_Suraq3);
        tv_surak4 = findViewById(R.id.tv_Suraq4);

        btn_tekseru = findViewById(R.id.btn_tekseru);
        suraktarJinau();

        btn_tekseru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tekseris(tv_surak1,rb_s1_jauap1,rb_s1_jauap2,rb_s1_jauap3,rb_s1_jauap4,0);
                tekseris(tv_surak2,rb_s2_jauap1,rb_s2_jauap2,rb_s2_jauap3,rb_s2_jauap4,1);
                tekseris(tv_surak3,rb_s3_jauap1,rb_s3_jauap2,rb_s3_jauap3,rb_s3_jauap4,2);
                tekseris(tv_surak4,rb_s4_jauap1,rb_s4_jauap2,rb_s4_jauap3,rb_s4_jauap4,3);
            }
        });

    }
    public void tekseris(TextView tv_surak, RadioButton rb1, RadioButton rb2,RadioButton rb3, RadioButton rb4, int index){
        if(rb1.isChecked()&&rb1.getText().toString().equals(jauaptar[index])){
            tv_surak.setText(suraktar[index]+"\nDurys");
            tv_surak.setTextColor(getResources().getColor(R.color.purple_500));
        }
        else if(rb2.isChecked()&&rb2.getText().toString().equals(jauaptar[index])){
            tv_surak.setText(suraktar[index]+"\nDurys");
            tv_surak.setTextColor(getResources().getColor(R.color.purple_500));
        }
        else if(rb3.isChecked()&&rb3.getText().toString().equals(jauaptar[index])){
            tv_surak.setText(suraktar[index]+"\nDurys");
            tv_surak.setTextColor(getResources().getColor(R.color.purple_500));
        }
        else if(rb4.isChecked()&&rb4.getText().toString().equals(jauaptar[index])){
            tv_surak.setText(suraktar[index]+"\nDurys");
            tv_surak.setTextColor(getResources().getColor(R.color.purple_500));
        }
        else{
            tv_surak.setText(suraktar[index]+"\nKate");
            tv_surak.setTextColor(getResources().getColor(R.color.purple_500));

        }
    }


    public void suraktarJinau(){
        tv_surak1.setText(suraktar[0]);
        rb_s1_jauap1.setText(variant[0][0]);
        rb_s1_jauap2.setText(variant[0][1]);
        rb_s1_jauap3.setText(variant[0][2]);
        rb_s1_jauap4.setText(variant[0][3]);

        tv_surak2.setText(suraktar[1]);
        rb_s2_jauap1.setText(variant[1][0]);
        rb_s2_jauap2.setText(variant[1][1]);
        rb_s2_jauap3.setText(variant[1][2]);
        rb_s2_jauap4.setText(variant[1][3]);

        tv_surak3.setText(suraktar[2]);
        rb_s3_jauap1.setText(variant[2][0]);
        rb_s3_jauap2.setText(variant[2][1]);
        rb_s3_jauap3.setText(variant[2][2]);
        rb_s3_jauap4.setText(variant[2][3]);

        tv_surak4.setText(suraktar[3]);
        rb_s4_jauap1.setText(variant[3][0]);
        rb_s4_jauap2.setText(variant[3][1]);
        rb_s4_jauap3.setText(variant[3][2]);
        rb_s4_jauap4.setText(variant[3][3]);


    }
}
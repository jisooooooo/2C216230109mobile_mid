package myapplication1.tabbed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final CheckBox checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        final CheckBox checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        final CheckBox checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        final CheckBox checkBox4 = (CheckBox)findViewById(R.id.checkBox4);
        final CheckBox checkBox5 = (CheckBox)findViewById(R.id.checkBox5);
        final CheckBox checkBox6 = (CheckBox)findViewById(R.id.checkBox6);



        final TextView textView= (TextView)findViewById(R.id.textView3);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                String result = "";  // 결과를 출력할 문자열  ,  항상 스트링은 빈문자열로 초기화 하는 습관을 가지자
                if(checkBox1.isChecked() == true) result += checkBox1.getText().toString();
                if(checkBox2.isChecked() == true) result += checkBox2.getText().toString();
                if(checkBox3.isChecked() == true) result += checkBox3.getText().toString();
                if(checkBox4.isChecked() == true) result += checkBox4.getText().toString();
                if(checkBox5.isChecked() == true) result += checkBox5.getText().toString();
                if(checkBox6.isChecked() == true) result += checkBox6.getText().toString();
                textView.setText("선택결과:" + result);


            }
        });
    }
    public void onBackButtonClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }}

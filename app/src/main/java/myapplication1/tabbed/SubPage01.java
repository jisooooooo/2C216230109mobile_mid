package myapplication1.tabbed;

/**
 * Created by 22292 on 2017-10-17.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;



//////////
public class SubPage01 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_sub_page01, container, false);
        return view;
    }
}



//public class SubPage01 extends Fragment {
//
//
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//
//        View view = inflater.inflate(R.layout.fragment_sub_page01, container, false);
//        final CheckBox checkBox1 = (CheckBox)view.findViewById(R.id.checkBox1);
//        final CheckBox checkBox2 = (CheckBox)view.findViewById(R.id.checkBox2);
//        final CheckBox checkBox3 = (CheckBox)view.findViewById(R.id.checkBox3);
//        final CheckBox checkBox4 = (CheckBox)view.findViewById(R.id.checkBox4);
//        final CheckBox checkBox5 = (CheckBox)view.findViewById(R.id.checkBox5);
//        final CheckBox checkBox6 = (CheckBox)view.findViewById(R.id.checkBox6);
//
//
//
//        final TextView textView= (TextView)getView().findViewById(R.id.textView3);
//
//        final Button button = (Button) view.findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener(){
//
//            public void onClick(View v){
//                String result = "";  // 결과를 출력할 문자열  ,  항상 스트링은 빈문자열로 초기화 하는 습관을 가지자
//                if(checkBox1.isChecked() == true) result += checkBox1.getText().toString();
//                if(checkBox2.isChecked() == true) result += checkBox2.getText().toString();
//                if(checkBox3.isChecked() == true) result += checkBox3.getText().toString();
//                if(checkBox4.isChecked() == true) result += checkBox4.getText().toString();
//                if(checkBox5.isChecked() == true) result += checkBox5.getText().toString();
//                if(checkBox6.isChecked() == true) result += checkBox6.getText().toString();
//                textView.setText("선택결과:" + result);
//
//
//            }
//        });
//        return view;
//    }
//}

package myapplication1.tabbed;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by 22292 on 2017-10-17.
 */

public class SubPage02 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_sub_page02, container, false);

        final Button button = (Button) view.findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                onButton2Clicked(v);
            }
        });
        return view;
    }

    public void onButton2Clicked(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hywoman.ac.kr/"));
        startActivity(myIntent);
    }
}

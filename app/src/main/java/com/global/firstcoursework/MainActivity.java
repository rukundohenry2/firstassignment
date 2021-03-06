package com.global.firstcoursework;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    Button button1;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    TextView txt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.but);
        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        txt4 = (TextView) findViewById(R.id.txt4);
        txt5 = (TextView) findViewById(R.id.txt5);
        txt6 = (TextView) findViewById(R.id.txt6);

//        button1.setOnClickListener(this);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txt1.setText("Computer and network security");
                txt2.setText("Data and Communications networks");
                txt3.setText("Entrepreneurship");
                txt4.setText("Mobile programming");
                txt5.setText("Artificial intelligence");
                txt6.setText("Automata, Complexity and Computability");
            }
        });
    }

//    @Override
//    public void onClick(View v) {
//        if(v.getId()==R.id.but){
//            txt1.setText("Computer and network security");
//            txt2.setText("Data and Communications networks");
//            txt3.setText("Entrepreneurship");
//            txt4.setText("Mobile programming");
//            txt5.setText("Artificial intelligence");
//            txt6.setText("Automata, Complexity and Computability");
//        }
//    }
}
//public class MainActivity extends Activity {
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        final TextView helloTextView = (TextView) findViewById(R.id.text_view_id);
//        helloTextView.setText(R.string.user_greeting);
//    }
//}
//public class MyActivity extends Activity {
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.content_layout_id);
//
//        final Button button = findViewById(R.id.button_id);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Code here executes on main thread after user presses button
//            }
//        });
//    }
//}
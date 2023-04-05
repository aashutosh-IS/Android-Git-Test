package com.example.loginform2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String identifierForPrint = "BCA";
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        if (savedInstanceState == null) {
//            // Let's first dynamically add a fragment into a frame container
//            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//            BlankFragment fragmentDemo = new BlankFragment();
//            ft.replace(R.id.your_placeholder, fragmentDemo);
//            ft.commit();
//        }
        button = findViewById(R.id.btn_login);
        EditText et= findViewById(R.id.et_email);
        Log.d(identifierForPrint, "onCreate: ");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String etText= et.getText().toString();
                Log.d("ET", "onClick: "+ etText.contains("@gmail.com"));
//                Intent i = new Intent(MainActivity.this,SecondActivity.class);
//                i.putExtra("key","THIS IS THE VALUE FROM ACTIVITY 1");
//                startActivity(i);
            }
        });
    }
//    protected void setFragment() {
//        // Begin the transaction
//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        // Replace the contents of the container with the new fragment
//        ft.replace(R.id.your_placeholder, new BlankFragment());
//        // or ft.add(R.id.your_placeholder, new ABCFragment());
//        // Complete the changes added above
//        ft.commit();
//    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(identifierForPrint, "onStart: ");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(identifierForPrint, "onResume: ");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(identifierForPrint, "onPause: ");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(identifierForPrint, "onRestart: ");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(identifierForPrint, "onStop: ");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(identifierForPrint, "onDestroy: ");

    }
}
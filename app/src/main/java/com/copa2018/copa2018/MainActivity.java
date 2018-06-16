package com.copa2018.copa2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Noticias button */
    public void verNoticias(View view) {
        Intent intent = new Intent(this, DisplayNoticiasActivity.class);
        //Button btn = findViewById(R.id.btnNoticias);
        //String btnText = (String) btn.getText();
        //intent.putExtra(EXTRA_MESSAGE, btnText);
        startActivity(intent);
    }


}
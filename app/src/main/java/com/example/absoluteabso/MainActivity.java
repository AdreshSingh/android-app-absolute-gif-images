package com.example.absoluteabso;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView wallpaper;
    EditText nameBox,passwdBox;
    Button loginButton;
    private static final String password = "oxford";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wallpaper = findViewById(R.id.myGifs);
        nameBox = findViewById(R.id.personName);
        passwdBox = findViewById(R.id.personPassword);
        loginButton = findViewById(R.id.containedButton);

        Glide.with(MainActivity.this).load(R.drawable.rainning).into(wallpaper);
        loginButton.setOnClickListener(view -> {
            if (password.equals(passwdBox.getText().toString())){
                Glide.with(MainActivity.this).load(R.drawable.ky).into(wallpaper);
                Toast.makeText(MainActivity.this, "Good to go 🚀", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(MainActivity.this, "Try again 😝", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
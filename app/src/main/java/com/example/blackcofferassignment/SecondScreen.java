package com.example.blackcofferassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class SecondScreen extends AppCompatActivity {

    TextView name, details, height, lookF, about;

    ImageButton photo,video,files,like;

    ShapeableImageView dp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        name = findViewById(R.id.personName);
        details = findViewById(R.id.personDetails);
        height = findViewById(R.id.personHeight);
        lookF = findViewById(R.id.personLookingFor);
        about = findViewById(R.id.personAbout);

        photo = findViewById(R.id.photo_btn);
        video = findViewById(R.id.video_btn);
        files = findViewById(R.id.file_btn);
        like = findViewById(R.id.likeButton);

        dp = findViewById(R.id.profilePic);

        ArrayList<Person> personArrayList = new ArrayList<>();

        Person p1 = new Person("Alex Johnson","Gemini|21|Single","5'7 Ft","21-23 yo female for casual dating",
                "If you have good energy and like to have fun, then send me a message. You don't have to enjoy all the same things I do, but it'd be great if you were willing to try them out.");


        name.setText(p1.getName());
        details.setText(p1.getDetails());
        height.setText("Height:"+p1.getHeight());
        lookF.setText("Looking for"+p1.getLookingFor());
        about.setText(p1.getAbout());

        dp.setImageResource(R.drawable.boy);

        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),photo.class);
                startActivity(i);
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),video.class);
                startActivity(i);
            }
        });

        files.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),files.class);
                startActivity(i);
            }
        });

    like.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(SecondScreen.this, "You liked this person", Toast.LENGTH_SHORT).show();
        }
    });


    }
}
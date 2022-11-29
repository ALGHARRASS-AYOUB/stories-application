package com.example.stories_application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView story,title;
    ImageView story_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    story=findViewById(R.id.story_text);
    story_image=findViewById(R.id.image_story);
    title=findViewById(R.id.title_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.stories_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.story1:
                story.setText(getResources().getString(R.string.story1));
                title.setText(getResources().getString(R.string.story1_title));
                story_image.setImageDrawable(getDrawable(R.drawable.sindibad));
                return true;
            case R.id.story2:

                story.setText(getResources().getString(R.string.story2));
                title.setText(getResources().getString(R.string.story2_title));
                story_image.setImageDrawable(getDrawable(R.drawable.sindibad));
                return true;
            case R.id.story3:

                story.setText(getResources().getString(R.string.story3));
                title.setText(getResources().getString(R.string.story3_title));
                story_image.setImageDrawable(getDrawable(R.drawable.sindibad));
                return true;
            case R.id.story4:

                story.setText(getResources().getString(R.string.story4));
                title.setText(getResources().getString(R.string.story4_title));
                story_image.setImageDrawable(getDrawable(R.drawable.sindibad));
                return true;
            case R.id.story5:

                story.setText(getResources().getString(R.string.story5));
                title.setText(getResources().getString(R.string.story5_title));
                story_image.setImageDrawable(getDrawable(R.drawable.sindibad));
                return true;
            default:
        }
        return true;
    }


}
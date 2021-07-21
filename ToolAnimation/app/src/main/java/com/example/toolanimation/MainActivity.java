package com.example.toolanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mAnimationImage;
    boolean click = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAnimationImage = (ImageView) findViewById(R.id.imageAnimationId);
    }

    public void animationClick(View view) {
        if (click) {
            mAnimationImage.setImageResource(R.drawable.avd_anim_pause_to_play);
            AnimatedVectorDrawable animatedClose = (AnimatedVectorDrawable) mAnimationImage.getDrawable();
            animatedClose.start();
            click = false;
        } else {
            mAnimationImage.setImageResource(R.drawable.avd_anim_play_to_pause2);
            AnimatedVectorDrawable animatedClose = (AnimatedVectorDrawable) mAnimationImage.getDrawable();
            animatedClose.start();
            click = true;
        }

    }
}
package com.example.salvadorgonzales.multimedia;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //para el video local
        VideoView i = (VideoView)findViewById(R.id.videoV);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(i);
        i.setMediaController(mediaController);

        String uriPath="android.resource://"+getPackageName()+"/"+R.raw.oasis;
        Uri uri=Uri.parse(uriPath);
        i.setVideoURI(uri);
        i.requestFocus();
        i.start();

        /* para el video de internet

        VideoView videoView = (VideoView) findViewById(R.id.videoV);
        videoView.setVideoPath("http://www.ebookfrenzy.com/android_book/movie.mp4");
        videoView.requestFocus();
        videoView.start();*/



    }

}

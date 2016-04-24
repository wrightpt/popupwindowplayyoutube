package com.example.c.myapplication1;

import android.app.Service;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by c on 4/23/16.
 */
public class VideoviewService extends Service {


    @Override
    public void onCreate() {
        super.onCreate();

        WindowManager windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);

        //chatHead = new ImageView(this);

       // chatHead.setImageResource(R.drawable.floating);

        final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_PHONE,
               // WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
                PixelFormat.TRANSLUCENT);

      //  params.gravity = Gravity.TOP | Gravity.LEFT;
     //   params.x = 0;
     //   params.y = 100;

        LayoutInflater li = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
       View mTopView =  li.inflate(R.layout.videoviewlayout, null);
        VideoView videoView =
                (VideoView) mTopView.findViewById(R.id.videoview);
        String vidAddress = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
        Uri vidUri = Uri.parse(vidAddress);
        videoView.setVideoURI(vidUri);


        windowManager.addView(mTopView, params);
        videoView.start();
       // MediaController vidControl = new MediaController(this);

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

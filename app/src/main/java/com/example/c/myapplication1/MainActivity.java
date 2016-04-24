package com.example.c.myapplication1;

import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import com.devbrackets.android.exomedia.EMVideoView;

public class MainActivity extends AppCompatActivity {

   /// RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        assert fab != null;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // createFloatView();

                //WindowManager.LayoutParams mWindowParams = new WindowManager.LayoutParams();
//                mWindowParams.x = 0;
             //   mWindowParams.y = 100;

            //    mWindowParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
             //   mWindowParams.width = WindowManager.LayoutParams.WRAP_CONTENT | mWindowParams.TYPE_SYSTEM_ALERT,
            //            | WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
            //            | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
            //            | WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
            //            | WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS;
             //  mWindowParams.format = PixelFormat.TRANSLUCENT;
             //   mWindowParams.windowAnimations = 0;



             //   WindowManager windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
             //   LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
             //   View v = findViewById(layou.exoplayertest);

              //  windowManager.addView(v,mWindowParams);


                startService(new Intent(MainActivity.this, VideoviewService.class));





              //  Uri vidUri = Uri.parse(vidAddress);





                //videoView.setVideoURI(vidUri);

                //Uri video = Uri.parse(  "http://www.androidbegin.com/tutorial/AndroidCommercial.3gp");

                // videoView.setVideoPath(
                //      "http://www.ebookfrenzy.com/android_book/movie.mp4");




                //init();


            }
        });
    }

    public void createFloatView()
    {


      //  emVideoView.setVideoURI(Uri.parse("https://archive.org/download/Popeye_forPresident/Popeye_forPresident_512kb.mp4"));
       // Button btn_floatView = (Button)findViewById(R.id.thisbutton);
      //  btn_floatView = new Button(getApplicationContext());
       // btn_floatView.setText("Suspension window");

        final WindowManager wm = (WindowManager) getApplicationContext().getSystemService(
                Context.WINDOW_SERVICE);
        final WindowManager.LayoutParams params = new WindowManager.LayoutParams();

        // Set window type
        params.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;
        /*
         * If set to params.type = WindowManager.LayoutParams.TYPE_PHONE; then the priority will reduce the number of,
         * Pull down the notification bar is not visible
         */

        params.format = PixelFormat.RGBA_8888; // Format picture effect, as the background transparent

        // Set Window flag
        params.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
                | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        /*
         * The flags attribute the effect is “ &rdquo lock;. Suspended window can not touch, do not accept any event, at the same time does not affect the next incident response.
         * wmParams.flags=LayoutParams.FLAG_NOT_TOUCH_MODAL |
         * LayoutParams.FLAG_NOT_FOCUSABLE | LayoutParams.FLAG_NOT_TOUCHABLE;
         */

        // Floating window was wide
        params.width = 100;
        params.height = 100;

        // Touch monitor for floating window

        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.exoplayertest,null);

        //final Button finalBtn_floatView = btn_floatView;
     //  emVideoView.setOnTouchListener(new View.OnTouchListener()
     //   {
        //    int lastX, lastY;
         //   int paramX, paramY;

         //   public boolean onTouch(View v, MotionEvent event)
        //    {
              //  switch (event.getAction())
            //    {
            //        case MotionEvent.ACTION_DOWN:
            //            lastX = (int) event.getRawX();
            //            lastY = (int) event.getRawY();
            //            paramX = params.x;
             //           paramY = params.y;
             //           break;
            //        case MotionEvent.ACTION_MOVE:
            //            int dx = (int) event.getRawX() - lastX;
              //          int dy = (int) event.getRawY() - lastY;
              //          params.x = paramX + dx;
              //          params.y = paramY + dy;
                        // Update suspended window position
                //        wm.updateViewLayout(emVideoView, params);
               //         break;
              //  }
               // return true;
          //  }
      //  });

        //wm.addView(emVideoView, params);
        //isAdded = true;
        wm.addView(v, params);
        //init();
      //  final EMVideoView emVideoView = (EMVideoView)findViewById(R.id.video_play_activity_video_view);
      //  emVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
         //   @Override
        //    public void onPrepared(MediaPlayer mp) {
          //       emVideoView.start();
         //   }
       // });
       // emVideoView.setVideoURI(Uri.parse("https://archive.org/download/Popeye_forPresident/Popeye_forPresident_512kb.mp4"));
        //wm.addView(emVideoView, params);
      //  emVideoView.start();


    }

    public void init(){
       // VideoView videoView =
            //    (VideoView) findViewById(R.id.videoview);

      //  String vidAddress = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
     //   Uri vidUri = Uri.parse(vidAddress);

      //  videoView.setVideoURI(vidUri);

      //videoView.setVideoURI(vidUri);

      //Uri video = Uri.parse(  "http://www.androidbegin.com/tutorial/AndroidCommercial.3gp");

       // videoView.setVideoPath(
          //      "http://www.ebookfrenzy.com/android_book/movie.mp4");

      //  videoView.start();
        // videoView.setVideoURI(video);

    }

    private void setupVideoView() {
        final EMVideoView emVideoView = (EMVideoView)findViewById(R.id.video_play_activity_video_view);
        assert emVideoView != null;
        emVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                emVideoView.start();
            }
        });

        //For now we just picked an arbitrary item to play.  More can be found at
        //https://archive.org/details/more_animation
        emVideoView.setVideoURI(Uri.parse("https://archive.org/download/Popeye_forPresident/Popeye_forPresident_512kb.mp4"));
    }

    //public void checkDrawOverlayPermission() {
    //    if (!Settings.canDrawOverlays(Context))   canDrawOverlays(Context)) {
    //        Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
    //                Uri.parse("package:" + getPackageName()));
    //        startActivityForResult(intent, REQUEST_CODE);
    //    }
   // }

   // @Override
  //  protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
  //      if (requestCode == REQUEST_CODE) {
   //         if (Settings.canDrawOverlays(this)) {
                // continue here - permission was granted
     //       }
    //    }
  //  }

   // @Override
   // public void onPrepared(MediaPlayer mp) {
        //Starts the video playback as soon as it is ready
   //     emVideoView.start();
   // }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

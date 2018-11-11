package my.com.fortnite.fortnitesoundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class Daequan extends AppCompatActivity {
    MediaPlayer mPlayer, mPlayer2, mPlayer3, mPlayer4, mPlayer5, mPlayer6, mPlayer7, mPlayer8, mPlayer9, mPlayer10, mPlayer11,
                mPlayer12, mPlayer13, mPlayer14, mPlayer15, mPlayer16, mPlayer17, mPlayer18, mPlayer19;
      static int posNumber3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_items);

        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new DaequanAdapter(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView parent, View view,
                                    int position, long id) {

                switch (position) {
                    case 0:
                        mPlayer = MediaPlayer.create(Daequan.this, R.raw.daequan_what_do_you_mean);
                        mPlayer.start();

                        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer.release();
                            }
                        });

                        break;
                    case 1:
                        mPlayer2 = MediaPlayer.create(Daequan.this, R.raw.daequan_come_here_boy);
                        mPlayer2.start();

                        mPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer2.release();
                            }
                        });

                        break;
                    case 2:
                        mPlayer3 = MediaPlayer.create(Daequan.this, R.raw.daequan_gimme_that_head);
                        mPlayer3.start();  

                        mPlayer3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer3.release();
                            }
                        });

                        break;

                    case 3:
                        mPlayer4 = MediaPlayer.create(Daequan.this, R.raw.daequan_ooo_please_game);

                        mPlayer4.start();  

                        mPlayer4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer4.release();
                            }
                        });
                        break;

                    case 4:
                        mPlayer5 = MediaPlayer.create(Daequan.this, R.raw.daequan_reeeeeee);

                        mPlayer5.start();  

                        mPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer5.release();
                            }
                        });

                        break;
                    case 5:
                        mPlayer6 = MediaPlayer.create(Daequan.this, R.raw.daequan_this_games_trash);

                        mPlayer6.start();  

                        mPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer6.release();
                            }
                        });

                        break;
                    case 6:
                        mPlayer7 = MediaPlayer.create(Daequan.this, R.raw.daequan_doodoo);

                        mPlayer7.start();  

                        mPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer7.release();
                            }
                        });

                        break;
                    case 7:
                        mPlayer8 = MediaPlayer.create(Daequan.this, R.raw.daequan_get_off_my_server);

                        mPlayer8.start();  

                        mPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer8.release();
                            }
                        });
                        break;
                    case 8:
                        mPlayer9 = MediaPlayer.create(Daequan.this, R.raw.daequan_this_game_doodoo);

                        mPlayer9.start();  

                        mPlayer9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer9.release();
                            }
                        });

                        break;
                    case 9:
                        mPlayer10 = MediaPlayer.create(Daequan.this, R.raw.daequan_im_comin_for_that_booty);

                        mPlayer10.start();  

                        mPlayer10.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer10.release();
                            }
                        });

                        break;
                    case 10:
                        mPlayer11= MediaPlayer.create(Daequan.this, R.raw.daequan_get_outta_my_game_kid);

                        mPlayer11.start();  

                        mPlayer11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer11.release();
                            }
                        });

                        break;
                    case 11:
                        mPlayer12 = MediaPlayer.create(Daequan.this, R.raw.daequan_get_outta_my_face_boy);

                        mPlayer12.start();  

                        mPlayer12.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer12.release();
                            }
                        });

                        break;
                    case 12:
                        mPlayer13 = MediaPlayer.create(Daequan.this, R.raw.daequan_cackling_laugh);

                        mPlayer13.start();  

                        mPlayer13.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer13.release();
                            }
                        });

                        break;
                    case 13:
                        mPlayer14 = MediaPlayer.create(Daequan.this, R.raw.daequan_alooloolool);

                        mPlayer14.start();  

                        mPlayer14.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer14.release();
                            }
                        });

                        break;
                    case 14:
                        mPlayer15 = MediaPlayer.create(Daequan.this, R.raw.daequan_ooo_what);

                        mPlayer15.start();  

                        mPlayer15.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer15.release();
                            }
                        });

                        break;
                    case 15:
                        mPlayer16 = MediaPlayer.create(Daequan.this, R.raw.daequan_what_are_you_talking_about);

                        mPlayer16.start();  

                        mPlayer16.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer15.release();
                            }
                        });

                        break;
                    case 16:
                        mPlayer17 = MediaPlayer.create(Daequan.this, R.raw.daequan_hey_brother_how_you_doin);

                        mPlayer17.start();  

                        mPlayer17.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer17.release();
                            }
                        });

                        break;
                    case 17:
                        mPlayer18 = MediaPlayer.create(Daequan.this, R.raw.daequan_where_you_going_boy);

                        mPlayer18.start();  

                        mPlayer18.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer18.release();
                            }
                        });

                        break;
                    case 18:
                        mPlayer19 = MediaPlayer.create(Daequan.this, R.raw.daequan_myth_impression);
                        mPlayer19.start();  

                        mPlayer19.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer19.release();
                            }
                        });

                        break;

                }

            }
        });
        

        gridview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
                                           final int position, long id) {
                posNumber3 = position + 1;
                startActivity(new Intent(Daequan.this, Pop.class));
                return true;
            }
        });
    }
}








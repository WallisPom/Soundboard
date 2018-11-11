package my.com.fortnite.fortnitesoundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class Tim extends AppCompatActivity {
    MediaPlayer mPlayer, mPlayer2, mPlayer3, mPlayer4, mPlayer5, mPlayer6, mPlayer7, mPlayer8, mPlayer9, mPlayer10;
    static int posNumber4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_items);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new TimAdapter(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        mPlayer = MediaPlayer.create(Tim.this, R.raw.tim);
                        mPlayer.start();   


                        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer.release();
                            }
                        });

                        break;
                    case 1:
                        mPlayer2 = MediaPlayer.create(Tim.this, R.raw.tim_omg);
                        mPlayer2.start();

                        mPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer2.release();
                            }
                        });

                        break;
                    case 2:
                        mPlayer3 = MediaPlayer.create(Tim.this, R.raw.tim_afk);
                        mPlayer3.start();  

                        mPlayer3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer3.release();
                            }
                        });

                        break;

                    case 3:
                        mPlayer4 = MediaPlayer.create(Tim.this, R.raw.tim_carry_is_here);

                        mPlayer4.start();  

                        mPlayer4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer4.release();
                            }
                        });
                        break;

                    case 4:
                        mPlayer5 = MediaPlayer.create(Tim.this, R.raw.tim_awful);

                        mPlayer5.start();  

                        mPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer5.release();
                            }
                        });

                        break;
                    case 5:
                        mPlayer6 = MediaPlayer.create(Tim.this, R.raw.tim_skrr_skrr);

                        mPlayer6.start();  

                        mPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer6.release();
                            }
                        });

                        break;
                    case 6:
                        mPlayer7 = MediaPlayer.create(Tim.this, R.raw.tim_smorc);

                        mPlayer7.start();  

                        mPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer7.release();
                            }
                        });

                        break;
                    case 7:
                        mPlayer8 = MediaPlayer.create(Tim.this, R.raw.tim_hobbit);

                        mPlayer8.start();  

                        mPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer8.release();
                            }
                        });
                        break;
                    case 8:
                        mPlayer9 = MediaPlayer.create(Tim.this, R.raw.tim_ahhhh);

                        mPlayer9.start();  

                        mPlayer9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer9.release();
                            }
                        });

                        break;
                    case 9:
                        mPlayer10 = MediaPlayer.create(Tim.this, R.raw.tim_pizza);

                        mPlayer10.start();  

                        mPlayer10.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer10.release();
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
                posNumber4 = position + 1;
                startActivity(new Intent(Tim.this, Pop.class));
                return true;
            }
        });
    }
}


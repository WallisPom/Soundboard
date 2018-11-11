package my.com.fortnite.fortnitesoundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class Ninja extends AppCompatActivity {
    MediaPlayer mPlayer, mPlayer2, mPlayer3, mPlayer4, mPlayer5, mPlayer6, mPlayer7, mPlayer8, mPlayer9, mPlayer10, mPlayer11,
            mPlayer12, mPlayer13, mPlayer14, mPlayer15;
    static int posNumber1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_items);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new NinjaAdapter(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        mPlayer = MediaPlayer.create(Ninja.this, R.raw.ninja_im_dr_lupo);
                        mPlayer.start();  // This will make sound

                        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer.release();
                            }
                        });

                        break;
                    case 1:
                        mPlayer2 = MediaPlayer.create(Ninja.this, R.raw.ninja_llama);
                        mPlayer2.start();

                        mPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer2.release();
                            }
                        });

                        break;
                    case 2:
                        mPlayer3 = MediaPlayer.create(Ninja.this, R.raw.ninja_later_baby);
                        mPlayer3.start();

                        mPlayer3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer3.release();
                            }
                        });

                        break;

                    case 3:
                        mPlayer4 = MediaPlayer.create(Ninja.this, R.raw.ninja_great_game);

                        mPlayer4.start();

                        mPlayer4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer4.release();
                            }
                        });
                        break;

                    case 4:
                        mPlayer5 = MediaPlayer.create(Ninja.this, R.raw.ninja_ahh);

                        mPlayer5.start();

                        mPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer5.release();
                            }
                        });

                        break;
                    case 5:
                        mPlayer6 = MediaPlayer.create(Ninja.this, R.raw.ninja_uhh_i_can_explain);

                        mPlayer6.start();

                        mPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer6.release();
                            }
                        });

                        break;
                    case 6:
                        mPlayer7 = MediaPlayer.create(Ninja.this, R.raw.ninja_keemstar_impression);

                        mPlayer7.start();

                        mPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer7.release();
                            }
                        });

                        break;
                    case 7:
                        mPlayer8 = MediaPlayer.create(Ninja.this, R.raw.ninja_lee_carter_impression);

                        mPlayer8.start();

                        mPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer8.release();
                            }
                        });
                        break;
                    case 8:
                        mPlayer9 = MediaPlayer.create(Ninja.this, R.raw.ninja_tim_impression);

                        mPlayer9.start();

                        mPlayer9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer9.release();
                            }
                        });

                        break;
                    case 9:
                        mPlayer10 = MediaPlayer.create(Ninja.this, R.raw.ninja_pentakill);

                        mPlayer10.start();

                        mPlayer10.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer10.release();
                            }
                        });

                        break;
                    case 10:
                        mPlayer11= MediaPlayer.create(Ninja.this, R.raw.ninja_de_wae);

                        mPlayer11.start();

                        mPlayer11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer11.release();
                            }
                        });

                        break;
                    case 11:
                        mPlayer12 = MediaPlayer.create(Ninja.this, R.raw.ninja_keep_the_change);

                        mPlayer12.start();

                        mPlayer12.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer12.release();
                            }
                        });

                        break;
                    case 12:
                        mPlayer13 = MediaPlayer.create(Ninja.this, R.raw.ninja_lets_go_baby);

                        mPlayer13.start();

                        mPlayer13.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer13.release();
                            }
                        });

                        break;
                    case 13:
                        mPlayer14 = MediaPlayer.create(Ninja.this, R.raw.ninja_gimme_that_gold);

                        mPlayer14.start();

                        mPlayer14.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer14.release();
                            }
                        });

                        break;
                    case 14:
                        mPlayer15 = MediaPlayer.create(Ninja.this, R.raw.ninja_losers_bracket);

                        mPlayer15.start();

                        mPlayer15.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mPlayer15.release();
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
                posNumber1 = position + 1;
                startActivity(new Intent(Ninja.this, Pop.class));
                return true;
            }
        });
    }
}


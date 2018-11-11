package my.com.fortnite.fortnitesoundboard;

import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Pop extends AppCompatActivity {

    int a = Ninja.posNumber1;
    int b = Myth.posNumber2;
    int c = Daequan.posNumber3;
    int d = Tim.posNumber4;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popupwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);


        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.4), (int) (height * 0.31));

        Button pop = findViewById(R.id.btnNotification);

        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (checkSystemWritePermission()) {

                    if(a > 0){
                    switch (a) {

                        case 1:

                            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_im_dr_lupo");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 2:

                            Uri uri2 = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_llama");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri2);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 3:

                            Uri uri3 = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_later_baby");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri3);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;

                        case 4:

                            Uri uri4 = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_great_game");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri4);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 5:

                            Uri uri5 = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_ahh");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri5);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 6:

                            Uri uri6 = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_uhh_i_can_explain");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri6);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 7:

                            Uri uri7 = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_keemstar_impression");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri7);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 8:

                            Uri uri8 = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_lee_carter_impression");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri8);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 9:

                            Uri uri9 = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_tim_impression");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri9);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 10:

                            Uri uri10 = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_pentakill");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri10);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 11:

                            Uri uri11 = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_de_wae");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri11);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 12:

                            Uri uri12 = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_keep_the_change");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri12);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 13:

                            Uri uri13 = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_lets_go_baby");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri13);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 14:

                            Uri uri14 = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_gimme_that_gold");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri14);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 15:

                            Uri uri15 = Uri.parse("android.resource://" + getPackageName() + "/raw/ninja_losers_bracket");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri15);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                    }
                    }

                    if(b > 0){
                    switch (b) {
                        case 1:

                            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/raw/myth_nani");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            b = 0;
                            return;
                        case 2:

                            Uri uri2 = Uri.parse("android.resource://" + getPackageName() + "/raw/myth_epic_fix_your_game");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri2);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            b = 0;
                            return;
                        case 3:

                            Uri uri3 = Uri.parse("android.resource://" + getPackageName() + "/raw/myth_lets_go_baby");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri3);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;

                        case 4:

                            Uri uri4 = Uri.parse("android.resource://" + getPackageName() + "/raw/myth_llama");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri4);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 5:

                            Uri uri5 = Uri.parse("android.resource://" + getPackageName() + "/raw/myth_literally");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri5);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 6:

                            Uri uri6 = Uri.parse("android.resource://" + getPackageName() + "/raw/myth_keep_believing");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri6);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 7:

                            Uri uri7 = Uri.parse("android.resource://" + getPackageName() + "/raw/myth_clip_it");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri7);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 8:

                            Uri uri8 = Uri.parse("android.resource://" + getPackageName() + "/raw/myth_ima_whoop");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri8);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 9:

                            Uri uri9 = Uri.parse("android.resource://" + getPackageName() + "/raw/myth_i_like_men");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri9);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 10:

                            Uri uri10 = Uri.parse("android.resource://" + getPackageName() + "/raw/myth_drink_it_down");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri10);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 11:

                            Uri uri11 = Uri.parse("android.resource://" + getPackageName() + "/raw/myth_better_watch_your_mouth");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri11);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                    }
                    }

                    if(c > 0){
                    switch (c) {
                        case 1:

                            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_what_do_you_mean");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 2:

                            Uri uri2 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_come_here_boy");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri2);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 3:

                            Uri uri3 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_gimme_that_head");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri3);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;

                        case 4:

                            Uri uri4 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_ooo_please_game");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri4);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 5:

                            Uri uri5 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_reeeeeee");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri5);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 6:

                            Uri uri6 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_this_games_trash");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri6);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 7:

                            Uri uri7 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_doodoo");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri7);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 8:

                            Uri uri8 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_get_off_my_server");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri8);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 9:

                            Uri uri9 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_this_game_doodoo");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri9);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 10:

                            Uri uri10 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_im_comin_for_that_booty");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri10);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 11:

                            Uri uri11 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_get_outta_my_game_kid");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri11);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 12:

                            Uri uri12 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_get_outta_my_face_boy");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri12);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 13:

                            Uri uri13 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_cackling_laugh");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri13);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 14:

                            Uri uri14 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_alooloolool");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri14);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 15:

                            Uri uri15 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_ooo_what");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri15);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 16:

                            Uri uri16 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_what_are_you_talking_about");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri16);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 17:

                            Uri uri17 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_hey_brother_how_you_doin");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri17);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 18:

                            Uri uri18 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_where_you_going_boy");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri18);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        case 19:

                            Uri uri19 = Uri.parse("android.resource://" + getPackageName() + "/raw/daequan_myth_impression");
                            RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri19);
                            Toast.makeText(Pop.this, "Set as Notification Sound ",
                                    Toast.LENGTH_SHORT).show();
                            return;

                    }
                    }

                    if(d > 0) {
                        switch (d) {
                            case 1:

                                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/raw/tim");
                                RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri);
                                Toast.makeText(Pop.this, "Set as Notification Sound ",
                                        Toast.LENGTH_SHORT).show();
                                return;
                            case 2:

                                Uri uri2 = Uri.parse("android.resource://" + getPackageName() + "/raw/tim_omg");
                                RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri2);
                                Toast.makeText(Pop.this, "Set as Notification Sound ",
                                        Toast.LENGTH_SHORT).show();
                                return;
                            case 3:

                                Uri uri3 = Uri.parse("android.resource://" + getPackageName() + "/raw/tim_afk");
                                RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri3);
                                Toast.makeText(Pop.this, "Set as Notification Sound ",
                                        Toast.LENGTH_SHORT).show();
                                return;

                            case 4:

                                Uri uri4 = Uri.parse("android.resource://" + getPackageName() + "/raw/tim_carry_is_here");
                                RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri4);
                                Toast.makeText(Pop.this, "Set as Notification Sound ",
                                        Toast.LENGTH_SHORT).show();
                                return;
                            case 5:

                                Uri uri5 = Uri.parse("android.resource://" + getPackageName() + "/raw/tim_awful");
                                RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri5);
                                Toast.makeText(Pop.this, "Set as Notification Sound ",
                                        Toast.LENGTH_SHORT).show();
                                return;
                            case 6:

                                Uri uri6 = Uri.parse("android.resource://" + getPackageName() + "/raw/tim_skrr_skrr");
                                RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri6);
                                Toast.makeText(Pop.this, "Set as Notification Sound ",
                                        Toast.LENGTH_SHORT).show();
                                return;
                            case 7:

                                Uri uri7 = Uri.parse("android.resource://" + getPackageName() + "/raw/tim_smorc");
                                RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri7);
                                Toast.makeText(Pop.this, "Set as Notification Sound ",
                                        Toast.LENGTH_SHORT).show();
                                return;
                            case 8:

                                Uri uri8 = Uri.parse("android.resource://" + getPackageName() + "/raw/tim_hobbit");
                                RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri8);
                                Toast.makeText(Pop.this, "Set as Notification Sound ",
                                        Toast.LENGTH_SHORT).show();
                                return;
                            case 9:

                                Uri uri9 = Uri.parse("android.resource://" + getPackageName() + "/raw/tim_ahhh");
                                RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri9);
                                Toast.makeText(Pop.this, "Set as Notification Sound ",
                                        Toast.LENGTH_SHORT).show();
                                return;
                            case 10:

                                Uri uri10 = Uri.parse("android.resource://" + getPackageName() + "/raw/tim_pizza");
                                RingtoneManager.setActualDefaultRingtoneUri(Pop.this, RingtoneManager.TYPE_NOTIFICATION, uri10);
                                Toast.makeText(Pop.this, "Set as Notification Sound ",
                                        Toast.LENGTH_SHORT).show();
                                return;

                        }
                    }
                }
                else{
                    Toast.makeText(Pop.this, "Permission Required",
                            Toast.LENGTH_SHORT).show();
                    openAndroidPermissionsMenu();
                }
            }
        }
        );
       Ninja.posNumber1= 0;
       Myth.posNumber2 = 0 ;
       Daequan.posNumber3 = 0;
       Tim.posNumber4 = 0;
    }

    private void openAndroidPermissionsMenu() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Intent intent = new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS);
            intent.setData(Uri.parse("package:" + this.getPackageName()));
            this.startActivity(intent);
        }
    }

    private boolean checkSystemWritePermission() {
        // Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
        // if Build.VERSION.SDK_INT >= 21
        if (Build.VERSION.SDK_INT >= 23) {
            if(Settings.System.canWrite(this))
                return true;
            else
                openAndroidPermissionsMenu();
        }
        return true;
    }
}
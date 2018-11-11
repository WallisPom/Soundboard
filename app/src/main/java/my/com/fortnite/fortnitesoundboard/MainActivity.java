package my.com.fortnite.fortnitesoundboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ninjaView =  findViewById(R.id.ninja);

        ninjaView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent ninjaIntent = new Intent(MainActivity.this, Ninja.class);

                startActivity(ninjaIntent);
                //finish();
            }
        });
        Button mythView =  findViewById(R.id.myth);

        mythView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent mythIntent = new Intent(MainActivity.this, Myth.class);

                startActivity(mythIntent);
                // finish();
            }
        });

        Button daequanView =  findViewById(R.id.daequan);

        daequanView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent daequanIntent = new Intent(MainActivity.this, Daequan.class);

                startActivity(daequanIntent);
               // finish();
            }
        });

        Button timView =  findViewById(R.id.tim);

        timView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent timIntent = new Intent(MainActivity.this, Tim.class);

                startActivity(timIntent);
               // finish();
            }
        });


        ImageView ninja1 = findViewById(R.id.ninjaTwitch);
        ninja1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.twitch.tv/ninja"));
                startActivity(intent);
            }
        });
        ImageView ninja2 = findViewById(R.id.ninjaYoutube);
        ninja2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/user/NinjasHyper"));
                startActivity(intent);
            }
        });

        ImageView myth1 = findViewById(R.id.mythTwitch);
        myth1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.twitch.tv/tsm_myth"));
                startActivity(intent);
            }
        });
        ImageView myth2 = findViewById(R.id.mythYoutube);
        myth2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/user/IMTHETacticalMyth/featured"));
                startActivity(intent);
            }
        });

        ImageView daequan1 = findViewById(R.id.daequanTwitch);
        daequan1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.twitch.tv/tsm_daequan"));
                startActivity(intent);
            }
        });
        ImageView daequan2 = findViewById(R.id.daequanYoutube);
        daequan2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/channel/UCbJ9W-EexsJSMc4wMPOA9pA"));
                startActivity(intent);
            }
        });

        ImageView tim1 = findViewById(R.id.timTwitch);
        tim1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.twitch.tv/timthetatman"));
                startActivity(intent);
            }
        });
        ImageView tim2 = findViewById(R.id.timYoutube);
        tim2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/user/timthetatman"));
                startActivity(intent);
            }
        });
    }
}

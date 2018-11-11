package my.com.fortnite.fortnitesoundboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


public class DaequanAdapter extends BaseAdapter {
    private Context mContext;

    public DaequanAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return Id.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            int height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 125, Resources.getSystem().getDisplayMetrics());
            int width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 125, Resources.getSystem().getDisplayMetrics());
            imageView.setLayoutParams(new ViewGroup.LayoutParams(width, height));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);

        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(Id[position]);
        return imageView;

    }

    // references to images
    private Integer[] Id = {
            R.drawable.what_do_you_mean, R.drawable.come_here_boy,
            R.drawable.gimme_that_head_boy, R.drawable.please_game,
            R.drawable.reee, R.drawable.this_games_trash,
            R.drawable.doodoo, R.drawable.get_off_my_server,
            R.drawable.this_game_doodoo, R.drawable.comin_for_that_booty,
            R.drawable.get_outta_my_game_kid, R.drawable.get_outta_my_face,
            R.drawable.hahahaha, R.drawable.lolol,
            R.drawable.ooo, R.drawable.what_are_you_talkin_about,
            R.drawable.hey_brother, R.drawable.where_you_goin_boy,
            R.drawable.myth_impression

    };
}
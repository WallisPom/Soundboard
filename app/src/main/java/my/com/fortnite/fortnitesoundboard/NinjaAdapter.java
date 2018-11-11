package my.com.fortnite.fortnitesoundboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


public class NinjaAdapter extends BaseAdapter {
    private Context mContext;

    public NinjaAdapter(Context c) {
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
            R.drawable.ninja_im_dr_lupo, R.drawable.ninja_llama,
            R.drawable.ninja_later_baby, R.drawable.ninja_great_game,
            R.drawable.ninja_ahhhh_omg, R.drawable.ninja_uhh_i_can_explain,
            R.drawable.ninja_keemstar_impression, R.drawable.ninja_rush_hour,
            R.drawable.ninja_tim_the_tat_man, R.drawable.ninja_pentakill,
            R.drawable.ninja_da_wae, R.drawable.ninja_keep_the_change,
            R.drawable.ninja_lets_go_baby, R.drawable.ninja_gimme_that_gold,
            R.drawable.ninja_losers_bracket
    };
}

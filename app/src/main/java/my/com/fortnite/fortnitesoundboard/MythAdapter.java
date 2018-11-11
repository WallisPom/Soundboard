package my.com.fortnite.fortnitesoundboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


public class MythAdapter extends BaseAdapter {
    private Context mContext;

    public MythAdapter(Context c) {
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
            R.drawable.myth_nani, R.drawable.myth_fix_your_game,
            R.drawable.myth_lets_go_baby, R.drawable.myth_llama,
            R.drawable.myth_literally, R.drawable.myth_keep_believin_baby,
            R.drawable.myth_clip_it, R.drawable.myth_ima_woop_your,
            R.drawable.myth_i_like_men, R.drawable.myth_drink_it_down,
            R.drawable.myth_watch_your_mouth
    };
}
package my.com.fortnite.fortnitesoundboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


public class TimAdapter extends BaseAdapter {
    private Context mContext;

    public TimAdapter(Context c) {
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
            R.drawable.tim, R.drawable.oh_my_god,
            R.drawable.im_afk, R.drawable.the_carry_is_here,
            R.drawable.im_awful, R.drawable.skrr_skrr,
            R.drawable.smorc_voice, R.drawable.hobbit_voice,
            R.drawable.tim_ahh, R.drawable.tim_pizza

    };
}
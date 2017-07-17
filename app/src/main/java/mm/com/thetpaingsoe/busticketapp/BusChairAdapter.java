package mm.com.thetpaingsoe.busticketapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class BusChairAdapter extends BaseAdapter {
    private Context context;

    public BusChairAdapter(Context c){
        context = c;
    }
    public int getCount() {
        return ChairIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(ChairIds[position]);
        return imageView;
    }
    public Integer[] ChairIds = {
            R.drawable.num1, R.drawable.num2,
            R.drawable.num3, R.drawable.num4,
            R.drawable.num5, R.drawable.num6,
            R.drawable.num7, R.drawable.num8,
            R.drawable.num9, R.drawable.num10,
            R.drawable.num11, R.drawable.num12,
            R.drawable.num13, R.drawable.num14,
            R.drawable.num15, R.drawable.num16,
            R.drawable.num17, R.drawable.num18,
            R.drawable.num19, R.drawable.num20,
            R.drawable.num21, R.drawable.num22,
            R.drawable.num23, R.drawable.num24,
            R.drawable.num25, R.drawable.num26,
            R.drawable.num27, R.drawable.num28,
            R.drawable.num29, R.drawable.num30,
            R.drawable.num31, R.drawable.num32,
            R.drawable.num33, R.drawable.num34,
            R.drawable.num35, R.drawable.num36,
            R.drawable.num37, R.drawable.num38,
            R.drawable.num39, R.drawable.num40,
            R.drawable.num41,R.drawable.num42,
            R.drawable.num43,R.drawable.num44


    };
}

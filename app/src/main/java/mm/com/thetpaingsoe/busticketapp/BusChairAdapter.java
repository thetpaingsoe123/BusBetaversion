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
            R.drawable.car_seat, R.drawable.car_seat,
            R.drawable.car_seat, R.drawable.car_seat,
            R.drawable.car_seat, R.drawable.car_seat,
            R.drawable.car_seat, R.drawable.car_seat,
            R.drawable.car_seat, R.drawable.car_seat,
            R.drawable.car_seat, R.drawable.car_seat,
            R.drawable.car_seat, R.drawable.car_seat,
            R.drawable.car_seat, R.drawable.car_seat,
            R.drawable.car_seat, R.drawable.car_seat,
            R.drawable.car_seat, R.drawable.car_seat

    };
}

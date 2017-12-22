package de.luh.hci.mid2017.wanderlust2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by jobusch on 13.12.17.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflater;


    public ImageAdapter(Context c) {
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.griditem, null);

            holder.imageview = (ImageView) convertView.findViewById(R.id.imageView);
            holder.checkbox = (CheckBox) convertView.findViewById(R.id.checkBox);

            convertView.setTag(holder);

            //holder.imageview.setLayoutParams(new GridView.LayoutParams(285, 285));
            holder.imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
            holder.imageview.setPadding(8, 8, 8, 8);

            //imageView = new ImageView(mContext);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.checkbox.setId(position);
        holder.imageview.setId(position);
        holder.id = position;
        holder.imageview.setImageResource(mThumbIds[position]);
        holder.imageview.setTag(holder.checkbox);
        holder.imageview.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                CheckBox cb = (CheckBox) v.getTag();
                if(cb.isChecked())
                    cb.setChecked(false);
                else
                    cb.setChecked(true);
            }
        });

       return convertView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_1, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_1, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_1, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_1, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3
    };

    class ViewHolder {
        ImageView imageview;
        CheckBox checkbox;
        int id;
    }
}

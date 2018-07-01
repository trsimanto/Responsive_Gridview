package com.example.towhid.gridview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView=(GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+position, Toast.LENGTH_SHORT).show();
            }
        });
    }




    public class ImageAdapter extends BaseAdapter{

        private Context mContext;

        public ImageAdapter(Context mContext) {
            this.mContext = mContext;
        }

        private  Integer[] mThumbsIds={
                R.drawable.download,
                R.drawable.download1,
                R.drawable.download2,
                R.drawable.download3,
                R.drawable.download4,
                R.drawable.download5,
                R.drawable.download6,
                R.drawable.images,
                R.drawable.images1,
                R.drawable.images2,
                R.drawable.images3,
                R.drawable.download,
                R.drawable.download1,
                R.drawable.download2,
                R.drawable.download3,
                R.drawable.download4,
                R.drawable.download5,
                R.drawable.download6,
                R.drawable.images,
                R.drawable.images1,
                R.drawable.images2,
                R.drawable.images3,
                R.drawable.download,
                R.drawable.download1,
                R.drawable.download2,
                R.drawable.download3,
                R.drawable.download4,
                R.drawable.download5,
                R.drawable.download6,
                R.drawable.images,
                R.drawable.images1,
                R.drawable.images2,
                R.drawable.images3,
                R.drawable.download,
                R.drawable.download1,
                R.drawable.download2,
                R.drawable.download3,
                R.drawable.download4,
                R.drawable.download5,
                R.drawable.download6,
                R.drawable.images,
                R.drawable.images1,
                R.drawable.images2,
                R.drawable.images3
        };

        @Override
        public int getCount() {
            return mThumbsIds.length;
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
            ImageView imageView= new ImageView(mContext);
            imageView.setImageResource(mThumbsIds[position]);
            return imageView;
        }
    }
}

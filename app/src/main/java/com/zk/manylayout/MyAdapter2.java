package com.zk.manylayout;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ${zk} on 2018/4/26 0026.
 * 欢迎每一天
 */

public class MyAdapter2 extends BaseAdapter {
    private List<Integer> list;
    private Context       ctx;
    final int VIEW_TYPE = 3;
    final int TYPE_1    = 0;
    final int TYPE_2    = 1;
    final int TYPE_3    = 2;

    public MyAdapter2(List<Integer> list, Context ctx) {
        super();
        this.list = list;
        this.ctx = ctx;
    }

    //  获取Item的View的类型
    @Override
    public int getItemViewType(int position) {
        int i = position % VIEW_TYPE;
        if (i == 0) {
            return TYPE_1;
        } else if (i == 1) {
            return TYPE_2;
        } else {
            return TYPE_3;
        }
    }

    //  总共有几种布局
    @Override
    public int getViewTypeCount() {
        return VIEW_TYPE;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder holder1 = null;
        MyViewHolder2 holder2 = null;
        MyViewHolder3 holder3 = null;
        int type = getItemViewType(position);
        if (convertView == null) {
            //设置布局和找ID
            switch (type) {
                case TYPE_1:
                    convertView = View.inflate(ctx, R.layout.adapter, null);
                    holder1 = new MyViewHolder(convertView);
                    convertView.setTag(holder1);
                    break;
                case TYPE_2:
                    convertView = View.inflate(ctx, R.layout.adapter2, null);
                    holder2 = new MyViewHolder2(convertView);
                    convertView.setTag(holder2);
                    break;
                case TYPE_3:
                    convertView = View.inflate(ctx, R.layout.adapter3, null);
                    holder3 = new MyViewHolder3(convertView);
                    convertView.setTag(holder3);
                    break;
            }
        } else {
            //设置复用
            switch (type) {
                case TYPE_1:
                    holder1 = (MyViewHolder) convertView.getTag();
                    break;

                case TYPE_2:
                    holder2 = (MyViewHolder2) convertView.getTag();
                    break;
                case TYPE_3:
                    holder3 = (MyViewHolder3) convertView.getTag();
                    break;
            }
        }
        //设置数据
        switch (type) {
            case TYPE_1:

                break;

            case TYPE_2:

                break;
            case TYPE_3:

                break;
        }
        return convertView;
    }

    private class MyViewHolder {
        public MyViewHolder(View convertView) {

        }
    }

    private class MyViewHolder2 {
        public MyViewHolder2(View convertView) {

        }
    }

    private class MyViewHolder3 {
        public MyViewHolder3(View convertView) {

        }

    }


}
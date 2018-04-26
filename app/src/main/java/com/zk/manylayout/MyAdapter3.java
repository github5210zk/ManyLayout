package com.zk.manylayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.Random;

/**
 * Created by ${zk} on 2018/4/26 0026.
 * 欢迎每一天
 */

public class MyAdapter3 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context       mContext;
    List<Bean> mList;
    final int TYPE_1    = 0;
    final int TYPE_2    = 1;
    final int TYPE_3    = 2;

    public MyAdapter3(Context context, List<Bean> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_1) {
            View view = View.inflate(mContext, R.layout.adapter, null);
            return new MyViewHolder(view);
        } else if (viewType == TYPE_2) {
            View view2 = View.inflate(mContext, R.layout.adapter2, null);

            return new MyViewHolder2(view2);
        } else {
            View view3 = View.inflate(mContext, R.layout.adapter3, null);
            return new MyViewHolder3(view3);
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder holder1 = null;
        MyViewHolder2 holder2 = null;
        MyViewHolder3 holder3 = null;
        if (holder instanceof MyViewHolder) {
            holder1 = (MyViewHolder) holder;
        } else if (holder instanceof MyViewHolder2) {
            holder2 = (MyViewHolder2) holder;

        } else {
            holder3 = (MyViewHolder3) holder;

        }
    }


    /**
     * 获取每个位置的View
     *
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        int type = mList.get(position).type;
        if ( type== 0 ) {
            return TYPE_1;
        } else if (type == 1 ) {
            return TYPE_2;
        } else  {
            return TYPE_3;
        }

    }


    @Override
    public int getItemCount() {
        if (mList != null) {
            return mList.size();
        }
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }

    class MyViewHolder2 extends RecyclerView.ViewHolder {
        public MyViewHolder2(View itemView) {
            super(itemView);
        }
    }

    class MyViewHolder3 extends RecyclerView.ViewHolder {
        public MyViewHolder3(View itemView) {
            super(itemView);
        }
    }


}

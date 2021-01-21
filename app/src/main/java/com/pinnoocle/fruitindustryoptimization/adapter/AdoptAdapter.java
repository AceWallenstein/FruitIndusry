package com.pinnoocle.fruitindustryoptimization.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.widget.TagTextView;

import java.util.ArrayList;
import java.util.List;


/**
 * @author: xl
 * @date: 2017/7/19
 */

public class AdoptAdapter extends RecyclerView.Adapter<AdoptAdapter.ViewHolder> {
    private LayoutInflater mInflater;
    private Context context;
    private List<String> tag = new ArrayList<>();

    public AdoptAdapter(Context context) {
        this.context = context;
        mInflater = LayoutInflater.from(context);
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_adopt, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        tag.clear();
        tag.add("企业专区");
        holder.tv_title.setContentAndTag("认养一颗新疆灰枣,拥有命名权，每年送10斤红枣零食", tag);
//        holder.ll_class.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (mOnItemClickListener != null) {
//                    mOnItemClickListener.onItemClick(position);
//                }
//            }
//        });
    }

    @Override
    public int getItemCount() {
//        return mShowItems == null ? 0 : mShowItems.size();
        return 3;
    }

    //**********************itemClick************************
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    private OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }
    //**************************************************************

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TagTextView tv_title;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_title = (TagTextView) itemView.findViewById(R.id.tv_title);
        }
    }
}

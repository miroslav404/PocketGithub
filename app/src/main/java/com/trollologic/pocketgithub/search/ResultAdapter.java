package com.trollologic.pocketgithub.search;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.trollologic.pocketgithub.R;
import com.trollologic.pocketgithub.databinding.SearchResultItemBinding;

/**
 * Created by miroslav on 02.02.17..
 */

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ViewHolder> {
    private final Context context;
    private String[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public SearchResultItemBinding binding;
        public ViewHolder(View v) {
            super(v);
        }
    }

    public ResultAdapter(Context context, String[] myDataset) {
        mDataset = myDataset;
        this.context = context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ResultAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.search_result_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}



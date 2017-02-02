package com.trollologic.pocketgithub.search;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.trollologic.pocketgithub.R;
import com.trollologic.pocketgithub.databinding.SearchResultItemBinding;
import com.trollologic.pocketgithub.models.SearchItem;
import com.trollologic.pocketgithub.models.responses.SearchResults;

/**
 * Created by miroslav on 02.02.17..
 */

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ViewHolder> {
    private final Context context;
    private SearchItem[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public SearchResultItemBinding binding;
        public ViewHolder(View v) {
            super(v);
            binding = DataBindingUtil.bind(v);

        }
    }

    public ResultAdapter(Context context, SearchItem[] mDataset) {
        this.mDataset = mDataset;
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
        holder.binding.setOwner(mDataset[position].getOwner());
        holder.binding.setRepo(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}



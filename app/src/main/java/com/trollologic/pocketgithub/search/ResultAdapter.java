package com.trollologic.pocketgithub.search;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;
import com.trollologic.pocketgithub.R;
import com.trollologic.pocketgithub.databinding.SearchResultItemBinding;
import com.trollologic.pocketgithub.models.SearchItem;

import java.util.List;

/**
 * Created by miroslav on 02.02.17..
 */

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ViewHolder> {
    private final Context context;
    private final SearchClickListeners searchClickListener;
    private List<SearchItem> mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public SearchResultItemBinding binding;
        public ViewHolder(View v) {
            super(v);
            binding = DataBindingUtil.bind(v);

        }
    }

    public ResultAdapter(Context context, List<SearchItem> mDataset, SearchPresenter presenter) {
        this.mDataset = mDataset;
        this.context = context;
        searchClickListener = new SearchClickListeners(presenter);
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
        SearchItem item = mDataset.get(position);

        //TODO check why textView is blinking when entity seted via binding method
        holder.binding.setOwner(item.getOwner());
        holder.binding.setRepo(item);
        holder.binding.setHandler(searchClickListener);
        holder.binding.repoOwner.setText(item.getOwner().getLogin());
        Picasso.with(context).load(item.getOwner().getAvatar_url()).into(holder.binding.ownerAvatar);
        holder.binding.repoName.setText(context.getString(R.string.two_strings_with_colon,
                context.getString(R.string.repository), item.getName()));
        holder.binding.repoForks.setText(context.getString(R.string.two_strings_with_colon,
                context.getString(R.string.fork_count), String.valueOf(item.getForks_count())));
        holder.binding.repoWatchers.setText(context.getString(R.string.two_strings_with_colon,
                context.getString(R.string.watchers_count), String.valueOf(item.getWatchers_count())));
        holder.binding.repoIssues.setText(context.getString(R.string.two_strings_with_colon,
                context.getString(R.string.open_issues_count), String.valueOf(item.getOpen_issues_count())));
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}



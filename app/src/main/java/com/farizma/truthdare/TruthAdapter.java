package com.farizma.truthdare;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TruthAdapter extends RecyclerView.Adapter<TruthAdapter.TruthViewHolder>  {

    private ArrayList<TruthItem> mTruthList;

    public static class TruthViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;

        public TruthViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }

    public TruthAdapter(ArrayList<TruthItem> truthList) {
        mTruthList = truthList;
    }

    @NonNull
    @Override
    public TruthViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_card, parent, false);
        TruthViewHolder truthViewHolder = new TruthViewHolder(view);
        return truthViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TruthViewHolder holder, int position) {
        TruthItem currentItem = mTruthList.get(position);
        holder.textView.setText(currentItem.getmText());
    }

    @Override
    public int getItemCount() {
        return mTruthList.size();
    }
}

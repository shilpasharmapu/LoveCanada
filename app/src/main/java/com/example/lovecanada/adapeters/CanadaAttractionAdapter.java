package com.example.lovecanada.adapeters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lovecanada.Layout.AttractionDetailsActivity;
import com.example.lovecanada.R;
import com.example.lovecanada.models.CanadaAttraction;

import java.util.ArrayList;

public class CanadaAttractionAdapter extends RecyclerView.Adapter<CanadaAttractionAdapter.AttractionViewHolder> {

    private ArrayList<CanadaAttraction> attractionList;

    public CanadaAttractionAdapter(ArrayList<CanadaAttraction> attractionList) {
        this.attractionList = attractionList;
    }

    @NonNull
    @Override
    public AttractionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_attraction,parent,false);
        AttractionViewHolder mAttractionViewHolder = new AttractionViewHolder(mView);
        return mAttractionViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull AttractionViewHolder holder, final int position) {
        CanadaAttraction mCountry = this.attractionList.get(position);
        holder.txtname.setText(mCountry.getName());
        holder.imgflag.setImageResource(mCountry.getImgaeFlag());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CanadaAttraction c = attractionList.get(position);
                Intent iIntent = new Intent(v.getContext(), AttractionDetailsActivity.class);
                iIntent.putExtra("attractionDetail", c);
                v.getContext().startActivity(iIntent);

            }

        });
    }

    @Override
    public int getItemCount() {
        return attractionList.size();
    }

    public class AttractionViewHolder extends RecyclerView.ViewHolder {
      private  TextView txtname;
      private   ImageView imgflag;
        public AttractionViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname = itemView.findViewById(R.id.txtAttraction);
            imgflag = itemView.findViewById(R.id.imgAttraction);
        }
    }
}

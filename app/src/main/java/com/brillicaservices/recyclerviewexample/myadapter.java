package com.brillicaservices.recyclerviewexample;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by user on 6/10/2018.
 */

public class myadapter extends RecyclerView.Adapter<myadapter.ViewHolder> {

    private List<itemlist> itemlists;
    private Context itemcontext;

    public myadapter(List<itemlist> itemlists, Context itemcontext) {
        this.itemlists = itemlists;
        this.itemcontext = itemcontext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        itemlist il=itemlists.get(position);
        holder.heading.setText(il.getHeading());
        holder.description.setText(il.getDescription());
    }
///
    @Override
    public int getItemCount() {
        return itemlists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView heading;
        public TextView description;
        public ViewHolder(View itemView) {
            super(itemView);
            heading=(TextView) itemView.findViewById(R.id.heading);
            description=(TextView) itemView.findViewById(R.id.description);
        }
    }
}
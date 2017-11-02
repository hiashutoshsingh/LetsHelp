package ashu.help.letshelp.com.letshelp.Adapters.Adapter.RequestBloodAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ashu.help.letshelp.com.letshelp.R;


class RequestDetailHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView bloodgroup;
    private TextView units;

    Context context;

    public RequestDetailHolder(final View itemView) {
        super(itemView);
        context=itemView.getContext();


        name=(TextView)itemView.findViewById(R.id.receiver_name);
        bloodgroup=(TextView)itemView.findViewById(R.id.receiver_blood_group);
        units=(TextView)itemView.findViewById(R.id.receiver_blood_units);

    }

    public void bindData(RequestHolder requestHolder)
    {
        name.setText(requestHolder.holdername);
        bloodgroup.setText(requestHolder.holderbloodgrp);
        units.setText(requestHolder.holderbloodunits);
    }
}

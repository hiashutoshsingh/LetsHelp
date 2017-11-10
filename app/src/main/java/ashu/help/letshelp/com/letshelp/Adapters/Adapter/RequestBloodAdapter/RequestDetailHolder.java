package ashu.help.letshelp.com.letshelp.Adapters.Adapter.RequestBloodAdapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import ashu.help.letshelp.com.letshelp.Activities.MapsActivity;
import ashu.help.letshelp.com.letshelp.R;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;


class RequestDetailHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView bloodgroup;
    private TextView units;
    private ImageView share,direction,phone;

    Context context;

    public RequestDetailHolder(final View itemView) {
        super(itemView);
        context=itemView.getContext();


        name=(TextView)itemView.findViewById(R.id.receiver_name);
        bloodgroup=(TextView)itemView.findViewById(R.id.receiver_blood_group);
        units=(TextView)itemView.findViewById(R.id.receiver_blood_units);
        share=(ImageView)itemView.findViewById(R.id.request_share);
        direction=(ImageView)itemView.findViewById(R.id.request_direction);
        phone=(ImageView)itemView.findViewById(R.id.request_phone);

share.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "An app to help out the people by donating money, clothes and blood";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "LetsHelp \n");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
      context.startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
});

        direction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myactivity = new Intent(context.getApplicationContext(), MapsActivity.class);
                myactivity.addFlags(FLAG_ACTIVITY_NEW_TASK);
                context.getApplicationContext().startActivity(myactivity);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9457444841"));
                try {
                   context.startActivity(in);
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(context, "Could not find an activity to place the call.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void bindData(RequestHolder requestHolder)
    {
        name.setText(requestHolder.holdername);
        bloodgroup.setText(requestHolder.holderbloodgrp);
        units.setText(requestHolder.holderbloodunits);
    }
}

package ashu.help.letshelp.com.letshelp.Activities.Details;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ashu.help.letshelp.com.letshelp.Activities.RegisterEvent;
import ashu.help.letshelp.com.letshelp.R;


public class EventsDetails extends AppCompatActivity {

    private TextView eventDetails;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_details);
//
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        final String money_details = getIntent().getExtras().getString("eventdetails");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_event);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "www.playstore.com/letshelp/appid=123sde45");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });

        eventDetails=(TextView)findViewById(R.id.eventdetails);
        eventDetails.setText(money_details);

        button=(Button)findViewById(R.id.eventregister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EventsDetails.this, RegisterEvent.class));
                finish();
            }
        });
    }
}

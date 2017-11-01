package ashu.help.letshelp.com.letshelp.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import ashu.help.letshelp.com.letshelp.Adapters.Adapters.Event.EventAdapter;
import ashu.help.letshelp.com.letshelp.R;

public class EventActivity extends AppCompatActivity {
    public RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_event);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView_Event);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        EventAdapter newsDetailAdapter=new EventAdapter();
        recyclerView.setAdapter(newsDetailAdapter);
    }
}

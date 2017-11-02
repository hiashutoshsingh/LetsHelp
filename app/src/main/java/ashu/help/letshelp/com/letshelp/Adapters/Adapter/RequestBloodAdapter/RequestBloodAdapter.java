package ashu.help.letshelp.com.letshelp.Adapters.Adapter.RequestBloodAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ashu.help.letshelp.com.letshelp.R;

public class RequestBloodAdapter extends RecyclerView.Adapter<RequestDetailHolder> {

    private List<RequestHolder> requestHolderList;

    public RequestBloodAdapter() {
        requestHolderList = new ArrayList<>();
        requestHolderList.add(new RequestHolder("Ashutosh","A+ve","4 units"));
        requestHolderList.add(new RequestHolder("Arnav","B+ve","3 units"));
        requestHolderList.add(new RequestHolder("Ashima","A-ve","2 units"));
        requestHolderList.add(new RequestHolder("Aaloo","B-ve","1 units"));
        requestHolderList.add(new RequestHolder("Pakoda","O+ve","5 units"));
        requestHolderList.add(new RequestHolder("Ashish","O-ve","2 units"));
        requestHolderList.add(new RequestHolder("Khalo","Ab+ve","1 units"));

    }

    @Override
    public RequestDetailHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.abc_layout_reques_blood,parent,false);
        return new RequestDetailHolder(view);

    }

    @Override
    public void onBindViewHolder(RequestDetailHolder holder, int position) {

        RequestHolder requestHolder = requestHolderList.get(position);
        holder.bindData(requestHolder);
    }

    @Override
    public int getItemCount() {
        return requestHolderList.size();
    }
}

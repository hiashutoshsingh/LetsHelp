package ashu.help.letshelp.com.letshelp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ashu.help.letshelp.com.letshelp.Adapters.Adapter.RequestBloodAdapter.RequestBloodAdapter;
import ashu.help.letshelp.com.letshelp.R;

public class BloodRequest extends Fragment {
RecyclerView recyclerView;


    public BloodRequest() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blood_request, container, false);

        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerView_request_blood);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RequestBloodAdapter requestBloodAdapter=new RequestBloodAdapter();
        recyclerView.setAdapter(requestBloodAdapter);
        return view;
    }



}

package ashu.help.letshelp.com.letshelp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ashu.help.letshelp.com.letshelp.Adapters.Adapter.ClothesAdapter.ClothesAdapter;
import ashu.help.letshelp.com.letshelp.R;


public class DonateClothes extends Fragment {

    RecyclerView recyclerView;

    public DonateClothes() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.fragment_donate_clothes,container,false);

        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerView_donate_clothes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ClothesAdapter clothesAdapter=new ClothesAdapter();
        recyclerView.setAdapter(clothesAdapter);

        return view;
    }




}


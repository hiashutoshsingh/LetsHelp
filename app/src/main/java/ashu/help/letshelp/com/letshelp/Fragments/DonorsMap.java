package ashu.help.letshelp.com.letshelp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ashu.help.letshelp.com.letshelp.R;





public class DonorsMap extends Fragment {



    public DonorsMap() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_donors_map,container,false);

        return  view;
    }


}

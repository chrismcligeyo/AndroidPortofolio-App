package mcligeyo.mcligeyodev.com.mcligeyodev.views;


import android.os.Bundle;
//import androidx.core.app.Fragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mcligeyo.mcligeyodev.com.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {


    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contactView =inflater.inflate(R.layout.fragment_contact, container, false);

        return contactView;
    }

}

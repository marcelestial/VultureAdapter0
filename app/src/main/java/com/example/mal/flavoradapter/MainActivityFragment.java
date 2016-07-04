package com.example.mal.flavoradapter;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;

/**
 * A fragment containing the list view
 */
public class MainActivityFragment extends Fragment {

    private AndroidFlavorAdapter flavorAdapter;

    AndroidFlavor[] androidFlavors = {
            new AndroidFlavor("Bearded Vulture", "looks like a dragon", R.drawable.bearded),
            new AndroidFlavor("Egyptian Vulture", "inspired by Jim Henson", R.drawable.egyptian),
            new AndroidFlavor("???? Vulture", "looks like a jerk", R.drawable.jerk),
            new AndroidFlavor("Ruppell's Vulture", "fuzzy. most social/cuddly", R.drawable.ruppells),
            new AndroidFlavor("Turkey Vulture", "TURKEY VULTURE!!!!1!1!!", R.drawable.turkey),
            new AndroidFlavor("White-headed Vulture", "kind of pink/blue-headed actually", R.drawable.whiteheaded)
    };

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        flavorAdapter = new AndroidFlavorAdapter(getActivity(), Arrays.asList(androidFlavors));

        GridView gridView = (GridView) rootView.findViewById(R.id.gridview_flavor);
        gridView.setAdapter(flavorAdapter);

        return rootView;
    }
}

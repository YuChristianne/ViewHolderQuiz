package sidespell.tech.viewholderquiz.fragments;

import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sidespell.tech.viewholderquiz.CustomMoviesAdapter;
import sidespell.tech.viewholderquiz.Movies;
import sidespell.tech.viewholderquiz.R;

/**
 * A placeholder fragment containing a {@link android.widget.ListView}.
 */
public class ListViewFragment extends Fragment {


    private ListView mListView;
    private TypedArray mTitle;
    private TypedArray mGenre;
    private TypedArray mDescription;
    private TypedArray mImg;
    private ListView listView;

    private static final String KEY_TITLE  = "mov_title";
    private static final String KEY_DESC  = "mov_desc";
    private static final String KEY_GENRE = "mov_genre";
    private static final String KEY_IMG = "mov_img";

    public static ListViewFragment newInstance() {


        return new ListViewFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_listview, container, false);



        ArrayList<Movies> arrayOfUsers = Movies.getMovies();
        // Create the adapter to convert the array to views
        CustomMoviesAdapter adapter = new CustomMoviesAdapter(this, arrayOfUsers);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
     mListView = (ListView) view.findViewById(R.id.listView);

    }

}

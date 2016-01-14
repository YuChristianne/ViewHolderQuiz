package sidespell.tech.viewholderquiz;

import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by User on 1/14/2016.
 */
public class CustomMoviesAdapter extends ArrayAdapter<Movies> {
    public CustomMoviesAdapter(Context context, ArrayList<Movies> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Movie user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_listview, parent, false);
        }

        return super.getView(position, convertView, parent);
    }
}



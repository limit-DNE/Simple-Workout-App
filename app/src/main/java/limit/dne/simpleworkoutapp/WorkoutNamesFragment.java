package limit.dne.simpleworkoutapp;


import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.ListFragment;

public class WorkoutNamesFragment extends ListFragment {

    interface Listener{
        void itemClicked(long id);
    };

    private Listener listener;

    public WorkoutNamesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] workoutNames = new String[Workouts.workouts.length];
        for (int i = 0; i < workoutNames.length; i++){
            workoutNames[i] = Workouts.workouts[i].getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, workoutNames){
            @Override
            public View getView(int position, View converView, ViewGroup parent){
                View view = super.getView(position, converView, parent);
                TextView textView = (TextView) view.findViewById(android.R.id.text1);
                textView.setTextSize(21);
                textView.setTextColor(Color.WHITE);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                return view;
            }
        };
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        this.listener = (Listener)context;
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id){
        if (listener != null){
            listener.itemClicked(id);
        }
    }
}

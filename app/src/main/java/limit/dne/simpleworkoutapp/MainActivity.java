package limit.dne.simpleworkoutapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements WorkoutNamesFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View frameLayout = findViewById(R.id.main_frame_layout);
        if (frameLayout != null){
            WorkoutNamesFragment workoutNamesFragment = new WorkoutNamesFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.main_frame_layout, workoutNamesFragment);
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    @Override
    public void itemClicked(long id) {
        Intent toDetails = new Intent(getApplicationContext(), WorkoutDisplay.class);
        toDetails.putExtra(WorkoutDisplay.EXTRA_WORKOUT_ID, (int)id);
        startActivity(toDetails);
    }
}

package limit.dne.simpleworkoutapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class WorkoutDisplay extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_display);
        WorkoutDetailsFragment fragment = (WorkoutDetailsFragment) getSupportFragmentManager().findFragmentById(R.id.workout_display_details_fragment);
        int workoutID = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        fragment.setWorkoutID(workoutID);
    }
}

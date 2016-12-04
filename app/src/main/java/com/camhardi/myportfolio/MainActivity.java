package com.camhardi.myportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Main activity entry point for My Portfolio app
 */
public class MainActivity extends AppCompatActivity {
    public static final String TOAST_PREFIX = "This button will launch ";
    public static final String PROJECT_ONE_NAME = "my popular movies project";
    public static final String PROJECT_TWO_NAME = "my stock hawk project";
    public static final String PROJECT_THREE_NAME = "my build it bigger";
    public static final String PROJECT_FOUR_NAME = "my make your app material";
    public static final String PROJECT_FIVE_NAME = "go ubiquitous";
    public static final String PROJECT_SIX_NAME = "my capstone project";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = getApplicationContext();

        // Attach onclick listeners to all buttons that will display appropriate toast messages for
        // each project. Buttons will actually launch their respective apps once the projects have been
        // completed.
        Button button = (Button) findViewById(R.id.project_one);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, TOAST_PREFIX + PROJECT_ONE_NAME, Toast.LENGTH_SHORT).show();
            }
        });

        button = (Button) findViewById(R.id.project_two);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, TOAST_PREFIX + PROJECT_TWO_NAME, Toast.LENGTH_SHORT).show();
            }
        });

        button = (Button) findViewById(R.id.project_three);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, TOAST_PREFIX + PROJECT_THREE_NAME, Toast.LENGTH_SHORT).show();
            }
        });

        button = (Button) findViewById(R.id.project_four);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, TOAST_PREFIX + PROJECT_FOUR_NAME, Toast.LENGTH_SHORT).show();
            }
        });

        button = (Button) findViewById(R.id.project_five);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, TOAST_PREFIX + PROJECT_FIVE_NAME, Toast.LENGTH_SHORT).show();
            }
        });

        button = (Button) findViewById(R.id.project_six);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, TOAST_PREFIX + PROJECT_SIX_NAME, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

package course.examples.ui.button;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends Activity {


    // a counter to keep track of button clicks
    // the counter is declared here as a class variable so the value
    // will be perserved between calls to the onClick method
    int count = 0;

    int countdown = 10;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
            
        // Get a reference to the Press Me Button
        final Button button = (Button) findViewById(R.id.buttonPress);
        
        // Set an OnClickListener on this Button
        // Called each time the user clicks the Button
        button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				// Maintain a count of user presses
				// Display count as text on the Button
				button.setText("Got Pressed:" + ++count);
				
			}
		});

        //TODO: Create a reference to the "Press me Too" button
        final Button buttonAlso = (Button) findViewById(R.id.buttonAlso);


        //TODO: Set an OnClickListener on the "Press me Too" button
        // when this button is pressed the, another class variable is decremented by 1
        // and a 'Toast' message appears..
        // when this variable is finally equal to zero, then the button is disabled,
        // and the text on the button says "No MORE"


        buttonAlso.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "";
                countdown--;
                    message = countdown +" left!";
                    Toast toast = Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT);
                toast.show();
               if(countdown == 0){
                   buttonAlso.setText("No More!");
                    buttonAlso.setEnabled(false);
                }
            }
        });





    }
}
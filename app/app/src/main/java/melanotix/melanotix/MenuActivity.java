package melanotix.melanotix;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fujiyuu75.sequent.Sequent;


public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);

        Sequent.origin(layout).start();

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
            Intent i = new Intent(MenuActivity.this,InstructionsActivity.class);
            startActivity(i);
            }
        });


    }

}

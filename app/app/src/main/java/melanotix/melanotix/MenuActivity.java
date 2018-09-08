package melanotix.melanotix;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.fujiyuu75.sequent.Sequent;

import spencerstudios.com.bungeelib.Bungee;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);
        Sequent.origin(layout).start();


    }
}

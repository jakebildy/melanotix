package melanotix.melanotix;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codemybrainsout.onboarder.AhoyOnboarderActivity;
import com.codemybrainsout.onboarder.AhoyOnboarderCard;
//import com.github.paolorotolo.appintro.AppIntro;

import java.util.ArrayList;
import java.util.List;

public class InstructionsActivity extends AhoyOnboarderActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        AhoyOnboarderCard ahoyOnboarderCard1 = new AhoyOnboarderCard("Camera", "Use your camera to take pictures of suspicious moles", R.drawable.camera);

        AhoyOnboarderCard ahoyOnboarderCard2 = new AhoyOnboarderCard("Communicate", "Communicate this info with your doctor", R.drawable.doctor);

        ahoyOnboarderCard1.setTitleTextSize(25);
        ahoyOnboarderCard1.setDescriptionTextSize(20);
        ahoyOnboarderCard1.setDescriptionColor(R.color.colorPrimary);
        ahoyOnboarderCard1.setTitleColor(R.color.colorPrimary);

        ahoyOnboarderCard2.setTitleTextSize(25);
        ahoyOnboarderCard2.setDescriptionTextSize(20);
        ahoyOnboarderCard2.setDescriptionColor(R.color.colorPrimaryDark);
        ahoyOnboarderCard2.setTitleColor(R.color.colorPrimaryDark);


        ahoyOnboarderCard1.setBackgroundColor(R.color.blue_transparent);
        ahoyOnboarderCard2.setBackgroundColor(R.color.blue_transparent);


        setImageBackground(R.drawable.panoramic);


        List<AhoyOnboarderCard> pages = new ArrayList<>();
        pages.add(ahoyOnboarderCard1);
        pages.add(ahoyOnboarderCard2);


        for (AhoyOnboarderCard page : pages) {
            page.setTitleColor(R.color.white);
            page.setDescriptionColor(R.color.white);

        }
        setOnboardPages(pages);

    }

    @Override
    public void onFinishButtonPressed() {
        Intent i = new Intent(InstructionsActivity.this, MenuActivity.class);
        startActivity(i);

    }
}

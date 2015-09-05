package edu.asu.aspira;

import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewFlipper;


public class Introduction extends ActionBarActivity {

    private TextView[] its;
    private TextView nameTitle;
    private Button signUpBtn, backBtn, nextBtn, randomBtn;
    private ViewFlipper viewFlipper;
    private EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_introduction);
        its = new TextView[10];

        its[0] = (TextView)findViewById(R.id.introTitleText);
        its[1] = (TextView)findViewById(R.id.introTitleText2);
        its[2] = (TextView)findViewById(R.id.introTitleText3);
        its[3] = (TextView)findViewById(R.id.introTitleText4);
        its[4] = (TextView)findViewById(R.id.introTitleText5);
        its[5] = (TextView)findViewById(R.id.introTitleText6);
        its[6] = (TextView)findViewById(R.id.introTitleText7);
        its[7] = (TextView)findViewById(R.id.introTitleText8);
        its[8] = (TextView)findViewById(R.id.introTitleText9);
        its[9] = (TextView)findViewById(R.id.introTitleText10);
        nameTitle = (TextView)findViewById(R.id.nameTitle);
        nameInput = (EditText)findViewById(R.id.nameInput);
        signUpBtn = (Button)findViewById(R.id.signUpBtn);
        backBtn = (Button)findViewById(R.id.backBtn);
        nextBtn = (Button)findViewById(R.id.nextBtn);
        randomBtn = (Button)findViewById(R.id.randomBtn);
        viewFlipper = (ViewFlipper)findViewById(R.id.introViewFlipper);

        viewFlipper.setInAnimation(this, R.anim.abc_fade_in);
        viewFlipper.setOutAnimation(this, R.anim.abc_fade_out);

        for(int x = 0; x < its.length; x++){
            its[x].setTypeface(Typeface.createFromAsset(getAssets(), "LuckiestGuy.ttf"));
        }
        signUpBtn.setTypeface(Typeface.createFromAsset(getAssets(), "LuckiestGuy.ttf"));
        backBtn.setTypeface(Typeface.createFromAsset(getAssets(), "LuckiestGuy.ttf"));
        nextBtn.setTypeface(Typeface.createFromAsset(getAssets(), "LuckiestGuy.ttf"));
        randomBtn.setTypeface(Typeface.createFromAsset(getAssets(), "LuckiestGuy.ttf"));
        nameTitle.setTypeface(Typeface.createFromAsset(getAssets(), "LuckiestGuy.ttf"));
        nameInput.setTypeface(Typeface.createFromAsset(getAssets(), "LuckiestGuy.ttf"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_introduction, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onNextClicked(View v) {
        //viewFlipper.showNext();
    }

    public void onBackClicked(View v) {
        viewFlipper.showPrevious();
        backBtn.setVisibility(View.GONE);
        nextBtn.setVisibility(View.GONE);
    }
    public void onRandomNameClicked(View v) {
        nameInput.setText("Ronald");
    }
    public void onSignUpClicked(View v) {
        viewFlipper.showNext();
        backBtn.setVisibility(View.VISIBLE);
        nextBtn.setVisibility(View.VISIBLE);
        nameInput.clearFocus();
    }


}

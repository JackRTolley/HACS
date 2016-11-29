package comp.hacsprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by domt on 27/11/2016.
 */

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void gotoQuestionaire(View view){
        Intent intent = new Intent(this, Questionaire.class);
        startActivity(intent);
    }

    public void gotoShop(View view){
        Intent intent = new Intent(this, Shop.class);
        startActivity(intent);
    }

}

package yasunin.kirk.kriekshoppingmall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import yasunin.kirk.kriekshoppingmall.frangment.MainFrangment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMain,new MainFrangment()).commit();
        }

    }  //Main Method
}   //Main Class

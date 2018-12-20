package home.stanislavpoliakov.meet6_refactoring;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ActivityCallback {
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private String message;

    @Override
    public void buttonPressed() {
        Bundle bundle = new Bundle();
        bundle.putString("Message", message);
        fragmentManager.beginTransaction()
                .replace(R.id.frameLayout, Fragment3.newInstance(bundle))
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void setText(String message) {
        this.message = message;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(MyService.newIntent(MainActivity.this));
    }


}

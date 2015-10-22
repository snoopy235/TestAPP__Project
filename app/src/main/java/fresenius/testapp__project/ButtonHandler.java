package fresenius.testapp__project;

import android.content.Intent;
import android.view.View;

/**
 * Created by snoopy235 on 22.10.2015.
 */
public class ButtonHandler implements View.OnClickListener {

    private MainActivity mainActivity = null;

    @Override
    public void onClick(View v) {
        mainActivity = (MainActivity)v.getContext();

        switch(v.getId()){
            case R.id.login_button:
                Intent in = new Intent(mainActivity.getApplication(), SecondActivity.class);
                mainActivity.startActivity(in);
                break;
        }

    }
}

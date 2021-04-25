package d.com.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    private TextView textView;
    private Button AddButton;
    private int x=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);


    }

    public void AddButton(View view)
    {
        x +=1;
        String text = String.valueOf(x);
        textView.setText(text);
    }
}
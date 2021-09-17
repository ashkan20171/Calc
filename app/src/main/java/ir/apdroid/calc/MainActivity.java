package ir.apdroid.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        n1=(EditText)findViewById(R.id.editText1);
        n2=(EditText)findViewById(R.id.editText2);
        result=(TextView)findViewById(R.id.textView3);
    }


    public void add(View v){
        try {
            int x = Integer.parseInt(n1.getText().toString());
            int y = Integer.parseInt(n2.getText().toString());
            int z = x + y;
            result.setText(String.valueOf(z));
        }
        catch(Exception e){
            Toast.makeText(this, "خطا در اعداد ورودی "+"\n"+e , Toast.LENGTH_LONG).show();
        }
    }

}

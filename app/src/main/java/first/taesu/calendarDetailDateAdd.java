package first.taesu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class calendarDetailDateAdd extends AppCompatActivity {

    Button DateAdd_button;

    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_detail_date_add);

        DateAdd_button = (Button)findViewById(R.id.date_add_button);
        DateAdd_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dateAddIntent = new Intent(getApplicationContext(), calendarDetailDateAdd.class);
                startActivity(dateAddIntent);
            }
        });
    }
}

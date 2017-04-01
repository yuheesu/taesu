package first.taesu;

import android.os.Bundle;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class calendarDetail extends Activity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;



    private List<calendarDetail_ListItem> calendarDetail_listsItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_detail);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        calendarDetail_listsItem = new ArrayList<>();

        for(int i = 0; i<=10; i++) {
            calendarDetail_ListItem calendarlistItem = new calendarDetail_ListItem(
                    "heading" + (i+1),
                    "asdf,", "12"
            );
            calendarDetail_listsItem.add(calendarlistItem);
        }

        adapter = new calendarDetailRecyclerViewAdapter(calendarDetail_listsItem, this);

        recyclerView.setAdapter(adapter);
    }

}
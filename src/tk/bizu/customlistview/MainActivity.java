package tk.bizu.customlistview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayList<CustomDTO> list = new ArrayList<CustomDTO>();

		list.add(new CustomDTO("Title1","Describe",R.drawable.ic_launcher));
		list.add(new CustomDTO("Title1","Describe",R.drawable.ic_launcher));
		list.add(new CustomDTO("Title1","Describe",R.drawable.ic_launcher));
		list.add(new CustomDTO("Title1","Describe",R.drawable.ic_launcher));
		list.add(new CustomDTO("Title1","Describe",R.drawable.ic_launcher));
		list.add(new CustomDTO("Title1","Describe",R.drawable.ic_launcher));
		
		CustomAdapter adapter = new CustomAdapter(this, R.layout.list_row, list);
		ListView lv = (ListView)findViewById(R.id.listview);
		lv.setAdapter(adapter);
	}
}

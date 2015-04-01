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

		list.add(new CustomDTO("컴퓨터","사고싶다....",R.drawable.img01));
		list.add(new CustomDTO("디스크","저 to the 장",R.drawable.img02));
		list.add(new CustomDTO("지도","여행가자!!",R.drawable.img03));
		list.add(new CustomDTO("마킹","뿅!",R.drawable.img04));
		list.add(new CustomDTO("돈","주세요.....",R.drawable.img05));
		list.add(new CustomDTO("++++","내삶의 +",R.drawable.img06));
		list.add(new CustomDTO("체크","는 완료의 의미",R.drawable.img07));
		list.add(new CustomDTO("엑스","는 취소의 의미",R.drawable.img08));
		list.add(new CustomDTO("별","은 중요하다는 의미",R.drawable.img09));
		list.add(new CustomDTO("사람들","을 많이 사귀자!",R.drawable.img10));
		
		CustomAdapter adapter = new CustomAdapter(this, R.layout.list_row, list);
		ListView lv = (ListView)findViewById(R.id.listview);
		lv.setAdapter(adapter);
	}
}

package tk.bizu.customlistview;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	ArrayList<CustomDTO> list = new ArrayList<CustomDTO>();

	TextView title, detail;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		list.add(new CustomDTO("컴퓨터","사고싶다....",R.drawable.img01, "최고급 컴퓨터로!!!\ni7... gtx980... 16gb ram.."));
		list.add(new CustomDTO("디스크","저 to the 장",R.drawable.img02, "요즘 저장장치에는 HDD, SDD가 있습니다.\nHDD는 자기유도방식을 이용하고, SSD는 NAND 메모리를 이용합니다."));
		list.add(new CustomDTO("지도","여행가자!!",R.drawable.img03,"우리나라에선 다음맵이나, 네이버지도를!\n외국엔 구글맵이 좋은듯.."));
		list.add(new CustomDTO("마킹","뿅!",R.drawable.img04, "가고싶은곳\n미국, 호주, 유럽, 일본 !!"));
		list.add(new CustomDTO("돈","주세요.....",R.drawable.img05, "많이주면 좋아요........"));
		list.add(new CustomDTO("++++","내삶의 +",R.drawable.img06, "영화, 미드, 게임, 인터넷!"));
		list.add(new CustomDTO("체크","는 완료의 의미",R.drawable.img07, "초등학교, 중학교, 고등학교, 대학교는 마쳣습니다..... 대학원 2년!..."));
		list.add(new CustomDTO("엑스","는 취소의 의미",R.drawable.img08,""));
		list.add(new CustomDTO("별","은 중요하다는 의미",R.drawable.img09,"가족, 친구, 컴퓨터 등등등......."));
		list.add(new CustomDTO("사람들","을 많이 사귀자!",R.drawable.img10,"SNS는 인생의 낭비다!\n사람들은 직접 발로뛰면서 만나자."));
		
		CustomAdapter adapter = new CustomAdapter(this, R.layout.list_row, list);
		ListView lv = (ListView)findViewById(R.id.listview);

		lv.setAdapter(adapter);
		lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            	showDialog(position);
            }
        });
	}
protected Dialog onCreateDialog(int id) {
		
		Dialog myDialog = null;
		
		myDialog = new Dialog(this);
		myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		myDialog.setContentView(R.layout.custom);
		
	    
	    title = (TextView) myDialog.findViewById(R.id.title);
	    detail = (TextView) myDialog.findViewById(R.id.detail);

		title.setText(list.get(id).getTitle() + " "+ list.get(id).getDescribe());
		detail.setText(list.get(id).getDetail());
		
		return myDialog;
	}    

}

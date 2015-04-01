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

		list.add(new CustomDTO("��ǻ��","���ʹ�....",R.drawable.img01));
		list.add(new CustomDTO("��ũ","�� to the ��",R.drawable.img02));
		list.add(new CustomDTO("����","���డ��!!",R.drawable.img03));
		list.add(new CustomDTO("��ŷ","��!",R.drawable.img04));
		list.add(new CustomDTO("��","�ּ���.....",R.drawable.img05));
		list.add(new CustomDTO("++++","������ +",R.drawable.img06));
		list.add(new CustomDTO("üũ","�� �Ϸ��� �ǹ�",R.drawable.img07));
		list.add(new CustomDTO("����","�� ����� �ǹ�",R.drawable.img08));
		list.add(new CustomDTO("��","�� �߿��ϴٴ� �ǹ�",R.drawable.img09));
		list.add(new CustomDTO("�����","�� ���� �����!",R.drawable.img10));
		
		CustomAdapter adapter = new CustomAdapter(this, R.layout.list_row, list);
		ListView lv = (ListView)findViewById(R.id.listview);
		lv.setAdapter(adapter);
	}
}

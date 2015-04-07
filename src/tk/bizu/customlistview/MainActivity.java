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

		list.add(new CustomDTO("��ǻ��","���ʹ�....",R.drawable.img01, "�ְ�� ��ǻ�ͷ�!!!\ni7... gtx980... 16gb ram.."));
		list.add(new CustomDTO("��ũ","�� to the ��",R.drawable.img02, "���� ������ġ���� HDD, SDD�� �ֽ��ϴ�.\nHDD�� �ڱ���������� �̿��ϰ�, SSD�� NAND �޸𸮸� �̿��մϴ�."));
		list.add(new CustomDTO("����","���డ��!!",R.drawable.img03,"�츮���󿡼� �������̳�, ���̹�������!\n�ܱ��� ���۸��� ������.."));
		list.add(new CustomDTO("��ŷ","��!",R.drawable.img04, "���������\n�̱�, ȣ��, ����, �Ϻ� !!"));
		list.add(new CustomDTO("��","�ּ���.....",R.drawable.img05, "�����ָ� ���ƿ�........"));
		list.add(new CustomDTO("++++","������ +",R.drawable.img06, "��ȭ, �̵�, ����, ���ͳ�!"));
		list.add(new CustomDTO("üũ","�� �Ϸ��� �ǹ�",R.drawable.img07, "�ʵ��б�, ���б�, ����б�, ���б��� �������ϴ�..... ���п� 2��!..."));
		list.add(new CustomDTO("����","�� ����� �ǹ�",R.drawable.img08,""));
		list.add(new CustomDTO("��","�� �߿��ϴٴ� �ǹ�",R.drawable.img09,"����, ģ��, ��ǻ�� ����......."));
		list.add(new CustomDTO("�����","�� ���� �����!",R.drawable.img10,"SNS�� �λ��� �����!\n������� ���� �߷ζٸ鼭 ������."));
		
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

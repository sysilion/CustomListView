package tk.bizu.customlistview;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

	Context ctx;
	int layout;
	ArrayList<CustomDTO> list;
	LayoutInflater inf;


	public CustomAdapter(Context ctx, int layout, ArrayList<CustomDTO> list) {
		this.ctx = ctx;
		this.layout = layout;
		this.list = list;
		
		inf = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView == null) convertView = inf.inflate(layout, null);

		TextView title = (TextView)convertView.findViewById(R.id.txtTitle);
		TextView describe = (TextView)convertView.findViewById(R.id.txtContent);
		ImageView image1 = (ImageView)convertView.findViewById(R.id.imgIcon1);
		ImageView image2 = (ImageView)convertView.findViewById(R.id.imgIcon2);
		
		CustomDTO dto = list.get(position);
		title.setText(dto.getTitle());
		describe.setText(dto.getDescribe());
		image1.setImageResource(dto.getImage());;
		image2.setImageResource(dto.getImage());;
		return convertView;
	}

}

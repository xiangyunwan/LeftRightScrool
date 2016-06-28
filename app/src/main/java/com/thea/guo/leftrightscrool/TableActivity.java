package com.thea.guo.leftrightscrool;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.thea.guo.leftrightscrool.adapter.MyLeftAdapter;
import com.thea.guo.leftrightscrool.adapter.MyRightAdapter;
import com.thea.guo.leftrightscrool.model.RightModel;
import com.thea.guo.leftrightscrool.tool.UtilTools;
import com.thea.guo.leftrightscrool.view.SyncHorizontalScrollView;

import java.util.ArrayList;
import java.util.List;

public class TableActivity extends Activity {
	private LinearLayout leftContainerView;
	private ListView leftListView;
	private List<String> leftlList;
	private LinearLayout rightContainerView;
	private ListView rightListView;
	private List<RightModel> models;
	private SyncHorizontalScrollView titleHorsv;
	private SyncHorizontalScrollView contentHorsv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_tab_view);
		leftContainerView = (LinearLayout) findViewById(R.id.left_container);
		leftListView = (ListView) findViewById(R.id.left_container_listview);
		rightContainerView = (LinearLayout) findViewById(R.id.right_container);
		rightListView = (ListView) findViewById(R.id.right_container_listview);
		titleHorsv = (SyncHorizontalScrollView) findViewById(R.id.title_horsv);
		contentHorsv = (SyncHorizontalScrollView) findViewById(R.id.content_horsv);
		// ��������ˮƽ�ؼ�������
		titleHorsv.setScrollView(contentHorsv);
		contentHorsv.setScrollView(titleHorsv);

		//
		leftContainerView.setBackgroundColor(Color.YELLOW);
		initLeftData();
		MyLeftAdapter adapter=new MyLeftAdapter(this, leftlList);
		leftListView.setAdapter(adapter);
		UtilTools.setListViewHeightBasedOnChildren(leftListView);
		//
		rightContainerView.setBackgroundColor(Color.GRAY);
		initRightData();
		MyRightAdapter myRightAdapter=new MyRightAdapter(this, models);
		rightListView.setAdapter(myRightAdapter);
		UtilTools.setListViewHeightBasedOnChildren(rightListView);
	}

	private void initRightData() {
		models=new ArrayList<RightModel>();
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
		models.add(new RightModel("111", "222", "333", "444", "555", "666"));
	}

	private void initLeftData() {
		leftlList=new ArrayList<String>();
		leftlList.add("aaaa");
		leftlList.add("aaaa");
		leftlList.add("aaaa");
		leftlList.add("aaaa");
		leftlList.add("aaaa");
		leftlList.add("aaaa");
		leftlList.add("aaaa");
		leftlList.add("aaaa");
		leftlList.add("aaaa");
		leftlList.add("aaaa");
		leftlList.add("aaaa");
		leftlList.add("aaaa");
		leftlList.add("aaaa");
		leftlList.add("aaaa");
		leftlList.add("aaaa");
	}
}
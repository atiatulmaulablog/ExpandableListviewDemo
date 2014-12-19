package atiatulmaula.expandablelistviewdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	private ExpandableListView mExpandableListView;
	private ExpandListAdapter mAdapter;
	private List<String> mGroups;
	private HashMap<String, List<String>> mChilds;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);

		prepareData();
		mAdapter = new ExpandListAdapter(this, mGroups, mChilds);
		mExpandableListView = (ExpandableListView) findViewById(R.id.expand_listview);

		mExpandableListView.setAdapter(mAdapter);
		mExpandableListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				switch (groupPosition) {
				case 0:
					switch (childPosition) {
					case 0:
						Toast.makeText(MainActivity.this, "menu 1",
								Toast.LENGTH_SHORT).show();
						break;
					case 1:
						Toast.makeText(MainActivity.this, "menu 2",
								Toast.LENGTH_SHORT).show();
						break;
					case 2:
						Toast.makeText(MainActivity.this, "menu 3",
								Toast.LENGTH_SHORT).show();
						break;
					default:
						break;
					}
					break;
				case 1:
					switch (childPosition) {
					case 0:
						Toast.makeText(MainActivity.this, "menu 1",
								Toast.LENGTH_SHORT).show();
						break;
					case 1:
						Toast.makeText(MainActivity.this, "menu 2",
								Toast.LENGTH_SHORT).show();
						break;
					case 2:
						Toast.makeText(MainActivity.this, "menu 3",
								Toast.LENGTH_SHORT).show();
						break;
					default:
						break;
					}
					break;
				case 2:
					switch (childPosition) {
					case 0:
						Toast.makeText(MainActivity.this, "menu 1",
								Toast.LENGTH_SHORT).show();
						break;
					case 1:
						Toast.makeText(MainActivity.this, "menu 2",
								Toast.LENGTH_SHORT).show();
						break;
					case 2:
						Toast.makeText(MainActivity.this, "menu 3",
								Toast.LENGTH_SHORT).show();
						break;
					default:
						break;
					}
					break;
				case 3:
					switch (childPosition) {
					case 0:
						Toast.makeText(MainActivity.this, "menu 1",
								Toast.LENGTH_SHORT).show();
						break;
					case 1:
						Toast.makeText(MainActivity.this, "menu 2",
								Toast.LENGTH_SHORT).show();
						break;
					case 2:
						Toast.makeText(MainActivity.this, "menu 3",
								Toast.LENGTH_SHORT).show();
						break;
					default:
						break;
					}
					break;
				default:
					break;
				}
				return false;
			}
		});
	}

	private void prepareData() {
		mGroups = new ArrayList<String>();
		mChilds = new HashMap<String, List<String>>();

		mGroups.add("Group 1");
		mGroups.add("Group 2");
		mGroups.add("Group 3");
		mGroups.add("Group 4");

		List<String> menu = new ArrayList<String>();
		menu.add("menu 1");
		menu.add("menu 2");
		menu.add("menu 3");

		mChilds.put(mGroups.get(0), menu);
		mChilds.put(mGroups.get(1), menu);
		mChilds.put(mGroups.get(2), menu);
		mChilds.put(mGroups.get(3), menu);
	}
}

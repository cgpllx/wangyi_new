package com.kubeiwu.wangyi.ui.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.kubeiwu.wangyi.R;
import com.kubeiwu.wangyi.ui.fragment.TabFragment;
import com.kubeiwu.wangyi.ui.fragment.NewsFragment1.MyListAdapter;

/**
 * @author  cgpllx1@qq.com (www.kubeiwu.com)
 * @date    2014-8-27
 */
public class HomeActivity extends ActionBarActivity {
	private ActionBarDrawerToggle mDrawerToggle;
	private DrawerLayout mDrawerLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//		getSupportActionBar().hide();
		super.onCreate(savedInstanceState);
		//		getSupportActionBar().setIcon(R.drawable.home_icon2);
		setContentView(R.layout.activity_home);
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		ListView listView=(ListView) findViewById(R.id.start_drawer);
		listView.setAdapter(new MyListAdapter(this, 0));
		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.drawable.home_icon2, R.string.app_name, R.string.app_name);
		mDrawerToggle.setDrawerIndicatorEnabled(false);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayShowHomeEnabled(true);

	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		mDrawerToggle.syncState();
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.replace(R.id.homecount, new TabFragment());
		ft.commitAllowingStateLoss();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			onOROff();
			break;
		default:
			break;
		}

		return super.onOptionsItemSelected(item);
	}

	private void onOROff() {
		if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
			mDrawerLayout.closeDrawer(GravityCompat.START);
		} else {
			mDrawerLayout.openDrawer(GravityCompat.START);
		}
	}
}

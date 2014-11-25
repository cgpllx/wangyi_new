//2014-8-28
package com.kubeiwu.wangyi.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.kubeiwu.wangyi.R;
/**
 * @author  cgpllx1@qq.com (www.kubeiwu.com)
 * @date    2014-8-29
 */
public class NewsFragment1 extends BaseFragment {
	//	View item;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		//		ListView listView = (ListView) view.findViewById(android.R.id.list);
		setListAdapter(new MyListAdapter(getActivity(), 0));
		super.onViewCreated(view, savedInstanceState);
	}

	int lvIndext;

	public static class MyListAdapter extends ArrayAdapter<String> {

		public MyListAdapter(Context context, int textViewResourceId) {
			super(context, textViewResourceId);
		}

		@Override
		public int getCount() {
			return 50;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, null);
			}
			return convertView;
		}

	}

}

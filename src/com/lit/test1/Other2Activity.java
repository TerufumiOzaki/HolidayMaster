package com.lit.test1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Other2Activity extends Activity {

	int a;
	private SharedPreferences mSharedPreferences;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other2);

		setTitle("HolidayMaster");

		mSharedPreferences = PreferenceManager
				.getDefaultSharedPreferences(this);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		adapter.add("特になし (はじめに表示します)");
		adapter.add("ショッピングモール (はじめに表示します)");
		adapter.add("カフェ (はじめに表示します)");
		adapter.add("美術館 (はじめに表示します)");

		Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setAdapter(adapter);

		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				Spinner spinner1 = (Spinner) parent;

				int c = spinner1.getSelectedItemPosition();
				SharedPreferences.Editor edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}

		});
	}

	public void doAction1(View v) {
		a = mSharedPreferences.getInt("a", 0);
		if (a == 0) {
			Intent intent1 = new Intent(Other2Activity.this,
					Other3Activity.class);
			startActivity(intent1);
		} else {
			Intent intent2 = new Intent(Other2Activity.this,
					Other4Activity.class);
			startActivity(intent2);
		}
	}

	public void doAction2(View v) {
		Intent intent1 = new Intent(Other2Activity.this, Other1Activity.class);
		startActivity(intent1);
	}

}

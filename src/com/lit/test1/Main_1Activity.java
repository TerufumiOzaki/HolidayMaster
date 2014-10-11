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

public class Main_1Activity extends Activity {

	int f;
	private SharedPreferences mSharedPreferences;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_1);

		setTitle("HolidayMaster");

		mSharedPreferences = PreferenceManager
				.getDefaultSharedPreferences(this);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		adapter.add("指定なし");
		adapter.add("新宿区");
		adapter.add("渋谷区");
		adapter.add("世田谷区");
		adapter.add("江東区");
		adapter.add("目黒区");
		adapter.add("港区");

		Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setAdapter(adapter);

		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				Spinner spinner1 = (Spinner) parent;

				int f = spinner1.getSelectedItemPosition();
				SharedPreferences.Editor edit = mSharedPreferences.edit();
				edit.putInt("f", f);
				edit.commit();

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}

		});
	}

	public void doAction1(View v) {
		Intent intent1 = new Intent(Main_1Activity.this, Other1Activity.class);
		startActivity(intent1);
	}

	public void doAction2(View v) {
		Intent intent1 = new Intent(Main_1Activity.this, MainActivity.class);
		startActivity(intent1);
	}

}
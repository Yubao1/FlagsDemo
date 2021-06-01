package com.example.demo5_31;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
	
	public void onClick(View v) {
		Context context = getApplicationContext();
		Intent intent = new Intent(this,Main2Activity.class);
		
		//当添加这一行代码时，程序就可以正常运行
//		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		
		context.startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

package jp.android.fukuoka.scorecaster;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;

public class ScoreCaster extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		menu.add(0,0,0, "更新").setIcon(android.R.drawable.ic_menu_rotate);
		menu.add(0,1,1, "設定").setIcon(android.R.drawable.ic_menu_preferences);
		return true;
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		super.onMenuItemSelected(featureId, item);
		switch (item.getItemId()) {
			case 1:
				//
//				Intent intent = new Intent(this, Preference.class);
//				startActivity(intent);
			break;
		}
		return true;
	}
}
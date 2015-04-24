package com.example.tkusamplecode_simpleunit2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Xavier on 2015/4/20.
 */
public class ActivityA extends Activity {
	public static final String TEXT = "INTENT_TEXT";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.layout_activity_a);

		final Button bOriginalButton = (Button) this.findViewById(R.id.btn_a_original);
		bOriginalButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActivityA.this, ActivityB.class);
				intent.putExtra(TEXT, bOriginalButton.getText());
				startActivity(intent);
			}
		});

		final Button bClickableButton = (Button) this.findViewById(R.id.btn_a_clickable);
		bClickableButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActivityA.this, ActivityB.class);
				intent.putExtra(TEXT, bClickableButton.getText());
				startActivity(intent);
			}
		});
	}
}

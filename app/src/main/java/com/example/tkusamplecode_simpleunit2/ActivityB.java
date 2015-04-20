package com.example.tkusamplecode_simpleunit2;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Xavier on 2015/4/20.
 */
public class ActivityB extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.layout_activity_b);

		TextView bResultText = (TextView) this.findViewById(R.id.text_b_result);
		final EditText bInputEdit = (EditText) this.findViewById(R.id.edit_b_input);
		Button bSendButton = (Button) this.findViewById(R.id.btn_b_send);

		String result = this.getIntent().getStringExtra(ActivityA.TEXT);
		if (!TextUtils.isEmpty(result)) {
			bResultText.setText(this.getString(R.string.text_b_result, result));
		} else {
			bResultText.setText(this.getString(R.string.text_b_result, this.getString(R.string.text_no_result)));
		}

		bSendButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(ActivityB.this, bInputEdit.getText(), Toast.LENGTH_LONG).show();
				finish();
			}
		});
	}
}

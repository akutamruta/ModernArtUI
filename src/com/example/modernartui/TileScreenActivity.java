package com.example.modernartui;


import com.example.modernartui.util.UITile;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;



public class TileScreenActivity extends Activity {
	
	
	private SeekBar colorContol = null;
	private TextView r1c1 = null;
	private TextView r1c2 = null;
	
	private TextView r2c1 = null;
	private TextView r2c2 = null;
	
	private TextView r3c1 = null;
	private TextView r3c2 = null;
	

	private UITile initializeUITile(TextView tv)
	{
		final UITile uti = new UITile();
		ColorDrawable cd = (ColorDrawable)tv.getBackground();
		int color = cd.getColor();	
		uti.initializeColorArray(color);
		
		return uti;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_fullscreen);

		
		
		colorContol = (SeekBar) findViewById(R.id.seekBar1);
		r1c1 = (TextView)findViewById(R.id.r1c1);
		r1c2 = (TextView)findViewById(R.id.r1c2);
		r2c1 = (TextView)findViewById(R.id.r2c1);
		r2c2 = (TextView)findViewById(R.id.r2c2);
		r3c1 = (TextView)findViewById(R.id.r3c1);
		r3c2 = (TextView)findViewById(R.id.r3c2);
		
		final UITile r1c1UTI = initializeUITile(r1c1);
		final UITile r1c2UTI = initializeUITile(r1c2);
		final UITile r2c1UTI = initializeUITile(r2c1);
		final UITile r2c2UTI = initializeUITile(r2c2);
		final UITile r3c1UTI = initializeUITile(r3c1);
		final UITile r3c2UTI = initializeUITile(r3c2);
		
		
		colorContol.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			int progressChanged = 0, color;
			ColorDrawable cd;
			int previousProgress = 0;

			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
				progressChanged = progress;
							
				r1c1.setBackgroundColor(r1c1UTI.getColorTint(progress));
				r1c2.setBackgroundColor(r1c2UTI.getColorTint(progress));
				r2c1.setBackgroundColor(r2c1UTI.getColorTint(progress));
				r2c2.setBackgroundColor(r2c2UTI.getColorTint(progress));
				r3c1.setBackgroundColor(r3c1UTI.getColorTint(progress));
				r3c2.setBackgroundColor(r3c2UTI.getColorTint(progress));
			}
			

			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
			}

			public void onStopTrackingTouch(SeekBar seekBar) {
				
			}
		});
		
	}

}

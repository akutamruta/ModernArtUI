package com.example.modernartui.util;

import android.graphics.Color;

public class UITile {
	
	public UITile() {
		// TODO Auto-generated constructor stub
		colorArray = new int[COLOR_ARRAY_SIZE];
	}
	
	
	int[] colorArray;
	final int COLOR_ARRAY_SIZE=100;
	
	public void initializeColorArray(int color)
	{
		
		int redHue = Color.red(color);
		int greenHue = Color.green(color);
		int blueHue = Color.blue(color);
	    
		for (int i=0; i < COLOR_ARRAY_SIZE ; i++)
		{
			int red = (int) Math.round(Math.max(0, redHue - 255 * i/COLOR_ARRAY_SIZE));
		    int green = (int) Math.round(Math.max(0, greenHue - 225 * i/COLOR_ARRAY_SIZE));
		    int blue = (int) Math.round(Math.max(0, blueHue - 225 * i/COLOR_ARRAY_SIZE));
						
		    if(redHue == 0xE6 && greenHue == 0xE4 && blueHue == 0xE4)
		    {
		    	colorArray[i] = Color.rgb(redHue, greenHue, blueHue);
		    }
		    else
		    {
		    	if(red < 30)
		    	{
		    		red = red + 150;
		    	}
		    	if(green < 30)
		    	{
		    		green += 150;
		    	}
		    	if(blue < 30)
		    	{
		    		blue += 150;
		    	}
		    	colorArray[i] = Color.rgb(red, green, blue);
		    }
		}
	}
	
	public int getColorTint(int index) {
		
		if(index == 0)
			return colorArray[index];
		else
			return colorArray[index-1];
	}
	
	
}

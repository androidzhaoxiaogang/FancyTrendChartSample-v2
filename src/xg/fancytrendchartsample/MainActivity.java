package xg.fancytrendchartsample;

import java.util.ArrayList;
import java.util.List;

import xg.fancytrendchart.TrendChartView;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	private TrendChartView chartView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		setupViews();
	}
	
	private void setupViews() {
		chartView = (TrendChartView) findViewById(R.id.trend_chart);
		
		chartView.setTopTile("AAAAAAAAAAAAA");
		
		List<String> xValueList = new ArrayList<String>();
		
		xValueList.add("2014-02-01");
		xValueList.add("2014-02-02");
		xValueList.add("2014-02-03");
		xValueList.add("2014-02-04");
		xValueList.add("2014-02-05");
		xValueList.add("2014-02-06");
		xValueList.add("2014-02-07");
		
		chartView.setxValueList(xValueList);
		
		List<String> yValueList = new ArrayList<String>();
		
		yValueList.add("4.3000");
		yValueList.add("4.9000");
		yValueList.add("5.2000");
		yValueList.add("6.3000");
		yValueList.add("6.5000");
		yValueList.add("6.9000");
		yValueList.add("7.0000");
		
		chartView.setyValueList(yValueList);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

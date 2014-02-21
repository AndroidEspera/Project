package com.addu.ece298exercise1;

import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       ImageView img1 = (ImageView)findViewById(R.id.img1);
       img1.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent();
				ComponentName cn = new ComponentName("com.android.calendar", "com.android.calendar.LaunchActivity");
				i.setComponent(cn);
				startActivity(i);
			}
		});
       
       ImageView img3 = (ImageView)findViewById(R.id.img3);
       img3.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
				startActivity(browserIntent);
			}
		});
       
       
       ImageView img4 = (ImageView)findViewById(R.id.img4);
       img4.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Intent.ACTION_INSERT_OR_EDIT);
                i.setType(ContactsContract.Contacts.CONTENT_ITEM_TYPE);   
                startActivity(i);
			}
		});
       
       ImageView img5 = (ImageView)findViewById(R.id.img5);
       img5.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("android.intent.action.MAIN");
				intent.setComponent(new ComponentName("com.android.mms","com.android.mms.ui.ConversationList"));
				startActivity(intent); 
			}
		});
       
       ImageView img19 = (ImageView)findViewById(R.id.img19);
       img19.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.yahoo.com"));
				startActivity(browserIntent);
			}
		});
       
       ImageView img7 = (ImageView)findViewById(R.id.img7);
       img7.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}
		});
       
       ImageView img11 = (ImageView)findViewById(R.id.img11);
       img11.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				LinearLayout l1 = (LinearLayout)findViewById(R.id.line1);
				l1.setBackgroundColor(Color.RED);
			}
		});
       
       
       ImageView img12 = (ImageView)findViewById(R.id.img12);
       img12.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				LinearLayout l2 = (LinearLayout)findViewById(R.id.line1);
				l2.setBackgroundColor(Color.GREEN);
			}
		});
       
       ImageView img13 = (ImageView)findViewById(R.id.img13);
       img13.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				LinearLayout l3 = (LinearLayout)findViewById(R.id.line1);
				l3.setBackgroundColor(Color.BLUE);
			}
		});
       
       ImageView img15 = (ImageView)findViewById(R.id.img15);
       img15.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ImageView l3 = (ImageView)findViewById(R.id.img8);
				l3.setImageResource(R.drawable.download1);
			}
		});
       
       ImageView img16 = (ImageView)findViewById(R.id.img16);
       img16.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ImageView l3 = (ImageView)findViewById(R.id.img8);
				l3.setImageResource(R.drawable.download2);
			}
		});
       
       ImageView img17 = (ImageView)findViewById(R.id.img17);
       img17.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ImageView l3 = (ImageView)findViewById(R.id.img8);
				l3.setImageResource(R.drawable.download3);
			}
		});
       
       ImageView img18 = (ImageView)findViewById(R.id.img18);
       img18.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ImageView l3 = (ImageView)findViewById(R.id.img8);
				l3.setImageResource(R.drawable.download4);
			}
		});
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
 
}

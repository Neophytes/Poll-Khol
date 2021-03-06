package com.example.jigyasa.poll_khol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;
import it.neokree.materialnavigationdrawer.elements.MaterialAccount;

public class MainActivity extends MaterialNavigationDrawer {

MaterialAccount account;
    @Override
    public void init(Bundle savedInstanceState) {
        account = new MaterialAccount(this.getResources(), "User Name",null,null,null);
        this.addAccount(account);
        ManifestoFragment sampleClassFragment = new ManifestoFragment();
        this.addSection(newSection("Aam Aadmi Party",R.drawable.ic_aap , sampleClassFragment));
        this.addSection(newSection("Bhartiya Janta Party", R.drawable.ic_bjp, sampleClassFragment));
        this.addSection(newSection("Congress", R.drawable.ic_congress, sampleClassFragment));
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

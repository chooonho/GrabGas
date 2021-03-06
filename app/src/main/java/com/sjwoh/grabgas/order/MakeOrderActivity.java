package com.sjwoh.grabgas.order;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.sjwoh.grabgas.R;

public class MakeOrderActivity extends AppCompatActivity implements SelectSupplierFragment.OnFragmentInteractionListener, SelectBrandFragment.OnFragmentInteractionListener, ConfirmOrderFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_order);

        if (savedInstanceState == null) {
            SelectSupplierFragment selectSupplierFragment = new SelectSupplierFragment();

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.rootLayoutMakeOrder, selectSupplierFragment, "SELECT_SUPPLIER")
                    .commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch(menuItem.getItemId()) {
            case android.R.id.home:
                if(getFragmentManager().getBackStackEntryCount() == 0) {
                    this.onBackPressed();
                }
                else {
                    getFragmentManager().popBackStack();
                }

                return true;
        }

        return super.onOptionsItemSelected(menuItem);
    }
}

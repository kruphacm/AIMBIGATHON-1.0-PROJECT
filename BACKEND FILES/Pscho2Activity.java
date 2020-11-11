/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.util.DisplayMetrics
 *  android.util.SparseBooleanArray
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.LinearLayout
 *  android.widget.ListView
 *  android.widget.TextView
 *  android.widget.Toast
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Random
 */
package com.my.newproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.my.newproject.Pscho3Activity;
import com.my.newproject.R;
import java.util.ArrayList;
import java.util.Random;

public class Pscho2Activity
extends Activity {
    private double a = 0.0;
    private Button button4;
    private CheckBox checkbox1;
    private CheckBox checkbox2;
    private CheckBox checkbox3;
    private Intent k = new Intent();
    private LinearLayout linear1;
    private TextView textview1;

    static /* synthetic */ void access$1(Pscho2Activity pscho2Activity, double d) {
        pscho2Activity.a = d;
    }

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout)this.findViewById(R.id.linear1);
        this.checkbox1 = (CheckBox)this.findViewById(R.id.checkbox1);
        this.checkbox2 = (CheckBox)this.findViewById(R.id.checkbox2);
        this.checkbox3 = (CheckBox)this.findViewById(R.id.checkbox3);
        this.button4 = (Button)this.findViewById(R.id.button4);
        this.textview1 = (TextView)this.findViewById(R.id.textview1);
        this.checkbox1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Pscho2Activity.this.checkbox1.setChecked(false);
            }
        });
        this.checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                Pscho2Activity.access$1(Pscho2Activity.this, 20.0);
            }
        });
        this.checkbox2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
            }
        });
        this.checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                Pscho2Activity.access$1(Pscho2Activity.this, 10.0);
            }
        });
        this.checkbox3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
            }
        });
        this.checkbox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                Pscho2Activity.access$1(Pscho2Activity.this, 30.0);
            }
        });
        this.button4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Pscho2Activity.this.k.setClass(Pscho2Activity.this.getApplicationContext(), Pscho3Activity.class);
                Pscho2Activity.this.startActivity(Pscho2Activity.this.k);
            }
        });
    }

    private void initializeLogic() {
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList arrayList = new ArrayList();
        SparseBooleanArray sparseBooleanArray = listView.getCheckedItemPositions();
        int n = 0;
        while (n < sparseBooleanArray.size()) {
            if (sparseBooleanArray.valueAt(n)) {
                arrayList.add((Object)sparseBooleanArray.keyAt(n));
            }
            ++n;
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int n) {
        return TypedValue.applyDimension((int)1, (float)n, (DisplayMetrics)this.getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return this.getResources().getDisplayMetrics().heightPixels;
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return this.getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getLocationX(View view) {
        int[] arrn = new int[2];
        view.getLocationInWindow(arrn);
        return arrn[0];
    }

    @Deprecated
    public int getLocationY(View view) {
        int[] arrn = new int[2];
        view.getLocationInWindow(arrn);
        return arrn[1];
    }

    @Deprecated
    public int getRandom(int n, int n2) {
        return n + new Random().nextInt(1 + (n2 - n));
    }

    protected void onActivityResult(int n, int n2, Intent intent) {
        super.onActivityResult(n, n2, intent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R.layout.pscho2);
        this.initialize(bundle);
        this.initializeLogic();
    }

    @Deprecated
    public void showMessage(String string2) {
        Toast.makeText((Context)this.getApplicationContext(), (CharSequence)string2, (int)0).show();
    }

}


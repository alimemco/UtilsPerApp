package com.alirnp.utilsperapp.customView;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

import com.alirnp.utilsperapp.base.Constants;
import com.alirnp.utilsperapp.R;
import com.alirnp.utilsperapp.base.UtilsPerApp;

public class MyTextView extends AppCompatTextView {


    public MyTextView(Context context) {
        super(context);
        setupFont(null);
    }


    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setupFont(attrs);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setupFont(attrs);
    }

    private void setupFont(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray attributes = getContext().obtainStyledAttributes(attrs, R.styleable.MyTextView);

            try {
                int font = attributes.getInteger(R.styleable.MyTextView_fontCustomTextView, Constants.IRAN_SANS_FONT);

                switch (font) {
                    case Constants.B_YEKAN_FONT:
                        setTypeface(UtilsPerApp.Font.getBYekan(getContext()));
                        break;

                    case Constants.IRAN_SANS_FONT:
                        setTypeface(UtilsPerApp.Font.getIranSans(getContext()));
                        break;

                    case Constants.IRAN_SANS_BOLD_FONT:
                        setTypeface(UtilsPerApp.Font.getIranSansBold(getContext()));
                        break;


                }

            } finally {
                invalidate();
                requestLayout();
                attributes.recycle();
            }
        }
    }
}

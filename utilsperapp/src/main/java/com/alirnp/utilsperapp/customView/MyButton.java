package com.alirnp.utilsperapp.customView;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

import com.alirnp.utilsperapp.base.Constants;
import com.alirnp.utilsperapp.R;
import com.alirnp.utilsperapp.base.UtilsPerApp;

public class MyButton extends AppCompatButton {


    public MyButton(Context context) {
        super(context);
        setupFont(null);
    }


    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setupFont(attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setupFont(attrs);
    }


    private void setupFont(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray attributes = getContext().obtainStyledAttributes(attrs, R.styleable.MyButton);

            try {
                int font = attributes.getInteger(R.styleable.MyButton_fontCustomButton, Constants.IRAN_SANS_FONT);

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
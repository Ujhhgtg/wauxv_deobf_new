package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import me.hd.wauxv.R;
import p000.ViewOnTouchListenerC0098Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final /* synthetic */ int f973Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final Chip f974Ujhhgtgfeyxiexzf;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC0042Ujhhgtgfeyxiexzf viewOnClickListenerC0042Ujhhgtgfeyxiexzf = new ViewOnClickListenerC0042Ujhhgtgfeyxiexzf(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f713Ujhhgtgfeyxiexzf.add(new C0041Ujhhgtgfeyxiexzf());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f974Ujhhgtgfeyxiexzf = chip2;
        ViewOnTouchListenerC0098Ujhhgtgfeyxiexzf viewOnTouchListenerC0098Ujhhgtgfeyxiexzf = new ViewOnTouchListenerC0098Ujhhgtgfeyxiexzf(1, new GestureDetector(getContext(), new C0043Ujhhgtgfeyxiexzf(this)));
        chip.setOnTouchListener(viewOnTouchListenerC0098Ujhhgtgfeyxiexzf);
        chip2.setOnTouchListener(viewOnTouchListenerC0098Ujhhgtgfeyxiexzf);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC0042Ujhhgtgfeyxiexzf);
        chip2.setOnClickListener(viewOnClickListenerC0042Ujhhgtgfeyxiexzf);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f974Ujhhgtgfeyxiexzf.sendAccessibilityEvent(8);
        }
    }
}

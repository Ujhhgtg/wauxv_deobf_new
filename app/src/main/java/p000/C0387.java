package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.material.slider.Slider;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤝᲇᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0387 extends AbstractC1258 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final Slider f1792;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final Rect f1793;

    public C0387(Slider slider) {
        super(slider);
        this.f1793 = new Rect();
        this.f1792 = slider;
    }

    @Override // p000.AbstractC1258
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final int mo1543(float f, float f2) {
        int i = 0;
        while (true) {
            Slider slider = this.f1792;
            if (i >= slider.getValues().size()) {
                return -1;
            }
            Rect rect = this.f1793;
            slider.m1567(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    @Override // p000.AbstractC1258
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void mo1544(ArrayList arrayList) {
        for (int i = 0; i < this.f1792.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // p000.AbstractC1258
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final boolean mo1545(int i, int i2, Bundle bundle) {
        Slider slider = this.f1792;
        if (!slider.isEnabled()) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !slider.m1565(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                return false;
            }
            slider.m1568();
            slider.postInvalidate();
            m2944(i);
            return true;
        }
        float fRound = slider.f1846;
        if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        float f = (slider.f1842 - slider.f1841) / fRound;
        float f2 = 20;
        if (f > f2) {
            fRound *= Math.round(f / f2);
        }
        if (i2 == 8192) {
            fRound = -fRound;
        }
        if (slider.m1557()) {
            fRound = -fRound;
        }
        float fFloatValue = slider.getValues().get(i).floatValue() + fRound;
        float valueFrom = slider.getValueFrom();
        float valueTo = slider.getValueTo();
        if (fFloatValue < valueFrom) {
            fFloatValue = valueFrom;
        } else if (fFloatValue > valueTo) {
            fFloatValue = valueTo;
        }
        if (!slider.m1565(i, fFloatValue)) {
            return false;
        }
        slider.m1568();
        slider.postInvalidate();
        m2944(i);
        return true;
    }

    @Override // p000.AbstractC1258
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void mo1546(int i, C0092 c0092) {
        String string;
        AccessibilityNodeInfo accessibilityNodeInfo = c0092.f1045;
        c0092.m1089(C0085.f1036);
        Slider slider = this.f1792;
        List<Float> values = slider.getValues();
        Float f = values.get(i);
        float fFloatValue = f.floatValue();
        float valueFrom = slider.getValueFrom();
        float valueTo = slider.getValueTo();
        if (slider.isEnabled()) {
            if (fFloatValue > valueFrom) {
                c0092.m1088(8192);
            }
            if (fFloatValue < valueTo) {
                c0092.m1088(4096);
            }
        }
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
        c0092.m1095(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (slider.getContentDescription() != null) {
            sb.append(slider.getContentDescription());
            sb.append(",");
        }
        String str = String.format(((float) ((int) fFloatValue)) == fFloatValue ? "%.0f" : "%.2f", f);
        String string2 = slider.getContext().getString(R.string.material_slider_value);
        if (values.size() > 1) {
            if (i == slider.getValues().size() - 1) {
                string = slider.getContext().getString(R.string.material_slider_range_end);
            } else {
                string = i == 0 ? slider.getContext().getString(R.string.material_slider_range_start) : "";
            }
            string2 = string;
        }
        Locale locale = Locale.US;
        sb.append(string2 + ", " + str);
        accessibilityNodeInfo.setContentDescription(sb.toString());
        Rect rect = this.f1793;
        slider.m1567(i, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}

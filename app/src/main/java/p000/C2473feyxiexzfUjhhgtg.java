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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2473feyxiexzfUjhhgtg extends AbstractC3504feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final Slider f8022Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Rect f8023Ujhhgtgfeyxiexzf;

    public C2473feyxiexzfUjhhgtg(Slider slider) {
        super(slider);
        this.f8023Ujhhgtgfeyxiexzf = new Rect();
        this.f8022Ujhhgtgfeyxiexzf = slider;
    }

    @Override // p000.AbstractC3504feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final int mo3728Ujhhgtgfeyxiexzf(float f, float f2) {
        int i = 0;
        while (true) {
            Slider slider = this.f8022Ujhhgtgfeyxiexzf;
            if (i >= slider.getValues().size()) {
                return -1;
            }
            Rect rect = this.f8023Ujhhgtgfeyxiexzf;
            slider.m3752Ujhhgtgfeyxiexzf(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    @Override // p000.AbstractC3504feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void mo3729Ujhhgtgfeyxiexzf(ArrayList arrayList) {
        for (int i = 0; i < this.f8022Ujhhgtgfeyxiexzf.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // p000.AbstractC3504feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final boolean mo3730Ujhhgtgfeyxiexzf(int i, int i2, Bundle bundle) {
        Slider slider = this.f8022Ujhhgtgfeyxiexzf;
        if (!slider.isEnabled()) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !slider.m3750Ujhhgtgfeyxiexzf(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                return false;
            }
            slider.m3753Ujhhgtgfeyxiexzf();
            slider.postInvalidate();
            m5021Ujhhgtgfeyxiexzf(i);
            return true;
        }
        float fRound = slider.f8074Ujhhgtgfeyxiexzf;
        if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        float f = (slider.f8070feyxiexzfUjhhgtg - slider.f8069feyxiexzfUjhhgtg) / fRound;
        float f2 = 20;
        if (f > f2) {
            fRound *= Math.round(f / f2);
        }
        if (i2 == 8192) {
            fRound = -fRound;
        }
        if (slider.m3742Ujhhgtgfeyxiexzf()) {
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
        if (!slider.m3750Ujhhgtgfeyxiexzf(i, fFloatValue)) {
            return false;
        }
        slider.m3753Ujhhgtgfeyxiexzf();
        slider.postInvalidate();
        m5021Ujhhgtgfeyxiexzf(i);
        return true;
    }

    @Override // p000.AbstractC3504feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void mo3731Ujhhgtgfeyxiexzf(int i, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        String string;
        AccessibilityNodeInfo accessibilityNodeInfo = c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf;
        c2963feyxiexzfUjhhgtg.m4433Ujhhgtgfeyxiexzf(C2956feyxiexzfUjhhgtg.f9263Ujhhgtgfeyxiexzf);
        Slider slider = this.f8022Ujhhgtgfeyxiexzf;
        List<Float> values = slider.getValues();
        Float f = values.get(i);
        float fFloatValue = f.floatValue();
        float valueFrom = slider.getValueFrom();
        float valueTo = slider.getValueTo();
        if (slider.isEnabled()) {
            if (fFloatValue > valueFrom) {
                c2963feyxiexzfUjhhgtg.m4432Ujhhgtgfeyxiexzf(8192);
            }
            if (fFloatValue < valueTo) {
                c2963feyxiexzfUjhhgtg.m4432Ujhhgtgfeyxiexzf(4096);
            }
        }
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
        c2963feyxiexzfUjhhgtg.m4439Ujhhgtgfeyxiexzf(SeekBar.class.getName());
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
        Rect rect = this.f8023Ujhhgtgfeyxiexzf;
        slider.m3752Ujhhgtgfeyxiexzf(i, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}

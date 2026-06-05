package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛲ要点脸ᛳᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2362Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public boolean f7695Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public boolean f7696Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f7697Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f7698Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Parcelable f7699Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Object f7700Ujhhgtgfeyxiexzf;

    public C2362Ujhhgtgfeyxiexzf() {
        this.f7698Ujhhgtgfeyxiexzf = new C0938feyxiexzfUjhhgtg();
        this.f7697Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m3577Ujhhgtgfeyxiexzf() {
        CompoundButton compoundButton = (CompoundButton) this.f7698Ujhhgtgfeyxiexzf;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f7695Ujhhgtgfeyxiexzf || this.f7696Ujhhgtgfeyxiexzf) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f7695Ujhhgtgfeyxiexzf) {
                    drawableMutate.setTintList((ColorStateList) this.f7699Ujhhgtgfeyxiexzf);
                }
                if (this.f7696Ujhhgtgfeyxiexzf) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f7700Ujhhgtgfeyxiexzf);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public Bundle m3578Ujhhgtgfeyxiexzf(String str) {
        if (!this.f7696Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f7699Ujhhgtgfeyxiexzf;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f7699Ujhhgtgfeyxiexzf;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f7699Ujhhgtgfeyxiexzf;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f7699Ujhhgtgfeyxiexzf = null;
        return bundle2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m3579Ujhhgtgfeyxiexzf(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f7698Ujhhgtgfeyxiexzf;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0801feyxiexzfUjhhgtg.f3167Ujhhgtgfeyxiexzf;
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf = C2366Ujhhgtgfeyxiexzf.m3592Ujhhgtgfeyxiexzf(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        AbstractC1901feyxiexzfUjhhgtg.m3264Ujhhgtgfeyxiexzf(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC3252feyxiexzfUjhhgtg.m4758Ujhhgtgfeyxiexzf(typedArray.getInt(3, -1), null));
            }
        } finally {
            c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
        }
    }

    public C2362Ujhhgtgfeyxiexzf(CompoundButton compoundButton) {
        this.f7699Ujhhgtgfeyxiexzf = null;
        this.f7700Ujhhgtgfeyxiexzf = null;
        this.f7695Ujhhgtgfeyxiexzf = false;
        this.f7696Ujhhgtgfeyxiexzf = false;
        this.f7698Ujhhgtgfeyxiexzf = compoundButton;
    }
}

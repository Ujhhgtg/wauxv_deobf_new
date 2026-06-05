package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3648Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final float f11470Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final float f11471Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final float f11472Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final float f11473Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f11474Ujhhgtgfeyxiexzf;

    public C3648Ujhhgtgfeyxiexzf(Context context, XmlResourceParser xmlResourceParser) {
        this.f11470Ujhhgtgfeyxiexzf = Float.NaN;
        this.f11471Ujhhgtgfeyxiexzf = Float.NaN;
        this.f11472Ujhhgtgfeyxiexzf = Float.NaN;
        this.f11473Ujhhgtgfeyxiexzf = Float.NaN;
        this.f11474Ujhhgtgfeyxiexzf = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0773feyxiexzfUjhhgtg.f3064Ujhhgtgfeyxiexzf);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f11474Ujhhgtgfeyxiexzf);
                this.f11474Ujhhgtgfeyxiexzf = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C3654Ujhhgtgfeyxiexzf().m5317Ujhhgtgfeyxiexzf((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f11473Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimension(index, this.f11473Ujhhgtgfeyxiexzf);
            } else if (index == 2) {
                this.f11471Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimension(index, this.f11471Ujhhgtgfeyxiexzf);
            } else if (index == 3) {
                this.f11472Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimension(index, this.f11472Ujhhgtgfeyxiexzf);
            } else if (index == 4) {
                this.f11470Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimension(index, this.f11470Ujhhgtgfeyxiexzf);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

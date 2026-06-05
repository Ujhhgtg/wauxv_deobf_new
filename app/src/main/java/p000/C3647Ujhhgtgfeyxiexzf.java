package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3647Ujhhgtgfeyxiexzf implements InterfaceC0690Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f11467Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f11468Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object f11469Ujhhgtgfeyxiexzf;

    public C3647Ujhhgtgfeyxiexzf(View view) {
        this.f11469Ujhhgtgfeyxiexzf = view;
    }

    @Override // p000.InterfaceC0690Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public void mo1710Ujhhgtgfeyxiexzf(C1429feyxiexzfUjhhgtg c1429feyxiexzfUjhhgtg) {
        if (c1429feyxiexzfUjhhgtg.f2786Ujhhgtgfeyxiexzf.f3750Ujhhgtgfeyxiexzf == 3) {
            int i = ((C3144Ujhhgtgfeyxiexzf) c1429feyxiexzfUjhhgtg.f9736Ujhhgtgfeyxiexzf).f9756Ujhhgtgfeyxiexzf;
            boolean[] zArr = (boolean[]) this.f11469Ujhhgtgfeyxiexzf;
            zArr[0] = zArr[0] && (this.f11467Ujhhgtgfeyxiexzf - this.f11468Ujhhgtgfeyxiexzf) + i == c1429feyxiexzfUjhhgtg.f2788Ujhhgtgfeyxiexzf.f3830Ujhhgtgfeyxiexzf;
        }
    }

    public C3647Ujhhgtgfeyxiexzf(Context context, XmlResourceParser xmlResourceParser) {
        this.f11469Ujhhgtgfeyxiexzf = new ArrayList();
        this.f11468Ujhhgtgfeyxiexzf = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0773feyxiexzfUjhhgtg.f3062Ujhhgtgfeyxiexzf);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f11467Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getResourceId(index, this.f11467Ujhhgtgfeyxiexzf);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f11468Ujhhgtgfeyxiexzf);
                this.f11468Ujhhgtgfeyxiexzf = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C3654Ujhhgtgfeyxiexzf().m5317Ujhhgtgfeyxiexzf((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C3647Ujhhgtgfeyxiexzf(boolean[] zArr, int i, int i2) {
        this.f11469Ujhhgtgfeyxiexzf = zArr;
        this.f11467Ujhhgtgfeyxiexzf = i;
        this.f11468Ujhhgtgfeyxiexzf = i2;
    }

    public C3647Ujhhgtgfeyxiexzf(int i, int i2, String str) {
        this.f11467Ujhhgtgfeyxiexzf = i;
        this.f11468Ujhhgtgfeyxiexzf = i2;
        this.f11469Ujhhgtgfeyxiexzf = str;
    }

    @Override // p000.InterfaceC0690Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public void mo1706Ujhhgtgfeyxiexzf(C1986feyxiexzfUjhhgtg c1986feyxiexzfUjhhgtg) {
    }

    @Override // p000.InterfaceC0690Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public void mo1708Ujhhgtgfeyxiexzf(C1430feyxiexzfUjhhgtg c1430feyxiexzfUjhhgtg) {
    }

    @Override // p000.InterfaceC0690Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public void mo1709Ujhhgtgfeyxiexzf(C3448Ujhhgtgfeyxiexzf c3448Ujhhgtgfeyxiexzf) {
    }

    @Override // p000.InterfaceC0690Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public void mo1711Ujhhgtgfeyxiexzf(C0692Ujhhgtgfeyxiexzf c0692Ujhhgtgfeyxiexzf) {
    }

    @Override // p000.InterfaceC0690Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public void mo1715Ujhhgtgfeyxiexzf(C2060Ujhhgtgfeyxiexzf c2060Ujhhgtgfeyxiexzf) {
    }

    @Override // p000.InterfaceC0690Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public void mo1716Ujhhgtgfeyxiexzf(C2060Ujhhgtgfeyxiexzf c2060Ujhhgtgfeyxiexzf) {
    }
}

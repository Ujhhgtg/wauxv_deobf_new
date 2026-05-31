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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᤞᲁᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0784 implements InterfaceC1662 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f2977;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f2978;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f2979;

    public C0784(View view) {
        this.f2979 = view;
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public void mo1689(C2395 c2395) {
        if (c2395.f5623.f8356 == 3) {
            int i = ((C0902) c2395.f3351).f3371;
            boolean[] zArr = (boolean[]) this.f2979;
            zArr[0] = zArr[0] && (this.f2977 - this.f2978) + i == c2395.f5625.f8205;
        }
    }

    public C0784(Context context, XmlResourceParser xmlResourceParser) {
        this.f2979 = new ArrayList();
        this.f2978 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2515.f7961);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f2977 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2977);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2978);
                this.f2978 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0791().m2418((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0784(boolean[] zArr, int i, int i2) {
        this.f2979 = zArr;
        this.f2977 = i;
        this.f2978 = i2;
    }

    public C0784(int i, int i2, String str) {
        this.f2977 = i;
        this.f2978 = i2;
        this.f2979 = str;
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo1685(C2982 c2982) {
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public void mo1687(C2396 c2396) {
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public void mo1688(C1331 c1331) {
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public void mo1690(C1689 c1689) {
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public void mo1694(C2928 c2928) {
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public void mo1695(C2928 c2928) {
    }
}

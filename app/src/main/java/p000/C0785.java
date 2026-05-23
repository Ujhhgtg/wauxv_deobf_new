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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᤞᲈᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0785 implements InterfaceC1648 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f2970;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f2971;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f2972;

    public C0785(View view) {
        this.f2972 = view;
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public void mo1583(C2350 c2350) {
        if (c2350.f5588.f8204 == 3) {
            int i = ((C0903) c2350.f3344).f3364;
            boolean[] zArr = (boolean[]) this.f2972;
            zArr[0] = zArr[0] && (this.f2970 - this.f2971) + i == c2350.f5590.f8055;
        }
    }

    public C0785(Context context, XmlResourceParser xmlResourceParser) {
        this.f2972 = new ArrayList();
        this.f2971 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2461.f7815);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f2970 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2970);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2971);
                this.f2971 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0792().m2303((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0785(boolean[] zArr, int i, int i2) {
        this.f2972 = zArr;
        this.f2970 = i;
        this.f2971 = i2;
    }

    public C0785(int i, int i2, String str) {
        this.f2970 = i;
        this.f2971 = i2;
        this.f2972 = str;
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo1579(C2923 c2923) {
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public void mo1581(C2351 c2351) {
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public void mo1582(C1329 c1329) {
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public void mo1584(C1674 c1674) {
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public void mo1588(C2868 c2868) {
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public void mo1589(C2868 c2868) {
    }
}

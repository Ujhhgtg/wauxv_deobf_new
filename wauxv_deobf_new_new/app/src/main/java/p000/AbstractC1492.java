package p000;

import android.content.Context;
import android.net.Uri;
import android.util.SparseIntArray;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲇᲁᲀᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1492 implements InterfaceC2028 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f5287;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f5288;

    public AbstractC1492(boolean z) {
        this.f5287 = new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int m3417(int i, int i2) {
        int iMo3416 = mo3416(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int iMo3417 = mo3416(i5);
            i3 += iMo3417;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = iMo3417;
            }
        }
        return i3 + iMo3416 > i2 ? i4 + 1 : i4;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public int mo3415(int i, int i2) {
        int iMo3416 = mo3416(i);
        if (iMo3416 == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int iMo3417 = mo3416(i4);
            i3 += iMo3417;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = iMo3417;
            }
        }
        if (iMo3416 + i3 <= i2) {
            return i3;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public abstract int mo3416(int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void m3418() {
        ((SparseIntArray) this.f5287).clear();
    }

    @Override // p000.InterfaceC2028
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public InterfaceC2027 mo1261(C2136 c2136) {
        Context context = (Context) this.f5287;
        Class cls = (Class) this.f5288;
        return new C2495(context, c2136.m4095(File.class, cls), c2136.m4095(Uri.class, cls), cls);
    }

    public AbstractC1492(Context context, Class cls) {
        this.f5287 = context;
        this.f5288 = cls;
    }

    public AbstractC1492() {
        this.f5287 = new SparseIntArray();
        this.f5288 = new SparseIntArray();
    }
}

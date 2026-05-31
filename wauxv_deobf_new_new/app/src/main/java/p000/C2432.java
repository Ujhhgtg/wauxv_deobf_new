package p000;

import com.umeng.analytics.pro.bc;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᛸᲁᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2432 implements InterfaceC2431 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object[] f7777;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f7778;

    public C2432(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f7777 = new Object[i];
    }

    @Override // p000.InterfaceC2431
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public boolean mo1457(Object obj) {
        Object[] objArr;
        boolean z;
        int i = this.f7778;
        int i2 = 0;
        while (true) {
            objArr = this.f7777;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f7778;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f7778 = i3 + 1;
        return true;
    }

    @Override // p000.InterfaceC2431
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public Object mo1458() {
        int i = this.f7778;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f7777;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f7778 = i - 1;
        return obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m4364(C0276 c0276) {
        int i = this.f7778;
        Object[] objArr = this.f7777;
        if (i < objArr.length) {
            objArr[i] = c0276;
            this.f7778 = i + 1;
        }
    }

    public C2432() {
        this.f7777 = new Object[bc.e];
    }
}

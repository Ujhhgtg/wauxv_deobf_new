package p000;

import com.umeng.analytics.pro.bc;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2379 implements InterfaceC2378 {

    public final Object[] f7633;

    public int f7634;

    public C2379(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f7633 = new Object[i];
    }

    @Override // p000.InterfaceC2378
    public boolean mo1311(Object obj) {
        Object[] objArr;
        boolean z;
        int i = this.f7634;
        int i2 = 0;
        while (true) {
            objArr = this.f7633;
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
        int i3 = this.f7634;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f7634 = i3 + 1;
        return true;
    }

    @Override // p000.InterfaceC2378
    public Object mo1312() {
        int i = this.f7634;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f7633;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f7634 = i - 1;
        return obj;
    }

    public void m4343(C0266 c0266) {
        int i = this.f7634;
        Object[] objArr = this.f7633;
        if (i < objArr.length) {
            objArr[i] = c0266;
            this.f7634 = i + 1;
        }
    }

    public C2379() {
        this.f7633 = new Object[256];
    }
}

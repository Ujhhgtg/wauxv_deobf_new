package p000;

import android.content.Context;
import android.net.Uri;
import android.util.SparseIntArray;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1481 implements InterfaceC1997 {

    public final Object f5255;

    public Object f5256;

    public AbstractC1481(boolean z) {
        this.f5255 = new CopyOnWriteArrayList();
    }

    public int m3240(int i, int i2) {
        int iMo3239 = mo3239(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int iMo32310 = mo3239(i5);
            i3 += iMo32310;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = iMo32310;
            }
        }
        return i3 + iMo3239 > i2 ? i4 + 1 : i4;
    }

    public int mo3238(int i, int i2) {
        int iMo3239 = mo3239(i);
        if (iMo3239 == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int iMo32310 = mo3239(i4);
            i3 += iMo32310;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = iMo32310;
            }
        }
        if (iMo3239 + i3 <= i2) {
            return i3;
        }
        return 0;
    }

    public abstract int mo3239(int i);

    public void m3241() {
        ((SparseIntArray) this.f5255).clear();
    }

    @Override // p000.InterfaceC1997
    public InterfaceC1996 mo1115(C2103 c2103) {
        Context context = (Context) this.f5255;
        Class cls = (Class) this.f5256;
        return new C2443(context, c2103.m3911(File.class, cls), c2103.m3911(Uri.class, cls), cls);
    }

    public AbstractC1481(Context context, Class cls) {
        this.f5255 = context;
        this.f5256 = cls;
    }

    public AbstractC1481() {
        this.f5255 = new SparseIntArray();
        this.f5256 = new SparseIntArray();
    }
}

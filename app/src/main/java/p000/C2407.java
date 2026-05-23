package p000;

import android.os.Handler;
import androidx.lifecycle.C0000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2407 implements InterfaceC1777 {

    public static final C2407 f7683 = new C2407();

    public int f7684;

    public int f7685;

    public Handler f7688;

    public boolean f7686 = true;

    public boolean f7687 = true;

    public final C0000 f7689 = new C0000(this);

    public final RunnableC0563 f7690 = new RunnableC0563(4, this);

    public final C1744 f7691 = new C1744(this);

    public final void m4375() {
        int i = this.f7685 + 1;
        this.f7685 = i;
        if (i == 1) {
            if (!this.f7686) {
                this.f7688.removeCallbacks(this.f7690);
            } else {
                this.f7689.m100(EnumC1769.ON_RESUME);
                this.f7686 = false;
            }
        }
    }

    @Override // p000.InterfaceC1777
    public final C0000 mo750() {
        return this.f7689;
    }
}

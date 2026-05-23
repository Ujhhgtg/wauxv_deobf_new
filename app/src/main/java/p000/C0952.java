package p000;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0952 implements InterfaceC0957, InterfaceC0954 {

    public final List f3472;

    public final C0970 f3473;

    public final InterfaceC0956 f3474;

    public int f3475 = -1;

    public InterfaceC1749 f3476;

    public List f3477;

    public int f3478;

    public volatile C1995 f3479;

    public File f3480;

    public C0952(List list, C0970 c0970, InterfaceC0956 interfaceC0956) {
        this.f3472 = list;
        this.f3473 = c0970;
        this.f3474 = interfaceC0956;
    }

    @Override // p000.InterfaceC0957
    public final void cancel() {
        C1995 c1995 = this.f3479;
        if (c1995 != null) {
            c1995.f6657.cancel();
        }
    }

    @Override // p000.InterfaceC0957
    public final boolean mo2447() {
        while (true) {
            List list = this.f3477;
            boolean z = false;
            if (list != null && this.f3478 < list.size()) {
                this.f3479 = null;
                while (!z && this.f3478 < this.f3477.size()) {
                    List list2 = this.f3477;
                    int i = this.f3478;
                    this.f3478 = i + 1;
                    InterfaceC1996 interfaceC1996 = (InterfaceC1996) list2.get(i);
                    File file = this.f3480;
                    C0970 c0970 = this.f3473;
                    this.f3479 = interfaceC1996.mo1395(file, c0970.f3525, c0970.f3526, c0970.f3529);
                    if (this.f3479 != null && this.f3473.m2492(this.f3479.f6657.mo1391()) != null) {
                        this.f3479.f6657.mo1856(this.f3473.f3535, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f3475 + 1;
            this.f3475 = i2;
            if (i2 >= this.f3472.size()) {
                return false;
            }
            InterfaceC1749 interfaceC1749 = (InterfaceC1749) this.f3472.get(this.f3475);
            C0970 c0971 = this.f3473;
            File fileMo1511 = c0971.f3528.m2831().mo1511(new C0953(interfaceC1749, c0971.f3534));
            this.f3480 = fileMo1511;
            if (fileMo1511 != null) {
                this.f3476 = interfaceC1749;
                this.f3477 = this.f3473.f3523.m3229().m4559(fileMo1511);
                this.f3478 = 0;
            }
        }
    }

    @Override // p000.InterfaceC0954
    public final void mo1882(Exception exc) {
        this.f3474.mo2449(this.f3476, exc, this.f3479.f6657, 3);
    }

    @Override // p000.InterfaceC0954
    public final void mo1883(Object obj) {
        this.f3474.mo2448(this.f3476, obj, this.f3479.f6657, 3, this.f3476);
    }
}

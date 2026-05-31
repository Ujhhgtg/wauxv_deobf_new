package p000;

import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᲇᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0955 implements InterfaceC0960, InterfaceC0957 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final List f3487;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0974 f3488;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC0959 f3489;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f3490 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public InterfaceC1772 f3491;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public List f3492;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f3493;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public volatile C2026 f3494;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public File f3495;

    public C0955(List list, C0974 c0974, InterfaceC0959 interfaceC0959) {
        this.f3487 = list;
        this.f3488 = c0974;
        this.f3489 = interfaceC0959;
    }

    @Override // p000.InterfaceC0960
    public final void cancel() {
        C2026 c2026 = this.f3494;
        if (c2026 != null) {
            c2026.f6762.cancel();
        }
    }

    @Override // p000.InterfaceC0960
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean mo2566() {
        while (true) {
            List list = this.f3492;
            boolean z = false;
            if (list != null && this.f3493 < list.size()) {
                this.f3494 = null;
                while (!z && this.f3493 < this.f3492.size()) {
                    List list2 = this.f3492;
                    int i = this.f3493;
                    this.f3493 = i + 1;
                    InterfaceC2027 interfaceC2027 = (InterfaceC2027) list2.get(i);
                    File file = this.f3495;
                    C0974 c0974 = this.f3488;
                    this.f3494 = interfaceC2027.mo1541(file, c0974.f3541, c0974.f3542, c0974.f3545);
                    if (this.f3494 != null && this.f3488.m2616(this.f3494.f6762.mo1537()) != null) {
                        this.f3494.f6762.mo1950(this.f3488.f3551, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f3490 + 1;
            this.f3490 = i2;
            if (i2 >= this.f3487.size()) {
                return false;
            }
            InterfaceC1772 interfaceC1772 = (InterfaceC1772) this.f3487.get(this.f3490);
            C0974 c0975 = this.f3488;
            File fileMo1616 = c0975.f3544.m2953().mo1616(new C0956(interfaceC1772, c0975.f3550));
            this.f3495 = fileMo1616;
            if (fileMo1616 != null) {
                this.f3491 = interfaceC1772;
                this.f3492 = this.f3488.f3539.m3406().m4581(fileMo1616);
                this.f3493 = 0;
            }
        }
    }

    @Override // p000.InterfaceC0957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1976(Exception exc) {
        this.f3489.mo2568(this.f3491, exc, this.f3494.f6762, 3);
    }

    @Override // p000.InterfaceC0957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo1977(Object obj) {
        this.f3489.mo2567(this.f3491, obj, this.f3494.f6762, 3, this.f3491);
    }
}

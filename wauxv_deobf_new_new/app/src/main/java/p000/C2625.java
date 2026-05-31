package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᛸᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2625 implements InterfaceC0960, InterfaceC0957 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final RunnableC0976 f8298;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0974 f8299;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f8300;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f8301 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public InterfaceC1772 f8302;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public List f8303;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f8304;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public volatile C2026 f8305;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public File f8306;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C2626 f8307;

    public C2625(C0974 c0974, RunnableC0976 runnableC0976) {
        this.f8299 = c0974;
        this.f8298 = runnableC0976;
    }

    @Override // p000.InterfaceC0960
    public final void cancel() {
        C2026 c2026 = this.f8305;
        if (c2026 != null) {
            c2026.f6762.cancel();
        }
    }

    @Override // p000.InterfaceC0960
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo2566() {
        List list;
        ArrayList arrayListM4099;
        ArrayList arrayListM2614 = this.f8299.m2614();
        boolean z = false;
        if (!arrayListM2614.isEmpty()) {
            C0974 c0974 = this.f8299;
            C2585 c2585M3406 = c0974.f3539.m3406();
            Class<?> cls = c0974.f3540.getClass();
            Class cls2 = c0974.f3543;
            Class cls3 = c0974.f3547;
            C0519 c0519 = c2585M3406.f8218;
            C2131 c2131 = (C2131) ((AtomicReference) c0519.f2208).getAndSet(null);
            if (c2131 == null) {
                c2131 = new C2131(cls, cls2, cls3);
            } else {
                c2131.f7038 = cls;
                c2131.f7039 = cls2;
                c2131.f7040 = cls3;
            }
            synchronized (((C0274) c0519.f2209)) {
                list = (List) ((C0274) c0519.f2209).get(c2131);
            }
            ((AtomicReference) c0519.f2208).set(c2131);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                C0519 c05110 = c2585M3406.f8211;
                synchronized (c05110) {
                    arrayListM4099 = ((C2136) c05110.f2208).m4099(cls);
                }
                Iterator it = arrayListM4099.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : c2585M3406.f8213.m1987((Class) it.next(), cls2)) {
                        if (!c2585M3406.f8216.m2934(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                C0519 c05111 = c2585M3406.f8218;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((C0274) c05111.f2209)) {
                    ((C0274) c05111.f2209).put(new C2131(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f8303;
                    if (list3 != null && this.f8304 < list3.size()) {
                        this.f8305 = null;
                        while (!z && this.f8304 < this.f8303.size()) {
                            List list4 = this.f8303;
                            int i = this.f8304;
                            this.f8304 = i + 1;
                            InterfaceC2027 interfaceC2027 = (InterfaceC2027) list4.get(i);
                            File file = this.f8306;
                            C0974 c0975 = this.f8299;
                            this.f8305 = interfaceC2027.mo1541(file, c0975.f3541, c0975.f3542, c0975.f3545);
                            if (this.f8305 != null && this.f8299.m2616(this.f8305.f6762.mo1537()) != null) {
                                this.f8305.f6762.mo1950(this.f8299.f3551, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.f8301 + 1;
                    this.f8301 = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.f8300 + 1;
                        this.f8300 = i3;
                        if (i3 >= arrayListM2614.size()) {
                            break;
                        }
                        this.f8301 = 0;
                    }
                    InterfaceC1772 interfaceC1772 = (InterfaceC1772) arrayListM2614.get(this.f8300);
                    Class cls5 = (Class) list2.get(this.f8301);
                    InterfaceC3484 interfaceC3484M2618 = this.f8299.m2618(cls5);
                    C0974 c0976 = this.f8299;
                    this.f8307 = new C2626(c0976.f3539.f5237, interfaceC1772, c0976.f3550, c0976.f3541, c0976.f3542, interfaceC3484M2618, cls5, c0976.f3545);
                    File fileMo1616 = c0976.f3544.m2953().mo1616(this.f8307);
                    this.f8306 = fileMo1616;
                    if (fileMo1616 != null) {
                        this.f8302 = interfaceC1772;
                        this.f8303 = this.f8299.f3539.m3406().m4581(fileMo1616);
                        this.f8304 = 0;
                    }
                }
            } else if (!File.class.equals(this.f8299.f3547)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f8299.f3540.getClass() + " to " + this.f8299.f3547);
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1976(Exception exc) {
        this.f8298.mo2568(this.f8307, exc, this.f8305.f6762, 4);
    }

    @Override // p000.InterfaceC0957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo1977(Object obj) {
        this.f8298.mo2567(this.f8302, obj, this.f8305.f6762, 4, this.f8307);
    }
}

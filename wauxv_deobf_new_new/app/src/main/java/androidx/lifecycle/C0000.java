package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC1095;
import p000.AbstractC1802;
import p000.C0262;
import p000.C1274;
import p000.C1790;
import p000.C1801;
import p000.C2677;
import p000.C2678;
import p000.C2679;
import p000.EnumC1792;
import p000.EnumC1793;
import p000.InterfaceC1002;
import p000.InterfaceC1450;
import p000.InterfaceC1797;
import p000.InterfaceC1799;
import p000.InterfaceC1800;

/* JADX INFO: renamed from: androidx.lifecycle.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0000 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean f298;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C1274 f299;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public EnumC1793 f300;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final WeakReference f301;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f302;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f303;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f304;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final ArrayList f305;

    public C0000(InterfaceC1800 interfaceC1800) {
        new AtomicReference();
        this.f298 = true;
        this.f299 = new C1274();
        this.f300 = EnumC1793.f5948;
        this.f305 = new ArrayList();
        this.f301 = new WeakReference(interfaceC1800);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m97(InterfaceC1799 interfaceC1799) {
        InterfaceC1797 reflectiveGenericLifecycleObserver;
        Object obj;
        InterfaceC1800 interfaceC1800;
        EnumC1792 enumC1792;
        m99("addObserver");
        EnumC1793 enumC1793 = this.f300;
        EnumC1793 enumC1794 = EnumC1793.f5947;
        if (enumC1793 != enumC1794) {
            enumC1794 = EnumC1793.f5948;
        }
        C1801 c1801 = new C1801();
        HashMap map = AbstractC1802.f5956;
        boolean z = interfaceC1799 instanceof InterfaceC1797;
        boolean z2 = interfaceC1799 instanceof InterfaceC1002;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC1002) interfaceC1799, (InterfaceC1797) interfaceC1799);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC1002) interfaceC1799, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (InterfaceC1797) interfaceC1799;
        } else {
            Class<?> cls = interfaceC1799.getClass();
            if (AbstractC1802.m3685(cls) == 2) {
                List list = (List) AbstractC1802.f5957.get(cls);
                if (list.size() == 1) {
                    AbstractC1802.m3684((Constructor) list.get(0), interfaceC1799);
                    throw null;
                }
                int size = list.size();
                InterfaceC1450[] interfaceC1450Arr = new InterfaceC1450[size];
                if (size > 0) {
                    AbstractC1802.m3684((Constructor) list.get(0), interfaceC1799);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC1450Arr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC1799);
            }
        }
        c1801.f5955 = reflectiveGenericLifecycleObserver;
        c1801.f5954 = enumC1794;
        C1274 c1274 = this.f299;
        C2678 c2678Mo3104 = c1274.mo3104(interfaceC1799);
        if (c2678Mo3104 != null) {
            obj = c2678Mo3104.f8662;
        } else {
            HashMap map2 = c1274.f4650;
            C2678 c2678 = new C2678(interfaceC1799, c1801);
            c1274.f8671++;
            C2678 c2679 = c1274.f8669;
            if (c2679 == null) {
                c1274.f8668 = c2678;
                c1274.f8669 = c2678;
            } else {
                c2679.f8663 = c2678;
                c2678.f8664 = c2679;
                c1274.f8669 = c2678;
            }
            map2.put(interfaceC1799, c2678);
            obj = null;
        }
        if (((C1801) obj) == null && (interfaceC1800 = (InterfaceC1800) this.f301.get()) != null) {
            boolean z3 = this.f302 != 0 || this.f303;
            EnumC1793 enumC1793M98 = m98(interfaceC1799);
            this.f302++;
            while (c1801.f5954.compareTo(enumC1793M98) < 0 && this.f299.f4650.containsKey(interfaceC1799)) {
                EnumC1793 enumC1795 = c1801.f5954;
                ArrayList arrayList = this.f305;
                arrayList.add(enumC1795);
                C1790 c1790 = EnumC1792.Companion;
                EnumC1793 enumC1796 = c1801.f5954;
                c1790.getClass();
                int iOrdinal = enumC1796.ordinal();
                if (iOrdinal == 1) {
                    enumC1792 = EnumC1792.ON_CREATE;
                } else if (iOrdinal != 2) {
                    enumC1792 = iOrdinal != 3 ? null : EnumC1792.ON_RESUME;
                } else {
                    enumC1792 = EnumC1792.ON_START;
                }
                if (enumC1792 == null) {
                    throw new IllegalStateException("no event up from " + c1801.f5954);
                }
                c1801.m3683(interfaceC1800, enumC1792);
                arrayList.remove(arrayList.size() - 1);
                enumC1793M98 = m98(interfaceC1799);
            }
            if (!z3) {
                m103();
            }
            this.f302--;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final EnumC1793 m98(InterfaceC1799 interfaceC1799) {
        HashMap map = this.f299.f4650;
        C2678 c2678 = map.containsKey(interfaceC1799) ? ((C2678) map.get(interfaceC1799)).f8664 : null;
        EnumC1793 enumC1793 = c2678 != null ? ((C1801) c2678.f8662).f5954 : null;
        ArrayList arrayList = this.f305;
        EnumC1793 enumC1794 = arrayList.isEmpty() ? null : (EnumC1793) arrayList.get(arrayList.size() - 1);
        EnumC1793 enumC1795 = this.f300;
        if (enumC1793 == null || enumC1793.compareTo(enumC1795) >= 0) {
            enumC1793 = enumC1795;
        }
        return (enumC1794 == null || enumC1794.compareTo(enumC1793) >= 0) ? enumC1793 : enumC1794;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m99(String str) {
        if (this.f298) {
            ((C0262) C0262.m1487().f1495).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC1095.m2800("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m100(EnumC1792 enumC1792) {
        m99("handleLifecycleEvent");
        m101(enumC1792.m3682());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m101(EnumC1793 enumC1793) {
        EnumC1793 enumC1794 = this.f300;
        if (enumC1794 == enumC1793) {
            return;
        }
        EnumC1793 enumC1795 = EnumC1793.f5948;
        EnumC1793 enumC1796 = EnumC1793.f5947;
        if (enumC1794 == enumC1795 && enumC1793 == enumC1796) {
            throw new IllegalStateException(("no event down from " + this.f300 + " in component " + this.f301.get()).toString());
        }
        this.f300 = enumC1793;
        if (this.f303 || this.f302 != 0) {
            this.f304 = true;
            return;
        }
        this.f303 = true;
        m103();
        this.f303 = false;
        if (this.f300 == enumC1796) {
            this.f299 = new C1274();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m102(InterfaceC1799 interfaceC1799) {
        m99("removeObserver");
        this.f299.mo3105(interfaceC1799);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m103() {
        EnumC1793 enumC1793;
        EnumC1793 enumC1794;
        EnumC1792 enumC1792;
        EnumC1792 enumC1795;
        InterfaceC1800 interfaceC1800 = (InterfaceC1800) this.f301.get();
        if (interfaceC1800 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1274 c1274 = this.f299;
            if (c1274.f8671 == 0 || ((enumC1793 = ((C1801) c1274.f8668.f8662).f5954) == (enumC1794 = ((C1801) c1274.f8669.f8662).f5954) && this.f300 == enumC1794)) {
                break;
            }
            this.f304 = false;
            int iCompareTo = this.f300.compareTo(enumC1793);
            ArrayList arrayList = this.f305;
            if (iCompareTo < 0) {
                C1274 c1275 = this.f299;
                C2677 c2677 = new C2677(c1275.f8669, c1275.f8668, 1);
                c1275.f8670.put(c2677, Boolean.FALSE);
                while (c2677.hasNext() && !this.f304) {
                    Map.Entry entry = (Map.Entry) c2677.next();
                    InterfaceC1799 interfaceC1799 = (InterfaceC1799) entry.getKey();
                    C1801 c1801 = (C1801) entry.getValue();
                    while (c1801.f5954.compareTo(this.f300) > 0 && !this.f304 && this.f299.f4650.containsKey(interfaceC1799)) {
                        C1790 c1790 = EnumC1792.Companion;
                        EnumC1793 enumC1796 = c1801.f5954;
                        c1790.getClass();
                        int iOrdinal = enumC1796.ordinal();
                        if (iOrdinal == 2) {
                            enumC1795 = EnumC1792.ON_DESTROY;
                        } else if (iOrdinal != 3) {
                            enumC1795 = iOrdinal != 4 ? null : EnumC1792.ON_PAUSE;
                        } else {
                            enumC1795 = EnumC1792.ON_STOP;
                        }
                        if (enumC1795 == null) {
                            throw new IllegalStateException("no event down from " + c1801.f5954);
                        }
                        arrayList.add(enumC1795.m3682());
                        c1801.m3683(interfaceC1800, enumC1795);
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
            C2678 c2678 = this.f299.f8669;
            if (!this.f304 && c2678 != null && this.f300.compareTo(((C1801) c2678.f8662).f5954) > 0) {
                C1274 c1276 = this.f299;
                c1276.getClass();
                C2679 c2679 = new C2679(c1276);
                c1276.f8670.put(c2679, Boolean.FALSE);
                while (c2679.hasNext() && !this.f304) {
                    Map.Entry entry2 = (Map.Entry) c2679.next();
                    InterfaceC1799 interfaceC17910 = (InterfaceC1799) entry2.getKey();
                    C1801 c1802 = (C1801) entry2.getValue();
                    while (c1802.f5954.compareTo(this.f300) < 0 && !this.f304 && this.f299.f4650.containsKey(interfaceC17910)) {
                        arrayList.add(c1802.f5954);
                        C1790 c1791 = EnumC1792.Companion;
                        EnumC1793 enumC1797 = c1802.f5954;
                        c1791.getClass();
                        int iOrdinal2 = enumC1797.ordinal();
                        if (iOrdinal2 == 1) {
                            enumC1792 = EnumC1792.ON_CREATE;
                        } else if (iOrdinal2 != 2) {
                            enumC1792 = iOrdinal2 != 3 ? null : EnumC1792.ON_RESUME;
                        } else {
                            enumC1792 = EnumC1792.ON_START;
                        }
                        if (enumC1792 == null) {
                            throw new IllegalStateException("no event up from " + c1802.f5954);
                        }
                        c1802.m3683(interfaceC1800, enumC1792);
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
        }
        this.f304 = false;
    }
}

package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC1194;
import p000.AbstractC1779;
import p000.C0252;
import p000.C1272;
import p000.C1767;
import p000.C1778;
import p000.C2616;
import p000.C2617;
import p000.C2618;
import p000.EnumC1769;
import p000.EnumC1770;
import p000.InterfaceC0998;
import p000.InterfaceC1442;
import p000.InterfaceC1774;
import p000.InterfaceC1776;
import p000.InterfaceC1777;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0000 {

    public final boolean f298;

    public C1272 f299;

    public EnumC1770 f300;

    public final WeakReference f301;

    public int f302;

    public boolean f303;

    public boolean f304;

    public final ArrayList f305;

    public C0000(InterfaceC1777 interfaceC1777) {
        new AtomicReference();
        this.f298 = true;
        this.f299 = new C1272();
        this.f300 = EnumC1770.f5892;
        this.f305 = new ArrayList();
        this.f301 = new WeakReference(interfaceC1777);
    }

    public final void m97(InterfaceC1776 interfaceC1776) {
        InterfaceC1774 reflectiveGenericLifecycleObserver;
        Object obj;
        InterfaceC1777 interfaceC1777;
        EnumC1769 enumC1769;
        m99("addObserver");
        EnumC1770 enumC1770 = this.f300;
        EnumC1770 enumC1771 = EnumC1770.f5891;
        if (enumC1770 != enumC1771) {
            enumC1771 = EnumC1770.f5892;
        }
        C1778 c1778 = new C1778();
        HashMap map = AbstractC1779.f5900;
        boolean z = interfaceC1776 instanceof InterfaceC1774;
        boolean z2 = interfaceC1776 instanceof InterfaceC0998;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0998) interfaceC1776, (InterfaceC1774) interfaceC1776);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0998) interfaceC1776, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (InterfaceC1774) interfaceC1776;
        } else {
            Class<?> cls = interfaceC1776.getClass();
            if (AbstractC1779.m3513(cls) == 2) {
                List list = (List) AbstractC1779.f5901.get(cls);
                if (list.size() == 1) {
                    AbstractC1779.m3512((Constructor) list.get(0), interfaceC1776);
                    throw null;
                }
                int size = list.size();
                InterfaceC1442[] interfaceC1442Arr = new InterfaceC1442[size];
                if (size > 0) {
                    AbstractC1779.m3512((Constructor) list.get(0), interfaceC1776);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC1442Arr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC1776);
            }
        }
        c1778.f5899 = reflectiveGenericLifecycleObserver;
        c1778.f5898 = enumC1771;
        C1272 c1272 = this.f299;
        C2617 c2617Mo3001 = c1272.mo3001(interfaceC1776);
        if (c2617Mo3001 != null) {
            obj = c2617Mo3001.f8497;
        } else {
            HashMap map2 = c1272.f4650;
            C2617 c2617 = new C2617(interfaceC1776, c1778);
            c1272.f8506++;
            C2617 c2618 = c1272.f8504;
            if (c2618 == null) {
                c1272.f8503 = c2617;
                c1272.f8504 = c2617;
            } else {
                c2618.f8498 = c2617;
                c2617.f8499 = c2618;
                c1272.f8504 = c2617;
            }
            map2.put(interfaceC1776, c2617);
            obj = null;
        }
        if (((C1778) obj) == null && (interfaceC1777 = (InterfaceC1777) this.f301.get()) != null) {
            boolean z3 = this.f302 != 0 || this.f303;
            EnumC1770 enumC1770M98 = m98(interfaceC1776);
            this.f302++;
            while (c1778.f5898.compareTo(enumC1770M98) < 0 && this.f299.f4650.containsKey(interfaceC1776)) {
                EnumC1770 enumC1772 = c1778.f5898;
                ArrayList arrayList = this.f305;
                arrayList.add(enumC1772);
                C1767 c1767 = EnumC1769.Companion;
                EnumC1770 enumC1773 = c1778.f5898;
                
                int iOrdinal = enumC1773.ordinal();
                if (iOrdinal == 1) {
                    enumC1769 = EnumC1769.ON_CREATE;
                } else if (iOrdinal != 2) {
                    enumC1769 = iOrdinal != 3 ? null : EnumC1769.ON_RESUME;
                } else {
                    enumC1769 = EnumC1769.ON_START;
                }
                if (enumC1769 == null) {
                    throw new IllegalStateException("no event up from " + c1778.f5898);
                }
                c1778.m3511(interfaceC1777, enumC1769);
                arrayList.remove(arrayList.size() - 1);
                enumC1770M98 = m98(interfaceC1776);
            }
            if (!z3) {
                m103();
            }
            this.f302--;
        }
    }

    public final EnumC1770 m98(InterfaceC1776 interfaceC1776) {
        HashMap map = this.f299.f4650;
        C2617 c2617 = map.containsKey(interfaceC1776) ? ((C2617) map.get(interfaceC1776)).f8499 : null;
        EnumC1770 enumC1770 = c2617 != null ? ((C1778) c2617.f8497).f5898 : null;
        ArrayList arrayList = this.f305;
        EnumC1770 enumC1771 = arrayList.isEmpty() ? null : (EnumC1770) arrayList.get(arrayList.size() - 1);
        EnumC1770 enumC1772 = this.f300;
        if (enumC1770 == null || enumC1770.compareTo(enumC1772) >= 0) {
            enumC1770 = enumC1772;
        }
        return (enumC1771 == null || enumC1771.compareTo(enumC1770) >= 0) ? enumC1770 : enumC1771;
    }

    public final void m99(String str) {
        if (this.f298) {
            
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC1194.m2785("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void m100(EnumC1769 enumC1769) {
        m99("handleLifecycleEvent");
        m101(enumC1769.m3510());
    }

    public final void m101(EnumC1770 enumC1770) {
        EnumC1770 enumC1771 = this.f300;
        if (enumC1771 == enumC1770) {
            return;
        }
        EnumC1770 enumC1772 = EnumC1770.f5892;
        EnumC1770 enumC1773 = EnumC1770.f5891;
        if (enumC1771 == enumC1772 && enumC1770 == enumC1773) {
            throw new IllegalStateException(("no event down from " + this.f300 + " in component " + this.f301.get()).toString());
        }
        this.f300 = enumC1770;
        if (this.f303 || this.f302 != 0) {
            this.f304 = true;
            return;
        }
        this.f303 = true;
        m103();
        this.f303 = false;
        if (this.f300 == enumC1773) {
            this.f299 = new C1272();
        }
    }

    public final void m102(InterfaceC1776 interfaceC1776) {
        m99("removeObserver");
        this.f299.mo3002(interfaceC1776);
    }

    public final void m103() {
        EnumC1770 enumC1770;
        EnumC1770 enumC1771;
        EnumC1769 enumC1769;
        EnumC1769 enumC17610;
        InterfaceC1777 interfaceC1777 = (InterfaceC1777) this.f301.get();
        if (interfaceC1777 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1272 c1272 = this.f299;
            if (c1272.f8506 == 0 || ((enumC1770 = ((C1778) c1272.f8503.f8497).f5898) == (enumC1771 = ((C1778) c1272.f8504.f8497).f5898) && this.f300 == enumC1771)) {
                break;
            }
            this.f304 = false;
            int iCompareTo = this.f300.compareTo(enumC1770);
            ArrayList arrayList = this.f305;
            if (iCompareTo < 0) {
                C1272 c1273 = this.f299;
                C2616 c2616 = new C2616(c1273.f8504, c1273.f8503, 1);
                c1273.f8505.put(c2616, Boolean.FALSE);
                while (c2616.hasNext() && !this.f304) {
                    Map.Entry entry = (Map.Entry) c2616.next();
                    InterfaceC1776 interfaceC1776 = (InterfaceC1776) entry.getKey();
                    C1778 c1778 = (C1778) entry.getValue();
                    while (c1778.f5898.compareTo(this.f300) > 0 && !this.f304 && this.f299.f4650.containsKey(interfaceC1776)) {
                        C1767 c1767 = EnumC1769.Companion;
                        EnumC1770 enumC1772 = c1778.f5898;
                        
                        int iOrdinal = enumC1772.ordinal();
                        if (iOrdinal == 2) {
                            enumC17610 = EnumC1769.ON_DESTROY;
                        } else if (iOrdinal != 3) {
                            enumC17610 = iOrdinal != 4 ? null : EnumC1769.ON_PAUSE;
                        } else {
                            enumC17610 = EnumC1769.ON_STOP;
                        }
                        if (enumC17610 == null) {
                            throw new IllegalStateException("no event down from " + c1778.f5898);
                        }
                        arrayList.add(enumC17610.m3510());
                        c1778.m3511(interfaceC1777, enumC17610);
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
            C2617 c2617 = this.f299.f8504;
            if (!this.f304 && c2617 != null && this.f300.compareTo(((C1778) c2617.f8497).f5898) > 0) {
                C1272 c1274 = this.f299;
                
                C2618 c2618 = new C2618(c1274);
                c1274.f8505.put(c2618, Boolean.FALSE);
                while (c2618.hasNext() && !this.f304) {
                    Map.Entry entry2 = (Map.Entry) c2618.next();
                    InterfaceC1776 interfaceC1778 = (InterfaceC1776) entry2.getKey();
                    C1778 c1779 = (C1778) entry2.getValue();
                    while (c1779.f5898.compareTo(this.f300) < 0 && !this.f304 && this.f299.f4650.containsKey(interfaceC1778)) {
                        arrayList.add(c1779.f5898);
                        C1767 c1768 = EnumC1769.Companion;
                        EnumC1770 enumC1773 = c1779.f5898;
                        
                        int iOrdinal2 = enumC1773.ordinal();
                        if (iOrdinal2 == 1) {
                            enumC1769 = EnumC1769.ON_CREATE;
                        } else if (iOrdinal2 != 2) {
                            enumC1769 = iOrdinal2 != 3 ? null : EnumC1769.ON_RESUME;
                        } else {
                            enumC1769 = EnumC1769.ON_START;
                        }
                        if (enumC1769 == null) {
                            throw new IllegalStateException("no event up from " + c1779.f5898);
                        }
                        c1779.m3511(interfaceC1777, enumC1769);
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
        }
        this.f304 = false;
    }
}

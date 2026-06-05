package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC0080Ujhhgtgfeyxiexzf;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.C0048Ujhhgtgfeyxiexzf;
import p000.C0084Ujhhgtgfeyxiexzf;
import p000.C0930feyxiexzfUjhhgtg;
import p000.C0931feyxiexzfUjhhgtg;
import p000.C0934feyxiexzfUjhhgtg;
import p000.C2373Ujhhgtgfeyxiexzf;
import p000.C3416Ujhhgtgfeyxiexzf;
import p000.EnumC0044Ujhhgtgfeyxiexzf;
import p000.InterfaceC0050Ujhhgtgfeyxiexzf;
import p000.InterfaceC0053Ujhhgtgfeyxiexzf;
import p000.InterfaceC0083Ujhhgtgfeyxiexzf;
import p000.InterfaceC3115Ujhhgtgfeyxiexzf;
import p000.InterfaceC3568Ujhhgtgfeyxiexzf;

/* JADX INFO: renamed from: androidx.lifecycle.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: invalid class name */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean f299Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public C3416Ujhhgtgfeyxiexzf f300Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public EnumC0044Ujhhgtgfeyxiexzf f301Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final WeakReference f302Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f303Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f304Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f305Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final ArrayList f306Ujhhgtgfeyxiexzf;

    public Ujhhgtgfeyxiexzf(InterfaceC0083Ujhhgtgfeyxiexzf interfaceC0083Ujhhgtgfeyxiexzf) {
        new AtomicReference();
        this.f299Ujhhgtgfeyxiexzf = true;
        this.f300Ujhhgtgfeyxiexzf = new C3416Ujhhgtgfeyxiexzf();
        this.f301Ujhhgtgfeyxiexzf = EnumC0044Ujhhgtgfeyxiexzf.f1057Ujhhgtgfeyxiexzf;
        this.f306Ujhhgtgfeyxiexzf = new ArrayList();
        this.f302Ujhhgtgfeyxiexzf = new WeakReference(interfaceC0083Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m97Ujhhgtgfeyxiexzf(InterfaceC0050Ujhhgtgfeyxiexzf interfaceC0050Ujhhgtgfeyxiexzf) {
        InterfaceC0053Ujhhgtgfeyxiexzf reflectiveGenericLifecycleObserver;
        Object obj;
        InterfaceC0083Ujhhgtgfeyxiexzf interfaceC0083Ujhhgtgfeyxiexzf;
        p000.Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf;
        m99Ujhhgtgfeyxiexzf("addObserver");
        EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf = this.f301Ujhhgtgfeyxiexzf;
        EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf2 = EnumC0044Ujhhgtgfeyxiexzf.f1056Ujhhgtgfeyxiexzf;
        if (enumC0044Ujhhgtgfeyxiexzf != enumC0044Ujhhgtgfeyxiexzf2) {
            enumC0044Ujhhgtgfeyxiexzf2 = EnumC0044Ujhhgtgfeyxiexzf.f1057Ujhhgtgfeyxiexzf;
        }
        C0084Ujhhgtgfeyxiexzf c0084Ujhhgtgfeyxiexzf = new C0084Ujhhgtgfeyxiexzf();
        HashMap map = AbstractC0080Ujhhgtgfeyxiexzf.f1148Ujhhgtgfeyxiexzf;
        boolean z = interfaceC0050Ujhhgtgfeyxiexzf instanceof InterfaceC0053Ujhhgtgfeyxiexzf;
        boolean z2 = interfaceC0050Ujhhgtgfeyxiexzf instanceof InterfaceC3115Ujhhgtgfeyxiexzf;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC3115Ujhhgtgfeyxiexzf) interfaceC0050Ujhhgtgfeyxiexzf, (InterfaceC0053Ujhhgtgfeyxiexzf) interfaceC0050Ujhhgtgfeyxiexzf);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC3115Ujhhgtgfeyxiexzf) interfaceC0050Ujhhgtgfeyxiexzf, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (InterfaceC0053Ujhhgtgfeyxiexzf) interfaceC0050Ujhhgtgfeyxiexzf;
        } else {
            Class<?> cls = interfaceC0050Ujhhgtgfeyxiexzf.getClass();
            if (AbstractC0080Ujhhgtgfeyxiexzf.m1127Ujhhgtgfeyxiexzf(cls) == 2) {
                List list = (List) AbstractC0080Ujhhgtgfeyxiexzf.f1149Ujhhgtgfeyxiexzf.get(cls);
                if (list.size() == 1) {
                    AbstractC0080Ujhhgtgfeyxiexzf.m1126Ujhhgtgfeyxiexzf((Constructor) list.get(0), interfaceC0050Ujhhgtgfeyxiexzf);
                    throw null;
                }
                int size = list.size();
                InterfaceC3568Ujhhgtgfeyxiexzf[] interfaceC3568UjhhgtgfeyxiexzfArr = new InterfaceC3568Ujhhgtgfeyxiexzf[size];
                if (size > 0) {
                    AbstractC0080Ujhhgtgfeyxiexzf.m1126Ujhhgtgfeyxiexzf((Constructor) list.get(0), interfaceC0050Ujhhgtgfeyxiexzf);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC3568UjhhgtgfeyxiexzfArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0050Ujhhgtgfeyxiexzf);
            }
        }
        c0084Ujhhgtgfeyxiexzf.f1159Ujhhgtgfeyxiexzf = reflectiveGenericLifecycleObserver;
        c0084Ujhhgtgfeyxiexzf.f1158Ujhhgtgfeyxiexzf = enumC0044Ujhhgtgfeyxiexzf2;
        C3416Ujhhgtgfeyxiexzf c3416Ujhhgtgfeyxiexzf = this.f300Ujhhgtgfeyxiexzf;
        C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf = c3416Ujhhgtgfeyxiexzf.mo2431Ujhhgtgfeyxiexzf(interfaceC0050Ujhhgtgfeyxiexzf);
        if (c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf != null) {
            obj = c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf.f3761Ujhhgtgfeyxiexzf;
        } else {
            HashMap map2 = c3416Ujhhgtgfeyxiexzf.f10642Ujhhgtgfeyxiexzf;
            C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg = new C0930feyxiexzfUjhhgtg(interfaceC0050Ujhhgtgfeyxiexzf, c0084Ujhhgtgfeyxiexzf);
            c3416Ujhhgtgfeyxiexzf.f3782Ujhhgtgfeyxiexzf++;
            C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg2 = c3416Ujhhgtgfeyxiexzf.f3780Ujhhgtgfeyxiexzf;
            if (c0930feyxiexzfUjhhgtg2 == null) {
                c3416Ujhhgtgfeyxiexzf.f3779Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg;
                c3416Ujhhgtgfeyxiexzf.f3780Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg;
            } else {
                c0930feyxiexzfUjhhgtg2.f3762Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg;
                c0930feyxiexzfUjhhgtg.f3763Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg2;
                c3416Ujhhgtgfeyxiexzf.f3780Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg;
            }
            map2.put(interfaceC0050Ujhhgtgfeyxiexzf, c0930feyxiexzfUjhhgtg);
            obj = null;
        }
        if (((C0084Ujhhgtgfeyxiexzf) obj) == null && (interfaceC0083Ujhhgtgfeyxiexzf = (InterfaceC0083Ujhhgtgfeyxiexzf) this.f302Ujhhgtgfeyxiexzf.get()) != null) {
            boolean z3 = this.f303Ujhhgtgfeyxiexzf != 0 || this.f304Ujhhgtgfeyxiexzf;
            EnumC0044Ujhhgtgfeyxiexzf enumC0044UjhhgtgfeyxiexzfM98Ujhhgtgfeyxiexzf = m98Ujhhgtgfeyxiexzf(interfaceC0050Ujhhgtgfeyxiexzf);
            this.f303Ujhhgtgfeyxiexzf++;
            while (c0084Ujhhgtgfeyxiexzf.f1158Ujhhgtgfeyxiexzf.compareTo(enumC0044UjhhgtgfeyxiexzfM98Ujhhgtgfeyxiexzf) < 0 && this.f300Ujhhgtgfeyxiexzf.f10642Ujhhgtgfeyxiexzf.containsKey(interfaceC0050Ujhhgtgfeyxiexzf)) {
                EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf3 = c0084Ujhhgtgfeyxiexzf.f1158Ujhhgtgfeyxiexzf;
                ArrayList arrayList = this.f306Ujhhgtgfeyxiexzf;
                arrayList.add(enumC0044Ujhhgtgfeyxiexzf3);
                C0048Ujhhgtgfeyxiexzf c0048Ujhhgtgfeyxiexzf = p000.Ujhhgtgfeyxiexzf.Companion;
                EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf4 = c0084Ujhhgtgfeyxiexzf.f1158Ujhhgtgfeyxiexzf;
                c0048Ujhhgtgfeyxiexzf.getClass();
                int iOrdinal = enumC0044Ujhhgtgfeyxiexzf4.ordinal();
                if (iOrdinal == 1) {
                    ujhhgtgfeyxiexzf = p000.Ujhhgtgfeyxiexzf.ON_CREATE;
                } else if (iOrdinal != 2) {
                    ujhhgtgfeyxiexzf = iOrdinal != 3 ? null : p000.Ujhhgtgfeyxiexzf.ON_RESUME;
                } else {
                    ujhhgtgfeyxiexzf = p000.Ujhhgtgfeyxiexzf.ON_START;
                }
                if (ujhhgtgfeyxiexzf == null) {
                    throw new IllegalStateException("no event up from " + c0084Ujhhgtgfeyxiexzf.f1158Ujhhgtgfeyxiexzf);
                }
                c0084Ujhhgtgfeyxiexzf.m1131Ujhhgtgfeyxiexzf(interfaceC0083Ujhhgtgfeyxiexzf, ujhhgtgfeyxiexzf);
                arrayList.remove(arrayList.size() - 1);
                enumC0044UjhhgtgfeyxiexzfM98Ujhhgtgfeyxiexzf = m98Ujhhgtgfeyxiexzf(interfaceC0050Ujhhgtgfeyxiexzf);
            }
            if (!z3) {
                m103Ujhhgtgfeyxiexzf();
            }
            this.f303Ujhhgtgfeyxiexzf--;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final EnumC0044Ujhhgtgfeyxiexzf m98Ujhhgtgfeyxiexzf(InterfaceC0050Ujhhgtgfeyxiexzf interfaceC0050Ujhhgtgfeyxiexzf) {
        HashMap map = this.f300Ujhhgtgfeyxiexzf.f10642Ujhhgtgfeyxiexzf;
        C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg = map.containsKey(interfaceC0050Ujhhgtgfeyxiexzf) ? ((C0930feyxiexzfUjhhgtg) map.get(interfaceC0050Ujhhgtgfeyxiexzf)).f3763Ujhhgtgfeyxiexzf : null;
        EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg != null ? ((C0084Ujhhgtgfeyxiexzf) c0930feyxiexzfUjhhgtg.f3761Ujhhgtgfeyxiexzf).f1158Ujhhgtgfeyxiexzf : null;
        ArrayList arrayList = this.f306Ujhhgtgfeyxiexzf;
        EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf2 = arrayList.isEmpty() ? null : (EnumC0044Ujhhgtgfeyxiexzf) arrayList.get(arrayList.size() - 1);
        EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf3 = this.f301Ujhhgtgfeyxiexzf;
        if (enumC0044Ujhhgtgfeyxiexzf == null || enumC0044Ujhhgtgfeyxiexzf.compareTo(enumC0044Ujhhgtgfeyxiexzf3) >= 0) {
            enumC0044Ujhhgtgfeyxiexzf = enumC0044Ujhhgtgfeyxiexzf3;
        }
        return (enumC0044Ujhhgtgfeyxiexzf2 == null || enumC0044Ujhhgtgfeyxiexzf2.compareTo(enumC0044Ujhhgtgfeyxiexzf) >= 0) ? enumC0044Ujhhgtgfeyxiexzf : enumC0044Ujhhgtgfeyxiexzf2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m99Ujhhgtgfeyxiexzf(String str) {
        if (this.f299Ujhhgtgfeyxiexzf) {
            ((C2373Ujhhgtgfeyxiexzf) C2373Ujhhgtgfeyxiexzf.m3614feyxiexzfUjhhgtg().f7724Ujhhgtgfeyxiexzf).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m100Ujhhgtgfeyxiexzf(p000.Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf) {
        m99Ujhhgtgfeyxiexzf("handleLifecycleEvent");
        m101Ujhhgtgfeyxiexzf(ujhhgtgfeyxiexzf.m1051Ujhhgtgfeyxiexzf());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m101Ujhhgtgfeyxiexzf(EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf) {
        EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf2 = this.f301Ujhhgtgfeyxiexzf;
        if (enumC0044Ujhhgtgfeyxiexzf2 == enumC0044Ujhhgtgfeyxiexzf) {
            return;
        }
        EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf3 = EnumC0044Ujhhgtgfeyxiexzf.f1057Ujhhgtgfeyxiexzf;
        EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf4 = EnumC0044Ujhhgtgfeyxiexzf.f1056Ujhhgtgfeyxiexzf;
        if (enumC0044Ujhhgtgfeyxiexzf2 == enumC0044Ujhhgtgfeyxiexzf3 && enumC0044Ujhhgtgfeyxiexzf == enumC0044Ujhhgtgfeyxiexzf4) {
            throw new IllegalStateException(("no event down from " + this.f301Ujhhgtgfeyxiexzf + " in component " + this.f302Ujhhgtgfeyxiexzf.get()).toString());
        }
        this.f301Ujhhgtgfeyxiexzf = enumC0044Ujhhgtgfeyxiexzf;
        if (this.f304Ujhhgtgfeyxiexzf || this.f303Ujhhgtgfeyxiexzf != 0) {
            this.f305Ujhhgtgfeyxiexzf = true;
            return;
        }
        this.f304Ujhhgtgfeyxiexzf = true;
        m103Ujhhgtgfeyxiexzf();
        this.f304Ujhhgtgfeyxiexzf = false;
        if (this.f301Ujhhgtgfeyxiexzf == enumC0044Ujhhgtgfeyxiexzf4) {
            this.f300Ujhhgtgfeyxiexzf = new C3416Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m102Ujhhgtgfeyxiexzf(InterfaceC0050Ujhhgtgfeyxiexzf interfaceC0050Ujhhgtgfeyxiexzf) {
        m99Ujhhgtgfeyxiexzf("removeObserver");
        this.f300Ujhhgtgfeyxiexzf.mo2432Ujhhgtgfeyxiexzf(interfaceC0050Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m103Ujhhgtgfeyxiexzf() {
        EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf;
        EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf2;
        p000.Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf;
        p000.Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf2;
        InterfaceC0083Ujhhgtgfeyxiexzf interfaceC0083Ujhhgtgfeyxiexzf = (InterfaceC0083Ujhhgtgfeyxiexzf) this.f302Ujhhgtgfeyxiexzf.get();
        if (interfaceC0083Ujhhgtgfeyxiexzf == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C3416Ujhhgtgfeyxiexzf c3416Ujhhgtgfeyxiexzf = this.f300Ujhhgtgfeyxiexzf;
            if (c3416Ujhhgtgfeyxiexzf.f3782Ujhhgtgfeyxiexzf == 0 || ((enumC0044Ujhhgtgfeyxiexzf = ((C0084Ujhhgtgfeyxiexzf) c3416Ujhhgtgfeyxiexzf.f3779Ujhhgtgfeyxiexzf.f3761Ujhhgtgfeyxiexzf).f1158Ujhhgtgfeyxiexzf) == (enumC0044Ujhhgtgfeyxiexzf2 = ((C0084Ujhhgtgfeyxiexzf) c3416Ujhhgtgfeyxiexzf.f3780Ujhhgtgfeyxiexzf.f3761Ujhhgtgfeyxiexzf).f1158Ujhhgtgfeyxiexzf) && this.f301Ujhhgtgfeyxiexzf == enumC0044Ujhhgtgfeyxiexzf2)) {
                break;
            }
            this.f305Ujhhgtgfeyxiexzf = false;
            int iCompareTo = this.f301Ujhhgtgfeyxiexzf.compareTo(enumC0044Ujhhgtgfeyxiexzf);
            ArrayList arrayList = this.f306Ujhhgtgfeyxiexzf;
            if (iCompareTo < 0) {
                C3416Ujhhgtgfeyxiexzf c3416Ujhhgtgfeyxiexzf2 = this.f300Ujhhgtgfeyxiexzf;
                C0934feyxiexzfUjhhgtg c0934feyxiexzfUjhhgtg = new C0934feyxiexzfUjhhgtg(c3416Ujhhgtgfeyxiexzf2.f3780Ujhhgtgfeyxiexzf, c3416Ujhhgtgfeyxiexzf2.f3779Ujhhgtgfeyxiexzf, 1);
                c3416Ujhhgtgfeyxiexzf2.f3781Ujhhgtgfeyxiexzf.put(c0934feyxiexzfUjhhgtg, Boolean.FALSE);
                while (c0934feyxiexzfUjhhgtg.hasNext() && !this.f305Ujhhgtgfeyxiexzf) {
                    Map.Entry entry = (Map.Entry) c0934feyxiexzfUjhhgtg.next();
                    InterfaceC0050Ujhhgtgfeyxiexzf interfaceC0050Ujhhgtgfeyxiexzf = (InterfaceC0050Ujhhgtgfeyxiexzf) entry.getKey();
                    C0084Ujhhgtgfeyxiexzf c0084Ujhhgtgfeyxiexzf = (C0084Ujhhgtgfeyxiexzf) entry.getValue();
                    while (c0084Ujhhgtgfeyxiexzf.f1158Ujhhgtgfeyxiexzf.compareTo(this.f301Ujhhgtgfeyxiexzf) > 0 && !this.f305Ujhhgtgfeyxiexzf && this.f300Ujhhgtgfeyxiexzf.f10642Ujhhgtgfeyxiexzf.containsKey(interfaceC0050Ujhhgtgfeyxiexzf)) {
                        C0048Ujhhgtgfeyxiexzf c0048Ujhhgtgfeyxiexzf = p000.Ujhhgtgfeyxiexzf.Companion;
                        EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf3 = c0084Ujhhgtgfeyxiexzf.f1158Ujhhgtgfeyxiexzf;
                        c0048Ujhhgtgfeyxiexzf.getClass();
                        int iOrdinal = enumC0044Ujhhgtgfeyxiexzf3.ordinal();
                        if (iOrdinal == 2) {
                            ujhhgtgfeyxiexzf2 = p000.Ujhhgtgfeyxiexzf.ON_DESTROY;
                        } else if (iOrdinal != 3) {
                            ujhhgtgfeyxiexzf2 = iOrdinal != 4 ? null : p000.Ujhhgtgfeyxiexzf.ON_PAUSE;
                        } else {
                            ujhhgtgfeyxiexzf2 = p000.Ujhhgtgfeyxiexzf.ON_STOP;
                        }
                        if (ujhhgtgfeyxiexzf2 == null) {
                            throw new IllegalStateException("no event down from " + c0084Ujhhgtgfeyxiexzf.f1158Ujhhgtgfeyxiexzf);
                        }
                        arrayList.add(ujhhgtgfeyxiexzf2.m1051Ujhhgtgfeyxiexzf());
                        c0084Ujhhgtgfeyxiexzf.m1131Ujhhgtgfeyxiexzf(interfaceC0083Ujhhgtgfeyxiexzf, ujhhgtgfeyxiexzf2);
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
            C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg = this.f300Ujhhgtgfeyxiexzf.f3780Ujhhgtgfeyxiexzf;
            if (!this.f305Ujhhgtgfeyxiexzf && c0930feyxiexzfUjhhgtg != null && this.f301Ujhhgtgfeyxiexzf.compareTo(((C0084Ujhhgtgfeyxiexzf) c0930feyxiexzfUjhhgtg.f3761Ujhhgtgfeyxiexzf).f1158Ujhhgtgfeyxiexzf) > 0) {
                C3416Ujhhgtgfeyxiexzf c3416Ujhhgtgfeyxiexzf3 = this.f300Ujhhgtgfeyxiexzf;
                c3416Ujhhgtgfeyxiexzf3.getClass();
                C0931feyxiexzfUjhhgtg c0931feyxiexzfUjhhgtg = new C0931feyxiexzfUjhhgtg(c3416Ujhhgtgfeyxiexzf3);
                c3416Ujhhgtgfeyxiexzf3.f3781Ujhhgtgfeyxiexzf.put(c0931feyxiexzfUjhhgtg, Boolean.FALSE);
                while (c0931feyxiexzfUjhhgtg.hasNext() && !this.f305Ujhhgtgfeyxiexzf) {
                    Map.Entry entry2 = (Map.Entry) c0931feyxiexzfUjhhgtg.next();
                    InterfaceC0050Ujhhgtgfeyxiexzf interfaceC0050Ujhhgtgfeyxiexzf2 = (InterfaceC0050Ujhhgtgfeyxiexzf) entry2.getKey();
                    C0084Ujhhgtgfeyxiexzf c0084Ujhhgtgfeyxiexzf2 = (C0084Ujhhgtgfeyxiexzf) entry2.getValue();
                    while (c0084Ujhhgtgfeyxiexzf2.f1158Ujhhgtgfeyxiexzf.compareTo(this.f301Ujhhgtgfeyxiexzf) < 0 && !this.f305Ujhhgtgfeyxiexzf && this.f300Ujhhgtgfeyxiexzf.f10642Ujhhgtgfeyxiexzf.containsKey(interfaceC0050Ujhhgtgfeyxiexzf2)) {
                        arrayList.add(c0084Ujhhgtgfeyxiexzf2.f1158Ujhhgtgfeyxiexzf);
                        C0048Ujhhgtgfeyxiexzf c0048Ujhhgtgfeyxiexzf2 = p000.Ujhhgtgfeyxiexzf.Companion;
                        EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf4 = c0084Ujhhgtgfeyxiexzf2.f1158Ujhhgtgfeyxiexzf;
                        c0048Ujhhgtgfeyxiexzf2.getClass();
                        int iOrdinal2 = enumC0044Ujhhgtgfeyxiexzf4.ordinal();
                        if (iOrdinal2 == 1) {
                            ujhhgtgfeyxiexzf = p000.Ujhhgtgfeyxiexzf.ON_CREATE;
                        } else if (iOrdinal2 != 2) {
                            ujhhgtgfeyxiexzf = iOrdinal2 != 3 ? null : p000.Ujhhgtgfeyxiexzf.ON_RESUME;
                        } else {
                            ujhhgtgfeyxiexzf = p000.Ujhhgtgfeyxiexzf.ON_START;
                        }
                        if (ujhhgtgfeyxiexzf == null) {
                            throw new IllegalStateException("no event up from " + c0084Ujhhgtgfeyxiexzf2.f1158Ujhhgtgfeyxiexzf);
                        }
                        c0084Ujhhgtgfeyxiexzf2.m1131Ujhhgtgfeyxiexzf(interfaceC0083Ujhhgtgfeyxiexzf, ujhhgtgfeyxiexzf);
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
        }
        this.f305Ujhhgtgfeyxiexzf = false;
    }
}

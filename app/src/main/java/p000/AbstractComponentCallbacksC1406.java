package p000;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.C0000;
import androidx.lifecycle.SavedStateHandleAttacher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲁᲀᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC1406 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1777, InterfaceC3587, InterfaceC1520, InterfaceC2629 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final Object f5065 = new Object();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f5066 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f5067 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0575 f5068 = new C0575();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean f5069 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C0243 f5070;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final EnumC1770 f5071;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C0000 f5072;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C2712 f5073;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final ArrayList f5074;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final C0094 f5075;

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᛸᲇᤝᲈ] */
    public AbstractComponentCallbacksC1406() {
        Object obj;
        InterfaceC2628 interfaceC2628;
        String str;
        new RunnableC0141(8, this);
        this.f5071 = EnumC1770.f5895;
        new C2107();
        new AtomicInteger();
        this.f5074 = new ArrayList();
        this.f5075 = new C0094(23, this);
        this.f5072 = new C0000(this);
        this.f5073 = new C2712(this);
        ArrayList arrayList = this.f5074;
        C0094 c0094 = this.f5075;
        if (arrayList.contains(c0094)) {
            return;
        }
        if (true) {
            arrayList.add(c0094);
            return;
        }
        AbstractComponentCallbacksC1406 abstractComponentCallbacksC1406 = (AbstractComponentCallbacksC1406) c0094.f1049;
        abstractComponentCallbacksC1406.f5073.m4721();
        EnumC1770 enumC1770 = abstractComponentCallbacksC1406.f5072.f300;
        if (enumC1770 != EnumC1770.f5892 && enumC1770 != EnumC1770.f5893) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((C2620) ((C0214) abstractComponentCallbacksC1406.f5073.f8761).f1327).iterator();
        do {
            C2616 c2616 = (C2616) it;
            obj = null;
            if (!c2616.hasNext()) {
                interfaceC2628 = null;
                break;
            } else {
                Map.Entry entry = (Map.Entry) c2616.next();
                str = (String) entry.getKey();
                interfaceC2628 = (InterfaceC2628) entry.getValue();
            }
        } while (!AbstractC2207.m4087(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        if (interfaceC2628 == null) {
            C2624 c2624 = new C2624((C0214) abstractComponentCallbacksC1406.f5073.f8761, abstractComponentCallbacksC1406);
            C2620 c2620 = (C2620) ((C0214) abstractComponentCallbacksC1406.f5073.f8761).f1327;
            C2617 c2617Mo3001 = c2620.mo3001("androidx.lifecycle.internal.SavedStateHandlesProvider");
            if (c2617Mo3001 != null) {
                obj = c2617Mo3001.f8497;
            } else {
                C2617 c2617 = new C2617("androidx.lifecycle.internal.SavedStateHandlesProvider", c2624);
                c2620.f8506++;
                C2617 c2618 = c2620.f8504;
                if (c2618 == null) {
                    c2620.f8503 = c2617;
                    c2620.f8504 = c2617;
                } else {
                    c2618.f8498 = c2617;
                    c2617.f8499 = c2618;
                    c2620.f8504 = c2617;
                }
            }
            if (((InterfaceC2628) obj) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            abstractComponentCallbacksC1406.f5072.m97(new SavedStateHandleAttacher(c2624));
        }
        C2712 c2712 = abstractComponentCallbacksC1406.f5073;
        if (!c2712.f8759) {
            c2712.m4721();
        }
        C0000 c0000Mo750 = c2712.f8760.mo750();
        if (c0000Mo750.f300.compareTo(EnumC1770.f5894) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0000Mo750.f300).toString());
        }
        C0214 c0214 = (C0214) c2712.f8761;
        if (!c0214.f1324) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0214.f1325) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0214.f1328 = null;
        c0214.f1325 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f5067);
        sb.append(")");
        return sb.toString();
    }

    @Override // p000.InterfaceC1520
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractC0376 mo3117() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // p000.InterfaceC3587
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractC1458 mo3118() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // p000.InterfaceC2629
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0214 mo3119() {
        return (C0214) this.f5073.f8761;
    }

    @Override // p000.InterfaceC1777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final C0000 mo750() {
        return this.f5072;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0575 m3120() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}

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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲁᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC1414 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1800, InterfaceC3647, InterfaceC1532, InterfaceC2690 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final Object f5094 = new Object();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f5095 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f5096 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0552 f5097 = new C0552();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean f5098 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0253 f5099;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final EnumC1793 f5100;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0000 f5101;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C2773 f5102;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ArrayList f5103;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C0102 f5104;

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᲈᛸᤝᲇ] */
    public AbstractComponentCallbacksC1414() {
        Object obj;
        InterfaceC2689 interfaceC2689;
        String str;
        new RunnableC0149(this, 8);
        this.f5100 = EnumC1793.f5951;
        new C2140();
        new AtomicInteger();
        this.f5103 = new ArrayList();
        this.f5104 = new C0102(this, 24);
        this.f5101 = new C0000(this);
        this.f5102 = new C2773(this);
        ArrayList arrayList = this.f5103;
        C0102 c0102 = this.f5104;
        if (arrayList.contains(c0102)) {
            return;
        }
        if (this.f5095 < 0) {
            arrayList.add(c0102);
            return;
        }
        AbstractComponentCallbacksC1414 abstractComponentCallbacksC1414 = (AbstractComponentCallbacksC1414) c0102.f1117;
        abstractComponentCallbacksC1414.f5102.m4755();
        EnumC1793 enumC1793 = abstractComponentCallbacksC1414.f5101.f300;
        if (enumC1793 != EnumC1793.f5948 && enumC1793 != EnumC1793.f5949) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((C2681) ((C0224) abstractComponentCallbacksC1414.f5102.f8924).f1401).iterator();
        do {
            C2677 c2677 = (C2677) it;
            obj = null;
            if (!c2677.hasNext()) {
                interfaceC2689 = null;
                break;
            } else {
                Map.Entry entry = (Map.Entry) c2677.next();
                str = (String) entry.getKey();
                interfaceC2689 = (InterfaceC2689) entry.getValue();
            }
        } while (!AbstractC1469.m3322(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        if (interfaceC2689 == null) {
            C2685 c2685 = new C2685((C0224) abstractComponentCallbacksC1414.f5102.f8924, abstractComponentCallbacksC1414);
            C2681 c2681 = (C2681) ((C0224) abstractComponentCallbacksC1414.f5102.f8924).f1401;
            C2678 c2678Mo3104 = c2681.mo3104("androidx.lifecycle.internal.SavedStateHandlesProvider");
            if (c2678Mo3104 != null) {
                obj = c2678Mo3104.f8662;
            } else {
                C2678 c2678 = new C2678("androidx.lifecycle.internal.SavedStateHandlesProvider", c2685);
                c2681.f8671++;
                C2678 c2679 = c2681.f8669;
                if (c2679 == null) {
                    c2681.f8668 = c2678;
                    c2681.f8669 = c2678;
                } else {
                    c2679.f8663 = c2678;
                    c2678.f8664 = c2679;
                    c2681.f8669 = c2678;
                }
            }
            if (((InterfaceC2689) obj) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            abstractComponentCallbacksC1414.f5101.m97(new SavedStateHandleAttacher(c2685));
        }
        C2773 c2773 = abstractComponentCallbacksC1414.f5102;
        if (!c2773.f8922) {
            c2773.m4755();
        }
        C0000 c0000Mo894 = c2773.f8923.mo894();
        if (c0000Mo894.f300.compareTo(EnumC1793.f5950) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0000Mo894.f300).toString());
        }
        C0224 c0224 = (C0224) c2773.f8924;
        if (!c0224.f1398) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0224.f1399) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0224.f1402 = null;
        c0224.f1399 = true;
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
        sb.append(this.f5096);
        sb.append(")");
        return sb.toString();
    }

    @Override // p000.InterfaceC1532
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractC0351 mo3225() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // p000.InterfaceC3647
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractC1470 mo3226() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // p000.InterfaceC2690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0224 mo3227() {
        return (C0224) this.f5102.f8924;
    }

    @Override // p000.InterfaceC1800
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final C0000 mo894() {
        return this.f5101;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0552 m3228() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}

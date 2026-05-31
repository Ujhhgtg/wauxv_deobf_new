package p000;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲀᤝᤞᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3497 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C0327 f11008 = new C0327();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final ThreadLocal f11009 = new ThreadLocal();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final ArrayList f11010 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m5020(ViewGroup viewGroup, AbstractC3493 abstractC3493) {
        ArrayList arrayList = f11010;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC3493 == null) {
            abstractC3493 = f11008;
        }
        AbstractC3493 abstractC3493Clone = abstractC3493.clone();
        ArrayList arrayList2 = (ArrayList) m5021().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC3493) it.next()).mo1561(viewGroup);
            }
        }
        abstractC3493Clone.m5011(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC3496 viewTreeObserverOnPreDrawListenerC3496 = new ViewTreeObserverOnPreDrawListenerC3496();
        viewTreeObserverOnPreDrawListenerC3496.f11006 = abstractC3493Clone;
        viewTreeObserverOnPreDrawListenerC3496.f11007 = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC3496);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC3496);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C0274 m5021() {
        C0274 c0274;
        ThreadLocal threadLocal = f11009;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0274 = (C0274) weakReference.get()) != null) {
            return c0274;
        }
        C0274 c0275 = new C0274(0);
        threadLocal.set(new WeakReference(c0275));
        return c0275;
    }
}

package p000;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3440 {

    public static final C0315 f10848 = new C0315();

    public static final ThreadLocal f10849 = new ThreadLocal();

    public static final ArrayList f10850 = new ArrayList();

    public static void m4958(ViewGroup viewGroup, AbstractC3436 abstractC3436) {
        ArrayList arrayList = f10850;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC3436 == null) {
            abstractC3436 = f10848;
        }
        AbstractC3436 abstractC3436Clone = abstractC3436.clone();
        ArrayList arrayList2 = (ArrayList) m4959().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC3436) it.next()).mo1415(viewGroup);
            }
        }
        abstractC3436Clone.m4949(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC3439 viewTreeObserverOnPreDrawListenerC3439 = new ViewTreeObserverOnPreDrawListenerC3439();
        viewTreeObserverOnPreDrawListenerC3439.f10846 = abstractC3436Clone;
        viewTreeObserverOnPreDrawListenerC3439.f10847 = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC3439);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC3439);
    }

    public static C0264 m4959() {
        C0264 c0264;
        ThreadLocal threadLocal = f10849;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0264 = (C0264) weakReference.get()) != null) {
            return c0264;
        }
        C0264 c0265 = new C0264(0);
        threadLocal.set(new WeakReference(c0265));
        return c0265;
    }
}

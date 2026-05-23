package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᛸᲀᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3436 implements Cloneable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final Animator[] f10816 = new Animator[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static final int[] f10817 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static final C2102 f10818 = new C2102(21);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static final ThreadLocal f10819 = new ThreadLocal();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public ArrayList f10830;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public ArrayList f10831;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public InterfaceC3435[] f10832;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public long f10842;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public long f10843;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10820 = getClass().getName();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public long f10821 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public long f10822 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public TimeInterpolator f10823 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final ArrayList f10824 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final ArrayList f10825 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C2103 f10826 = new C2103(15);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C2103 f10827 = new C2103(15);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C0315 f10828 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int[] f10829 = f10817;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final ArrayList f10833 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public Animator[] f10834 = f10816;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int f10835 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public boolean f10836 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public boolean f10837 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public AbstractC3436 f10838 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public ArrayList f10839 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public ArrayList f10840 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public C2102 f10841 = f10818;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m4944(C2103 c2103, View view, C3444 c3444) {
        C0264 c0264 = (C0264) c2103.f6935;
        C0264 c0265 = (C0264) c2103.f6938;
        SparseArray sparseArray = (SparseArray) c2103.f6936;
        C1863 c1863 = (C1863) c2103.f6937;
        c0264.put(view, c3444);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        Field field = AbstractC3578.f11184;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (c0265.containsKey(transitionName)) {
                c0265.put(transitionName, null);
            } else {
                c0265.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c1863.f6187) {
                    int i = c1863.f6190;
                    long[] jArr = c1863.f6188;
                    Object[] objArr = c1863.f6189;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != AbstractC1460.f5198) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    c1863.f6187 = false;
                    c1863.f6190 = i2;
                }
                if (AbstractC1460.m3206(c1863.f6188, c1863.f6190, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1863.m3633(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) c1863.m3631(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c1863.m3633(null, itemIdAtPosition);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static C0264 m4945() {
        ThreadLocal threadLocal = f10819;
        C0264 c0264 = (C0264) threadLocal.get();
        if (c0264 != null) {
            return c0264;
        }
        C0264 c0265 = new C0264(0);
        threadLocal.set(c0265);
        return c0265;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static boolean m4946(C3444 c3444, C3444 c3445, String str) {
        Object obj = c3444.f10854.get(str);
        Object obj2 = c3445.f10854.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void cancel() {
        ArrayList arrayList = this.f10833;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f10834);
        this.f10834 = f10816;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f10834 = animatorArr;
        m4956(this, C2373.f7626, false);
    }

    public final String toString() {
        return mo1427("");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m4947(InterfaceC3435 interfaceC3435) {
        if (this.f10839 == null) {
            this.f10839 = new ArrayList();
        }
        this.f10839.add(interfaceC3435);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public abstract void mo1409(C3444 c3444);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4948(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C3444 c3444 = new C3444(view);
            if (z) {
                mo1411(c3444);
            } else {
                mo1409(c3444);
            }
            c3444.f10856.add(this);
            mo1410(c3444);
            if (z) {
                m4944(this.f10826, view, c3444);
            } else {
                m4944(this.f10827, view, c3444);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4948(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public abstract void mo1411(C3444 c3444);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m4949(ViewGroup viewGroup, boolean z) {
        m4950(z);
        ArrayList arrayList = this.f10824;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10825;
        if (size <= 0 && arrayList2.size() <= 0) {
            m4948(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                C3444 c3444 = new C3444(viewFindViewById);
                if (z) {
                    mo1411(c3444);
                } else {
                    mo1409(c3444);
                }
                c3444.f10856.add(this);
                mo1410(c3444);
                if (z) {
                    m4944(this.f10826, viewFindViewById, c3444);
                } else {
                    m4944(this.f10827, viewFindViewById, c3444);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C3444 c3445 = new C3444(view);
            if (z) {
                mo1411(c3445);
            } else {
                mo1409(c3445);
            }
            c3445.f10856.add(this);
            mo1410(c3445);
            if (z) {
                m4944(this.f10826, view, c3445);
            } else {
                m4944(this.f10827, view, c3445);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m4950(boolean z) {
        if (z) {
            ((C0264) this.f10826.f6935).clear();
            ((SparseArray) this.f10826.f6936).clear();
            ((C1863) this.f10826.f6937).m3630();
        } else {
            ((C0264) this.f10827.f6935).clear();
            ((SparseArray) this.f10827.f6936).clear();
            ((C1863) this.f10827.f6937).m3630();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: merged with bridge method [inline-methods] */
    public AbstractC3436 clone() {
        try {
            AbstractC3436 abstractC3436 = (AbstractC3436) super.clone();
            abstractC3436.f10840 = new ArrayList();
            abstractC3436.f10826 = new C2103(15);
            abstractC3436.f10827 = new C2103(15);
            abstractC3436.f10830 = null;
            abstractC3436.f10831 = null;
            abstractC3436.f10838 = this;
            abstractC3436.f10839 = null;
            return abstractC3436;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public Animator mo2016(ViewGroup viewGroup, C3444 c3444, C3444 c3445) {
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public void mo1413(ViewGroup viewGroup, C2103 c2103, C2103 c2104, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        C3444 c3444;
        Animator animator;
        C3444 c3445;
        C0264 c0264M4945 = m4945();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        
        int i3 = 0;
        while (i3 < size) {
            C3444 c3446 = (C3444) arrayList.get(i3);
            C3444 c3447 = (C3444) arrayList2.get(i3);
            if (c3446 != null && !c3446.f10856.contains(this)) {
                c3446 = null;
            }
            if (c3447 != null && !c3447.f10856.contains(this)) {
                c3447 = null;
            }
            if ((c3446 != null || c3447 != null) && (c3446 == null || c3447 == null || mo2954(c3446, c3447))) {
                Animator animatorMo2016 = mo2016(viewGroup, c3446, c3447);
                if (animatorMo2016 != null) {
                    String str = this.f10820;
                    if (c3447 != null) {
                        view = c3447.f10855;
                        String[] strArrMo2017 = mo2017();
                        if (strArrMo2017 != null && strArrMo2017.length > 0) {
                            c3445 = new C3444(view);
                            C3444 c3448 = (C3444) ((C0264) c2104.f6935).get(view);
                            i = size;
                            if (c3448 != null) {
                                int i4 = 0;
                                while (i4 < strArrMo2017.length) {
                                    String str2 = strArrMo2017[i4];
                                    int i5 = i3;
                                    c3445.f10854.put(str2, c3448.f10854.get(str2));
                                    i4++;
                                    i3 = i5;
                                    c3448 = c3448;
                                }
                            }
                            i2 = i3;
                            int i6 = c0264M4945.f8716;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = animatorMo2016;
                                    break;
                                }
                                C3432 c3432 = (C3432) c0264M4945.get((Animator) c0264M4945.m4706(i7));
                                if (c3432.f10811 != null && c3432.f10809 == view && c3432.f10810.equals(str) && c3432.f10811.equals(c3445)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorMo2016;
                            c3445 = null;
                        }
                        animatorMo2016 = animator;
                        c3444 = c3445;
                    } else {
                        i = size;
                        i2 = i3;
                        view = c3446.f10855;
                        c3444 = null;
                    }
                    if (animatorMo2016 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C3432 c3433 = new C3432();
                        c3433.f10809 = view;
                        c3433.f10810 = str;
                        c3433.f10811 = c3444;
                        c3433.f10812 = windowId;
                        c3433.f10813 = this;
                        c3433.f10814 = animatorMo2016;
                        c0264M4945.put(animatorMo2016, c3433);
                        this.f10840.add(animatorMo2016);
                    }
                }
                i3 = i2 + 1;
                size = i;
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                C3432 c3434 = (C3432) c0264M4945.get((Animator) this.f10840.get(sparseIntArray.keyAt(i8)));
                c3434.f10814.setStartDelay(c3434.f10814.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - 9223372036854775807L));
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m4951() {
        int i = this.f10835 - 1;
        this.f10835 = i;
        if (i == 0) {
            m4956(this, C2373.f7625, false);
            for (int i2 = 0; i2 < ((C1863) this.f10826.f6937).m3634(); i2++) {
                View view = (View) ((C1863) this.f10826.f6937).m3635(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C1863) this.f10827.f6937).m3634(); i3++) {
                View view2 = (View) ((C1863) this.f10827.f6937).m3635(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f10837 = true;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final C3444 m4952(View view, boolean z) {
        C0315 c0315 = this.f10828;
        if (c0315 != null) {
            return c0315.m4952(view, z);
        }
        ArrayList arrayList = z ? this.f10830 : this.f10831;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C3444 c3444 = (C3444) arrayList.get(i);
            if (c3444 == null) {
                return null;
            }
            if (c3444.f10855 == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C3444) (z ? this.f10831 : this.f10830).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final AbstractC3436 m4953() {
        C0315 c0315 = this.f10828;
        return c0315 != null ? c0315.m4953() : this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public String[] mo2017() {
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final C3444 m4954(View view, boolean z) {
        C0315 c0315 = this.f10828;
        if (c0315 != null) {
            return c0315.m4954(view, z);
        }
        return (C3444) ((C0264) (z ? this.f10826 : this.f10827).f6935).get(view);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public boolean mo1414() {
        return !this.f10833.isEmpty();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public boolean mo2954(C3444 c3444, C3444 c3445) {
        if (c3444 != null && c3445 != null) {
            String[] strArrMo2017 = mo2017();
            if (strArrMo2017 != null) {
                for (String str : strArrMo2017) {
                    if (m4946(c3444, c3445, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c3444.f10854.keySet().iterator();
                while (it.hasNext()) {
                    if (m4946(c3444, c3445, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final boolean m4955(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f10824;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10825;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void m4956(AbstractC3436 abstractC3436, C2373 c2373, boolean z) {
        AbstractC3436 abstractC3437 = this.f10838;
        if (abstractC3437 != null) {
            abstractC3437.m4956(abstractC3436, c2373, z);
        }
        ArrayList arrayList = this.f10839;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f10839.size();
        InterfaceC3435[] interfaceC3435Arr = this.f10832;
        if (interfaceC3435Arr == null) {
            interfaceC3435Arr = new InterfaceC3435[size];
        }
        this.f10832 = null;
        InterfaceC3435[] interfaceC3435Arr2 = (InterfaceC3435[]) this.f10839.toArray(interfaceC3435Arr);
        for (int i = 0; i < size; i++) {
            InterfaceC3435 interfaceC3435 = interfaceC3435Arr2[i];
            switch (c2373.f7629) {
                case 24 /* 24 */:
                    interfaceC3435.mo2950(abstractC3436);
                    break;
                case 25 /* 25 */:
                    interfaceC3435.mo2012(abstractC3436);
                    break;
                case 26:
                    interfaceC3435.mo2014(abstractC3436);
                    break;
                case 27:
                    interfaceC3435.mo2011();
                    break;
                default:
                    interfaceC3435.mo2013();
                    break;
            }
            interfaceC3435Arr2[i] = null;
        }
        this.f10832 = interfaceC3435Arr2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public void mo1415(View view) {
        if (this.f10837) {
            return;
        }
        ArrayList arrayList = this.f10833;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f10834);
        this.f10834 = f10816;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f10834 = animatorArr;
        m4956(this, C2373.f7627, false);
        this.f10836 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public void mo1416() {
        C0264 c0264M4945 = m4945();
        this.f10842 = 0L;
        for (int i = 0; i < this.f10840.size(); i++) {
            Animator animator = (Animator) this.f10840.get(i);
            C3432 c3432 = (C3432) c0264M4945.get(animator);
            if (animator != null && c3432 != null) {
                Animator animator2 = c3432.f10814;
                long j = this.f10822;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.f10821;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.f10823;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f10833.add(animator);
                this.f10842 = Math.max(this.f10842, AbstractC3433.m4942(animator));
            }
        }
        this.f10840.clear();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ */
    public AbstractC3436 mo1417(InterfaceC3435 interfaceC3435) {
        AbstractC3436 abstractC3436;
        ArrayList arrayList = this.f10839;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC3435) && (abstractC3436 = this.f10838) != null) {
                abstractC3436.mo1417(interfaceC3435);
            }
            if (this.f10839.size() == 0) {
                this.f10839 = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public void mo1418(View view) {
        if (this.f10836) {
            if (!this.f10837) {
                ArrayList arrayList = this.f10833;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f10834);
                this.f10834 = f10816;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f10834 = animatorArr;
                m4956(this, C2373.f7628, false);
            }
            this.f10836 = false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public void mo1419() {
        m4957();
        C0264 c0264M4945 = m4945();
        for (Animator animator : this.f10840) {
            if (c0264M4945.containsKey(animator)) {
                m4957();
                if (animator != null) {
                    animator.addListener(new C3431(this, c0264M4945));
                    long j = this.f10822;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f10821;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f10823;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0123(6, this));
                    animator.start();
                }
            }
        }
        this.f10840.clear();
        m4951();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ */
    public void mo1420(long j, long j2) {
        long j3 = this.f10842;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.f10837 = false;
            m4956(this, C2373.f7624, z);
        }
        ArrayList arrayList = this.f10833;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f10834);
        this.f10834 = f10816;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            AbstractC3433.m4943(animator, Math.min(Math.max(0L, j), AbstractC3433.m4942(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.f10834 = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.f10837 = true;
        }
        m4956(this, C2373.f7625, z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public void mo1421(long j) {
        this.f10822 = j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ */
    public void mo1423(TimeInterpolator timeInterpolator) {
        this.f10823 = timeInterpolator;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public void mo1424(C2102 c2102) {
        if (c2102 == null) {
            this.f10841 = f10818;
        } else {
            this.f10841 = c2102;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public void mo1426(long j) {
        this.f10821 = j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final void m4957() {
        if (this.f10835 == 0) {
            m4956(this, C2373.f7624, false);
            this.f10837 = false;
        }
        this.f10835++;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public String mo1427(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f10822 != -1) {
            sb.append("dur(");
            sb.append(this.f10822);
            sb.append(") ");
        }
        if (this.f10821 != -1) {
            sb.append("dly(");
            sb.append(this.f10821);
            sb.append(") ");
        }
        if (this.f10823 != null) {
            sb.append("interp(");
            sb.append(this.f10823);
            sb.append(") ");
        }
        ArrayList arrayList = this.f10824;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10825;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public void mo1425() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public void mo1410(C3444 c3444) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public void mo1422(AbstractC0968 abstractC0968) {
    }
}

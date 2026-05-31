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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲀᛸᲈᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3493 implements Cloneable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final Animator[] f10976 = new Animator[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final int[] f10977 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static final C2135 f10978 = new C2135(21);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static final ThreadLocal f10979 = new ThreadLocal();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public ArrayList f10990;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public ArrayList f10991;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public InterfaceC3492[] f10992;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public long f11002;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public long f11003;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10980 = getClass().getName();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public long f10981 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public long f10982 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public TimeInterpolator f10983 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ArrayList f10984 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final ArrayList f10985 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C2136 f10986 = new C2136(10);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C2136 f10987 = new C2136(10);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C0327 f10988 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int[] f10989 = f10977;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final ArrayList f10993 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public Animator[] f10994 = f10976;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public int f10995 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public boolean f10996 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public boolean f10997 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public AbstractC3493 f10998 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public ArrayList f10999 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public ArrayList f11000 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public C2135 f11001 = f10978;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m5006(C2136 c2136, View view, C3501 c3501) {
        C0274 c0274 = (C0274) c2136.f7059;
        C0274 c0275 = (C0274) c2136.f7062;
        SparseArray sparseArray = (SparseArray) c2136.f7060;
        C1889 c1889 = (C1889) c2136.f7061;
        c0274.put(view, c3501);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        Field field = AbstractC3638.f11333;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (c0275.containsKey(transitionName)) {
                c0275.put(transitionName, null);
            } else {
                c0275.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c1889.f6261) {
                    int i = c1889.f6264;
                    long[] jArr = c1889.f6262;
                    Object[] objArr = c1889.f6263;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != AbstractC1468.f5217) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    c1889.f6261 = false;
                    c1889.f6264 = i2;
                }
                if (AbstractC1469.m3324(c1889.f6262, c1889.f6264, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1889.m3811(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) c1889.m3809(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c1889.m3811(null, itemIdAtPosition);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static C0274 m5007() {
        ThreadLocal threadLocal = f10979;
        C0274 c0274 = (C0274) threadLocal.get();
        if (c0274 != null) {
            return c0274;
        }
        C0274 c0275 = new C0274(0);
        threadLocal.set(c0275);
        return c0275;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static boolean m5008(C3501 c3501, C3501 c3502, String str) {
        Object obj = c3501.f11014.get(str);
        Object obj2 = c3502.f11014.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void cancel() {
        ArrayList arrayList = this.f10993;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f10994);
        this.f10994 = f10976;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f10994 = animatorArr;
        m5018(this, C2425.f7766, false);
    }

    public final String toString() {
        return mo1573("");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m5009(InterfaceC3492 interfaceC3492) {
        if (this.f10999 == null) {
            this.f10999 = new ArrayList();
        }
        this.f10999.add(interfaceC3492);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public abstract void mo1555(C3501 c3501);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m5010(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C3501 c3501 = new C3501(view);
            if (z) {
                mo1557(c3501);
            } else {
                mo1555(c3501);
            }
            c3501.f11016.add(this);
            mo1556(c3501);
            if (z) {
                m5006(this.f10986, view, c3501);
            } else {
                m5006(this.f10987, view, c3501);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m5010(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public abstract void mo1557(C3501 c3501);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m5011(ViewGroup viewGroup, boolean z) {
        m5012(z);
        ArrayList arrayList = this.f10984;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10985;
        if (size <= 0 && arrayList2.size() <= 0) {
            m5010(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                C3501 c3501 = new C3501(viewFindViewById);
                if (z) {
                    mo1557(c3501);
                } else {
                    mo1555(c3501);
                }
                c3501.f11016.add(this);
                mo1556(c3501);
                if (z) {
                    m5006(this.f10986, viewFindViewById, c3501);
                } else {
                    m5006(this.f10987, viewFindViewById, c3501);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C3501 c3502 = new C3501(view);
            if (z) {
                mo1557(c3502);
            } else {
                mo1555(c3502);
            }
            c3502.f11016.add(this);
            mo1556(c3502);
            if (z) {
                m5006(this.f10986, view, c3502);
            } else {
                m5006(this.f10987, view, c3502);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m5012(boolean z) {
        if (z) {
            ((C0274) this.f10986.f7059).clear();
            ((SparseArray) this.f10986.f7060).clear();
            ((C1889) this.f10986.f7061).m3808();
        } else {
            ((C0274) this.f10987.f7059).clear();
            ((SparseArray) this.f10987.f7060).clear();
            ((C1889) this.f10987.f7061).m3808();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: merged with bridge method [inline-methods] */
    public AbstractC3493 clone() {
        try {
            AbstractC3493 abstractC3493 = (AbstractC3493) super.clone();
            abstractC3493.f11000 = new ArrayList();
            abstractC3493.f10986 = new C2136(10);
            abstractC3493.f10987 = new C2136(10);
            abstractC3493.f10990 = null;
            abstractC3493.f10991 = null;
            abstractC3493.f10998 = this;
            abstractC3493.f10999 = null;
            return abstractC3493;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public Animator mo2113(ViewGroup viewGroup, C3501 c3501, C3501 c3502) {
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public void mo1559(ViewGroup viewGroup, C2136 c2136, C2136 c2137, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        C3501 c3501;
        Animator animator;
        C3501 c3502;
        C0274 c0274M5007 = m5007();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m5015().getClass();
        int i3 = 0;
        while (i3 < size) {
            C3501 c3503 = (C3501) arrayList.get(i3);
            C3501 c3504 = (C3501) arrayList2.get(i3);
            if (c3503 != null && !c3503.f11016.contains(this)) {
                c3503 = null;
            }
            if (c3504 != null && !c3504.f11016.contains(this)) {
                c3504 = null;
            }
            if ((c3503 != null || c3504 != null) && (c3503 == null || c3504 == null || mo3073(c3503, c3504))) {
                Animator animatorMo2113 = mo2113(viewGroup, c3503, c3504);
                if (animatorMo2113 != null) {
                    String str = this.f10980;
                    if (c3504 != null) {
                        view = c3504.f11015;
                        String[] strArrMo2114 = mo2114();
                        if (strArrMo2114 != null && strArrMo2114.length > 0) {
                            c3502 = new C3501(view);
                            C3501 c3505 = (C3501) ((C0274) c2137.f7059).get(view);
                            i = size;
                            if (c3505 != null) {
                                int i4 = 0;
                                while (i4 < strArrMo2114.length) {
                                    String str2 = strArrMo2114[i4];
                                    int i5 = i3;
                                    c3502.f11014.put(str2, c3505.f11014.get(str2));
                                    i4++;
                                    i3 = i5;
                                    c3505 = c3505;
                                }
                            }
                            i2 = i3;
                            int i6 = c0274M5007.f8887;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = animatorMo2113;
                                    break;
                                }
                                C3489 c3489 = (C3489) c0274M5007.get((Animator) c0274M5007.m4743(i7));
                                if (c3489.f10971 != null && c3489.f10969 == view && c3489.f10970.equals(str) && c3489.f10971.equals(c3502)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorMo2113;
                            c3502 = null;
                        }
                        animatorMo2113 = animator;
                        c3501 = c3502;
                    } else {
                        i = size;
                        i2 = i3;
                        view = c3503.f11015;
                        c3501 = null;
                    }
                    if (animatorMo2113 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C3489 c34810 = new C3489();
                        c34810.f10969 = view;
                        c34810.f10970 = str;
                        c34810.f10971 = c3501;
                        c34810.f10972 = windowId;
                        c34810.f10973 = this;
                        c34810.f10974 = animatorMo2113;
                        c0274M5007.put(animatorMo2113, c34810);
                        this.f11000.add(animatorMo2113);
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
                C3489 c34811 = (C3489) c0274M5007.get((Animator) this.f11000.get(sparseIntArray.keyAt(i8)));
                c34811.f10974.setStartDelay(c34811.f10974.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m5013() {
        int i = this.f10995 - 1;
        this.f10995 = i;
        if (i == 0) {
            m5018(this, C2425.f7765, false);
            for (int i2 = 0; i2 < ((C1889) this.f10986.f7061).m3812(); i2++) {
                View view = (View) ((C1889) this.f10986.f7061).m3813(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C1889) this.f10987.f7061).m3812(); i3++) {
                View view2 = (View) ((C1889) this.f10987.f7061).m3813(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f10997 = true;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final C3501 m5014(View view, boolean z) {
        C0327 c0327 = this.f10988;
        if (c0327 != null) {
            return c0327.m5014(view, z);
        }
        ArrayList arrayList = z ? this.f10990 : this.f10991;
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
            C3501 c3501 = (C3501) arrayList.get(i);
            if (c3501 == null) {
                return null;
            }
            if (c3501.f11015 == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C3501) (z ? this.f10991 : this.f10990).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final AbstractC3493 m5015() {
        C0327 c0327 = this.f10988;
        return c0327 != null ? c0327.m5015() : this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public String[] mo2114() {
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final C3501 m5016(View view, boolean z) {
        C0327 c0327 = this.f10988;
        if (c0327 != null) {
            return c0327.m5016(view, z);
        }
        return (C3501) ((C0274) (z ? this.f10986 : this.f10987).f7059).get(view);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public boolean mo1560() {
        return !this.f10993.isEmpty();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public boolean mo3073(C3501 c3501, C3501 c3502) {
        if (c3501 != null && c3502 != null) {
            String[] strArrMo2114 = mo2114();
            if (strArrMo2114 != null) {
                for (String str : strArrMo2114) {
                    if (m5008(c3501, c3502, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c3501.f11014.keySet().iterator();
                while (it.hasNext()) {
                    if (m5008(c3501, c3502, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final boolean m5017(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f10984;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10985;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void m5018(AbstractC3493 abstractC3493, C2425 c2425, boolean z) {
        AbstractC3493 abstractC3494 = this.f10998;
        if (abstractC3494 != null) {
            abstractC3494.m5018(abstractC3493, c2425, z);
        }
        ArrayList arrayList = this.f10999;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f10999.size();
        InterfaceC3492[] interfaceC3492Arr = this.f10992;
        if (interfaceC3492Arr == null) {
            interfaceC3492Arr = new InterfaceC3492[size];
        }
        this.f10992 = null;
        InterfaceC3492[] interfaceC3492Arr2 = (InterfaceC3492[]) this.f10999.toArray(interfaceC3492Arr);
        for (int i = 0; i < size; i++) {
            InterfaceC3492 interfaceC3492 = interfaceC3492Arr2[i];
            switch (c2425.f7769) {
                case 16:
                    interfaceC3492.mo3069(abstractC3493);
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    interfaceC3492.mo2109(abstractC3493);
                    break;
                case Opcodes.LDC /* 18 */:
                    interfaceC3492.mo2111(abstractC3493);
                    break;
                case 19:
                    interfaceC3492.mo2108();
                    break;
                default:
                    interfaceC3492.mo2110();
                    break;
            }
            interfaceC3492Arr2[i] = null;
        }
        this.f10992 = interfaceC3492Arr2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public void mo1561(View view) {
        if (this.f10997) {
            return;
        }
        ArrayList arrayList = this.f10993;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f10994);
        this.f10994 = f10976;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f10994 = animatorArr;
        m5018(this, C2425.f7767, false);
        this.f10996 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public void mo1562() {
        C0274 c0274M5007 = m5007();
        this.f11002 = 0L;
        for (int i = 0; i < this.f11000.size(); i++) {
            Animator animator = (Animator) this.f11000.get(i);
            C3489 c3489 = (C3489) c0274M5007.get(animator);
            if (animator != null && c3489 != null) {
                Animator animator2 = c3489.f10974;
                long j = this.f10982;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.f10981;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.f10983;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f10993.add(animator);
                this.f11002 = Math.max(this.f11002, AbstractC3490.m5004(animator));
            }
        }
        this.f11000.clear();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ */
    public AbstractC3493 mo1563(InterfaceC3492 interfaceC3492) {
        AbstractC3493 abstractC3493;
        ArrayList arrayList = this.f10999;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC3492) && (abstractC3493 = this.f10998) != null) {
                abstractC3493.mo1563(interfaceC3492);
            }
            if (this.f10999.size() == 0) {
                this.f10999 = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public void mo1564(View view) {
        if (this.f10996) {
            if (!this.f10997) {
                ArrayList arrayList = this.f10993;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f10994);
                this.f10994 = f10976;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f10994 = animatorArr;
                m5018(this, C2425.f7768, false);
            }
            this.f10996 = false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public void mo1565() {
        m5019();
        C0274 c0274M5007 = m5007();
        for (Animator animator : this.f11000) {
            if (c0274M5007.containsKey(animator)) {
                m5019();
                if (animator != null) {
                    animator.addListener(new C3488(this, c0274M5007));
                    long j = this.f10982;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f10981;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f10983;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0131(this, 6));
                    animator.start();
                }
            }
        }
        this.f11000.clear();
        m5013();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ */
    public void mo1566(long j, long j2) {
        long j3 = this.f11002;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.f10997 = false;
            m5018(this, C2425.f7764, z);
        }
        ArrayList arrayList = this.f10993;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f10994);
        this.f10994 = f10976;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            AbstractC3490.m5005(animator, Math.min(Math.max(0L, j), AbstractC3490.m5004(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.f10994 = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.f10997 = true;
        }
        m5018(this, C2425.f7765, z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public void mo1567(long j) {
        this.f10982 = j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ */
    public void mo1569(TimeInterpolator timeInterpolator) {
        this.f10983 = timeInterpolator;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public void mo1570(C2135 c2135) {
        if (c2135 == null) {
            this.f11001 = f10978;
        } else {
            this.f11001 = c2135;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public void mo1572(long j) {
        this.f10981 = j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final void m5019() {
        if (this.f10995 == 0) {
            m5018(this, C2425.f7764, false);
            this.f10997 = false;
        }
        this.f10995++;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public String mo1573(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f10982 != -1) {
            sb.append("dur(");
            sb.append(this.f10982);
            sb.append(") ");
        }
        if (this.f10981 != -1) {
            sb.append("dly(");
            sb.append(this.f10981);
            sb.append(") ");
        }
        if (this.f10983 != null) {
            sb.append("interp(");
            sb.append(this.f10983);
            sb.append(") ");
        }
        ArrayList arrayList = this.f10984;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10985;
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
    public void mo1571() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public void mo1556(C3501 c3501) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public void mo1568(AbstractC1469 abstractC1469) {
    }
}

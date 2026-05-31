package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᲇᲀᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0428 extends AbstractC1467 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1995;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0860 f1996;

    public /* synthetic */ C0428(AbstractC0860 abstractC0860, int i) {
        this.f1995 = i;
        this.f1996 = abstractC0860;
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int mo1791(View view, int i) {
        int iM3679;
        int i2;
        switch (this.f1995) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1996;
                C1787 c1787 = sideSheetBehavior.f823;
                switch (c1787.f5944) {
                    case 0:
                        iM3679 = -c1787.f5945.f834;
                        break;
                    default:
                        iM3679 = c1787.m3679();
                        break;
                }
                C1787 c1788 = sideSheetBehavior.f823;
                switch (c1788.f5944) {
                    case 0:
                        i2 = c1788.f5945.f837;
                        break;
                    default:
                        i2 = c1788.f5945.f835;
                        break;
                }
                return AbstractC2234.m4158(i, iM3679, i2);
        }
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int mo1792(View view, int i) {
        switch (this.f1995) {
            case 0:
                return AbstractC2234.m4158(i, ((BottomSheetBehavior) this.f1996).m788(), mo1794());
            default:
                return view.getTop();
        }
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public int mo1793(View view) {
        switch (this.f1995) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1996;
                return sideSheetBehavior.f834 + sideSheetBehavior.f837;
            default:
                return super.mo1793(view);
        }
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int mo1794() {
        switch (this.f1995) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1996;
                return bottomSheetBehavior.f658 ? bottomSheetBehavior.f669 : bottomSheetBehavior.f656;
            default:
                return super.mo1794();
        }
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final void mo1795(int i) {
        switch (this.f1995) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1996;
                    if (bottomSheetBehavior.f660) {
                        bottomSheetBehavior.m793(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1996;
                    if (sideSheetBehavior.f829) {
                        sideSheetBehavior.m831(1);
                    }
                }
                break;
        }
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final void mo1796(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f1995) {
            case 0:
                ((BottomSheetBehavior) this.f1996).m787(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1996;
                WeakReference weakReference = sideSheetBehavior.f839;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    C1787 c1787 = sideSheetBehavior.f823;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (c1787.f5944) {
                        case 0:
                            if (left <= c1787.f5945.f835) {
                                marginLayoutParams.leftMargin = right;
                            }
                            break;
                        default:
                            int i3 = c1787.f5945.f835;
                            if (left <= i3) {
                                marginLayoutParams.rightMargin = i3 - left;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f843;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                C1787 c1788 = sideSheetBehavior.f823;
                switch (c1788.f5944) {
                    case 0:
                        c1788.m3680();
                        c1788.m3679();
                        break;
                    default:
                        int i4 = c1788.f5945.f835;
                        c1788.m3679();
                        break;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC1095.m2792(it);
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:65:0x0114  */
    /* JADX WARN: Code duplicated, block: B:79:0x0153  */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0027. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0065. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000d. Please report as an issue. */
    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void mo1797(View view, float f, float f2) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        switch (this.f1995) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1996;
                int i2 = 6;
                if (f2 < 0.0f) {
                    if (bottomSheetBehavior.f625) {
                        i2 = 3;
                    } else {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.f654) {
                            i2 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.f658 && bottomSheetBehavior.m794(view, f2)) {
                    if (Math.abs(f) < Math.abs(f2) && f2 > bottomSheetBehavior.f627) {
                        i2 = 5;
                    } else if (view.getTop() > (bottomSheetBehavior.m788() + bottomSheetBehavior.f669) / 2) {
                        i2 = 5;
                    } else if (bottomSheetBehavior.f625 || Math.abs(view.getTop() - bottomSheetBehavior.m788()) < Math.abs(view.getTop() - bottomSheetBehavior.f654)) {
                        i2 = 3;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f625) {
                        int i3 = bottomSheetBehavior.f654;
                        if (top2 < i3) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.f656)) {
                                i2 = 3;
                            } else {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f656)) {
                            bottomSheetBehavior.getClass();
                        } else {
                            i2 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.f653) < Math.abs(top2 - bottomSheetBehavior.f656)) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                } else if (bottomSheetBehavior.f625) {
                    i2 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f654) < Math.abs(top3 - bottomSheetBehavior.f656)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i2 = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.m795(view, i2, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1996;
                switch (sideSheetBehavior.f823.f5944) {
                    case 0:
                        if (f <= 0.0f) {
                            z = false;
                        } else {
                            z = true;
                        }
                        break;
                    default:
                        if (f >= 0.0f) {
                            z = false;
                        } else {
                            z = true;
                        }
                        break;
                }
                if (!z) {
                    C1787 c1787 = sideSheetBehavior.f823;
                    switch (c1787.f5944) {
                        case 0:
                            float left = view.getLeft();
                            SideSheetBehavior sideSheetBehavior2 = c1787.f5945;
                            float fAbs = Math.abs((sideSheetBehavior2.f833 * f) + left);
                            sideSheetBehavior2.getClass();
                            if (fAbs <= 0.5f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            break;
                        default:
                            float right = view.getRight();
                            SideSheetBehavior sideSheetBehavior3 = c1787.f5945;
                            float fAbs2 = Math.abs((sideSheetBehavior3.f833 * f) + right);
                            sideSheetBehavior3.getClass();
                            if (fAbs2 <= 0.5f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            break;
                    }
                    if (z2) {
                        switch (sideSheetBehavior.f823.f5944) {
                            case 0:
                                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                break;
                            default:
                                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                break;
                        }
                        if (!z3) {
                            C1787 c1788 = sideSheetBehavior.f823;
                            switch (c1788.f5944) {
                                case 0:
                                    if (view.getRight() >= (c1788.m3679() - c1788.m3680()) / 2) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    break;
                                default:
                                    if (view.getLeft() <= (c1788.m3679() + c1788.f5945.f835) / 2) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    break;
                            }
                            if (z4) {
                            }
                        }
                    } else if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left2 = view.getLeft();
                        i = Math.abs(left2 - sideSheetBehavior.f823.m3679()) < Math.abs(left2 - sideSheetBehavior.f823.m3680()) ? 3 : 5;
                    }
                }
                sideSheetBehavior.m833(view, i, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0048  */
    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public final boolean mo1798(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        switch (this.f1995) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1996;
                int i2 = bottomSheetBehavior.f661;
                if (i2 != 1 && !bottomSheetBehavior.f676) {
                    if (i2 == 3 && bottomSheetBehavior.f674 == i) {
                        WeakReference weakReference3 = bottomSheetBehavior.f671;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            System.currentTimeMillis();
                            weakReference = bottomSheetBehavior.f670;
                            if (weakReference == null) {
                            }
                        }
                    } else {
                        System.currentTimeMillis();
                        weakReference = bottomSheetBehavior.f670;
                        if (weakReference == null && weakReference.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1996;
                return (sideSheetBehavior.f830 == 1 || (weakReference2 = sideSheetBehavior.f838) == null || weakReference2.get() != view) ? false : true;
        }
    }
}

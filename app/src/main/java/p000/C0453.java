package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0453 extends AbstractC0743 {

    public final /* synthetic */ int f2023;

    public final /* synthetic */ AbstractC0861 f2024;

    public /* synthetic */ C0453(AbstractC0861 abstractC0861, int i) {
        this.f2023 = i;
        this.f2024 = abstractC0861;
    }

    @Override // p000.AbstractC0743
    public final int mo1683(View view, int i) {
        switch (this.f2023) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2024;
                return AbstractC3681.m5318(i, sideSheetBehavior.f757.mo3325(), sideSheetBehavior.f757.mo3324());
        }
    }

    @Override // p000.AbstractC0743
    public final int mo1684(View view, int i) {
        switch (this.f2023) {
            case 0:
                return AbstractC3681.m5318(i, ((BottomSheetBehavior) this.f2024).m645(), mo1686());
            default:
                return view.getTop();
        }
    }

    @Override // p000.AbstractC0743
    public int mo1685(View view) {
        switch (this.f2023) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2024;
                return sideSheetBehavior.f768 + sideSheetBehavior.f771;
            default:
                return super.mo1685(view);
        }
    }

    @Override // p000.AbstractC0743
    public int mo1686() {
        switch (this.f2023) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2024;
                return bottomSheetBehavior.f606 ? bottomSheetBehavior.f617 : bottomSheetBehavior.f604;
            default:
                return super.mo1686();
        }
    }

    @Override // p000.AbstractC0743
    public final void mo1687(int i) {
        switch (this.f2023) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2024;
                    if (bottomSheetBehavior.f608) {
                        bottomSheetBehavior.m650(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2024;
                    if (sideSheetBehavior.f763) {
                        sideSheetBehavior.m687(1);
                    }
                }
                break;
        }
    }

    @Override // p000.AbstractC0743
    public final void mo1688(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f2023) {
            case 0:
                ((BottomSheetBehavior) this.f2024).m644(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2024;
                WeakReference weakReference = sideSheetBehavior.f773;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f757.mo3333(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f777;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f757.mo3321(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC1194.m2777(it);
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    @Override // p000.AbstractC0743
    public final void mo1689(View view, float f, float f2) {
        int i;
        switch (this.f2023) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2024;
                int i2 = 6;
                if (f2 < 0.0f) {
                    if (bottomSheetBehavior.f573) {
                        i2 = 3;
                    } else {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        
                        if (top <= bottomSheetBehavior.f602) {
                            i2 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.f606 && bottomSheetBehavior.m651(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.f575) {
                        if (view.getTop() > (bottomSheetBehavior.m645() + bottomSheetBehavior.f617) / 2) {
                            i2 = 5;
                        } else if (bottomSheetBehavior.f573 || Math.abs(view.getTop() - bottomSheetBehavior.m645()) < Math.abs(view.getTop() - bottomSheetBehavior.f602)) {
                            i2 = 3;
                        }
                    } else {
                        i2 = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f573) {
                        int i3 = bottomSheetBehavior.f602;
                        if (top2 < i3) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.f604)) {
                                i2 = 3;
                            } else {
                                
                            }
                        } else if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f604)) {
                            
                        } else {
                            i2 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.f601) < Math.abs(top2 - bottomSheetBehavior.f604)) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                } else if (bottomSheetBehavior.f573) {
                    i2 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f602) < Math.abs(top3 - bottomSheetBehavior.f604)) {
                        
                    } else {
                        i2 = 4;
                    }
                }
                
                bottomSheetBehavior.m652(view, i2, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2024;
                if (!sideSheetBehavior.f757.mo3329(f)) {
                    if (!sideSheetBehavior.f757.mo3332(view, f)) {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            i = Math.abs(left - sideSheetBehavior.f757.mo3322()) < Math.abs(left - sideSheetBehavior.f757.mo3323()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.f757.mo3331(f, f2) || sideSheetBehavior.f757.mo3330(view)) {
                    }
                }
                sideSheetBehavior.m689(view, i, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0048  */
    @Override // p000.AbstractC0743
    public final boolean mo1690(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        switch (this.f2023) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2024;
                int i2 = bottomSheetBehavior.f609;
                if (i2 != 1 && !bottomSheetBehavior.f624) {
                    if (i2 == 3 && bottomSheetBehavior.f622 == i) {
                        WeakReference weakReference3 = bottomSheetBehavior.f619;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            System.currentTimeMillis();
                            weakReference = bottomSheetBehavior.f618;
                            if (weakReference == null) {
                            }
                        }
                    } else {
                        System.currentTimeMillis();
                        weakReference = bottomSheetBehavior.f618;
                        if (weakReference == null && weakReference.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2024;
                return (sideSheetBehavior.f764 == 1 || (weakReference2 = sideSheetBehavior.f772) == null || weakReference2.get() != view) ? false : true;
        }
    }
}

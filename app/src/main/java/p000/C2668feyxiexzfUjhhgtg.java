package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲ要点脸ᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2668feyxiexzfUjhhgtg extends AbstractC1243feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f8535Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3723feyxiexzfUjhhgtg f8536Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2668feyxiexzfUjhhgtg(AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg, int i) {
        this.f8535Ujhhgtgfeyxiexzf = i;
        this.f8536Ujhhgtgfeyxiexzf = abstractC3723feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final int mo2664Ujhhgtgfeyxiexzf(View view, int i) {
        switch (this.f8535Ujhhgtgfeyxiexzf) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8536Ujhhgtgfeyxiexzf;
                return AbstractC3611Ujhhgtgfeyxiexzf.m5212Ujhhgtgfeyxiexzf(i, sideSheetBehavior.f837Ujhhgtgfeyxiexzf.mo1064Ujhhgtgfeyxiexzf(), sideSheetBehavior.f837Ujhhgtgfeyxiexzf.mo1063Ujhhgtgfeyxiexzf());
        }
    }

    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final int mo2665Ujhhgtgfeyxiexzf(View view, int i) {
        switch (this.f8535Ujhhgtgfeyxiexzf) {
            case 0:
                return AbstractC3611Ujhhgtgfeyxiexzf.m5212Ujhhgtgfeyxiexzf(i, ((BottomSheetBehavior) this.f8536Ujhhgtgfeyxiexzf).m787Ujhhgtgfeyxiexzf(), mo2745Ujhhgtgfeyxiexzf());
            default:
                return view.getTop();
        }
    }

    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public int mo2666Ujhhgtgfeyxiexzf(View view) {
        switch (this.f8535Ujhhgtgfeyxiexzf) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8536Ujhhgtgfeyxiexzf;
                return sideSheetBehavior.f848Ujhhgtgfeyxiexzf + sideSheetBehavior.f851Ujhhgtgfeyxiexzf;
            default:
                return super.mo2666Ujhhgtgfeyxiexzf(view);
        }
    }

    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public int mo2745Ujhhgtgfeyxiexzf() {
        switch (this.f8535Ujhhgtgfeyxiexzf) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f8536Ujhhgtgfeyxiexzf;
                return bottomSheetBehavior.f672feyxiexzfUjhhgtg ? bottomSheetBehavior.f683feyxiexzfUjhhgtg : bottomSheetBehavior.f670feyxiexzfUjhhgtg;
            default:
                return super.mo2745Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public final void mo2668Ujhhgtgfeyxiexzf(int i) {
        switch (this.f8535Ujhhgtgfeyxiexzf) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f8536Ujhhgtgfeyxiexzf;
                    if (bottomSheetBehavior.f674feyxiexzfUjhhgtg) {
                        bottomSheetBehavior.m792feyxiexzfUjhhgtg(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8536Ujhhgtgfeyxiexzf;
                    if (sideSheetBehavior.f843Ujhhgtgfeyxiexzf) {
                        sideSheetBehavior.m830Ujhhgtgfeyxiexzf(1);
                    }
                }
                break;
        }
    }

    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ */
    public final void mo2669Ujhhgtgfeyxiexzf(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f8535Ujhhgtgfeyxiexzf) {
            case 0:
                ((BottomSheetBehavior) this.f8536Ujhhgtgfeyxiexzf).m786Ujhhgtgfeyxiexzf(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8536Ujhhgtgfeyxiexzf;
                WeakReference weakReference = sideSheetBehavior.f853Ujhhgtgfeyxiexzf;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f837Ujhhgtgfeyxiexzf.mo1072feyxiexzfUjhhgtg(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f857Ujhhgtgfeyxiexzf;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f837Ujhhgtgfeyxiexzf.mo1060Ujhhgtgfeyxiexzf(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it);
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ */
    public final void mo2670Ujhhgtgfeyxiexzf(View view, float f, float f2) {
        int i;
        switch (this.f8535Ujhhgtgfeyxiexzf) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f8536Ujhhgtgfeyxiexzf;
                int i2 = 6;
                if (f2 < 0.0f) {
                    if (bottomSheetBehavior.f639Ujhhgtgfeyxiexzf) {
                        i2 = 3;
                    } else {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.f668feyxiexzfUjhhgtg) {
                            i2 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.f672feyxiexzfUjhhgtg && bottomSheetBehavior.m793feyxiexzfUjhhgtg(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.f641Ujhhgtgfeyxiexzf) {
                        if (view.getTop() > (bottomSheetBehavior.m787Ujhhgtgfeyxiexzf() + bottomSheetBehavior.f683feyxiexzfUjhhgtg) / 2) {
                            i2 = 5;
                        } else if (bottomSheetBehavior.f639Ujhhgtgfeyxiexzf || Math.abs(view.getTop() - bottomSheetBehavior.m787Ujhhgtgfeyxiexzf()) < Math.abs(view.getTop() - bottomSheetBehavior.f668feyxiexzfUjhhgtg)) {
                            i2 = 3;
                        }
                    } else {
                        i2 = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f639Ujhhgtgfeyxiexzf) {
                        int i3 = bottomSheetBehavior.f668feyxiexzfUjhhgtg;
                        if (top2 < i3) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.f670feyxiexzfUjhhgtg)) {
                                i2 = 3;
                            } else {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f670feyxiexzfUjhhgtg)) {
                            bottomSheetBehavior.getClass();
                        } else {
                            i2 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.f667feyxiexzfUjhhgtg) < Math.abs(top2 - bottomSheetBehavior.f670feyxiexzfUjhhgtg)) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                } else if (bottomSheetBehavior.f639Ujhhgtgfeyxiexzf) {
                    i2 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f668feyxiexzfUjhhgtg) < Math.abs(top3 - bottomSheetBehavior.f670feyxiexzfUjhhgtg)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i2 = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.m794feyxiexzfUjhhgtg(view, i2, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8536Ujhhgtgfeyxiexzf;
                if (!sideSheetBehavior.f837Ujhhgtgfeyxiexzf.mo1068Ujhhgtgfeyxiexzf(f)) {
                    if (!sideSheetBehavior.f837Ujhhgtgfeyxiexzf.mo1071feyxiexzfUjhhgtg(view, f)) {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            i = Math.abs(left - sideSheetBehavior.f837Ujhhgtgfeyxiexzf.mo1061Ujhhgtgfeyxiexzf()) < Math.abs(left - sideSheetBehavior.f837Ujhhgtgfeyxiexzf.mo1062Ujhhgtgfeyxiexzf()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.f837Ujhhgtgfeyxiexzf.mo1070feyxiexzfUjhhgtg(f, f2) || sideSheetBehavior.f837Ujhhgtgfeyxiexzf.mo1069feyxiexzfUjhhgtg(view)) {
                    }
                }
                sideSheetBehavior.m832Ujhhgtgfeyxiexzf(view, i, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0048  */
    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ */
    public final boolean mo2671feyxiexzfUjhhgtg(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        switch (this.f8535Ujhhgtgfeyxiexzf) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f8536Ujhhgtgfeyxiexzf;
                int i2 = bottomSheetBehavior.f675feyxiexzfUjhhgtg;
                if (i2 != 1 && !bottomSheetBehavior.f690Ujhhgtgfeyxiexzf) {
                    if (i2 == 3 && bottomSheetBehavior.f688Ujhhgtgfeyxiexzf == i) {
                        WeakReference weakReference3 = bottomSheetBehavior.f685feyxiexzfUjhhgtg;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            System.currentTimeMillis();
                            weakReference = bottomSheetBehavior.f684feyxiexzfUjhhgtg;
                            if (weakReference == null) {
                            }
                        }
                    } else {
                        System.currentTimeMillis();
                        weakReference = bottomSheetBehavior.f684feyxiexzfUjhhgtg;
                        if (weakReference == null && weakReference.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8536Ujhhgtgfeyxiexzf;
                return (sideSheetBehavior.f844Ujhhgtgfeyxiexzf == 1 || (weakReference2 = sideSheetBehavior.f852Ujhhgtgfeyxiexzf) == null || weakReference2.get() != view) ? false : true;
        }
    }
}

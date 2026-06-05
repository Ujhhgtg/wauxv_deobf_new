package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱ能不能要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0430Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public ViewParent f2284Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public ViewParent f2285Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ViewGroup f2286Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f2287Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int[] f2288Ujhhgtgfeyxiexzf;

    public C0430Ujhhgtgfeyxiexzf(ViewGroup viewGroup) {
        this.f2286Ujhhgtgfeyxiexzf = viewGroup;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean m1748Ujhhgtgfeyxiexzf(float f, float f2, boolean z) {
        ViewParent viewParentM1752Ujhhgtgfeyxiexzf;
        if (this.f2287Ujhhgtgfeyxiexzf && (viewParentM1752Ujhhgtgfeyxiexzf = m1752Ujhhgtgfeyxiexzf(0)) != null) {
            try {
                return viewParentM1752Ujhhgtgfeyxiexzf.onNestedFling(this.f2286Ujhhgtgfeyxiexzf, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM1752Ujhhgtgfeyxiexzf + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean m1749Ujhhgtgfeyxiexzf(float f, float f2) {
        ViewParent viewParentM1752Ujhhgtgfeyxiexzf;
        if (this.f2287Ujhhgtgfeyxiexzf && (viewParentM1752Ujhhgtgfeyxiexzf = m1752Ujhhgtgfeyxiexzf(0)) != null) {
            try {
                return viewParentM1752Ujhhgtgfeyxiexzf.onNestedPreFling(this.f2286Ujhhgtgfeyxiexzf, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM1752Ujhhgtgfeyxiexzf + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean m1750Ujhhgtgfeyxiexzf(int[] iArr, int i, int i2, int i3, int[] iArr2) {
        ViewParent viewParentM1752Ujhhgtgfeyxiexzf;
        int i4;
        int i5;
        ViewGroup viewGroup;
        if (!this.f2287Ujhhgtgfeyxiexzf || (viewParentM1752Ujhhgtgfeyxiexzf = m1752Ujhhgtgfeyxiexzf(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup2 = this.f2286Ujhhgtgfeyxiexzf;
        if (iArr2 != null) {
            viewGroup2.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f2288Ujhhgtgfeyxiexzf == null) {
                this.f2288Ujhhgtgfeyxiexzf = new int[2];
            }
            iArr = this.f2288Ujhhgtgfeyxiexzf;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM1752Ujhhgtgfeyxiexzf instanceof InterfaceC0429Ujhhgtgfeyxiexzf) {
            ((InterfaceC0429Ujhhgtgfeyxiexzf) viewParentM1752Ujhhgtgfeyxiexzf).mo16Ujhhgtgfeyxiexzf(viewGroup2, i, i2, iArr3, i3);
            viewGroup = viewGroup2;
        } else {
            viewGroup = viewGroup2;
            if (i3 == 0) {
                try {
                    viewParentM1752Ujhhgtgfeyxiexzf.onNestedPreScroll(viewGroup, i, i2, iArr3);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM1752Ujhhgtgfeyxiexzf + " does not implement interface method onNestedPreScroll", e);
                }
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean m1751Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM1752Ujhhgtgfeyxiexzf;
        int i6;
        int i7;
        int[] iArr3;
        if (this.f2287Ujhhgtgfeyxiexzf && (viewParentM1752Ujhhgtgfeyxiexzf = m1752Ujhhgtgfeyxiexzf(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.f2286Ujhhgtgfeyxiexzf;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f2288Ujhhgtgfeyxiexzf == null) {
                        this.f2288Ujhhgtgfeyxiexzf = new int[2];
                    }
                    int[] iArr4 = this.f2288Ujhhgtgfeyxiexzf;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM1752Ujhhgtgfeyxiexzf instanceof InterfaceC0432Ujhhgtgfeyxiexzf) {
                    ((InterfaceC0432Ujhhgtgfeyxiexzf) viewParentM1752Ujhhgtgfeyxiexzf).mo11Ujhhgtgfeyxiexzf(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM1752Ujhhgtgfeyxiexzf instanceof InterfaceC0429Ujhhgtgfeyxiexzf) {
                        ((InterfaceC0429Ujhhgtgfeyxiexzf) viewParentM1752Ujhhgtgfeyxiexzf).mo12Ujhhgtgfeyxiexzf(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentM1752Ujhhgtgfeyxiexzf.onNestedScroll(viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM1752Ujhhgtgfeyxiexzf + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final ViewParent m1752Ujhhgtgfeyxiexzf(int i) {
        if (i == 0) {
            return this.f2284Ujhhgtgfeyxiexzf;
        }
        if (i != 1) {
            return null;
        }
        return this.f2285Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m1753Ujhhgtgfeyxiexzf(int i) {
        return m1752Ujhhgtgfeyxiexzf(i) != null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean m1754Ujhhgtgfeyxiexzf(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (!m1753Ujhhgtgfeyxiexzf(i2)) {
            if (this.f2287Ujhhgtgfeyxiexzf) {
                View view = this.f2286Ujhhgtgfeyxiexzf;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC0429Ujhhgtgfeyxiexzf;
                    if (z) {
                        zOnStartNestedScroll = ((InterfaceC0429Ujhhgtgfeyxiexzf) parent).mo13Ujhhgtgfeyxiexzf(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i2 == 0) {
                            this.f2284Ujhhgtgfeyxiexzf = parent;
                        } else if (i2 == 1) {
                            this.f2285Ujhhgtgfeyxiexzf = parent;
                        }
                        if (z) {
                            ((InterfaceC0429Ujhhgtgfeyxiexzf) parent).mo14Ujhhgtgfeyxiexzf(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m1755Ujhhgtgfeyxiexzf(int i) {
        ViewParent viewParentM1752Ujhhgtgfeyxiexzf = m1752Ujhhgtgfeyxiexzf(i);
        if (viewParentM1752Ujhhgtgfeyxiexzf != null) {
            boolean z = viewParentM1752Ujhhgtgfeyxiexzf instanceof InterfaceC0429Ujhhgtgfeyxiexzf;
            ViewGroup viewGroup = this.f2286Ujhhgtgfeyxiexzf;
            if (z) {
                ((InterfaceC0429Ujhhgtgfeyxiexzf) viewParentM1752Ujhhgtgfeyxiexzf).mo15Ujhhgtgfeyxiexzf(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentM1752Ujhhgtgfeyxiexzf.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM1752Ujhhgtgfeyxiexzf + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f2284Ujhhgtgfeyxiexzf = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f2285Ujhhgtgfeyxiexzf = null;
            }
        }
    }
}

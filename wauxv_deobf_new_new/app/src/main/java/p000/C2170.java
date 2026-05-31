package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᛸᲇᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2170 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public ViewParent f7195;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public ViewParent f7196;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ViewGroup f7197;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f7198;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int[] f7199;

    public C2170(ViewGroup viewGroup) {
        this.f7197 = viewGroup;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m4128(float f, float f2, boolean z) {
        ViewParent viewParentM4132;
        if (this.f7198 && (viewParentM4132 = m4132(0)) != null) {
            try {
                return viewParentM4132.onNestedFling(this.f7197, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM4132 + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m4129(float f, float f2) {
        ViewParent viewParentM4132;
        if (this.f7198 && (viewParentM4132 = m4132(0)) != null) {
            try {
                return viewParentM4132.onNestedPreFling(this.f7197, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM4132 + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean m4130(int[] iArr, int i, int i2, int i3, int[] iArr2) {
        ViewParent viewParentM4132;
        int i4;
        int i5;
        ViewGroup viewGroup;
        if (!this.f7198 || (viewParentM4132 = m4132(i3)) == null) {
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
        ViewGroup viewGroup2 = this.f7197;
        if (iArr2 != null) {
            viewGroup2.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f7199 == null) {
                this.f7199 = new int[2];
            }
            iArr = this.f7199;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM4132 instanceof InterfaceC2171) {
            ((InterfaceC2171) viewParentM4132).mo16(viewGroup2, i, i2, iArr3, i3);
            viewGroup = viewGroup2;
        } else {
            viewGroup = viewGroup2;
            if (i3 == 0) {
                try {
                    viewParentM4132.onNestedPreScroll(viewGroup, i, i2, iArr3);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM4132 + " does not implement interface method onNestedPreScroll", e);
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m4131(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM4132;
        int i6;
        int i7;
        int[] iArr3;
        if (this.f7198 && (viewParentM4132 = m4132(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.f7197;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f7199 == null) {
                        this.f7199 = new int[2];
                    }
                    int[] iArr4 = this.f7199;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM4132 instanceof InterfaceC2172) {
                    ((InterfaceC2172) viewParentM4132).mo11(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM4132 instanceof InterfaceC2171) {
                        ((InterfaceC2171) viewParentM4132).mo12(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentM4132.onNestedScroll(viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM4132 + " does not implement interface method onNestedScroll", e);
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ViewParent m4132(int i) {
        if (i == 0) {
            return this.f7195;
        }
        if (i != 1) {
            return null;
        }
        return this.f7196;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m4133(int i) {
        return m4132(i) != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean m4134(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (!m4133(i2)) {
            if (this.f7198) {
                View view = this.f7197;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC2171;
                    if (z) {
                        zOnStartNestedScroll = ((InterfaceC2171) parent).mo13(view2, view, i, i2);
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
                            this.f7195 = parent;
                        } else if (i2 == 1) {
                            this.f7196 = parent;
                        }
                        if (z) {
                            ((InterfaceC2171) parent).mo14(view2, view, i, i2);
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m4135(int i) {
        ViewParent viewParentM4132 = m4132(i);
        if (viewParentM4132 != null) {
            boolean z = viewParentM4132 instanceof InterfaceC2171;
            ViewGroup viewGroup = this.f7197;
            if (z) {
                ((InterfaceC2171) viewParentM4132).mo15(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentM4132.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM4132 + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f7195 = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f7196 = null;
            }
        }
    }
}

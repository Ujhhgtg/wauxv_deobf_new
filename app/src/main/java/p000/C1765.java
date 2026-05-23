package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1765 extends AbstractC1574 {

    public final /* synthetic */ int f5888;

    public final SideSheetBehavior f5889;

    public /* synthetic */ C1765(SideSheetBehavior sideSheetBehavior, int i) {
        this.f5888 = i;
        this.f5889 = sideSheetBehavior;
    }

    @Override // p000.AbstractC1574
    public final int mo3320(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f5888) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p000.AbstractC1574
    public final float mo3321(int i) {
        switch (this.f5888) {
            case 0:
                float fMo3323 = mo3323();
                return (i - fMo3323) / (mo3322() - fMo3323);
            default:
                float f = this.f5889.f769;
                return (f - i) / (f - mo3322());
        }
    }

    @Override // p000.AbstractC1574
    public final int mo3322() {
        switch (this.f5888) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f5889;
                return Math.max(0, sideSheetBehavior.f770 + sideSheetBehavior.f771);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f5889;
                return Math.max(0, (sideSheetBehavior2.f769 - sideSheetBehavior2.f768) - sideSheetBehavior2.f771);
        }
    }

    @Override // p000.AbstractC1574
    public final int mo3323() {
        switch (this.f5888) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f5889;
                return (-sideSheetBehavior.f768) - sideSheetBehavior.f771;
            default:
                return this.f5889.f769;
        }
    }

    @Override // p000.AbstractC1574
    public final int mo3324() {
        switch (this.f5888) {
            case 0:
                return this.f5889.f771;
            default:
                return this.f5889.f769;
        }
    }

    @Override // p000.AbstractC1574
    public final int mo3325() {
        switch (this.f5888) {
            case 0:
                return -this.f5889.f768;
            default:
                return mo3322();
        }
    }

    @Override // p000.AbstractC1574
    public final int mo3326(View view) {
        switch (this.f5888) {
            case 0:
                return view.getRight() + this.f5889.f771;
            default:
                return view.getLeft() - this.f5889.f771;
        }
    }

    @Override // p000.AbstractC1574
    public final int mo3327(CoordinatorLayout coordinatorLayout) {
        switch (this.f5888) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // p000.AbstractC1574
    public final int mo3328() {
        switch (this.f5888) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // p000.AbstractC1574
    public final boolean mo3329(float f) {
        switch (this.f5888) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    @Override // p000.AbstractC1574
    public final boolean mo3330(View view) {
        switch (this.f5888) {
            case 0:
                return view.getRight() < (mo3322() - mo3323()) / 2;
            default:
                return view.getLeft() > (mo3322() + this.f5889.f769) / 2;
        }
    }

    @Override // p000.AbstractC1574
    public final boolean mo3331(float f, float f2) {
        switch (this.f5888) {
            case 0:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) 500);
            default:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) 500);
        }
    }

    @Override // p000.AbstractC1574
    public final boolean mo3332(View view, float f) {
        switch (this.f5888) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f5889;
                float fAbs = Math.abs((f * sideSheetBehavior.f767) + left);
                
                return fAbs > 0.5f;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f5889;
                float fAbs2 = Math.abs((f * sideSheetBehavior2.f767) + right);
                
                return fAbs2 > 0.5f;
        }
    }

    @Override // p000.AbstractC1574
    public final void mo3333(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f5888) {
            case 0:
                if (i <= this.f5889.f769) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i3 = this.f5889.f769;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                }
                break;
        }
    }
}

package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ要点脸ᛴᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0063Ujhhgtgfeyxiexzf extends AbstractC3593Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f1077Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final SideSheetBehavior f1078Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0063Ujhhgtgfeyxiexzf(SideSheetBehavior sideSheetBehavior, int i) {
        this.f1077Ujhhgtgfeyxiexzf = i;
        this.f1078Ujhhgtgfeyxiexzf = sideSheetBehavior;
    }

    @Override // p000.AbstractC3593Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int mo1059Ujhhgtgfeyxiexzf(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1077Ujhhgtgfeyxiexzf) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p000.AbstractC3593Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final float mo1060Ujhhgtgfeyxiexzf(int i) {
        switch (this.f1077Ujhhgtgfeyxiexzf) {
            case 0:
                float fMo1062Ujhhgtgfeyxiexzf = mo1062Ujhhgtgfeyxiexzf();
                return (i - fMo1062Ujhhgtgfeyxiexzf) / (mo1061Ujhhgtgfeyxiexzf() - fMo1062Ujhhgtgfeyxiexzf);
            default:
                float f = this.f1078Ujhhgtgfeyxiexzf.f849Ujhhgtgfeyxiexzf;
                return (f - i) / (f - mo1061Ujhhgtgfeyxiexzf());
        }
    }

    @Override // p000.AbstractC3593Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final int mo1061Ujhhgtgfeyxiexzf() {
        switch (this.f1077Ujhhgtgfeyxiexzf) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1078Ujhhgtgfeyxiexzf;
                return Math.max(0, sideSheetBehavior.f850Ujhhgtgfeyxiexzf + sideSheetBehavior.f851Ujhhgtgfeyxiexzf);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f1078Ujhhgtgfeyxiexzf;
                return Math.max(0, (sideSheetBehavior2.f849Ujhhgtgfeyxiexzf - sideSheetBehavior2.f848Ujhhgtgfeyxiexzf) - sideSheetBehavior2.f851Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.AbstractC3593Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int mo1062Ujhhgtgfeyxiexzf() {
        switch (this.f1077Ujhhgtgfeyxiexzf) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1078Ujhhgtgfeyxiexzf;
                return (-sideSheetBehavior.f848Ujhhgtgfeyxiexzf) - sideSheetBehavior.f851Ujhhgtgfeyxiexzf;
            default:
                return this.f1078Ujhhgtgfeyxiexzf.f849Ujhhgtgfeyxiexzf;
        }
    }

    @Override // p000.AbstractC3593Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int mo1063Ujhhgtgfeyxiexzf() {
        switch (this.f1077Ujhhgtgfeyxiexzf) {
            case 0:
                return this.f1078Ujhhgtgfeyxiexzf.f851Ujhhgtgfeyxiexzf;
            default:
                return this.f1078Ujhhgtgfeyxiexzf.f849Ujhhgtgfeyxiexzf;
        }
    }

    @Override // p000.AbstractC3593Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final int mo1064Ujhhgtgfeyxiexzf() {
        switch (this.f1077Ujhhgtgfeyxiexzf) {
            case 0:
                return -this.f1078Ujhhgtgfeyxiexzf.f848Ujhhgtgfeyxiexzf;
            default:
                return mo1061Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.AbstractC3593Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int mo1065Ujhhgtgfeyxiexzf(View view) {
        switch (this.f1077Ujhhgtgfeyxiexzf) {
            case 0:
                return view.getRight() + this.f1078Ujhhgtgfeyxiexzf.f851Ujhhgtgfeyxiexzf;
            default:
                return view.getLeft() - this.f1078Ujhhgtgfeyxiexzf.f851Ujhhgtgfeyxiexzf;
        }
    }

    @Override // p000.AbstractC3593Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int mo1066Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout) {
        switch (this.f1077Ujhhgtgfeyxiexzf) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // p000.AbstractC3593Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final int mo1067Ujhhgtgfeyxiexzf() {
        switch (this.f1077Ujhhgtgfeyxiexzf) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // p000.AbstractC3593Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean mo1068Ujhhgtgfeyxiexzf(float f) {
        switch (this.f1077Ujhhgtgfeyxiexzf) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    @Override // p000.AbstractC3593Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean mo1069feyxiexzfUjhhgtg(View view) {
        switch (this.f1077Ujhhgtgfeyxiexzf) {
            case 0:
                return view.getRight() < (mo1061Ujhhgtgfeyxiexzf() - mo1062Ujhhgtgfeyxiexzf()) / 2;
            default:
                return view.getLeft() > (mo1061Ujhhgtgfeyxiexzf() + this.f1078Ujhhgtgfeyxiexzf.f849Ujhhgtgfeyxiexzf) / 2;
        }
    }

    @Override // p000.AbstractC3593Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean mo1070feyxiexzfUjhhgtg(float f, float f2) {
        switch (this.f1077Ujhhgtgfeyxiexzf) {
            case 0:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) 500);
            default:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) 500);
        }
    }

    @Override // p000.AbstractC3593Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean mo1071feyxiexzfUjhhgtg(View view, float f) {
        switch (this.f1077Ujhhgtgfeyxiexzf) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f1078Ujhhgtgfeyxiexzf;
                float fAbs = Math.abs((f * sideSheetBehavior.f847Ujhhgtgfeyxiexzf) + left);
                sideSheetBehavior.getClass();
                return fAbs > 0.5f;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f1078Ujhhgtgfeyxiexzf;
                float fAbs2 = Math.abs((f * sideSheetBehavior2.f847Ujhhgtgfeyxiexzf) + right);
                sideSheetBehavior2.getClass();
                return fAbs2 > 0.5f;
        }
    }

    @Override // p000.AbstractC3593Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final void mo1072feyxiexzfUjhhgtg(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f1077Ujhhgtgfeyxiexzf) {
            case 0:
                if (i <= this.f1078Ujhhgtgfeyxiexzf.f849Ujhhgtgfeyxiexzf) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i3 = this.f1078Ujhhgtgfeyxiexzf.f849Ujhhgtgfeyxiexzf;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                }
                break;
        }
    }
}

package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛲ能不能ᛱfeyxiexzfᛱᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0319Ujhhgtgfeyxiexzf implements InterfaceC1904feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1875Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final LinearLayout f1876Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final TextInputEditText f1877Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0319Ujhhgtgfeyxiexzf(LinearLayout linearLayout, TextInputEditText textInputEditText, int i) {
        this.f1875Ujhhgtgfeyxiexzf = i;
        this.f1876Ujhhgtgfeyxiexzf = linearLayout;
        this.f1877Ujhhgtgfeyxiexzf = textInputEditText;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C0319Ujhhgtgfeyxiexzf m1532Ujhhgtgfeyxiexzf(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.module_dialog_anti_revoke, (ViewGroup) null, false);
        int i = R.id.moduleDialogEdtAntiRevokeTip;
        TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.moduleDialogEdtAntiRevokeTip);
        if (textInputEditText != null) {
            i = R.id.moduleDialogInputAntiRevokeTip;
            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.moduleDialogInputAntiRevokeTip)) != null) {
                return new C0319Ujhhgtgfeyxiexzf((LinearLayout) viewInflate, textInputEditText, 0);
            }
        }
        throw new NullPointerException(MagicFactory.get(4928816486484542858L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf).concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C0319Ujhhgtgfeyxiexzf m1533Ujhhgtgfeyxiexzf(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.module_dialog_menu_save, (ViewGroup) null, false);
        int i = R.id.moduleDialogEdtMenuSavePath;
        TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.moduleDialogEdtMenuSavePath);
        if (textInputEditText != null) {
            i = R.id.moduleDialogInputMenuSavePath;
            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.moduleDialogInputMenuSavePath)) != null) {
                return new C0319Ujhhgtgfeyxiexzf((LinearLayout) viewInflate, textInputEditText, 6);
            }
        }
        throw new NullPointerException(MagicFactory.get(4928802880028149130L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf).concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC1904feyxiexzfUjhhgtg
    public final View getRoot() {
        switch (this.f1875Ujhhgtgfeyxiexzf) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return this.f1876Ujhhgtgfeyxiexzf;
    }

    public C0319Ujhhgtgfeyxiexzf(LinearLayout linearLayout, TextInputEditText textInputEditText, RecyclerView recyclerView) {
        this.f1875Ujhhgtgfeyxiexzf = 2;
        this.f1876Ujhhgtgfeyxiexzf = linearLayout;
        this.f1877Ujhhgtgfeyxiexzf = textInputEditText;
    }
}

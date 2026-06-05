package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛴᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3483feyxiexzfUjhhgtg extends AbstractC3569Ujhhgtgfeyxiexzf implements InterfaceC3556feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C3483feyxiexzfUjhhgtg f10818Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f10818Ujhhgtgfeyxiexzf = new C3483feyxiexzfUjhhgtg(3, C0310Ujhhgtgfeyxiexzf.class, MagicFactory.get(4928798902888433034L, strArr), MagicFactory.get(4928798868528694666L, strArr), 0);
    }

    @Override // p000.InterfaceC3556feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo1207Ujhhgtgfeyxiexzf(Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        View viewInflate = ((LayoutInflater) obj).inflate(R.layout.module_dialog_float_action_button_full, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.moduleDialogBtnFloatActionButtonAdd;
        MaterialButton materialButton = (MaterialButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.moduleDialogBtnFloatActionButtonAdd);
        if (materialButton != null) {
            i = R.id.moduleDialogRvFloatActionButtonItems;
            RecyclerView recyclerView = (RecyclerView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.moduleDialogRvFloatActionButtonItems);
            if (recyclerView != null) {
                return new C0310Ujhhgtgfeyxiexzf((LinearLayout) viewInflate, materialButton, recyclerView);
            }
        }
        throw new NullPointerException(MagicFactory.get(4928804804173497738L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf).concat(viewInflate.getResources().getResourceName(i)));
    }
}

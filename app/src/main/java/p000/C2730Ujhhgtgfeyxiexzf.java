package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.ChipGroup;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛲᛱUjhhgtgᛱ要点脸ᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2730Ujhhgtgfeyxiexzf extends AbstractC3569Ujhhgtgfeyxiexzf implements InterfaceC3556feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C2730Ujhhgtgfeyxiexzf f8692Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f8692Ujhhgtgfeyxiexzf = new C2730Ujhhgtgfeyxiexzf(3, C0330Ujhhgtgfeyxiexzf.class, MagicFactory.get(4928787508340196746L, strArr), MagicFactory.get(4928787611419411850L, strArr), 0);
    }

    @Override // p000.InterfaceC3556feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo1207Ujhhgtgfeyxiexzf(Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        View viewInflate = ((LayoutInflater) obj).inflate(R.layout.module_dialog_chat_group_tab_conf, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.moduleDialogBtnChatGroupTabAdd;
        MaterialButton materialButton = (MaterialButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.moduleDialogBtnChatGroupTabAdd);
        if (materialButton != null) {
            i = R.id.moduleDialogCgChatGroupTabBuiltin;
            ChipGroup chipGroup = (ChipGroup) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.moduleDialogCgChatGroupTabBuiltin);
            if (chipGroup != null) {
                i = R.id.moduleDialogRvChatGroupTabItems;
                RecyclerView recyclerView = (RecyclerView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.moduleDialogRvChatGroupTabItems);
                if (recyclerView != null) {
                    return new C0330Ujhhgtgfeyxiexzf((LinearLayout) viewInflate, materialButton, chipGroup, recyclerView);
                }
            }
        }
        throw new NullPointerException(MagicFactory.get(4928819647580472714L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf).concat(viewInflate.getResources().getResourceName(i)));
    }
}

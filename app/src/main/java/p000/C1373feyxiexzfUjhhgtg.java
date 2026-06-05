package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛳ能不能ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1373feyxiexzfUjhhgtg extends AbstractC3569Ujhhgtgfeyxiexzf implements InterfaceC3556feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C1373feyxiexzfUjhhgtg f4866Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f4866Ujhhgtgfeyxiexzf = new C1373feyxiexzfUjhhgtg(3, C0311Ujhhgtgfeyxiexzf.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lme/hd/wauxv/databinding/ModuleDialogPanelEmojiFullBinding;", 0);
    }

    @Override // p000.InterfaceC3556feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo1207Ujhhgtgfeyxiexzf(Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        View viewInflate = ((LayoutInflater) obj).inflate(R.layout.module_dialog_panel_emoji_full, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        RecyclerView recyclerView = (RecyclerView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.moduleDialogRvPanelEmojiGroups);
        if (recyclerView != null) {
            return new C0311Ujhhgtgfeyxiexzf((LinearLayout) viewInflate, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.moduleDialogRvPanelEmojiGroups)));
    }
}

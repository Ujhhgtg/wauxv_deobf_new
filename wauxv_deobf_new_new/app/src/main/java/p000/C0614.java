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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲁᤞᲀᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0614 extends AbstractC1446 implements InterfaceC1438 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0614 f2455;

    static {
        String[] strArr = AbstractC1471.f5234;
        f2455 = new C0614(3, C2045.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lme/hd/wauxv/databinding/ModuleDialogChatGroupTabConfBinding;", 0);
    }

    @Override // p000.InterfaceC1438
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object mo2135(Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        View viewInflate = ((LayoutInflater) obj).inflate(R.layout.module_dialog_chat_group_tab_conf, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.moduleDialogBtnChatGroupTabAdd;
        MaterialButton materialButton = (MaterialButton) AbstractC1272.m3098(viewInflate, R.id.moduleDialogBtnChatGroupTabAdd);
        if (materialButton != null) {
            i = R.id.moduleDialogCgChatGroupTabBuiltin;
            ChipGroup chipGroup = (ChipGroup) AbstractC1272.m3098(viewInflate, R.id.moduleDialogCgChatGroupTabBuiltin);
            if (chipGroup != null) {
                i = R.id.moduleDialogRvChatGroupTabItems;
                RecyclerView recyclerView = (RecyclerView) AbstractC1272.m3098(viewInflate, R.id.moduleDialogRvChatGroupTabItems);
                if (recyclerView != null) {
                    return new C2045((LinearLayout) viewInflate, materialButton, chipGroup, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

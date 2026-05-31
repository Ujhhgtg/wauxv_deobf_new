package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᲁᛸᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1368 extends AbstractC1446 implements InterfaceC1438 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C1368 f4884;

    static {
        String[] strArr = AbstractC1471.f5234;
        f4884 = new C1368(3, C2050.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lme/hd/wauxv/databinding/ModuleDialogFloatActionButtonFullBinding;", 0);
    }

    @Override // p000.InterfaceC1438
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo2135(Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        View viewInflate = ((LayoutInflater) obj).inflate(R.layout.module_dialog_float_action_button_full, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.moduleDialogBtnFloatActionButtonAdd;
        MaterialButton materialButton = (MaterialButton) AbstractC1272.m3098(viewInflate, R.id.moduleDialogBtnFloatActionButtonAdd);
        if (materialButton != null) {
            i = R.id.moduleDialogRvFloatActionButtonItems;
            RecyclerView recyclerView = (RecyclerView) AbstractC1272.m3098(viewInflate, R.id.moduleDialogRvFloatActionButtonItems);
            if (recyclerView != null) {
                return new C2050((LinearLayout) viewInflate, materialButton, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

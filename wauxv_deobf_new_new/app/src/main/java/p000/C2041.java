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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲀᲈᛸᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2041 implements InterfaceC3623 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6809;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final LinearLayout f6810;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final TextInputEditText f6811;

    public /* synthetic */ C2041(LinearLayout linearLayout, TextInputEditText textInputEditText, int i) {
        this.f6809 = i;
        this.f6810 = linearLayout;
        this.f6811 = textInputEditText;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C2041 m4058(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.module_dialog_anti_revoke, (ViewGroup) null, false);
        int i = R.id.moduleDialogEdtAntiRevokeTip;
        TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewInflate, R.id.moduleDialogEdtAntiRevokeTip);
        if (textInputEditText != null) {
            i = R.id.moduleDialogInputAntiRevokeTip;
            if (((TextInputLayout) AbstractC1272.m3098(viewInflate, R.id.moduleDialogInputAntiRevokeTip)) != null) {
                return new C2041((LinearLayout) viewInflate, textInputEditText, 0);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C2041 m4059(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.module_dialog_menu_save, (ViewGroup) null, false);
        int i = R.id.moduleDialogEdtMenuSavePath;
        TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewInflate, R.id.moduleDialogEdtMenuSavePath);
        if (textInputEditText != null) {
            i = R.id.moduleDialogInputMenuSavePath;
            if (((TextInputLayout) AbstractC1272.m3098(viewInflate, R.id.moduleDialogInputMenuSavePath)) != null) {
                return new C2041((LinearLayout) viewInflate, textInputEditText, 6);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC3623
    public final View getRoot() {
        switch (this.f6809) {
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
        return this.f6810;
    }

    public C2041(LinearLayout linearLayout, TextInputEditText textInputEditText, RecyclerView recyclerView) {
        this.f6809 = 2;
        this.f6810 = linearLayout;
        this.f6811 = textInputEditText;
    }
}

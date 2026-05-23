package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2011 {

    public final LinearLayout f6707;

    public final TextInputEditText f6708;

    public /* synthetic */ C2011(LinearLayout linearLayout, TextInputEditText textInputEditText) {
        this.f6707 = linearLayout;
        this.f6708 = textInputEditText;
    }

    public static C2011 m3871(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.module_dialog_anti_revoke, (ViewGroup) null, false);
        int i = R.id.moduleDialogEdtAntiRevokeTip;
        TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewInflate, R.id.moduleDialogEdtAntiRevokeTip);
        if (textInputEditText != null) {
            i = R.id.moduleDialogInputAntiRevokeTip;
            if (((TextInputLayout) AbstractC3681.m5325(viewInflate, R.id.moduleDialogInputAntiRevokeTip)) != null) {
                return new C2011((LinearLayout) viewInflate, textInputEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public static C2011 m3872(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.module_dialog_menu_save, (ViewGroup) null, false);
        int i = R.id.moduleDialogEdtMenuSavePath;
        TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewInflate, R.id.moduleDialogEdtMenuSavePath);
        if (textInputEditText != null) {
            i = R.id.moduleDialogInputMenuSavePath;
            if (((TextInputLayout) AbstractC3681.m5325(viewInflate, R.id.moduleDialogInputMenuSavePath)) != null) {
                return new C2011((LinearLayout) viewInflate, textInputEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

package p000;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import java.util.ArrayList;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleRecyclerView;
import me.hd.wauxv.ui.setting.view.ModuleTabLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᲁᤞᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2734 extends AbstractC1915 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2735 f8762;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2734(C2735 c2735) {
        super(R.layout.dialog_module);
        this.f8762 = c2735;
    }

    @Override // p000.AbstractC1915
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo3856(AbstractC0034 abstractC0034, View view) {
        View viewM897 = ((C0942) abstractC0034).m897();
        String[] strArr = AbstractC1471.f5234;
        "null cannot be cast to non-null type android.view.ViewGroup";
        ViewGroup viewGroup = (ViewGroup) viewM897;
        StringBuilder sb = new StringBuilder();
        sb.append("免费模块仅供学习\n");
        sb.append("勿在国内平台传播\n");
        C0488.f2136.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("wxid:");
        C0772.f2876.getClass();
        sb2.append(C0772.m2366());
        sb2.append('\n');
        sb.append(sb2.toString());
        String strM2365 = C0772.m2365();
        ModuleRecyclerView moduleRecyclerView = null;
        if (strM2365 != null) {
            if (strM2365.length() <= 0) {
                strM2365 = null;
            }
            if (strM2365 != null) {
                sb.append("alias:" + strM2365 + '\n');
            }
        }
        C3690 c3690 = new C3690(sb.toString(), AbstractC0747.m2326(viewGroup.getContext().getColor(R.color.md_theme_primary), 45));
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackground(new C3691(c3690));
        viewGroup.addView(frameLayout);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.moduleTabRow);
        C2735 c2735 = this.f8762;
        c2735.f8767 = linearLayout;
        c2735.f8768 = (ModuleTabLayout) view.findViewById(R.id.moduleTabLayout);
        c2735.f8769 = (ImageView) view.findViewById(R.id.moduleIvSearchToggle);
        c2735.f8770 = (LinearLayout) view.findViewById(R.id.moduleSearchRow);
        c2735.f8771 = (EditText) view.findViewById(R.id.moduleEdtSearchInput);
        c2735.f8772 = (ImageView) view.findViewById(R.id.moduleIvSearchClose);
        c2735.f8773 = (ModuleRecyclerView) view.findViewById(R.id.moduleRecyclerView);
        ModuleTabLayout moduleTabLayout = c2735.f8768;
        if (moduleTabLayout == null) {
            "tabLayout";
            moduleTabLayout = null;
        }
        C0613 c0613 = new C0613(c2735, 1);
        ArrayList arrayList = moduleTabLayout.f9470;
        if (!arrayList.contains(c0613)) {
            arrayList.add(c0613);
        }
        C3622 c3622M4719 = c2735.m4719();
        int selectedTabPosition = moduleTabLayout.getSelectedTabPosition();
        Integer numValueOf = Integer.valueOf(selectedTabPosition);
        if (selectedTabPosition < 0) {
            numValueOf = null;
        }
        c3622M4719.m5152(c2735.m4718(numValueOf != null ? numValueOf.intValue() : 0));
        ImageView imageView = c2735.f8769;
        if (imageView == null) {
            "ivSearchToggle";
            imageView = null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC2728(c2735, 16));
        final EditText editText = c2735.f8771;
        if (editText == null) {
            "edtSearchInput";
            editText = null;
        }
        editText.addTextChangedListener(new C0628(c2735, 2));
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᤞᲁᲈᛸ
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3) {
                    return false;
                }
                EditText editText2 = editText;
                Context context = editText2.getContext();
                String[] strArr2 = AbstractC1471.f5234;
                Object systemService = context.getSystemService("input_method");
                "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
                ((InputMethodManager) systemService).hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                return true;
            }
        });
        ImageView imageView2 = c2735.f8772;
        if (imageView2 == null) {
            "ivSearchClose";
            imageView2 = null;
        }
        imageView2.setOnClickListener(new ViewOnClickListenerC2728(c2735, 17));
        ModuleRecyclerView moduleRecyclerView2 = c2735.f8773;
        if (moduleRecyclerView2 == null) {
            "recyclerView";
        } else {
            moduleRecyclerView = moduleRecyclerView2;
        }
        moduleRecyclerView.getContext();
        moduleRecyclerView.setLayoutManager(new LinearLayoutManager(1));
        moduleRecyclerView.setAdapter(c2735.m4719());
    }
}

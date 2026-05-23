package p000;

import android.content.Context;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kongzue.dialogx.interfaces.AbstractC0027;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleRecyclerView;
import me.hd.wauxv.ui.setting.view.ModuleTabLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᤝᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2674 extends AbstractC1889 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C2675 f8604;

    public C2674(C2675 c2675) {
        this.f8604 = c2675;
        if (AbstractC0027.m740() == null) {
            AbstractC2205 abstractC2205 = AbstractC1034.f3778;
            Log.e(">>>", "DialogX.init: 初始化异常，context 为 null 或未初始化，详情请查看 https://github.com/kongzue/DialogX/wiki");
        } else {
            this.f6238 = R.layout.dialog_module;
            this.f6241 = AbstractC1460.m3216(AbstractC0027.m740()).inflate(R.layout.dialog_module, (ViewGroup) new RelativeLayout(AbstractC0027.m740()), false);
        }
    }

    @Override // p000.AbstractC1889
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo3678(AbstractC0027 abstractC0027, View view) throws IllegalAccessException, InvocationTargetException {
        View viewM753 = ((C0943) abstractC0027).m753();
        String[] strArr = AbstractC1574.f5469;
        "null cannot be cast to non-null type android.view.ViewGroup";
        ViewGroup viewGroup = (ViewGroup) viewM753;
        StringBuilder sb = new StringBuilder();
        sb.append("免费模块仅供学习\n");
        sb.append("勿在国内平台传播\n");
        C0511.f2180.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("wxid:");
        C0774.f2874.getClass();
        sb2.append(C0774.m2264());
        sb2.append('\n');
        sb.append(sb2.toString());
        ModuleRecyclerView moduleRecyclerView = null;
        Object objInvoke = AbstractC1574.m3315(C0773.f2873).invoke(null, null);
        "null cannot be cast to non-null type kotlin.collections.Map<*, *>";
        Object obj = ((Map) objInvoke).get("last_login_alias");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                sb.append("alias:" + str + '\n');
            }
        }
        C3630 c3630 = new C3630(sb.toString(), AbstractC0752.m2226(viewGroup.getContext().getColor(R.color.md_theme_primary), 45));
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackground(new C3631(c3630));
        viewGroup.addView(frameLayout);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.moduleTabRow);
        C2675 c2675 = this.f8604;
        c2675.f8609 = linearLayout;
        c2675.f8610 = (ModuleTabLayout) view.findViewById(R.id.moduleTabLayout);
        c2675.f8611 = (ImageView) view.findViewById(R.id.moduleIvSearchToggle);
        c2675.f8612 = (LinearLayout) view.findViewById(R.id.moduleSearchRow);
        c2675.f8613 = (EditText) view.findViewById(R.id.moduleEdtSearchInput);
        c2675.f8614 = (ImageView) view.findViewById(R.id.moduleIvSearchClose);
        c2675.f8615 = (ModuleRecyclerView) view.findViewById(R.id.moduleRecyclerView);
        ModuleTabLayout moduleTabLayout = c2675.f8610;
        if (moduleTabLayout == null) {
            "tabLayout";
            moduleTabLayout = null;
        }
        C2670 c2670 = new C2670(c2675);
        ArrayList arrayList = moduleTabLayout.f9303;
        if (!arrayList.contains(c2670)) {
            arrayList.add(c2670);
        }
        C3563 c3563M4685 = c2675.m4685();
        int selectedTabPosition = moduleTabLayout.getSelectedTabPosition();
        Integer numValueOf = Integer.valueOf(selectedTabPosition);
        if (selectedTabPosition < 0) {
            numValueOf = null;
        }
        c3563M4685.m5146(c2675.m4684(numValueOf != null ? numValueOf.intValue() : 0));
        ImageView imageView = c2675.f8611;
        if (imageView == null) {
            "ivSearchToggle";
            imageView = null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC2666(c2675, 16));
        final EditText editText = c2675.f8613;
        if (editText == null) {
            "edtSearchInput";
            editText = null;
        }
        editText.addTextChangedListener(new C0635(2, c2675));
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᛸᤞᤝᲇ
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3) {
                    return false;
                }
                EditText editText2 = editText;
                Context context = editText2.getContext();
                String[] strArr2 = AbstractC1574.f5469;
                Object systemService = context.getSystemService("input_method");
                "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
                ((InputMethodManager) systemService).hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                return true;
            }
        });
        ImageView imageView2 = c2675.f8614;
        if (imageView2 == null) {
            "ivSearchClose";
            imageView2 = null;
        }
        imageView2.setOnClickListener(new ViewOnClickListenerC2666(c2675, 17));
        ModuleRecyclerView moduleRecyclerView2 = c2675.f8615;
        if (moduleRecyclerView2 == null) {
            "recyclerView";
        } else {
            moduleRecyclerView = moduleRecyclerView2;
        }
        moduleRecyclerView.getContext();
        moduleRecyclerView.setLayoutManager(new LinearLayoutManager(1));
        moduleRecyclerView.setAdapter(c2675.m4685());
    }
}

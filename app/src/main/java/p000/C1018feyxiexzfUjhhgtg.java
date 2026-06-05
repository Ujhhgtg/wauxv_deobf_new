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
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import java.util.ArrayList;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleRecyclerView;
import me.hd.wauxv.ui.setting.view.ModuleTabLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ能不能要点脸ᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1018feyxiexzfUjhhgtg extends AbstractC0171Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C1019feyxiexzfUjhhgtg f3985Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1018feyxiexzfUjhhgtg(C1019feyxiexzfUjhhgtg c1019feyxiexzfUjhhgtg) {
        super(R.layout.dialog_module);
        this.f3985Ujhhgtgfeyxiexzf = c1019feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC0171Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final void mo1230Ujhhgtgfeyxiexzf(Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf, View view) {
        View viewM898Ujhhgtgfeyxiexzf = ((C3082Ujhhgtgfeyxiexzf) ujhhgtgfeyxiexzf).m898Ujhhgtgfeyxiexzf();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        "null cannot be cast to non-null type android.view.ViewGroup";
        ViewGroup viewGroup = (ViewGroup) viewM898Ujhhgtgfeyxiexzf;
        StringBuilder sb = new StringBuilder();
        sb.append("免费模块仅供学习\n");
        sb.append("勿在国内平台传播\n");
        C2625feyxiexzfUjhhgtg.f8453Ujhhgtgfeyxiexzf.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("wxid:");
        C2884feyxiexzfUjhhgtg.f9151Ujhhgtgfeyxiexzf.getClass();
        sb2.append(C2884feyxiexzfUjhhgtg.m4273feyxiexzfUjhhgtg());
        sb2.append('\n');
        sb.append(sb2.toString());
        String strM4272feyxiexzfUjhhgtg = C2884feyxiexzfUjhhgtg.m4272feyxiexzfUjhhgtg();
        ModuleRecyclerView moduleRecyclerView = null;
        if (strM4272feyxiexzfUjhhgtg != null) {
            if (strM4272feyxiexzfUjhhgtg.length() <= 0) {
                strM4272feyxiexzfUjhhgtg = null;
            }
            if (strM4272feyxiexzfUjhhgtg != null) {
                sb.append("alias:" + strM4272feyxiexzfUjhhgtg + '\n');
            }
        }
        C2244feyxiexzfUjhhgtg c2244feyxiexzfUjhhgtg = new C2244feyxiexzfUjhhgtg(sb.toString(), AbstractC2857Ujhhgtgfeyxiexzf.m4262Ujhhgtgfeyxiexzf(viewGroup.getContext().getColor(R.color.md_theme_primary), 45));
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackground(new C2245feyxiexzfUjhhgtg(c2244feyxiexzfUjhhgtg));
        viewGroup.addView(frameLayout);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.moduleTabRow);
        C1019feyxiexzfUjhhgtg c1019feyxiexzfUjhhgtg = this.f3985Ujhhgtgfeyxiexzf;
        c1019feyxiexzfUjhhgtg.f3990Ujhhgtgfeyxiexzf = linearLayout;
        c1019feyxiexzfUjhhgtg.f3991Ujhhgtgfeyxiexzf = (ModuleTabLayout) view.findViewById(R.id.moduleTabLayout);
        c1019feyxiexzfUjhhgtg.f3992Ujhhgtgfeyxiexzf = (ImageView) view.findViewById(R.id.moduleIvSearchToggle);
        c1019feyxiexzfUjhhgtg.f3993Ujhhgtgfeyxiexzf = (LinearLayout) view.findViewById(R.id.moduleSearchRow);
        c1019feyxiexzfUjhhgtg.f3994Ujhhgtgfeyxiexzf = (EditText) view.findViewById(R.id.moduleEdtSearchInput);
        c1019feyxiexzfUjhhgtg.f3995Ujhhgtgfeyxiexzf = (ImageView) view.findViewById(R.id.moduleIvSearchClose);
        c1019feyxiexzfUjhhgtg.f3996Ujhhgtgfeyxiexzf = (ModuleRecyclerView) view.findViewById(R.id.moduleRecyclerView);
        ModuleTabLayout moduleTabLayout = c1019feyxiexzfUjhhgtg.f3991Ujhhgtgfeyxiexzf;
        if (moduleTabLayout == null) {
            "tabLayout";
            moduleTabLayout = null;
        }
        C2729Ujhhgtgfeyxiexzf c2729Ujhhgtgfeyxiexzf = new C2729Ujhhgtgfeyxiexzf(1, c1019feyxiexzfUjhhgtg);
        ArrayList arrayList = moduleTabLayout.f6542feyxiexzfUjhhgtg;
        if (!arrayList.contains(c2729Ujhhgtgfeyxiexzf)) {
            arrayList.add(c2729Ujhhgtgfeyxiexzf);
        }
        C1905feyxiexzfUjhhgtg c1905feyxiexzfUjhhgtgM2517Ujhhgtgfeyxiexzf = c1019feyxiexzfUjhhgtg.m2517Ujhhgtgfeyxiexzf();
        int selectedTabPosition = moduleTabLayout.getSelectedTabPosition();
        Integer numValueOf = Integer.valueOf(selectedTabPosition);
        if (selectedTabPosition < 0) {
            numValueOf = null;
        }
        c1905feyxiexzfUjhhgtgM2517Ujhhgtgfeyxiexzf.m3268Ujhhgtgfeyxiexzf(c1019feyxiexzfUjhhgtg.m2516Ujhhgtgfeyxiexzf(numValueOf != null ? numValueOf.intValue() : 0));
        ImageView imageView = c1019feyxiexzfUjhhgtg.f3992Ujhhgtgfeyxiexzf;
        if (imageView == null) {
            "ivSearchToggle";
            imageView = null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC1114feyxiexzfUjhhgtg(c1019feyxiexzfUjhhgtg, 16));
        final EditText editText = c1019feyxiexzfUjhhgtg.f3994Ujhhgtgfeyxiexzf;
        if (editText == null) {
            "edtSearchInput";
            editText = null;
        }
        editText.addTextChangedListener(new C2737Ujhhgtgfeyxiexzf(2, c1019feyxiexzfUjhhgtg));
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ要点脸ᛴ能不能ᛲᛱUjhhgtgᛱ
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3) {
                    return false;
                }
                EditText editText2 = editText;
                Context context = editText2.getContext();
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                Object systemService = context.getSystemService("input_method");
                "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
                ((InputMethodManager) systemService).hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                return true;
            }
        });
        ImageView imageView2 = c1019feyxiexzfUjhhgtg.f3995Ujhhgtgfeyxiexzf;
        if (imageView2 == null) {
            "ivSearchClose";
            imageView2 = null;
        }
        imageView2.setOnClickListener(new ViewOnClickListenerC1114feyxiexzfUjhhgtg(c1019feyxiexzfUjhhgtg, 17));
        ModuleRecyclerView moduleRecyclerView2 = c1019feyxiexzfUjhhgtg.f3996Ujhhgtgfeyxiexzf;
        if (moduleRecyclerView2 == null) {
            "recyclerView";
        } else {
            moduleRecyclerView = moduleRecyclerView2;
        }
        moduleRecyclerView.getContext();
        moduleRecyclerView.setLayoutManager(new LinearLayoutManager(1));
        moduleRecyclerView.setAdapter(c1019feyxiexzfUjhhgtg.m2517Ujhhgtgfeyxiexzf());
    }
}

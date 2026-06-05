package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0308Ujhhgtgfeyxiexzf extends AbstractC0171Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ CharSequence f1834Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ C0416Ujhhgtgfeyxiexzf f1835Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0308Ujhhgtgfeyxiexzf(CharSequence charSequence, C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf) {
        super(R.layout.module_dialog_full_config);
        this.f1834Ujhhgtgfeyxiexzf = charSequence;
        this.f1835Ujhhgtgfeyxiexzf = c0416Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0171Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final void mo1230Ujhhgtgfeyxiexzf(Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf, View view) {
        C3082Ujhhgtgfeyxiexzf c3082Ujhhgtgfeyxiexzf = (C3082Ujhhgtgfeyxiexzf) ujhhgtgfeyxiexzf;
        View viewM898Ujhhgtgfeyxiexzf = c3082Ujhhgtgfeyxiexzf.m898Ujhhgtgfeyxiexzf();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        MagicFactory.get(4928464921936528778L, strArr);
        ViewGroup viewGroup = (ViewGroup) viewM898Ujhhgtgfeyxiexzf;
        StringBuilder sb = new StringBuilder();
        sb.append(MagicFactory.get(4928465076555351434L, strArr));
        sb.append(MagicFactory.get(4928465171044631946L, strArr));
        C2625feyxiexzfUjhhgtg.f8453Ujhhgtgfeyxiexzf.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(MagicFactory.get(4928464166022284682L, strArr));
        C2884feyxiexzfUjhhgtg.f9151Ujhhgtgfeyxiexzf.getClass();
        sb2.append(C2884feyxiexzfUjhhgtg.m4273feyxiexzfUjhhgtg());
        sb2.append('\n');
        sb.append(sb2.toString());
        String strM4272feyxiexzfUjhhgtg = C2884feyxiexzfUjhhgtg.m4272feyxiexzfUjhhgtg();
        if (strM4272feyxiexzfUjhhgtg != null) {
            if (strM4272feyxiexzfUjhhgtg.length() <= 0) {
                strM4272feyxiexzfUjhhgtg = null;
            }
            if (strM4272feyxiexzfUjhhgtg != null) {
                sb.append(MagicFactory.get(4928464140252480906L, strArr) + strM4272feyxiexzfUjhhgtg + '\n');
            }
        }
        C2244feyxiexzfUjhhgtg c2244feyxiexzfUjhhgtg = new C2244feyxiexzfUjhhgtg(sb.toString(), AbstractC2857Ujhhgtgfeyxiexzf.m4262Ujhhgtgfeyxiexzf(viewGroup.getContext().getColor(R.color.md_theme_primary), 45));
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackground(new C2245feyxiexzfUjhhgtg(c2244feyxiexzfUjhhgtg));
        viewGroup.addView(frameLayout);
        MaterialTextView materialTextView = (MaterialTextView) view.findViewById(R.id.moduleDialogFullConfigTitle);
        CharSequence charSequence = this.f1834Ujhhgtgfeyxiexzf;
        if (charSequence != null) {
            materialTextView.setText(charSequence);
        }
        ((ShapeableImageView) view.findViewById(R.id.moduleDialogFullConfigIvClose)).setOnClickListener(new ViewOnClickListenerC2974feyxiexzfUjhhgtg(8, c3082Ujhhgtgfeyxiexzf));
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.moduleDialogFullConfigContent);
        frameLayout2.removeAllViews();
        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf = this.f1835Ujhhgtgfeyxiexzf;
        InterfaceC1904feyxiexzfUjhhgtg interfaceC1904feyxiexzfUjhhgtg = (InterfaceC1904feyxiexzfUjhhgtg) ((InterfaceC3556feyxiexzfUjhhgtg) c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf).mo1207Ujhhgtgfeyxiexzf(AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf((Context) c0416Ujhhgtgfeyxiexzf.f2243Ujhhgtgfeyxiexzf), frameLayout2, Boolean.FALSE);
        frameLayout2.addView(interfaceC1904feyxiexzfUjhhgtg.getRoot());
        InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg = (InterfaceC3549feyxiexzfUjhhgtg) c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf;
        if (interfaceC3549feyxiexzfUjhhgtg != null) {
            interfaceC3549feyxiexzfUjhhgtg.invoke(interfaceC1904feyxiexzfUjhhgtg);
        }
    }
}

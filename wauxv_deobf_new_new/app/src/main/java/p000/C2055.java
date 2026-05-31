package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᤝᲀᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2055 extends AbstractC1915 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ CharSequence f6899;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C2136 f6900;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2055(CharSequence charSequence, C2136 c2136) {
        super(R.layout.module_dialog_full_config);
        this.f6899 = charSequence;
        this.f6900 = c2136;
    }

    @Override // p000.AbstractC1915
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo3856(AbstractC0034 abstractC0034, View view) {
        C0942 c0942 = (C0942) abstractC0034;
        View viewM897 = c0942.m897();
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
        MaterialTextView materialTextView = (MaterialTextView) view.findViewById(R.id.moduleDialogFullConfigTitle);
        CharSequence charSequence = this.f6899;
        if (charSequence != null) {
            materialTextView.setText(charSequence);
        }
        ((ShapeableImageView) view.findViewById(R.id.moduleDialogFullConfigIvClose)).setOnClickListener(new ViewOnClickListenerC0111(c0942, 8));
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.moduleDialogFullConfigContent);
        frameLayout2.removeAllViews();
        C2136 c2136 = this.f6900;
        InterfaceC3623 interfaceC3623 = (InterfaceC3623) ((InterfaceC1438) c2136.f7060).mo2135(LayoutInflater.from((Context) c2136.f7059), frameLayout2, Boolean.FALSE);
        frameLayout2.addView(interfaceC3623.getRoot());
        InterfaceC1433 interfaceC1433 = (InterfaceC1433) c2136.f7062;
        if (interfaceC1433 != null) {
            interfaceC1433.invoke(interfaceC3623);
        }
    }
}

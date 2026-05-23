package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᲁᛸᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1836 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6128;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ View f6129;

    public /* synthetic */ ViewOnClickListenerC1836(View view, int i) {
        this.f6128 = i;
        this.f6129 = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6128) {
            case 0:
                Activity activityM4033 = AbstractC2203.m4033();
                Context context = this.f6129.getContext();
                C1846.f6140.getClass();
                C0243 c0243 = C1846.f6143;
                InterfaceC1742 interfaceC1742 = C1846.f6141[0];
                Intent intent = new Intent(context, (Class<?>) c0243.m1323());
                intent.putExtra("map_view_type", 8);
                activityM4033.startActivityForResult(intent, 6);
                break;
            default:
                AbstractC3681.m5335(this.f6129.getContext(), "https://hdshare.github.io/WAuxiliary_Plugin/");
                break;
        }
    }
}

package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᲀᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1863 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6203;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ View f6204;

    public /* synthetic */ ViewOnClickListenerC1863(View view, int i) {
        this.f6203 = i;
        this.f6204 = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6203) {
            case 0:
                Activity activityM3476 = AbstractC1586.m3476();
                Context context = this.f6204.getContext();
                C1872.f6214.getClass();
                C0253 c0253 = C1872.f6217;
                InterfaceC1766 interfaceC1766 = C1872.f6215[0];
                Intent intent = new Intent(context, (Class<?>) c0253.m1469());
                intent.putExtra("map_view_type", 8);
                activityM3476.startActivityForResult(intent, 6);
                break;
            default:
                AbstractC2234.m4181(this.f6204.getContext(), "https://hdshare.github.io/WAuxiliary_Plugin/");
                break;
        }
    }
}

package p000;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2811 extends AbstractC2508 implements InterfaceC1413 {

    public static final /* synthetic */ int f9010 = 0;

    public final FrameLayout f9011;

    public C2811(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C2102.m3893(frameLayout);
        super(frameLayout);
        this.f9011 = frameLayout;
    }
}

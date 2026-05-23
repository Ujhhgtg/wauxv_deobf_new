package p000;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1461 extends ContextWrapper {

    public static final C1445 f5204;

    public final C1867 f5205;

    public final C1215 f5206;

    public final C1227 f5207;

    public final C1227 f5208;

    public final List f5209;

    public final C0264 f5210;

    public final C1216 f5211;

    public final C1466 f5212;

    public final int f5213;

    public C2565 f5214;

    static {
        C1445 c1445 = new C1445();
        c1445.f5113 = C2221.f7210;
        f5204 = c1445;
    }

    public C1461(Context context, C1867 c1867, C2712 c2712, C1227 c1227, C1227 c1228, C0264 c0264, List list, C1216 c1216, C1466 c1466) {
        super(context.getApplicationContext());
        this.f5205 = c1867;
        this.f5207 = c1227;
        this.f5208 = c1228;
        this.f5209 = list;
        this.f5210 = c0264;
        this.f5211 = c1216;
        this.f5212 = c1466;
        this.f5213 = 4;
        this.f5206 = new C1215(c2712);
    }

    public final C2529 m3229() {
        return (C2529) this.f5206.get();
    }
}

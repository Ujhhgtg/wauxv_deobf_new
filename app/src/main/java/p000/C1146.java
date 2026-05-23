package p000;

import android.text.Editable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1146 extends Editable.Factory {

    public static final Object f4252 = new Object();

    public static volatile C1146 f4253;

    public static Class f4254;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f4254;
        return cls != null ? new C2793(cls, charSequence) : super.newEditable(charSequence);
    }
}

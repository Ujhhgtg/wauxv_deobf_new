package com.drake.net.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC2140;
import p000.Unit;
import p000.InterfaceC1636;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class NetInitializer implements InterfaceC1636 {
    @Override // p000.InterfaceC1636
    public final List mo92() {
        return new ArrayList();
    }

    @Override // p000.InterfaceC1636
    public final Object mo93(Context context) {
        AbstractC2140.f7078 = context;
        return Unit.INSTANCE;
    }
}

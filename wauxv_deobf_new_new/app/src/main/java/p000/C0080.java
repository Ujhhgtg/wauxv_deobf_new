package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0080 extends AbstractC1469 {
    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo1096(AbstractFutureC0082 abstractFutureC0082, C0078 c0078) {
        C0078 c0079 = C0078.f1067;
        synchronized (abstractFutureC0082) {
            try {
                if (abstractFutureC0082.f1082 != c0078) {
                    return false;
                }
                abstractFutureC0082.f1082 = c0079;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final boolean mo1097(AbstractFutureC0082 abstractFutureC0082, Object obj, Object obj2) {
        synchronized (abstractFutureC0082) {
            try {
                if (abstractFutureC0082.f1081 != obj) {
                    return false;
                }
                abstractFutureC0082.f1081 = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final boolean mo1098(AbstractFutureC0082 abstractFutureC0082, C0081 c0081, C0081 c0082) {
        synchronized (abstractFutureC0082) {
            try {
                if (abstractFutureC0082.f1083 != c0081) {
                    return false;
                }
                abstractFutureC0082.f1083 = c0082;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final void mo1099(C0081 c0081, C0081 c0082) {
        c0081.f1076 = c0082;
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final void mo1100(C0081 c0081, Thread thread) {
        c0081.f1075 = thread;
    }
}

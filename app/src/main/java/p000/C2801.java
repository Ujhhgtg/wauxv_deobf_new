package p000;

import android.content.ContentValues;
import java.lang.reflect.Array;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᤞᲁᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2801 extends AbstractC1823 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2801 f8931 = new C2801();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final LinkedHashSet f8932 = new LinkedHashSet();

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        int i = 0;
        String[] strArr = AbstractC1574.f5469;
        C1744 c1744M2483 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.wcdb.database.SQLiteDatabase"));
        MethodResolver c1973M3492 = c1744M2483.m3492();
        c1973M3492.name = "insertWithOnConflict";
        C0707 c0707M4527 = AbstractC2519.classToKClass(String.class);
        C0707 c0707M4528 = AbstractC2519.classToKClass(String.class);
        C0707 c0707M4529 = AbstractC2519.classToKClass(ContentValues.class);
        Class cls = Integer.TYPE;
        C1982 c1982 = (C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{c0707M4527, c0707M4528, c0707M4529, AbstractC2519.classToKClass(cls)}, 4, c1973M3492);
        C2801 c2801 = f8931;
        C3689 c3689M4174 = c2801.m4174(c1982, 1);
        c3689M4174.m5351(new C2798(3));
        c3689M4174.applyHook();
        MethodResolver c1973M3493 = c1744M2483.m3492();
        c1973M3493.name = "updateWithOnConflict";
        C3689 c3689M4175 = c2801.m4174((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(ContentValues.class), AbstractC2519.classToKClass(String.class), Array.newInstance((Class<?>) AbstractC2519.classToKClass(String.class).mo2114(), 0).getClass(), AbstractC2519.classToKClass(cls)}, 5, c1973M3493), 1);
        c3689M4175.m5351(new C2798(4));
        c3689M4175.applyHook();
        MethodResolver c1973M3494 = c1744M2483.m3492();
        c1973M3494.name = "rawQueryWithFactory";
        C3689 c3689M4176 = c2801.m4174((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{"com.tencent.wcdb.database.SQLiteDatabase$CursorFactory", AbstractC2519.classToKClass(String.class), Array.newInstance((Class<?>) AbstractC2519.classToKClass(Object.class).mo2114(), 0).getClass(), AbstractC2519.classToKClass(String.class), "com.tencent.wcdb.support.CancellationSignal"}, 5, c1973M3494), 1);
        c3689M4176.m5351(new C2798(5));
        c3689M4176.applyHook();
        if (AbstractC3471.m5079(WeChatVersions.f11530) || AbstractC3471.m5080(WeChatVersionsPlay.f11496)) {
            C1744 c1744M2484 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.wcdb.compat.SQLiteDatabase"));
            MethodResolver c1973M3495 = c1744M2484.m3492();
            c1973M3495.name = "updateWithOnConflict";
            C3689 c3689M4177 = c2801.m4174((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(ContentValues.class), AbstractC2519.classToKClass(String.class), Array.newInstance((Class<?>) AbstractC2519.classToKClass(String.class).mo2114(), 0).getClass(), AbstractC2519.classToKClass(cls)}, 5, c1973M3495), 1);
            c3689M4177.m5351(new C2798(6));
            c3689M4177.applyHook();
            MethodResolver c1973M3496 = c1744M2484.m3492();
            c1973M3496.name = "rawQuery";
            C3689 c3689M4178 = c2801.m4174((C1982) AbstractC0744.firstInList(c1973M3496.resolve()), 1);
            c3689M4178.m5351(new C2798(7));
            c3689M4178.applyHook();
        }
    }
}

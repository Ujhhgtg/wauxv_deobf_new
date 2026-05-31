package p000;

import android.content.ContentValues;
import java.lang.reflect.Array;
import java.util.LinkedHashSet;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤝᲇᤞᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2860 extends AbstractC1850 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2860 f9092 = new C2860();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final LinkedHashSet f9093 = new LinkedHashSet();

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        int i = AbstractC1768.f5906;
        String[] strArr = AbstractC1471.f5234;
        C1681 c1681M4712 = AbstractC2727.m4712(AbstractC0972.m2606("com.tencent.wcdb.database.SQLiteDatabase"));
        C2004 c2004M3560 = c1681M4712.m3560();
        c2004M3560.f6475 = "insertWithOnConflict";
        C0702 c0702M4549 = AbstractC2574.m4549(String.class);
        C0702 c0702M45410 = AbstractC2574.m4549(String.class);
        C0702 c0702M45411 = AbstractC2574.m4549(ContentValues.class);
        Class cls = Integer.TYPE;
        C2013 c2013 = (C2013) AbstractC2844.m4777(new Object[]{c0702M4549, c0702M45410, c0702M45411, AbstractC2574.m4549(cls)}, 4, c2004M3560);
        C2860 c2860 = f9092;
        C3752 c3752M4303 = c2860.m4303(c2013, 1);
        c3752M4303.m5359(new C2832(25));
        c3752M4303.m5360();
        C2004 c2004M3561 = c1681M4712.m3560();
        c2004M3561.f6475 = "updateWithOnConflict";
        C3752 c3752M4304 = c2860.m4303((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(String.class), AbstractC2574.m4549(ContentValues.class), AbstractC2574.m4549(String.class), Array.newInstance((Class<?>) AbstractC2574.m4549(String.class).mo2209(), 0).getClass(), AbstractC2574.m4549(cls)}, 5, c2004M3561), 1);
        c3752M4304.m5359(new C2832(26));
        c3752M4304.m5360();
        C2004 c2004M3562 = c1681M4712.m3560();
        c2004M3562.f6475 = "rawQueryWithFactory";
        C3752 c3752M4305 = c2860.m4303((C2013) AbstractC2844.m4777(new Object[]{"com.tencent.wcdb.database.SQLiteDatabase$CursorFactory", AbstractC2574.m4549(String.class), Array.newInstance((Class<?>) AbstractC2574.m4549(Object.class).mo2209(), 0).getClass(), AbstractC2574.m4549(String.class), "com.tencent.wcdb.support.CancellationSignal"}, 5, c2004M3562), 1);
        c3752M4305.m5359(new C2832(27));
        c3752M4305.m5360();
        if (AbstractC0972.m2596(EnumC3737.f11679) || AbstractC0972.m2597(EnumC3734.f11645)) {
            C1681 c1681M4713 = AbstractC2727.m4712(AbstractC0972.m2606("com.tencent.wcdb.compat.SQLiteDatabase"));
            C2004 c2004M3563 = c1681M4713.m3560();
            c2004M3563.f6475 = "updateWithOnConflict";
            C3752 c3752M4306 = c2860.m4303((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(String.class), AbstractC2574.m4549(ContentValues.class), AbstractC2574.m4549(String.class), Array.newInstance((Class<?>) AbstractC2574.m4549(String.class).mo2209(), 0).getClass(), AbstractC2574.m4549(cls)}, 5, c2004M3563), 1);
            c3752M4306.m5359(new C2832(28));
            c3752M4306.m5360();
            C2004 c2004M3564 = c1681M4713.m3560();
            c2004M3564.f6475 = "rawQuery";
            C3752 c3752M4307 = c2860.m4303((C2013) AbstractC0739.m2290(c2004M3564.m3993()), 1);
            c3752M4307.m5359(new C2832(29));
            c3752M4307.m5360();
        }
    }
}

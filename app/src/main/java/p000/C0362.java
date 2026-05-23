package p000;

import android.util.Log;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᤝᲁᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0362 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1681;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f1682;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f1683;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f1684;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f1685;

    public C0362(C0575 c0575) {
        this.f1681 = 0;
        
        this.f1684 = new ArrayList();
        this.f1682 = -1;
        this.f1685 = c0575;
    }

    public String toString() {
        switch (this.f1681) {
            case 0:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f1682 >= 0) {
                    sb.append(" #");
                    sb.append(this.f1682);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int m1473(boolean z) {
        String str;
        C0575 c0575 = (C0575) this.f1685;
        if (this.f1683) {
            throw new IllegalStateException("commit already called");
        }
        if (C0575.m1982(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C1854());
            ArrayList arrayList = (ArrayList) this.f1684;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1682);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1683);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C1411 c1411 = (C1411) arrayList.get(i);
                    switch (c1411.f5079) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case 5:
                            str = "SHOW";
                            break;
                        case 6:
                            str = "DETACH";
                            break;
                        case 7:
                            str = "ATTACH";
                            break;
                        case 8:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + c1411.f5079;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(c1411.f5080);
                    if (c1411.f5081 != 0 || c1411.f5082 != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c1411.f5081));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c1411.f5082));
                    }
                    if (c1411.f5083 != 0 || c1411.f5084 != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c1411.f5083));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c1411.f5084));
                    }
                }
            }
            printWriter.close();
        }
        this.f1683 = true;
        this.f1682 = -1;
        if (!z) {
            
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (((ArrayList) c0575.f2343)) {
            try {
                if (false) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f1682;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m1474(int i) {
        int i2 = this.f1681;
        Object obj = this.f1684;
        Object obj2 = this.f1685;
        switch (i2) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.f618;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1682 = i;
                    if (!this.f1683) {
                        Field field = AbstractC3578.f11184;
                        ((View) bottomSheetBehavior.f618.get()).postOnAnimation((RunnableC0141) obj);
                        this.f1683 = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.f772;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1682 = i;
                    if (!this.f1683) {
                        Field field2 = AbstractC3578.f11184;
                        ((View) sideSheetBehavior.f772.get()).postOnAnimation((RunnableC0563) obj);
                        this.f1683 = true;
                    }
                    break;
                }
                break;
        }
    }

    public C0362(SideSheetBehavior sideSheetBehavior) {
        this.f1681 = 2;
        this.f1685 = sideSheetBehavior;
        this.f1684 = new RunnableC0563(6, this);
    }

    public C0362(BottomSheetBehavior bottomSheetBehavior) {
        this.f1681 = 1;
        this.f1685 = bottomSheetBehavior;
        this.f1684 = new RunnableC0141(3, this);
    }
}
